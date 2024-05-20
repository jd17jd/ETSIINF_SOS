
/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;
import java.util.HashMap;

import es.upm.etsiinf.sos.model.xsd.User;
/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */
public class WineSocialUPMSkeleton {
	
	public Map<String, User> usuarios = new HashMap<>();
	public List<User> usuariosAutenticados = new ArrayList<>();
	
	private User admin = new User();
	admin.setName("admin");
	admin.setPwd("admin");
	private User usuarioActual;
	private UPMAuthenticationAuthorizationWSSkeletonSkeleton auth = new UPMAuthenticationAuthorizationWSSkeletonSkeleton();
	
	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) throws RemoteException {
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonSkeleton.AddUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonSkeleton.AddUserResponse();
		es.upm.fi.sos.t3.backend.AddUser usuario = new es.upm.fi.sos.t3.backend.AddUser();
		es.upm.fi.sos.t3.backend.xsd.UserBackEnd usuarioBackend = new es.upm.fi.sos.t3.backend.xsd.UserBackEnd();
		Username username = addUser.getArgs0();
		
		//Aqui creo el usuario del backend que le paso al stub (UPMAuth...)
		usuarioBackend.setName(username.getUsername());
		usuario.setUser(usuarioBackend);
		
		
		
		//TODO: esto no lo entiendo bien
		if(this.usuarioActual == null) {
			System.out.println("Inicie sesión para añadir usuarios...\n");
			respuestaFinal.setResponse(false);
		}
		
		//si soy el admin puedo añadir usuarios
		//redirijo servicio a UPMAuth...para que haga el add en el backend 
		if(soyAdmin(usuarioActual)) {
			//en la respuesta el backend me devuelve la contraseña y el true/false que debe 
			respuestaBackend = auth.addUser(usuario);
			//si la respuesta es que HA IDO BIEN => TRUE (entro en el if)
			if(respuestaBackend.get_return().getResult()) {
				response.setResponse(true); //pongo la respuesta a true
				response.setPwd(response.get_return().getPassword()); //pongo contraseña en la respuesta
				respuestaFinalFuncion.set_return(response);
				//TODO: revisar que haya que añadir un usuario a lista de usuarios conectados
				//usuarios.put()...
				
				System.out.println("Funcionó bieeeeen!!\nSe ha añadido al usuario: '" + username.getUsername() + "'.\n");
			  //si la respuesta que me devuelve el backend es [false]
			} else {
				System.out.println("El usuario: '" + username.getUsername() + "' ya existía en el servicio.\n");
				response.setResponse(false);
				respuestaFinalFuncion.set_return(response);
			}
			
		  //si no soy el admin debe dar error prq no he podido añadir al usuario
		} else {
			System.out.println("Error!! No se pudo añadir al usuario. (Falta de permisos)\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
		}	
		return respuestaFinalFuncion;
	}
	
	//TRUE => si soy el admin
	//FALSE => e.o.c
	private boolean soyAdmin(User user) {
		return (user.getUsername().equals(admin.getUsername())) && (user.getPwd().equals(admin.getPwd()));
	}
	
	
	/**
	 * 
	 * 
	 * @param login
	 * @return loginResponse
	 */

	//cada llamada a esto tiene que redirigirlo a UPMAuth...
	//ahi nos devuelve un true/false dependiendo de si ha tenido exito o no
	//if(usuariosAutenticados)
	
	//TODO: gestionar el login del admin AQUI, NO en el UPMAuth...
	
	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) {
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.fi.sos.t3.backend.LoginResponse respuestaLogin = new es.upm.fi.sos.t3.backend.LoginResponse();
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackend respuestaLoginBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackend();  
		es.upm.fi.sos.t3.backend.ExistUser usuarioExiste = new es.upm.fi.sos.t3.backend.ExistUser();
		es.upm.fi.sos.t3.backend.ExistUserResponse respuestaUsuarioExiste = new es.upm.fi.sos.t3.backend.ExistUserResponse();
		es.upm.fi.sos.t3.backend.Login paramLogin = new es.upm.fi.sos.t3.backend.Login();
		es.upm.fi.sos.t3.backend.xsd.Username nombre_usuario = new es.upm.fi.sos.t3.backend.xsd.Username(); 
		
		//obtengo el usuario del param login
		User usuario = login.getArgs0();
		//pillo su username y su contraseña
		String name = usuario.getName();
		String password = usuario.getPwd();
		
		//Creo el objeto Username y le pongo el nombre del usuario que me pasan
		nombre_usuario.setName(name);
		//TODO: setteo el nombre del login en el objeto de existUser para comprobar que existe
		usuarioExiste.setUsername(nombre_usuario);
		
		respuestaUsuarioExiste = auth.existUser(usuarioExiste);
		boolean existe = respuestaUsuarioExiste.get_return().getResult();
		
		
		//si no existe y no es el admin => Response = false (El usuario no existe)
		if(!existe && !name.equals("admin")) {
			System.out.println("El usuario: '" + name + "' no existe en el sistema.\n");
			response.setResponse(false);
		}
		else { //si el usuario existe
			//habria que ver si el usuario ya esta conectado y lanzar directamente => TRUE
			if(usuariosAutenticados.contains(usuario)) {
				System.out.println("Usuario: '" + name + "' ya autenticado!!\n");
				response.setResponse(true);
			}else {
				//TODO: habria que meter algo para iniciar el 'paramLogin'
				respuestaLogin = auth.login(paramLogin);
				respuestaLoginBackend = respuestaLogin.get_return();
				
				//si ha ido bien el login => TRUE
				if(respuestaLoginBackend.getResult()) {
					System.out.println("Usuario: '" + name + "' autenticando...\n");
					usuariosAutenticados.add(usuario); //añado el usuario a la lista de conectados, compruebo posteriormente
					response.setResponse(true);
				} else {
					System.out.println("El usuario: '" + name + "' no se pudo autenticar :(\n");
					response.setResponse(false);
				}
			}
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param logout
	 * @return logoutResponse
	 */

	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) {
		LogoutResponse respuestaFinalFuncion new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		boolean conectado = false;
		
		if(usuariosAutenticados.contains(this.usuarioActual)) {
			usuariosAutenticados.remove(usuarioActual);
			this.usuarioActual = null;
			System.out.println("Has cerrado correctamente la sesión!!\n");
			response.setResponse(true);
		}else {
			System.out.println("Hubo un error en el cierre de sesión :(\n");
			response.setResponse(false);
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param removeUser
	 * @return removeUserResponse
	 */

	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) {
		RemoveUserResponse respuestaFinalFuncion = new respuestaFinalFuncion();
		es.upm.fi.sos.t3.backend.RemoveUserResponse respuestaRemove = new es.upm.fi.sos.t3.backend.RemoveUserResponse();
		es.upm.fi.sos.t3.backend.RemoveUser paramRemove = new es.upm.fi.sos.t3.backend.RemoveUser();
		es.upm.fi.sos.t3.backend.xsd.RemoveUser removeDevuelto = new es.upm.fi.sos.t3.backend.xsd.RemoveUser();
		es.upm.fi.sos.t3.backend.xsd removeModelo = new es.upm.fi.sos.t3.backend.xsd();
		
		Username usuario = removeUser.getArgs0();
		String nombre_usuario = usuario.getUsername();
		removeModelo.setName(nombre_usuario);
		
		//TODO: si el usuario existe dentro de mi memoria, entonces se puede borrar
		//if(usuarios)
		//solo el admin o el propio usuario pueden borrar
		if(soyAdmin(usuarioActual)) {
			
		}
	}
	
	
	
	
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param getMyFollowers
	 * @return getMyFollowersResponse
	 */

	public es.upm.etsiinf.sos.GetMyFollowersResponse getMyFollowers(es.upm.etsiinf.sos.GetMyFollowers getMyFollowers) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyFollowers");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param addFollower
	 * @return addFollowerResponse
	 */

	public es.upm.etsiinf.sos.AddFollowerResponse addFollower(es.upm.etsiinf.sos.AddFollower addFollower) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#addFollower");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyRates
	 * @return getMyRatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyRatesResponse getMyRates(es.upm.etsiinf.sos.GetMyRates getMyRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyRates");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param removeWine
	 * @return removeWineResponse
	 */

	public es.upm.etsiinf.sos.RemoveWineResponse removeWine(es.upm.etsiinf.sos.RemoveWine removeWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#removeWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param unfollow
	 * @return unfollowResponse
	 */

	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#unfollow");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param rateWine
	 * @return rateWineResponse
	 */

	public es.upm.etsiinf.sos.RateWineResponse rateWine(es.upm.etsiinf.sos.RateWine rateWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#rateWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addWine
	 * @return addWineResponse
	 */

	public es.upm.etsiinf.sos.AddWineResponse addWine(es.upm.etsiinf.sos.AddWine addWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getWines
	 * @return getWinesResponse
	 */

	public es.upm.etsiinf.sos.GetWinesResponse getWines(es.upm.etsiinf.sos.GetWines getWines) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getWines");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */

	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#changePassword");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param getMyFollowerRates
	 * @return getMyFollowerRatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyFollowerRatesResponse getMyFollowerRates(
			es.upm.etsiinf.sos.GetMyFollowerRates getMyFollowerRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyFollowerRates");
	}

}
