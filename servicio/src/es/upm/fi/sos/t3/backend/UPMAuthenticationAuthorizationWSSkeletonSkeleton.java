
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
	
	//public Map<String, User> usuarios;
	public List<User> usuarios;
	public List<User> usuariosAutenticados;
	
	
	public UPMAuthenticationAuthorizationWSSkeletonSkeleton() {
		//usuarios = new HashMap<>();
		usuarios = new ArrayList<>();
		usuariosAutenticados = new ArrayList<>(); 
	}
	
	
	/*public String printUsuarios() {
		String res = "";
		for(User usuario : usuarios.values()) {
			res += usuario.getName() + ", ";
		}
		return res;
	}*/
	
	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	public es.upm.fi.sos.t3.backend.AddUserResponse addUser(es.upm.fi.sos.t3.backend.AddUser addUser) {
		es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd();
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		UserBackEnd usuarioBackend = addUser.getUser();
		User user = new User();
		user.setName(usuarioBackend.getName());
		
		for(User usuarioExistente : usuarios) {
			if(usuarioExistente.getName().equals(user.getName())) {
				System.out.println("El usuario con el nombre: " + user.getName() + " ya existe.\n");
				respuestaBackend.setResult(false);
				respuestaFinalFuncion.set_return(respuestaBackend);
				return respuestaFinalFuncion;
			}
		}
		usuarios.add(user);
		respuestaBackend.setResult(true);
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
		
		String name = login.getLogin().getName();
		String password = login.getLogin().getPassword();
		
		
		
		respuestaBackend.setResult(true);
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param existUser
	 * @return existUserResponse
	 */

	public es.upm.fi.sos.t3.backend.ExistUserResponse existUser(es.upm.fi.sos.t3.backend.ExistUser existUser) {
		System.out.println("Entro en el exist...\n");
		ExistUserResponse respuestaFinalFuncion = new ExistUserResponse();
		
		Username usuario = existUser.getUsername();
		User user = new User();
		
		
		respuestaFinalFuncion.set_return(null);
		return respuestaFinalFuncion;
	}
	

	/**
	 * Auto generated method signature
	 * 
	 * @param removeUser
	 * @return removeUserResponse
	 */

	public es.upm.fi.sos.t3.backend.RemoveUserResponse removeUser(es.upm.fi.sos.t3.backend.RemoveUser removeUser) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#removeUser");
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
