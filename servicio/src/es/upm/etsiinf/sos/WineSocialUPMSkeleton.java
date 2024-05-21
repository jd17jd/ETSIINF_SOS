
/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;
import es.upm.etsiinf.sos.model.xsd.User;
import es.upm.etsiinf.sos.model.xsd.Username;
import es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonSkeleton;
/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */
public class WineSocialUPMSkeleton {
	
	private User admin;
	public User usuarioActual;
	private UPMAuthenticationAuthorizationWSSkeletonSkeleton auth;
	
	
	public WineSocialUPMSkeleton() {
		admin = new User();
		admin.setName("admin");
		admin.setPwd("admin");
		this.usuarioActual = new User();
		auth = new UPMAuthenticationAuthorizationWSSkeletonSkeleton();
	}
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	//EN TEORIA YA ESTÁ FUNCIONANDO BIEN
	
	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) {
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		es.upm.fi.sos.t3.backend.AddUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.AddUserResponse();
		es.upm.fi.sos.t3.backend.AddUser usuario = new es.upm.fi.sos.t3.backend.AddUser();
		es.upm.fi.sos.t3.backend.xsd.UserBackEnd usuarioBackend = new es.upm.fi.sos.t3.backend.xsd.UserBackEnd();
		Username username = addUser.getArgs0();
		
		//Aqui creo el usuario del backend que le paso al stub (UPMAuth...)
		usuarioBackend.setName(username.getUsername());
		usuario.setUser(usuarioBackend);
		
		
		//TODO: esto no lo entiendo bien
//		if(this.usuarioActual == null) {
//			System.out.println("Inicie sesión para añadir usuarios...\n");
//			response.setResponse(false);
//			respuestaFinalFuncion.set_return(response);
//		}
		
		//si soy el admin puedo añadir usuarios
		//redirijo servicio a UPMAuth...para que haga el add en el backend 
		if(soyAdmin(usuarioActual)) {
			
			//en la respuesta el backend me devuelve la contraseña y el true/false que debe 
			respuestaBackend = auth.addUser(usuario);
			//si la respuesta es que HA IDO BIEN => TRUE (entro en el if)
			if(respuestaBackend.get_return().getResult()) {
				response.setResponse(true); //pongo la respuesta a true
				//TODO: revisar como se genera la contraseña (si la imprimo me da null)
				response.setPwd(respuestaBackend.get_return().getPassword()); //pongo contraseña en la respuesta
				respuestaFinalFuncion.set_return(response);

				System.out.println("Se ha añadido al usuario: '" + username.getUsername() + "'.\n");
			  //si la respuesta que me devuelve el backend es [false]
			} else {
				System.out.println("El usuario: '" + username.getUsername() + "' ya existía en el servicio.\n");
				response.setResponse(false);
				respuestaFinalFuncion.set_return(response);
			}
			
		  //si no soy el admin debe dar error prq no he podido añadir al usuario
		} else {
			System.out.println("Error!! No se pudo añadir al usuario. No soy el usuario administrador :(\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
		}	
		return respuestaFinalFuncion;
	}
	
	//TRUE => si soy el admin
	//FALSE => e.o.c
	private boolean soyAdmin(User user) {
		return (user.getName().equals(admin.getName())) && 
				(user.getPwd().equals(admin.getPwd()));
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
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd respuestaLoginBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd();  
		es.upm.fi.sos.t3.backend.ExistUser usuarioExiste = new es.upm.fi.sos.t3.backend.ExistUser();
		es.upm.fi.sos.t3.backend.ExistUserResponse respuestaUsuarioExiste = new es.upm.fi.sos.t3.backend.ExistUserResponse();
		es.upm.fi.sos.t3.backend.Login paramLogin = new es.upm.fi.sos.t3.backend.Login();
		es.upm.fi.sos.t3.backend.xsd.Username nombre_usuario = new es.upm.fi.sos.t3.backend.xsd.Username(); 
		
		//obtengo el usuario del param login
		User usuario = login.getArgs0();
		//pillo su username y su contraseña
		String name = usuario.getName();
		
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
			if(auth.usuariosAutenticados.contains(usuario)) {
				System.out.println("Usuario: '" + name + "' ya autenticado!!\n");
				response.setResponse(true);
			}else {
				//TODO: habria que meter algo para iniciar el 'paramLogin'
				respuestaLogin = auth.login(paramLogin);
				respuestaLoginBackend = respuestaLogin.get_return();
				
				//si ha ido bien el login => TRUE
				if(respuestaLoginBackend.getResult()) {
					System.out.println("Usuario: '" + name + "' autenticando...\n");
					auth.usuariosAutenticados.add(usuario); //añado el usuario a la lista de conectados, compruebo posteriormente
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
		LogoutResponse respuestaFinalFuncion = new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		boolean conectado = false;
		
		if(auth.usuariosAutenticados.contains(this.usuarioActual)) {
			auth.usuariosAutenticados.remove(usuarioActual);
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
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.fi.sos.t3.backend.RemoveUserResponse respuestaRemove = new es.upm.fi.sos.t3.backend.RemoveUserResponse();
		es.upm.fi.sos.t3.backend.RemoveUser paramRemove = new es.upm.fi.sos.t3.backend.RemoveUser();
		es.upm.fi.sos.t3.backend.xsd.RemoveUser removeDevuelto = new es.upm.fi.sos.t3.backend.xsd.RemoveUser();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.fi.sos.t3.backend.ExistUser usuarioExiste = new es.upm.fi.sos.t3.backend.ExistUser();
		es.upm.fi.sos.t3.backend.ExistUserResponse respuestaUsuarioExiste = new es.upm.fi.sos.t3.backend.ExistUserResponse();
		es.upm.fi.sos.t3.backend.xsd.Username username = new es.upm.fi.sos.t3.backend.xsd.Username();
		
		boolean eliminado = false;
		
		//obtengo el usuario y nombre del parametro de la funcion
		Username usuario = removeUser.getArgs0();
		String nombre_usuario = usuario.getUsername();
		username.setName(nombre_usuario);
		
		usuarioExiste.setUsername(username);
		respuestaUsuarioExiste = auth.existUser(usuarioExiste);
		boolean existe = respuestaUsuarioExiste.get_return().getResult();
		
		//obtengo el remove del backend y le pongo el nombre del usuario dado
		removeDevuelto = paramRemove.getRemoveUser();
		removeDevuelto.setName(nombre_usuario);
		
		//setteo ese remove del backend en el parametro del que le paso a la funcion de UPMAuth...
		paramRemove.setRemoveUser(removeDevuelto);
		
		
		//El admin NUNCA se puede borrar
		if(nombre_usuario.equals("admin")) {
			System.out.println("Hubo un error! No se puede borrar el usuario 'admin'\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
		}
		
		//si el usuario no existe, obviamente NO se puede borrar
		if(!existe) {
			System.out.println("Hubo un error! No existe el usuario: '" + nombre_usuario +"'\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
		}
		
		
		//solo el admin o el propio usuario pueden borrar
		if((soyAdmin(this.usuarioActual)) || (this.usuarioActual.getName().equals(nombre_usuario))) {
			System.out.println("Si he entrado aqui, o soy el admin o soy el usuario que se quiere borrar...\n");
			//llamo a la funcion y me devuelve una respuesta
			respuestaRemove = auth.removeUser(paramRemove);
			eliminado = respuestaRemove.get_return().getResult();
			System.out.println("Se ha eliminado al usuario: '" + nombre_usuario + "'\n");
			response.setResponse(eliminado);
			respuestaFinalFuncion.set_return(response);
		}
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */

	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		ChangePasswordResponse respuestaFinalFuncion = new ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.fi.sos.t3.backend.ChangePasswordResponse respuestaAuth = new es.upm.fi.sos.t3.backend.ChangePasswordResponse();
		es.upm.fi.sos.t3.backend.ChangePassword paramAuth = new es.upm.fi.sos.t3.backend.ChangePassword();
		es.upm.etsiinf.sos.model.xsd.PasswordPair passw = new es.upm.etsiinf.sos.model.xsd.PasswordPair();
		es.upm.fi.sos.t3.backend.xsd.ChangePasswordResponse respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.ChangePasswordResponse();
		
		//extraigo la contraseñas del parametro
		passw = changePassword.getArgs0();
		//extraigo cada contraseña por si quisiese imprimirlas
		String oldPassword = passw.getOldpwd();
		String newPassword = passw.getNewpwd();
		
		//el cambio de contraseña del admin se trata de forma local
		if(soyAdmin(this.usuarioActual) && admin.getPwd().equals(oldPassword)) {
			System.out.println("Se ha cambiado la contraseña del admin correctamente!!");
			admin.setPwd(newPassword);
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
		}
		
		//TODO: arreglar
		//paramAuth.setArgs0(passw);
		
		//llamo a la funcion del UPMAuth... y obtengo la respuesta
		respuestaAuth = auth.changePassword(paramAuth);
		respuestaBackend = respuestaAuth.get_return();
		
		
		//si se ha cambiado correctamente
		if(respuestaBackend.getResult()) {
			System.out.println("Contraseña cambiada correctamente!!\n");
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
		}
		return respuestaFinalFuncion;
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