
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
import java.util.Random;

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

	// private String getLoggeados() {
	// 	String res = "Usuarios Loggeados => [";
	// 	for(User usuarioLog : usuariosLoggeados) {
	// 		res += usuarioLog.getName() + " ";
	// 	}
	// 	return res + "]";
	// }

	private String generateRandomString() {
		int length;
        Random random = new Random();
		length = random.nextInt(10) + 1; // Longitud de la contraseña entre 1 y 10
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            // Generar dos números aleatorios
            int randomNum1 = random.nextInt(100); // Número aleatorio entre 0 y 99
            int randomNum2 = random.nextInt(26);  // Número aleatorio entre 0 y 25 (para las letras)

            // Calcular el módulo
            int modResult = randomNum1 % (randomNum2 + 1); // Asegurarse de que el divisor no sea 0

            // Convertir el resultado del módulo a una letra del alfabeto (a-z)
            char randomChar = (char) ('a' + modResult % 26);
            
            // Añadir el carácter al StringBuilder
            sb.append(randomChar);
        }
        return sb.toString();
    }


	//---------------------------------------------------

	// Metodos principales

	/**
	 * Añade un usuario al sistema
	 * @param addUser Objeto con los datos del usuario a añadir
	 * @return addUserResponse Objeto que contiene la contraseña + booleano de exito de operacion
	 */
	public es.upm.fi.sos.t3.backend.AddUserResponse addUser(es.upm.fi.sos.t3.backend.AddUser addUser) {
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.AddUserResponseBackEnd();
		
		Username nombre_usuario = new Username();
		ExistUser usuarioExiste = new ExistUser();
		ExistUserResponse respuestaUsuarioExiste = new ExistUserResponse();

		User user = new User();

		//INICIALIZACION RESPUESTA
		respuestaBackend.setResult(false);
		respuestaFinalFuncion.set_return(respuestaBackend); //False en inicio

		// COMPROBACION USUARIO EXISTE EN EL SISTEMA
		nombre_usuario.setName(addUser.getUser().getName());
		usuarioExiste.setUsername(nombre_usuario); 
		respuestaUsuarioExiste = existUser(usuarioExiste);
		boolean existe = respuestaUsuarioExiste.get_return().getResult();

		if(existe)
			return respuestaFinalFuncion;

		// SI NO EXISTE --> Lo creamos
		UserBackEnd usuarioBackend = addUser.getUser();
		String password = generateRandomString();

		// CREO EL USUARIO
		user.setName(usuarioBackend.getName());
		user.setPwd(password); // Autogenerador de la contraseña
		
		usuariosRegistrados.put(user.getName(), user); // Lo añadimos en el mapa

		respuestaBackend.setResult(true);
		respuestaBackend.setPassword(user.getPwd());
		
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}

	
	/**
	 * Comienza una nueva sesión para un usuario
	 * @param login Objeto con los datos del usuario a loggear
	 * @return loginResponse Objeto inddicando si se ha loggeado correctamente
	 */
	public es.upm.fi.sos.t3.backend.LoginResponse login(es.upm.fi.sos.t3.backend.Login login) {
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd();
		
		String nombre_login = login.getLogin().getName();
		String password_login = login.getLogin().getPassword();

		Username nombre_usuario = new Username();
		ExistUser usuarioExiste = new ExistUser();
		ExistUserResponse respuestaUsuarioExiste = new ExistUserResponse();

		User usuario = new User();

		// INICIALIZACION RESPUESTA
		respuestaBackend.setResult(false);
		respuestaFinalFuncion.set_return(respuestaBackend); //False en incio TODO: Ver si esta sobra
		
		// COMPROBACION USUARIO ESTÁ REGISTRADO
		nombre_usuario.setName(nombre_login);
		usuarioExiste.setUsername(nombre_usuario); 
		respuestaUsuarioExiste = existUser(usuarioExiste);
		boolean existe = respuestaUsuarioExiste.get_return().getResult();
		
		// COMPROBACION EXISTENCIA USUARIO
		if(existe) {

			if (usuariosLoggeados.size() > 0) { 
				for (User user : usuariosLoggeados) { //Si ya está loggeado TODO: Administrar bien las sesiones de un usuario. Definir estructura de datos a utilizar
					if (user.getName().equals(nombre_login)) {
						System.out.println("El usuario: '" + nombre_login + "' ya está loggeado en el sistema.\n");
						respuestaBackend.setResult(true);
						respuestaFinalFuncion.set_return(respuestaBackend);
						return respuestaFinalFuncion;
					}
				}
			}

			// COMPROBACION DE SI TIENE CONTRASEÑA SUMINISTRADA
			usuario = usuariosRegistrados.get(nombre_login);

			System.out.println("Contraseña introducida por el usuario: " + password_login);
			System.out.println("Contraseña autogenerada en memoria: " + usuario.getPwd());

			if(password_login.equals(usuario.getPwd())) { //Comparamos contraseña suministrada con la autogenerada
				usuariosLoggeados.add(usuario);
				respuestaBackend.setResult(true);
			}
		}
		else {
			System.out.println("El usuario: '" + nombre_login + "' no existe en el sistema.\n");
		}
		respuestaFinalFuncion.set_return(respuestaBackend);
		return respuestaFinalFuncion;
	}


	//TODO: Check si todo ok
	/**
	 * Borra un usuario del sistema
	 * @param removeUser Objeto con el nombre del usuario a borrar
	 * @return removeUserResponse Objeto indicando si se ha borrado correctamente
	 */
	public es.upm.fi.sos.t3.backend.RemoveUserResponse removeUser(es.upm.fi.sos.t3.backend.RemoveUser removeUser) {
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.fi.sos.t3.backend.xsd.RemoveUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.RemoveUserResponse(); 

		es.upm.fi.sos.t3.backend.xsd.RemoveUser usuarioABorrar = removeUser.getRemoveUser();
		String nombre_user_borrado = usuarioABorrar.getName();

		//INICIALIZACION RESPUESTA
		respuestaBackend.setResult(false);
		respuestaFinalFuncion.set_return(respuestaBackend);
		
		// COMPROBACION EXISTENCIA USUARIO
		boolean existe = usuariosRegistrados.containsKey(nombre_user_borrado); //TODO: Definir si asi o de la otra manera

		if(existe) {
			usuariosRegistrados.remove(nombre_user_borrado);
			respuestaBackend.setResult(true);
			respuestaFinalFuncion.set_return(respuestaBackend);
			return respuestaFinalFuncion;
		}
		System.out.println("El usuario: '" + nombre_user_borrado + "' no existe en el sistema.\n");
		return respuestaFinalFuncion;
	}
	

	//TODO: Check si todo ok
	/**
	 * permite que un usuario ya registrado pueda cambiar su contraseña.
	 * @param changePassword Objeto con los datos del usuario y las contraseñas
	 * @return changePasswordResponse Objeto indicando si se ha cambiado correctamente
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
	
	
	/**
	 * Averiguar si un usuario está registrado en el sistema.
	 * @param existUser Objeto con el nombre del usuario a comprobar
	 * @return existUserResponse Objeto indicando si el usuario existe
	 */
	public es.upm.fi.sos.t3.backend.ExistUserResponse existUser(es.upm.fi.sos.t3.backend.ExistUser existUser) {
		ExistUserResponse respuestaFinalFuncion = new ExistUserResponse();
		es.upm.fi.sos.t3.backend.xsd.ExistUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.xsd.ExistUserResponse();

		String nombreUsuario = existUser.getUsername().getName();
		boolean existe = usuariosRegistrados.containsKey(nombreUsuario);
	
		respuestaBackend.setResult(existe);
		respuestaFinalFuncion.set_return(respuestaBackend);

		return respuestaFinalFuncion;
	}

}
