
/**
 * UPMAuthenticationAuthorizationWSSkeletonSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.fi.sos.t3.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import es.upm.etsiinf.sos.model.xsd.User;
import es.upm.fi.sos.t3.backend.xsd.UserBackEnd;
import es.upm.fi.sos.t3.backend.xsd.Username;

/**
 * UPMAuthenticationAuthorizationWSSkeletonSkeleton java skeleton for the
 * axisService
 */
public class UPMAuthenticationAuthorizationWSSkeletonSkeleton {
	
	private Map<String,User> usuariosRegistrados;
	private List<User> usuariosLoggeados;
	
	
	public UPMAuthenticationAuthorizationWSSkeletonSkeleton() {
		usuariosRegistrados = new HashMap<>();
		usuariosLoggeados = new ArrayList<>();
	}

	// Getters y Setters
	
	//---------------------------------------------------

	public void setUsuariosRegistrados(Map<String, User> usuariosRegistrados) {
		this.usuariosRegistrados = usuariosRegistrados;
	}

	public Map<String, User> getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosLoggeados(List<User> usuariosLoggeados) {
		this.usuariosLoggeados = usuariosLoggeados;
	}

	public List<User> getUsuariosLoggeados() {
		return usuariosLoggeados;
	}

	//---------------------------------------------------

	// Metodos auxiliares

	

	//---------------------------------------------------

	
	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	//TODO: HAY QUE COMPROBAR COMO SE AUTOGENERA LA CONTRASEÑA
	public es.upm.fi.sos.t3.backend.AddUserResponse addUser(es.upm.fi.sos.t3.backend.AddUser addUser) {
		es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd();
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		UserBackEnd usuarioBackend = addUser.getUser();
		User user = new User();
		//si aqui setteo el username y contraseña luego al añadirlo queda registrado 
		user.setName(usuarioBackend.getName());
		
		//////////////////////////////////////////////////////
		//AQUI SE AUTOGENERA LA CONTRASEÑA
		user.setPwd("contraseñaAutoGenerada");
		//////////////////////////////////////////////////////
		
		//TODO: revisar lo de que no exista previamente en el Map
		usuariosRegistrados.put(user.getName(), user);
		//usuarios.add(user);
		respuestaBackend.setResult(true);
		respuestaBackend.setPassword(user.getPwd());
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}
	
	private String getLoggeados() {
		String res = "Usuarios Loggeados => [";
		for(User usuarioLog : usuariosLoggeados) {
			res += usuarioLog.getName() + " ";
		}
		return res + "]";
	}
	
	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public es.upm.fi.sos.t3.backend.LoginResponse login(es.upm.fi.sos.t3.backend.Login login) {
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd();
		
		String nombre_login = login.getLogin().getName();
		String password_login = login.getLogin().getPassword();

		Username nombre_usuario = new Username();
		ExistUser usuarioExiste = new ExistUser();
		ExistUserResponse respuestaUsuarioExiste = new ExistUserResponse();
		boolean existe = false;

		User usuario = new User();

		// INICIALIZACION RESPUESTA
		respuestaBackend.setResult(false);
		respuestaFinalFuncion.set_return(respuestaBackend); //False en incio
		
		// COMPROBACION USUARIO EXISTE EN EL SISTEMA
		nombre_usuario.setName(nombre_login);
		usuarioExiste.setUsername(nombre_usuario); 
		respuestaUsuarioExiste = existUser(usuarioExiste);
		existe = respuestaUsuarioExiste.get_return().getResult();
		
		if(existe) { //COMPROBAR SI PODRA LOGGEAR
			usuario = usuariosRegistrados.get(nombre_login);

			System.out.println("Contraseña introducida por el usuario: " + password_login + "\n");
			System.out.println("Contraseña generada en memoria (autogenerada): " + usuario.getPwd() + "\n");

			if(password_login.equals(usuario.getPwd())) { //Comparamos contraseña suministrada con la autogenerada
				usuariosLoggeados.add(usuario);
				respuestaBackend.setResult(true);
			}
		}
		System.out.println("El usuario: '" + nombre_login + "' no existe en el sistema.\n");
		return respuestaFinalFuncion;
	}
	
	
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param existUser
	 * @return existUserResponse
	 */

	//Comprueba que el usuario pasado como parametro existe en memoria
	public es.upm.fi.sos.t3.backend.ExistUserResponse existUser(es.upm.fi.sos.t3.backend.ExistUser existUser) {
		ExistUserResponse respuestaFinalFuncion = new ExistUserResponse();
		es.upm.fi.sos.t3.backend.xsd.ExistUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.ExistUserResponse(); 
		Username usuario = existUser.getUsername();
		String nombreUsuario = usuario.getName();
		
		boolean existe = usuariosRegistrados.containsKey(nombreUsuario);
		if(existe) {
			respuestaBackend.setResult(true);
		} else {
			respuestaBackend.setResult(false);
		}
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}
	

	/**
	 * Auto generated method signature
	 * 
	 * @param removeUser
	 * @return removeUserResponse
	 */

	public es.upm.fi.sos.t3.backend.RemoveUserResponse removeUser(es.upm.fi.sos.t3.backend.RemoveUser removeUser) {
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.fi.sos.t3.backend.xsd.RemoveUser usuarioABorrar = removeUser.getRemoveUser();
		es.upm.fi.sos.t3.backend.xsd.RemoveUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.RemoveUserResponse(); 
		String nombre_user_borrado = usuarioABorrar.getName();
		boolean existe = usuariosRegistrados.containsKey(nombre_user_borrado); 
		//si el usuario existe se borra del sistema
		//TODO: ver si de verdad hay que comprobar dos veces si existe
		if(existe) {
			respuestaBackend.setResult(true);
			usuariosRegistrados.remove(nombre_user_borrado);
		} else {
			respuestaBackend.setResult(false);
		}
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}



	/**
	 * Auto generated method signature
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */

	public es.upm.fi.sos.t3.backend.ChangePasswordResponse changePassword(es.upm.fi.sos.t3.backend.ChangePassword changePassword) {
		ChangePasswordResponse respuestaFinalFuncion = new ChangePasswordResponse();
		es.upm.fi.sos.t3.backend.xsd.ChangePasswordBackEnd cambioBackend = new es.upm.fi.sos.t3.backend.xsd.ChangePasswordBackEnd();
		es.upm.fi.sos.t3.backend.xsd.ChangePasswordResponse response = new es.upm.fi.sos.t3.backend.xsd.ChangePasswordResponse();
		cambioBackend = changePassword.getChangePassword();
		
		//TODO: revisar como obtener el nombre de pepito sin meterlo hardcodeado
		String nombre = cambioBackend.getName();
		String antigua = cambioBackend.getOldpwd();
		String nueva = cambioBackend.getNewpwd();
		
		//si la contraseña antigua es igual a la que tiene almacenada, la cambio
		//TODO: si no es igual o NO SE HA HECHO LOGIN PREVIO => ERROR
		if(antigua.equals(usuariosRegistrados.get(nombre).getPwd())) {
			usuariosRegistrados.get(nombre).setPwd(nueva);
			response.setResult(true);
			respuestaFinalFuncion.set_return(response);
		} else {
			response.setResult(false);
			respuestaFinalFuncion.set_return(response);
		}
		return respuestaFinalFuncion;
	}

}
