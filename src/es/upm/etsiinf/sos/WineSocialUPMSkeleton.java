/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;
import org.apache.log4j.Level;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import es.upm.etsiinf.sos.model.xsd.FollowerList;
import es.upm.etsiinf.sos.model.xsd.Response;
import es.upm.etsiinf.sos.model.xsd.User;
import es.upm.etsiinf.sos.model.xsd.Username;
import es.upm.etsiinf.sos.model.xsd.Wine;
import es.upm.etsiinf.sos.model.xsd.WineList;
import es.upm.etsiinf.sos.model.xsd.WineRated;
import es.upm.etsiinf.sos.model.xsd.WinesRatedList;
import es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub;

/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */
public class WineSocialUPMSkeleton {
	
	public static int counter = 0;

	private String admin_password = "admin";
	private User activeUser;

	private boolean isLogged = false;

	public static Map<String,User> usersRegistered; // KEY: Nombre usuario -- VALUE: Objeto usuario
	public static Map<User,FollowerList> followersMap; // KEY: Objeto usuario -- VALUE: lista de seguidores
	public static List<Wine> winesList;
	public static Map<String, List<WineRated>> userRatedMap; // KEY: Objeto usuario -- VALUE: Lista de Vinos Puntuados
	
	private static final Logger logger = Logger.getLogger(WineSocialUPMSkeleton.class);
	
	public WineSocialUPMSkeleton() {
		
		if (usersRegistered == null) {
			User admin = new User();
			admin.setName("admin");
			admin.setPwd("admin");
			usersRegistered = new HashMap<String, User>();
			usersRegistered.put("admin", admin);
		}

		logger.debug("[IMP] Creada instancia: " + counter++);

		if (activeUser == null) logger.debug("Active user: null, isLogged: " + isLogged);
		else logger.debug("Active user: " + activeUser.getName() + ", isLogged: " + isLogged);

		if (followersMap == null) new HashMap<>();
		if (winesList == null) new ArrayList<>();
		if (userRatedMap == null) new HashMap<>();
		
	}
	
	//INICIALIZO LOGGER
	static {
        try {
            // Configurar el logger
            SimpleLayout layout = new SimpleLayout();
            ConsoleAppender consoleAppender = new ConsoleAppender(layout);
            FileAppender fileAppender = new FileAppender(layout, "app.log", true);

            logger.addAppender(consoleAppender);
            logger.addAppender(fileAppender);
            logger.setLevel(Level.DEBUG);  // Establecer el nivel del logger a DEBUG

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * FUNCION AUXILIAR.
	 * Imprime los nombres de las personas que tengo en mi lista de seguidores
	 * @return String representando un array con los nombres de las personas que tengo en mi lista de seguidores
	 */
	private String printStringListaFollowers() {
		String res = "";
		String[] arr = followersMap.get(activeUser).getFollowers();
		for (int i = 0; i < arr.length; i++) {
			if(i > 0) {
				res += ", ";
			}
			res += "[" + i + "]:" + "'" + arr[i] + "'";
        }
		return res;
    }

	/**
	 * FUNCION AUXILIAR.
	 * Imprime los nombres de los vinos que tengo en mi lista de vinos
	 * @return String representando un array con los nombres de los vinos que tengo en mi lista de vinos
	 */
	public String getSeguidores() {
	    StringBuilder usuariosInfo = new StringBuilder("MAPA FOLLOWERS = ");
	    
	    for (Map.Entry<User, FollowerList> entry : followersMap.entrySet()) {
	        usuariosInfo.append("[NOMBRE: ").append(entry.getKey())
	                    .append(", SEGUIDORES: ").append(printStringListaFollowers()).append("]\n");
	    }
	    return usuariosInfo.toString();
	}


	/**
	 * FUNCION AUXILIAR.
	 * Imprime la lista de vinos
	 * @param vino Vino a imprimir
	 * @return String con la informacion del vino
	 */
	private String printWineRated(WineRated vino) {
		String res = "[";
		res += "Nombre: " + vino.getName() + ", Año: " + vino.getYear() + ", Uva: " + vino.getGrape() + 
				", Puntuacion: " + vino.getRate();
		return res + "]";
	}
	
	/**
	 * FUNCION AUXILIAR.
	 * Imprime el mapa de puntuaciones
	 * @return String con la informacion de las puntuaciones
	 */
	public String imprimeRatedMap(){
	    StringBuilder ratedInfo = new StringBuilder("MAPA PUNTUACIONES = ");
	    
	    for (Map.Entry<String, List<WineRated>> entry : userRatedMap.entrySet()) {
	        ratedInfo.append("[NOMBRE: ").append(entry.getKey()).append(", PUNTUADOS: [");
	        
	        List<WineRated> ratedList = entry.getValue();
	        for (int i = 0; i < ratedList.size(); i++) {
	            ratedInfo.append(printWineRated(ratedList.get(i)));
	            if (i < ratedList.size() - 1) {
	                ratedInfo.append(", ");
	            }
	        }
	        ratedInfo.append("]]\n");
	    }
	    return ratedInfo.toString();
	}

	/**
	 * FUNCION AUXILIAR.
	 * usuarioRegistrado(user1)
	 * Comprueba si el usuario pasado como parametro está registrado
	 * @param nombreUsuario Nombre del usuario a comprobar
	 * @return true si está registrado, false en caso contrario
	 */
	private boolean usuarioRegistrado(String username) throws RemoteException {
		boolean result = false;
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUser existUser = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUser();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Username username2 = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Username();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub stub = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE existResult = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE();

		username2.setName(username);
		existUser.setUsername(username2);
		  
		existResult =  stub.existUser(existUser);
		result = existResult.get_return().getResult();
		  
		return result;
	}

	/**
	 * userAdmin.addUser(user1)
	 * Añade e user1 a la red social
	 * @param addUser Objeto con los datos del usuario a añadir
	 * @return AddUserResponse: Objeto que contiene la contraseña + booleano de exito de operacion
	 * @throws RemoteException 
	 */
 	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) throws RemoteException {
		logger.debug("METODO: [ADDUSER]");
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();

		UPMAuthenticationAuthorizationWSSkeletonStub stub = new UPMAuthenticationAuthorizationWSSkeletonStub();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser stubAddUser = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd stubUserBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponse stubAddUserResponse = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponse();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponseBackEnd stubAddUserResponseBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponseBackEnd();

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		response.setPwd(null);
		respuestaFinalFuncion.set_return(response);

		if (!isLogged) { // isLooged == false
			logger.error("Error. No puedes añadir usuarios sin estar loggeado.");
			return respuestaFinalFuncion;
		}

		String username = addUser.getArgs0().getUsername();

		// COMPROBACION ADMIN
		if(!activeUser.getName().equals("admin")) {
			logger.error("Error. No tienes permisos para añadir usuarios. Se debe ser administrador.");
			return respuestaFinalFuncion;
		}

		// COMPROBACION USUARIO YA REGISTRADO
		if(usuarioRegistrado(username)) {
			logger.error("Error. El usuario: " + username + " ya está registrado en el sistema.");
			return respuestaFinalFuncion;
		}

		stubUserBackend.setName(username);
		stubAddUser.setUser(stubUserBackend);

		stubAddUserResponse = stub.addUser(stubAddUser);
		stubAddUserResponseBackend = stubAddUserResponse.get_return();

		response.setResponse(stubAddUserResponseBackend.getResult());
		response.setPwd(stubAddUserResponseBackend.getPassword());
		respuestaFinalFuncion.set_return(response);

		// SI HA IDO BIEN, LO AÑADO AL MAPA
		if(response.getResponse()) {
			User usuario = new User();
			usuario.setName(username);
			usuario.setPwd(stubAddUserResponseBackend.getPassword());
			response.setResponse(true);
			response.setPwd(stubAddUserResponseBackend.getPassword());
			respuestaFinalFuncion.set_return(response);
			usersRegistered.put(username, usuario);
			logger.info("Usuario: '" + username + "' añadido con éxito.");
			return respuestaFinalFuncion;
		}
		
		logger.error("Error. No se pudo añadir al usuario: '" + username + "'.");
		response.setResponse(false);
		response.setPwd(null);
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	

	/**
	 * userAdmin.login(user1)
	 * Comienza una nueva sesion para user1
	 * @param login Objeto con los datos del usuario a loggear
	 * @return loginResponse Objeto inddicando si se ha loggeado correctamente
	 */
 	
	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) throws RemoteException {
		logger.debug("METODO: [LOGIN]");
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();  
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub stub = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Login stubLogin = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Login();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd stubLoginBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse stubLoginResponse = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponseBackEnd stubLoginResponseBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponseBackEnd();

				
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio
		
		// OBTENGO EL USUARIO Y CONTRASEÑA DEL PARAMETRO
		User usuario = login.getArgs0();
		String name = usuario.getName();
		String password = usuario.getPwd();
		
		logger.debug("Intentando login para el usuario: " + name + " con contraseña: <" + password + ">");
		logger.debug("Mi isLogged es => " + isLogged);
		
		if (!usuarioRegistrado(name)) {
			logger.error("Error. El usuario: '" + name + "' no está registrado en el sistema.");
			return respuestaFinalFuncion;
		}
		activeUser = usersRegistered.get(name);
		
		// SI SE HACE LOGIN DE FORMA REPETIDA, DA IGUAL LA CONTRASEÑA.
		if(isLogged) {
			boolean res = activeUser.getName().equals(name) ? true : false;
			response.setResponse(res);
			respuestaFinalFuncion.set_return(response);
			logger.info("Ya está loggeado " + res + ", " + activeUser.getName() + " - " + name);
			return respuestaFinalFuncion;
		}
		
		// COMPROBACION ADMIN -> local
		if (name.equals("admin") && password.equals(admin_password)) {
			isLogged = true;
			activeUser = usersRegistered.get(name); //el usuario actual es el admin
			//activeUser.setName("admin");
			//activeUser.setPwd("admin");
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			logger.info("Usuario actual: " + activeUser.getName() + ", valor de isLogged: " + isLogged); //deberia dar "admin" + true
			return respuestaFinalFuncion;
		}
		

		stubLoginBackend.setName(name);
		stubLoginBackend.setPassword(password);
		stubLogin.setLogin(stubLoginBackend);

		// COMPROBCION DE EXISTENCIA DEVUELTO POR BACKEND
		stubLoginResponse = stub.login(stubLogin);
		stubLoginResponseBackend = stubLoginResponse.get_return();

		response.setResponse(stubLoginResponseBackend.getResult()); //Resultado del backend
		respuestaFinalFuncion.set_return(response);

		// SI EL LOGIN HA IDO BIEN
		logger.debug("La respuesta del backend ha sido: " + response.getResponse());
		if(response.getResponse()) {
			isLogged = true; //logged en el backend
			activeUser = usersRegistered.get(name);
			logger.info("Sesion iniciada en backend con éxito. Usuario actual es: " + activeUser.getName());
			return respuestaFinalFuncion;
		}

		logger.error("Error. Contraseña incorrecta.");
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * user1.logout()
	 * Cierra la sesión del usuario QUE LA INVOCA
	 * @param logout Objeto vacio (creo)
	 * @return logoutResponse Objeto indicando si se ha cerrado correctamente la sesion
	 */
	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) throws RemoteException {
		logger.debug("METODO: [LOGOUT]");
		LogoutResponse respuestaFinalFuncion = new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
			
		// COMPROBACION SESION INICIADA
		if (!isLogged) {
			logger.error("Error. No puedes cerrar sesión al no estar loggeado.");
			response.setResponse(false);
		} else {
			isLogged = false;
			activeUser = null;
			logger.info("Has cerrado sesión.");
			response.setResponse(true);
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * userAdmin.removeUser(user1) // user1.removeUser(user1)
	 * Elimina al usuario pasado como parametro del sistema
	 * @param removeUser Objeto con el nombre del usuario a borrar
	 * @return removeUserResponse Objeto indicando si se ha borrado correctamente
	 */
	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) throws RemoteException {
		logger.debug("METODO: [REMOVE_USER]");
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub stub = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE removeUserE = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser removeUserE2 = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE removeResponseE = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE();
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		String nombreUsuarioBorrado = removeUser.getArgs0().getUsername();
		
		if (!isLogged) {
			logger.error("Error. No puedes eliminar usuarios sin estar loggeado.");
			return respuestaFinalFuncion;
		}
		
		//---AQUI ENTONCES ESTOY LOGGEADO---
		
		// EL ADMIN NO SE PUEDE BORRAR
		if(nombreUsuarioBorrado.equals("admin")) {
			logger.error("Error. No se puede borrar al admin.");
			return respuestaFinalFuncion;
		}

		// COMPROBACION USUARIO EXISTENTE
		if(!usuarioRegistrado(nombreUsuarioBorrado)) {
			logger.error("Error. El usuario no existe en el sistema.");
			return respuestaFinalFuncion;
		}
		
		logger.debug("Active user llamante: " + activeUser.getName());
		
		//si soy el ADMIN O el mismo usuario que se quiere borrar => VA BIEN
		if((activeUser.getName().equals("admin")) || (activeUser.getName().equals(nombreUsuarioBorrado))) {

			logger.debug("(ActiveUser: " + activeUser.getName() + ", Usuario a borrar:  " + nombreUsuarioBorrado + ")");

			User usuario = usersRegistered.get(nombreUsuarioBorrado);
		
			// PARAMETROS A PASAR AL BACKEND
			removeUserE2.setName(usuario.getName());
			removeUserE2.setPassword(usuario.getPwd());
			removeUserE.setRemoveUser(removeUserE2);
			
			removeResponseE = stub.removeUser(removeUserE);
			response.setResponse(removeResponseE.get_return().getResult()); 
			
			// SI EL BORRADO HA IDO BIEN
			if(response.getResponse()) {
				usersRegistered.remove(nombreUsuarioBorrado);
				respuestaFinalFuncion.set_return(response);
				logger.info("Usuario: '" + nombreUsuarioBorrado + "' borrado con exito.");
				return respuestaFinalFuncion;
			}

			logger.error("Error. No se pudo borrar al usuario: '" + nombreUsuarioBorrado);
			return respuestaFinalFuncion;
		}

		logger.error("Error. No tienes permisos para eliminar usuario. Se debe ser administrador o el propio usuario a borrar.");
		return respuestaFinalFuncion;

	}

	/**
	 * user1.changePassword(oldpwd, newpwd)
	 * Cambia la contraseña del usuario que la invoca
	 * @param changePassword Objeto con la contraseña antigua y la nueva
	 * @return changePasswordResponse Objeto indicando si se ha cambiado correctamente
	 */
	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) throws RemoteException {
		logger.debug("METODO: [CHANGE_PASSWORD]");
		ChangePasswordResponse respuestaFinalFuncion = new ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub stub = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword upmChangePassword = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd upmChangePasswordBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd();

		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE changeRes = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE();

		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en inicio

		logger.debug("Valor de isLogged: " + isLogged);

		if (!isLogged) {
			logger.error("Error. No puedes cambiar contraseña sin estar loggeado.");
			return respuestaFinalFuncion;
		}

		// EXTRAEMOS CONTRASEÑAS
		String oldPassword = changePassword.getArgs0().getOldpwd();
		String newPassword = changePassword.getArgs0().getNewpwd();
		
		// SI ES EL ADMIN NO LLAMO AL BACKEND
		if(activeUser.getName().equals("admin")) {
			if(activeUser.getPwd().equals(oldPassword)) { //las contraseñas coinciden
				activeUser.setPwd(newPassword);
				admin_password = newPassword;
				
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				logger.info("Se ha cambiado la contraseña del admin correctamente. Contraseña nueva: " + newPassword + "Valor response= " + response.getResponse());
				return respuestaFinalFuncion;
			}
			else {
				logger.error("Error. La contraseña no coincide, no se pudo cambiar.");
				return respuestaFinalFuncion;
			}
		}
		
		upmChangePasswordBackend.setName(activeUser.getName());
		upmChangePasswordBackend.setNewpwd(newPassword);
		upmChangePasswordBackend.setOldpwd(oldPassword);
		upmChangePassword.setChangePassword(upmChangePasswordBackend);
		  
		changeRes = stub.changePassword(upmChangePassword);

		response.setResponse(changeRes.get_return().getResult());
		respuestaFinalFuncion.set_return(response);
		
		// SI EL CHANGEPASSWORD HA IDO BIEN
		if(response.getResponse()) logger.info("Contraseña cambiada correctamente!!");
		else logger.error("Error. La contraseña no coincide, no se pudo cambiar.");

		return respuestaFinalFuncion;
	}
	

	/**
	 * FUNCION AUXILIAR.
	 * Comprueba si el usuario pasado como parametro es seguidor del usuario que la invoca
	 * @param name Nombre del usuario a comprobar
	 * @return true si es seguidor, false en caso contrario
	 */
	private boolean followerExist(String name) {
	    boolean existe = false;
	    if (followersMap.get(activeUser).getFollowers() != null) {
	        String[] seguidores = followersMap.get(activeUser).getFollowers();
	        for (int i = 0; i < seguidores.length; i++) {
	            if (seguidores[i].equals(name)) {
	                existe = true;
	            }
	        }
	    }
	    return existe;
	}
	
	/**
	 * user1.addFollower(user2) --> user1 FOLLOWS a user2.
	 * Usuario que la invoca sigue al usuario que se le pasa como parametro.
	 * Se añade user2 a la lista de seguidos de user1
	 * Follower: Persona a la que sigues, no persona que sigue.
	 * @param addFollower Objeto con el nombre del usuario a seguir
	 * @return addFollowerResponse Objeto indicando si se ha seguido correctamente
	 * @throws RemoteException 
	 */
	public es.upm.etsiinf.sos.AddFollowerResponse addFollower(es.upm.etsiinf.sos.AddFollower addFollower) throws RemoteException {
		logger.debug("METODO: [ADD_FOLLOWER]");
		AddFollowerResponse respuestaFinalFuncion = new AddFollowerResponse();
		Response response = new Response();

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio
		
		// USUARIO A SEGUIR
		Username username = addFollower.getArgs0();
		String nombreUsuarioASeguir = username.getUsername(); //el usuario al que se va a seguir 

		// COMPROBACION DE LOGGEADO USER1 
		if (!isLogged) {
			logger.error("Error. No puedes seguir a un usuario sin estar loggeado.");
			return respuestaFinalFuncion;
		}

		// COMPROBACION DE EXISTENCIA USUARIO A SEGUIR
		if(!usuarioRegistrado(nombreUsuarioASeguir)) {
			logger.error("Error. El usuario: '" + nombreUsuarioASeguir + "' no existe en el sistema.");
			return respuestaFinalFuncion;
		}
		
		logger.debug("Estoy aqui");
		FollowerList listaSeguidores = followersMap.get(activeUser); //LISTA DE SEGUIDOS DE USUARIO ACTUAL
		logger.debug("Estoy ahora aqui");

		if(listaSeguidores == null) { 
			listaSeguidores = new FollowerList();
			followersMap.put(activeUser, listaSeguidores);
		}
		
		// COMPROBACION EXISTENCIA USUAIRO
		if(!followerExist(nombreUsuarioASeguir)) {
			listaSeguidores.addFollowers(nombreUsuarioASeguir);
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			logger.info("El usuario: '" + activeUser + "' ha empezado a seguir a: '" + nombreUsuarioASeguir + "' como seguidor.");
			return respuestaFinalFuncion;
		}

		logger.error("Error. El usuario: '" + activeUser + "' ya sigue a: '" + nombreUsuarioASeguir + ".");
		return respuestaFinalFuncion;
	}

	/**
	 * FUNCION AUXILIAR.
	 * Borra un seguidor de la lista de seguidores del usuario que la invoca
	 * @param seguidor Nombre del seguidor a borrar
	 */
	private void borrarSeguidor (String seguidor) {
		int res = -1;
		boolean encontrado = false;
        String[] seguidores = followersMap.get(activeUser).getFollowers();

        for (int i = 0; i < seguidores.length && !encontrado; i++) {
            if (seguidores[i].equals(seguidor)) {
                res = i;
				encontrado = true;
            }
        }

        if (res != -1) {
            String[] followersN = new String[seguidores.length - 1]; //Nueva lista de tamaño - 1

            int j = 0;
            for (int i = 0; i < seguidores.length; i++) {
                if (i != res) {
                	followersN[j] = seguidores[i];
                    j++;
                }
            }
            followersMap.get(activeUser).setFollowers(followersN);
        }
	}

	/**
	 * user1.unfollow(user2) --> user1 UNFOLLOWS a user2.
	 * @param unfollow Objeto con el nombre del usuario a dejar de seguir
	 * @return unfollowResponse Objeto indicando si se ha dejado de seguir correctamente
	 * @throws RemoteException 
	 */
	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) throws RemoteException {
		UnfollowResponse respuestaFinalFuncion = new UnfollowResponse();
		Response reponse = new Response();

		Username usuarioUnfollow = unfollow.getArgs0();
		String nombreUsuarioUnfollow = usuarioUnfollow.getUsername();

		// INICIALIZACION RESPUESTA
		reponse.setResponse(false);
		respuestaFinalFuncion.set_return(reponse); //False en incio

		// COMPROBACION DE LOGGEADO USER1 
		if (activeUser == null) {
			logger.error("Error. Para dejar de seguir a un usuario se debe haber iniciado sesión previamente.");
			return respuestaFinalFuncion;
		}

		// COMPROBACION DE EXISTENCIA USUARIO A SEGUIR
		if(!usuarioRegistrado(nombreUsuarioUnfollow)) {
			logger.error("Error. El usuario: '" + nombreUsuarioUnfollow + "' no existe en el sistema.");
			return respuestaFinalFuncion;
		}	
		
		if(followerExist(nombreUsuarioUnfollow)) {
			borrarSeguidor(nombreUsuarioUnfollow);
			reponse.setResponse(true);
			respuestaFinalFuncion.set_return(reponse);
			logger.info("El usuario: '" + activeUser + "' ha dejado de seguir a: '" + nombreUsuarioUnfollow + ".");
			return respuestaFinalFuncion;
		}

		logger.error("Error. El usuario: '" + activeUser + "' no sigue a: '" + nombreUsuarioUnfollow + "' y por tanto no lo puede borrar.");
		return respuestaFinalFuncion;
	}
	
	/**
	 * user1.getMyFollowers().
	 * Devuelve la lista de los usuarios a los que sigue user1.
	 * @param getMyFollowers Objeto vacio (creo)
	 * @return getMyFollowersResponse Objeto con la lista de seguidores
	 */
	public es.upm.etsiinf.sos.GetMyFollowersResponse getMyFollowers(es.upm.etsiinf.sos.GetMyFollowers getMyFollowers) {
		GetMyFollowersResponse respuestaFinalFuncion = new GetMyFollowersResponse();
		FollowerList listaSeguidores = new FollowerList(); 

		// INICIALIZACION RESPUESTA
		listaSeguidores.setResult(false);
		respuestaFinalFuncion.set_return(listaSeguidores); //False en incio
		
		if(activeUser != null) {
			listaSeguidores.setFollowers(followersMap.get(activeUser).getFollowers()); // METO SEGUIDORES DEL MAPA EN LA CLASE FollowersList
			listaSeguidores.setResult(true);
			respuestaFinalFuncion.set_return(listaSeguidores); 
			return respuestaFinalFuncion;
		}

		logger.error("Error. Para ver tus seguidores debes haber iniciado sesión previamente.");
		return respuestaFinalFuncion;		
	}


	/** 
	 * FUNCION AUXILIAR.
	 * Comprueba si existe el vino pasado como parametros en una 
	 * @param vino Vino a comprobar
	 * @return true si existe, false en caso contrario
	 */
	private boolean existeVino(Wine vino) {    
		for (Wine vinoList : winesList) {
			if (vinoList.getGrape().equals(vino.getGrape()) && 
				vinoList.getName().equals(vino.getName()) && 
				vinoList.getYear() == vino.getYear()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * userAdmin.addWine(vino1).
	 * Añade un vino a la red social.
	 * @param addWine Objeto con los datos del vino a añadir
	 * @return addWineResponse Objeto indicando si se ha añadido correctamente
	 */
	public es.upm.etsiinf.sos.AddWineResponse addWine(es.upm.etsiinf.sos.AddWine addWine) {
		AddWineResponse respuestaFinalFuncion = new AddWineResponse();
		Response response = new Response();
		
		Wine vino = new Wine();
		vino = addWine.getArgs0();
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// COMPROBACION DE ADMIN
		if(activeUser.getName().equals("admin")) {
			if(!existeVino(vino)) {
				winesList.add(vino); 
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				logger.debug("Se ha añadido el vino: '" + vino.getName() + "' con éxito.");
			} else {
				logger.debug("El vino: '" + vino.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vino.getGrape() + "\n" +
				"\t\tAño: " + vino.getYear() + "\n" +
				"ya existe en la red social.\n");
				return respuestaFinalFuncion;
			}
		} else
			logger.debug("No tienes permisos para crear vinos. Se debe ser administrador.");
		return respuestaFinalFuncion;
	}

	/**
	 * userAdmin.removeWine(vino1)
	 * Elimina un vino de la red social
	 * @param removeWine Objeto con los datos del vino a borrar
	 * @return removeWineResponse Objeto indicando si se ha borrado correctamente
	 */
	public es.upm.etsiinf.sos.RemoveWineResponse removeWine(es.upm.etsiinf.sos.RemoveWine removeWine) {
		RemoveWineResponse respuestaFinalFuncion = new RemoveWineResponse();
		Response response = new Response();
		
		Wine vinoBorrado = removeWine.getArgs0();
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// COMPROBACION DE ADMIN
		if(activeUser.getName().equals("admin")) {
			if(!existeVino(vinoBorrado)) {
				logger.debug("El vino: '" + vinoBorrado.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vinoBorrado.getGrape() + "\n" +
				"\t\tAño: " + vinoBorrado.getYear() + "\n" +
				"no existe en la red social.\n");
				return respuestaFinalFuncion;
			} else {
				winesList.remove(vinoBorrado);
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				logger.debug("Se ha borrado el vino: '" + vinoBorrado.getName() + "' con éxito.");
				return respuestaFinalFuncion;
			}
		} else
			logger.debug("No tienes permisos para crear vinos. Se debe ser administrador.");
		return respuestaFinalFuncion;
	}

	/**
	 * user1.getWines()
	 * Devuelve la lista de vinos existentes en la red social.
	 * @param getWines
	 * @return getMyRatesResponse
	 */
	public es.upm.etsiinf.sos.GetWinesResponse getWines(es.upm.etsiinf.sos.GetWines getWines) {
		GetWinesResponse respuestaFinalFuncion = new GetWinesResponse();

		WineList listaVinos = new WineList();

		// INICIALIZACION RESPUESTA
		listaVinos.setResult(false);
		respuestaFinalFuncion.set_return(listaVinos); //False en incio

		// COMPROBACION DE LOGGEADO
		if(activeUser != null) {
			// MAX INDEX (Para recorrerla hacia atras)
			int j = winesList.size() - 1;

			// CREACION ARRAYS RESPUESTA
			String[] nombresVinos = new String[winesList.size()];
			String[] nombresUva = new String[winesList.size()];
			int[] años = new int[winesList.size()];
			
			for(int i=0; i<winesList.size(); i++) {
				Wine vino = new Wine();

				// Leemos
				vino.setName(winesList.get(i).getName()); //cojo el nombre del vino
				vino.setGrape(winesList.get(i).getGrape()); //cojo el tipo de uva
				vino.setYear(winesList.get(i).getYear()); //cojo el año

				// Escribimos
				nombresVinos[j] = vino.getName();
				nombresUva[j] = vino.getGrape();
				años[j] = vino.getYear();
				j--;
			}
			listaVinos.setNames(nombresVinos);
			listaVinos.setGrapes(nombresUva);
			listaVinos.setYears(años);
			listaVinos.setResult(true);
			respuestaFinalFuncion.set_return(listaVinos);
			return respuestaFinalFuncion;
		}
		else 
			logger.error("Error. Para ver los vinos debes haber iniciado sesión previamente.");
		return respuestaFinalFuncion;
	}


	/**
	 * user1.rateWine(vino1, puntuacion)
	 * Crea una puntucaion al vino especificada por un usuario
	 * @param rateWine Objeto con el nombre del vino a puntuar y la puntuacion
	 * @return rateWineResponse Objeto indicando si se ha puntuado correctamente
	 */
	public es.upm.etsiinf.sos.RateWineResponse rateWine(es.upm.etsiinf.sos.RateWine rateWine) {
		RateWineResponse respuestaFinalFuncion = new RateWineResponse();
		Response response = new Response();
		Wine vino = new Wine();
		WineRated vinoPuntuado = rateWine.getArgs0();
		List<WineRated> listaPuntuados;
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio
		
		//setteo de parametros para buscar si hay alguno exactamente con los MISMOS atributos
		vino.setName(vinoPuntuado.getName());
		vino.setGrape(vinoPuntuado.getGrape());
		vino.setYear(vinoPuntuado.getYear());
		
		// COMPROBACION DE LOGGEADO
		if (activeUser != null) {
			//si el vino existe lo puedo puntuar
			if (existeVino(vino)) {
				// compruebo que la puntuacion que se le da está entre 0 y 10
				if (vinoPuntuado.getRate() >= 0 && vinoPuntuado.getRate() <= 10) {
					// Añado puntuacion asociada al usuario que la ha puesto
					//lo añado siempre que no exista ya dentro, sino sobreescribo
					
					//obtengo la lista de vinos puntuados por el usuario actual (si no hay la creo)
					listaPuntuados = userRatedMap.getOrDefault(activeUser, new ArrayList<>());
					
					// Busco si el vino ya está en la lista
	                boolean vinoEncontrado = false;
	                for (int i = 0; i < listaPuntuados.size(); i++) {
	                    WineRated vinoExistente = listaPuntuados.get(i);
	                    if (vinoExistente.getName().equals(vinoPuntuado.getName()) &&
	                        vinoExistente.getGrape().equals(vinoPuntuado.getGrape()) &&
	                        vinoExistente.getYear() == vinoPuntuado.getYear()) {
	                    	
	                        // Si se encuentra el vino, se actualiza la puntuación
	                        listaPuntuados.set(i, vinoPuntuado);
	                        vinoEncontrado = true;
	                        break;
	                    }
	                }

	                //si no se encontró en la lista, se añade
					if(!vinoEncontrado) {
						listaPuntuados.add(vinoPuntuado);
					}

					//actualizo el mapa con la lista modificada
					userRatedMap.put(activeUser.getName(), listaPuntuados);
					response.setResponse(true);
	                respuestaFinalFuncion.set_return(response);

	                logger.info("Se ha puntuado el vino: '" + vino.getName() + "' con un: '" + vinoPuntuado.getRate() + "' con éxito.");
	                return respuestaFinalFuncion;
				}
				else {
					logger.error("Error. La puntuación debe estar entre 0 y 10.");
					return respuestaFinalFuncion;
				}
			}
			else {
				logger.error("Error. El vino: '" + vino.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vino.getGrape() + "\n" +
				"\t\tAño: " + vino.getYear() + "\n" +
				"no existe en la red social.");
				return respuestaFinalFuncion;
			}
		}
		else
			logger.error("Error. Para puntuar un vino se debe haber iniciado sesión previamente.");
		return respuestaFinalFuncion;
	}

	
	/**
	 * user1.getMyRates()
	 * Devuelve los ultimos vinos puntuados por user1
	 * @param getMyRates
	 * @return
	 */
	public es.upm.etsiinf.sos.GetMyRatesResponse getMyRates(es.upm.etsiinf.sos.GetMyRates getMyRates) {
		GetMyRatesResponse respuestaFinalFuncion = new GetMyRatesResponse();
		WinesRatedList listaVinosPuntuados = new WinesRatedList();
		List<WineRated> puntuados = userRatedMap.get(activeUser.getName());
		
		// INICIALIZACION RESPUESTA
		listaVinosPuntuados.setResult(false);
		respuestaFinalFuncion.set_return(listaVinosPuntuados);

		 // COMPROBACION DE LOGGEADO
		 if(activeUser != null) {
		 	// MAX INDEX (Para recorrerla hacia atras)
		 	int j = puntuados.size() - 1;

		 	// CREACION ARRAYS RESPUESTA
		 	String[] nombresVinos = new String[puntuados.size()]; //habrá tantos nombres como vinosPuntuados
		 	String[] nombresUva = new String[puntuados.size()]; //habrá tantos nombresUva como vinosPuntuados
		 	int[] años = new int[puntuados.size()]; //habrá tantos años como vinosPuntuados
			int[] puntuaciones = new int[puntuados.size()];
		 	
		 	for(int i=0; i<puntuados.size(); i++) {
		 		WineRated vinoPuntuado = new WineRated();

		 		// Leemos
		 		vinoPuntuado.setName(puntuados.get(i).getName()); //cojo el nombre del vino
		 		vinoPuntuado.setGrape(puntuados.get(i).getGrape()); //cojo el tipo de uva
		 		vinoPuntuado.setYear(puntuados.get(i).getYear()); //cojo el año
		 		vinoPuntuado.setRate(puntuados.get(i).getRate()); //cojo la puntuacion
		 		
		 		// Escribimos al reves en el array
		 		nombresVinos[j] = vinoPuntuado.getName();
		 		nombresUva[j] = vinoPuntuado.getGrape();
		 		años[j] = vinoPuntuado.getYear();
		 		puntuaciones[j] = vinoPuntuado.getRate();
		 		j--;
		 	}
		 	listaVinosPuntuados.setNames(nombresVinos);
		 	listaVinosPuntuados.setGrapes(nombresUva);
		 	listaVinosPuntuados.setYears(años);
		 	listaVinosPuntuados.setRates(puntuaciones);
		 	listaVinosPuntuados.setResult(true);
		 	respuestaFinalFuncion.set_return(listaVinosPuntuados);
		 	return respuestaFinalFuncion;
		}
		else 
		 	logger.error("Error. Para ver los vinos debes haber iniciado sesión previamente.");
		return respuestaFinalFuncion;
	}


	/**
	 * user1.getMyFollowerRates(follower1)
	 * Devuelve los últimos vinos puntuados por el follower que se pasa por parametro ([follower1])
	 * Devuelve true si se hace login correctamente y si sigue al usuario pasado por parametro ([follower1])
	 * Deben estar ordenados de manera inversa a su puntuacion, primero los últimos vinos que el usuario puntuó 
	 * @param getMyFollowerRates
	 * @return getMyFollowerRatesResponse
	 */
	
	public es.upm.etsiinf.sos.GetMyFollowerRatesResponse getMyFollowerRates(es.upm.etsiinf.sos.GetMyFollowerRates getMyFollowerRates) {
		GetMyFollowerRatesResponse respuestaFinalFuncion = new GetMyFollowerRatesResponse();
		Username username = getMyFollowerRates.getArgs0();
		String nombreFollower = username.getUsername();
		WinesRatedList listaPuntuados = new WinesRatedList(); //la obtengo de la llamada al mapa  de los vinos puntuados
		
		// INICIALIZACION RESPUESTA
		listaPuntuados.setResult(false);
		respuestaFinalFuncion.set_return(listaPuntuados);
		
		//si estoy loggeado y sigo al [follower1] entonces devuelvo su lista (invertida)
		if((activeUser != null) && followerExist(nombreFollower)){
			//accedo al mapa de los vinos puntuados por [follower1]
			List<WineRated> puntuados = userRatedMap.get(nombreFollower);
			
			if(puntuados != null && !puntuados.isEmpty()) {
				// MAX INDEX (Para recorrerla hacia atras)
	            int j = puntuados.size() - 1;
	            
				// CREACION ARRAYS RESPUESTA
	            String[] nombresVinos = new String[puntuados.size()];
	            String[] nombresUva = new String[puntuados.size()];
	            int[] años = new int[puntuados.size()];
	            int[] puntuaciones = new int[puntuados.size()];
	            
	            for (int i = 0; i < puntuados.size(); i++) {
	                WineRated vinoPuntuado = puntuados.get(i);

	                // Escribimos al reves en el array
	                nombresVinos[j] = vinoPuntuado.getName();
	                nombresUva[j] = vinoPuntuado.getGrape();
	                años[j] = vinoPuntuado.getYear();
	                puntuaciones[j] = vinoPuntuado.getRate();
	                j--;
	            }
	            listaPuntuados.setNames(nombresVinos);
	            listaPuntuados.setGrapes(nombresUva);
	            listaPuntuados.setYears(años);
	            listaPuntuados.setRates(puntuaciones);
	            listaPuntuados.setResult(true);
			}
		}
		else
			logger.error("Error. Para ver los vinos de un seguidor, debes haber iniciado sesión y el seguidor debe existir.");
			
		respuestaFinalFuncion.set_return(listaPuntuados);
		return respuestaFinalFuncion;
	}

}