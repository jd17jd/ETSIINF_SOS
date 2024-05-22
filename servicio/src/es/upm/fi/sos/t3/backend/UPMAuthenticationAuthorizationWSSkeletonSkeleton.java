
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
	
	public Map<String,User> usuariosEnSistema;
	public List<User> usuariosAutenticados;
	
	
	public UPMAuthenticationAuthorizationWSSkeletonSkeleton() {
		usuariosEnSistema = new HashMap<>();
		usuariosAutenticados = new ArrayList<>(); 
	}
	
	
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
		usuariosEnSistema.put(user.getName(), user);
		//usuarios.add(user);
		respuestaBackend.setResult(true);
		respuestaBackend.setPassword(user.getPwd());
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}
	
	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public es.upm.fi.sos.t3.backend.LoginResponse login(es.upm.fi.sos.t3.backend.Login login) {
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd();
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		String nombre_login = login.localLogin.getName();
		String password_login = login.getLogin().getPassword();
		User usuario = new User();
		
		//compruebo que el usuario existe en el sistema
		boolean existe = usuariosEnSistema.containsKey(nombre_login);
		
		usuario = usuariosEnSistema.get(nombre_login);
		//si existe en el sistema habra que comprobar si puede acceder (loggearse)
		if(existe) {
			//si se ha podido loggear prq el nombre y contraseña coinciden
			//se añade a la lista de loggeados y se devuelve true
			//BIEEEN FUNCIONAAAA
			System.out.println("CONTRASEÑA INTRODUCIDA POR USUARIO => " + password_login);
			System.out.println("CONTRASEÑA ALMACENADA EN MEMORIA (AUTOGENERADA) => " + usuario.getPwd());
			//si las contraseñas coinciden se puede autenticar, sino no
			if(password_login.equals(usuario.getPwd())) {
				usuariosAutenticados.add(usuario);
				respuestaBackend.setResult(true);
			}
		}
		
		respuestaFinalFuncion.set_return(respuestaBackend);
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
		
		boolean existe = usuariosEnSistema.containsKey(nombreUsuario);
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
		boolean existe = usuariosEnSistema.containsKey(nombre_user_borrado); 
		//si el usuario existe se borra del sistema
		//TODO: ver si de verdad hay que comprobar dos veces si existe
		if(existe) {
			respuestaBackend.setResult(true);
			usuariosEnSistema.remove(nombre_user_borrado);
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

	public es.upm.fi.sos.t3.backend.ChangePasswordResponse changePassword(
			es.upm.fi.sos.t3.backend.ChangePassword changePassword) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#changePassword");
	}

}
