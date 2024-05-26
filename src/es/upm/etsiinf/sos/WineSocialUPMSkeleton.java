/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.etsiinf.sos.model.xsd.FollowerList;
import es.upm.etsiinf.sos.model.xsd.Response;
import es.upm.etsiinf.sos.model.xsd.User;
import es.upm.etsiinf.sos.model.xsd.Username;
import es.upm.etsiinf.sos.model.xsd.Wine;
import es.upm.etsiinf.sos.model.xsd.WineList;
import es.upm.etsiinf.sos.model.xsd.WineRated;
import es.upm.etsiinf.sos.model.xsd.WinesRatedList;
/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */
public class WineSocialUPMSkeleton {
	
	public static final String ADMIN_NAME = "admin";
	public static final String ADMIN_PWD = "admin";
	
	public static int counter = 0;
	
	private String username = "";
	private String password = "";
	private boolean loggeado = false;

	public static Map<String,FollowerList> followersMap = new HashMap<>(); // KEY: Nombre usuario -- VALUE: lista de seguidores
	public static List<Wine> winesList = new ArrayList<>();	
	public static Map<String, List<WineRated>> userRatedMap = new HashMap<>(); // KEY: Nombre usuario -- VALUE: Lista de Vinos Puntuados
	
	public WineSocialUPMSkeleton() {
		System.out.println("[IMP] Creada instancia: " + counter++);
	}

	//Getters y Setters para pruebas

	//---------------------------------------------------

	//---------------------------------------------------

	// Metodos auxiliares
	/**
	 * soyAdmin(user)
	 * Comprueba si user1 es el administador
	 * @param user Usuario a comprobar
	 * @return true si lo es, false en caso contrario
	 */
//	private boolean soyAdmin(User user) {
//		return (user.getName().equals(admin.getName())) && (user.getPwd().equals(admin.getPwd()));
//	}

	/**
	 * usuarioRegistrado(user1)
	 * Comprueba si el usuario pasado como parametro está registrado
	 * @param nombreUsuario Nombre del usuario a comprobar
	 * @return true si está registrado, false en caso contrario
	 */
	private boolean usuarioRegistrado (String nombreUsuario) throws RemoteException {
		boolean res = false;
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUser existUser = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUser();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Username username2 = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Username();
		
		username2.setName(nombreUsuario);
		existUser.setUsername(username2);
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub service = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE existResult =  service.existUser(existUser);
		
		res = existResult.get_return().getResult();
		return res;
	}
	

	/**
	 * Imprime los nombres de las personas loggeadas
	 * @return String representando un array con los nombres de las personas loggeadas
	 */
//	public String getLoggeados() {
//		String res = "[";
//		for(User usuarioLog : auth.getUsuariosLoggeados()) {
//			res += usuarioLog.getName() + " ";
//		}
//		return res + "]";
//	}

	/**
	 * user1.estoyLoggeado()
	 * Comprueba si el usuario que la invoca está loggeado
	 * @return true si está loggeado, false en caso contrario
	 */
//	private boolean estoyLoggeado() {
//		for (User usuario : auth.getUsuariosLoggeados()) {
//			if (usuario.getName().equals(this.this.username)) {
//				return true;
//			}
//		}
//		return false;
//	}
	//LO HE CAMBIADO POR UNA VARIABLE BOOLEANA QUE DICE SI ESTA O NO LOGGEADO EL USUARIO
	

	/**
	 * Comprueba si el usuario pasado como parametro es seguidor del usuario que la invoca
	 * @param name Nombre del usuario a comprobar
	 * @return true si es seguidor, false en caso contrario
	 */
	private boolean followerExist(String name) {
	    boolean existe = false;
	    if (followersMap.get(this.username).getFollowers() != null) {
	        String[] seguidores = followersMap.get(this.username).getFollowers();
	        for (int i = 0; i < seguidores.length; i++) {
	            //System.out.println("Comparando " + seguidores[i] + " con " + name);
	            if (seguidores[i].equals(name)) {
	                existe = true;
	                //System.out.println("Encontrado: " + seguidores[i]);
	            }
	        }
	    }
	    return existe;
	}

	/**
	 * Borra un seguidor de la lista de seguidores del usuario que la invoca
	 * @param seguidor Nombre del seguidor a borrar
	 */
	private void borrarSeguidor (String seguidor) {
		int res = -1;
		boolean encontrado = false;
        String[] seguidores = followersMap.get(this.username).getFollowers();

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
            followersMap.get(this.username).setFollowers(followersN);
        }
	}

	/**
	 * Imprime los nombres de las personas que tengo en mi lista de seguidores
	 * @return String representando un array con los nombres de las personas que tengo en mi lista de seguidores
	 */
	private String printStringListaFollowers() {
		String res = "";
		String[] arr = followersMap.get(this.username).getFollowers();
		for (int i = 0; i < arr.length; i++) {
			if(i > 0) {
				res += ", ";
			}
			res += "[" + i + "]:" + "'" + arr[i] + "'";
        }
		return res;
    }

	/**
	 * 
	 * @return
	 */
	public String getSeguidores() {
	    StringBuilder usuariosInfo = new StringBuilder("MAPA FOLLOWERS = ");
	    
	    for (Map.Entry<String, FollowerList> entry : followersMap.entrySet()) {
	        usuariosInfo.append("[NOMBRE: ").append(entry.getKey())
	                    .append(", SEGUIDORES: ").append(printStringListaFollowers()).append("]\n");
	    }
	    return usuariosInfo.toString();
	}


	/** 
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

	
	private String printWineRated(WineRated vino) {
		String res = "[";
		res += "Nombre: " + vino.getName() + ", Año: " + vino.getYear() + ", Uva: " + vino.getGrape() + 
				", Puntuacion: " + vino.getRate();
		return res + "]";
	}
	
	
	/**
	 * Funcion auxiliar para ver el mapa de puntuaciones impreso
	 * @param ninguno
	 * @return el mapa
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

	//---------------------------------------------------

	// Metodos principales

	/**
	 * userAdmin.addUser(user1)
	 * Añade e user1 a la red social
	 * @param addUser Objeto con los datos del usuario a añadir
	 * @return AddUserResponse: Objeto que contiene la contraseña + booleano de exito de operacion
	 * @throws RemoteException 
	 */
	
	//EN PRINCIPIO YA ESTÁ ARREGLADA
	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) throws RemoteException {
		//throw new java.lang.UnsupportedOperationException("Not implemented yet:" + this.getClass().getName() + "#addUser");

		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		Username username = addUser.getArgs0();
		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		es.upm.fi.sos.t3.backend.AddUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.AddUserResponse();
		//parametros del stub
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub service = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser addUserAuth = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd userBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd();
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// CREO EL USUARIO DEL BACKEND
		if (username.getUsername() == null || username.getUsername().isBlank()) {
			System.out.println("Error. El nombre de usuario no puede ser nulo ni vacío.\n");
			return respuestaFinalFuncion;
		}
		
		if(username.getUsername().equals("pepito")) {
			System.out.println("HOLAAA ENTROOO AQUIII");
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			return respuestaFinalFuncion;
		}
		
		//configuro el usuario que voy a pasar al stub
		userBackend.setName(username.getUsername());
		addUserAuth.setUser(userBackend);
		
		// COMPROBACION ADMIN
		 if(this.username.equals(ADMIN_NAME)) {
			if(!usuarioRegistrado(addUser.getArgs0().getUsername())) { // Ha creado el usuario
				//llamo al stub con el usuarioBackend
				es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponse addUserRes = service.addUser(addUserAuth);
				es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponseBackEnd result = addUserRes.get_return();
				
				// Seteo la respuesta
				response.setResponse(result.getResult());
				response.setPwd(result.getPassword());
				respuestaFinalFuncion.set_return(response);

				System.out.println("Se ha añadido al usuario: '" + username.getUsername() + "'' con contraseña: '" + respuestaBackend.get_return().getPassword() + "'\n");
				return respuestaFinalFuncion;
				
			} else {// No ha creado el usuario
				response.setResponse(false);
				respuestaFinalFuncion.set_return(response);
				System.out.println("El usuario: '" + username.getUsername() + "' ya existe en el sistema. No se ha podido registrar'.\n");
			}
		 }
		 else { // No soy el admin
			 System.out.println("No tienes permisos para crear usuarios. Se debe ser administrador.\n");
		 }
		return respuestaFinalFuncion;
	}

	
	/**
	 * userAdmin.login(user1)
	 * Comienza una nueva sesion para user1
	 * @param login Objeto con los datos del usuario a loggear
	 * @return loginResponse Objeto inddicando si se ha loggeado correctamente
	 */
	
	//EN PRINCIPIO YA ESTÁ ARREGLADA
	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) throws RemoteException {
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();  
		es.upm.fi.sos.t3.backend.xsd.LoginBackEnd loginBackend = new es.upm.fi.sos.t3.backend.xsd.LoginBackEnd();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub service = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Login upmLogin = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.Login();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd upmLoginBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd();
		
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		
		// OBTENGO EL USUARIO Y CONTRASEÑA DEL PARAMETRO
		User usuario = login.getArgs0();
		String name = usuario.getName();
		String password = usuario.getPwd();
		
		// PAARAMETROS A PASAR AL BACKEND
		loginBackend.setName(name);
		loginBackend.setPassword(password);
		
		
		//TODO: EL USUARIO ADMIN NO SE DEBE LOGGEAR ASI (SEGURO??)
		if (name.equals("admin")) {
			System.out.println("No está autorizado para iniciar sesión del usuario: '" + name + "'.\n");
			return respuestaFinalFuncion;
		}

		// LA COMPROBCION DE EXISTENCIA LO DEVUELVE EL BACKEND
		// Debemos llamar al backend para ver si da bien o mal (no existe o contraseña incorrecta)

		// COMPROBACION DE USUARIO AUTENTICADO
		if (loggeado) {
			boolean value = this.username.equals(name) ? true : false; //por si con sesion activa intenta loggear otro usuario
			response.setResponse(value);
			respuestaFinalFuncion.set_return(response);
			System.out.println("Usuario: '" + name + "' ya autenticado.\n");
			return respuestaFinalFuncion;
		}
		
		else { // En caso de no estar logeado --> Hacer login
			upmLoginBackend.setName(name);
			upmLoginBackend.setPassword(password);
			
			this.username = name;
			this.password = password;
			this.loggeado = true; //me loggeo
			
			upmLogin.setLogin(upmLoginBackend);
			es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse loginRes = service.login(upmLogin);

			response.setResponse(loginRes.get_return().getResult());
			
			//si ha ido bien el login => TRUE
			if(response.getResponse() == true) { // Caso de exito
				System.out.println("El usuario: '" + name + "' con la contraseña: '" + password +  "'' ha inciado sesión correctamente.\n");
				respuestaFinalFuncion.set_return(response);
				return respuestaFinalFuncion;

			} else { // Caso de fallo
				System.out.println("El usuario: '" + name + "' no se pudo autenticar.\n");
				return respuestaFinalFuncion;
			}
		}
	}
	
	
	/**
	 * user1.logout()
	 * Cierra la sesión del usuario QUE LA INVOCA
	 * @param logout Objeto vacio (creo)
	 * @return logoutResponse Objeto indicando si se ha cerrado correctamente la sesion
	 */
	
	//EN PRINCIPIO YA ESTÁ ARREGLADA
	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) throws RemoteException {
		LogoutResponse respuestaFinalFuncion = new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		//TODO: Ahora mismo nuestras listas solo tienen un user aunque tenga muchas sesiones abiertas
		//ESTO NO DEBERIA DE PASAR, EN ENUNCIADO DICE Q AUNQ NO SE HAGA LOGIN NO PASA NADA
		//System.out.println("Para cerrar sesión se debe haber iniciado sesión previamente.\n"); 
		
		// COMPROBACION SESION INICIADA (si estoy loggeado, cierro sesion)
		if(loggeado == true) {
			loggeado = false;
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			System.out.println("Has cerrado correctamente la sesión.\n");
		}	
		return respuestaFinalFuncion;
	}
	

	/**
	 * userAdmin.removeUser(user1) // user1.removeUser(user1)
	 * Elimina al usuario pasado como parametro del sistema
	 * @param removeUser Objeto con el nombre del usuario a borrar
	 * @return removeUserResponse Objeto indicando si se ha borrado correctamente
	 */
	
	//System.out.println("No se ha podido eliminar al usuario: '" + nombre_usuario + "' del sistema\n");	
	//System.out.println("No tienes permisos para borrar el usuario.\n");
	
	//EN PRINCIPIO YA ESTÁ ARREGLADA
	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) throws RemoteException {
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub service = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE removeUserE = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser removeUserE2 = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();
		
		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// OBTENGO EL USUARIO DEL PARAMETRO
		Username usuario = removeUser.getArgs0();
		String nombre_usuario = usuario.getUsername();
		
		
		// SOLO EL ADMIN O EL PROPIO USUARIO PUEDEN BORRAR SU CUENTA
		if(loggeado && (username.equals(ADMIN_NAME) || username.equals(this.username)) && !username.equals(ADMIN_NAME)) {
			// PARAMETROS A PASAR AL BACKEND
			removeUserE2.setName(username);
			removeUserE.setRemoveUser(removeUserE2);
			
			es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE removeResponseE =  service.removeUser(removeUserE);
			response.setResponse(removeResponseE.get_return().getResult());
			respuestaFinalFuncion.set_return(response); //False en incio
			System.out.println("Se ha eliminado al usuario: '" + nombre_usuario + "' del sistema\n");
			//TODO: REVISAR ESTO PRQ NOSOTROS TENDRIAMOS QUE BORRARLO DE FOLLOWERS
			//si se ha eliminado bien tendria que borrarse su lista de seguidores (prq ya no existe)
			if(removeResponseE.get_return().getResult()){
				  WineSocialUPMSkeleton.followersMap.remove(nombre_usuario);
			}			
		} else {
			System.out.println("Para borrar un usuario se debe haber iniciado sesión previamente.\n");
			return respuestaFinalFuncion;
		}
		
		//EL USUARIO ADMIN NO SE PUEDE BORRAR
		if (nombre_usuario.equals("admin")) {
			System.out.println("No está autorizado para eliminar el usuario: '" + nombre_usuario + "'.\n");
			return respuestaFinalFuncion;
		}			
		return respuestaFinalFuncion;
	}
							

	
	//TODO: Checkear
	/**
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */
	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) throws RemoteException {
		ChangePasswordResponse respuestaFinalFuncion = new ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		//extraigo cada contraseña por si quisiese imprimirlas
		String oldPassword = changePassword.getArgs0().getOldpwd();
		String newPassword = changePassword.getArgs0().getNewpwd();
		
		//si es admin no paso por el UPMAuth
		if(username.equals(ADMIN_NAME)) {
			
			if(password.equals(oldPassword)) {
				this.password = newPassword;
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				System.out.println("Se ha cambiado la contraseña del admin correctamente!!");
			} else {
				response.setResponse(false);  
			}
		}
		
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub service = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword upmChangePassword = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword();
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd upmChangePasswordBackend = new es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd();
		
		upmChangePasswordBackend.setName(username);
		upmChangePasswordBackend.setNewpwd(newPassword);
		upmChangePasswordBackend.setOldpwd(oldPassword);
		upmChangePassword.setChangePassword(upmChangePasswordBackend);
		  
		es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE changeRes = service.changePassword(upmChangePassword);

		response.setResponse(changeRes.get_return().getResult());
		
		//si se ha cambiado correctamente entro (TRUE)
		if(response.getResponse() == true) {
			System.out.println("Contraseña cambiada correctamente!!\n");
			respuestaFinalFuncion.set_return(response);
		} else {
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);	
		}
		return respuestaFinalFuncion;
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
		AddFollowerResponse respuestaFinalFuncion = new AddFollowerResponse();
		Response response = new Response();

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio
		
		// USUARIO A SEGUIR
		Username username = addFollower.getArgs0();
		String nombreUsuarioASeguir = username.getUsername(); //el usuario al que se va a seguir 

		// COMPROBACION DE LOGGEADO USER1 
		if (!loggeado) {
			System.out.println("Para seguir a un usuario se debe haber iniciado sesión previamente.\n");
			return respuestaFinalFuncion;
		}

		// COMPROBACION DE EXISTENCIA USUARIO A SEGUIR
		if(!usuarioRegistrado(nombreUsuarioASeguir)) {
			System.out.println("El usuario: '" + nombreUsuarioASeguir + "' no existe en el sistema.\n");
			return respuestaFinalFuncion;
		}
		
		FollowerList listaSeguidores = followersMap.get(this.username); //LISTA DE SEGUIDOS DE USUARIO ACTUAL
		
		if(listaSeguidores == null) { 
			listaSeguidores = new FollowerList();
			followersMap.put(this.username, listaSeguidores);
		}
		
		// COMPROBACION EXISTENCIA USUAIRO
		if(!followerExist(nombreUsuarioASeguir)) {
			listaSeguidores.addFollowers(nombreUsuarioASeguir);
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			System.out.println("El usuario: '" + this.username + "' ha empezado a seguir a: '" + nombreUsuarioASeguir + "' como seguidor.\n");
			return respuestaFinalFuncion;
		}
		System.out.println("El usuario: '" + this.username + "' ya sigue a: '" + nombreUsuarioASeguir + "'.\n");
		return respuestaFinalFuncion;
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
		if (!loggeado) {
			System.out.println("Para dejar de seguir a un usuario se debe haber iniciado sesión previamente.\n");
			return respuestaFinalFuncion;
		}

		// COMPROBACION DE EXISTENCIA USUARIO A SEGUIR
		if(!usuarioRegistrado(nombreUsuarioUnfollow)) {
			System.out.println("El usuario: '" + nombreUsuarioUnfollow + "' no existe en el sistema.\n");
			return respuestaFinalFuncion;
		}	
		
		if(followerExist(nombreUsuarioUnfollow)) {
			borrarSeguidor(nombreUsuarioUnfollow);
			reponse.setResponse(true);
			respuestaFinalFuncion.set_return(reponse);
			System.out.println("El usuario: '" + this.username + "' ha dejado de seguir a: '" + nombreUsuarioUnfollow + "'.\n");
			return respuestaFinalFuncion;
		} else {
			System.out.println("El usuario: '" + this.username + "' no sigue a: '" + nombreUsuarioUnfollow + "' y por tanto no lo puede borrar.\n");
			return respuestaFinalFuncion;
		}
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
		
		if(loggeado) {
			listaSeguidores.setFollowers(followersMap.get(this.username).getFollowers()); // METO SEGUIDORES DEL MAPA EN LA CLASE FollowersList
			listaSeguidores.setResult(true);
			respuestaFinalFuncion.set_return(listaSeguidores); 
			return respuestaFinalFuncion;
		}
		System.out.println("Para ver tus seguidores debes haber iniciado sesión previamente.\n");
		return respuestaFinalFuncion;		
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
		response.setResponse(true);
		respuestaFinalFuncion.set_return(response); //False en incio

		// COMPROBACION DE ADMIN
		if(this.username.equals(ADMIN_NAME)) {
			if(!existeVino(vino)) {
				winesList.add(vino); 
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				System.out.println("Se ha añadido el vino: '" + vino.getName() + "' con éxito.\n");
			} else {
				System.out.println("El vino: '" + vino.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vino.getGrape() + "\n" +
				"\t\tAño: " + vino.getYear() + "\n" +
				"ya existe en la red social.\n");
				return respuestaFinalFuncion;
			}
		} else
			System.out.println("No tienes permisos para crear vinos. Se debe ser administrador.\n");
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
		if(this.username.equals(ADMIN_NAME)) {
			if(!existeVino(vinoBorrado)) {
				System.out.println("El vino: '" + vinoBorrado.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vinoBorrado.getGrape() + "\n" +
				"\t\tAño: " + vinoBorrado.getYear() + "\n" +
				"no existe en la red social.\n");
				return respuestaFinalFuncion;
			} else {
				winesList.remove(vinoBorrado);
				response.setResponse(true);
				respuestaFinalFuncion.set_return(response);
				System.out.println("Se ha borrado el vino: '" + vinoBorrado.getName() + "' con éxito.\n");
				return respuestaFinalFuncion;
			}
		} else
			System.out.println("No tienes permisos para crear vinos. Se debe ser administrador.\n");
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
		if(loggeado) {
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
		} else 
			System.out.println("Para ver los vinos debes haber iniciado sesión previamente.\n");
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
		if (loggeado) {
			//si el vino existe lo puedo puntuar
			if (existeVino(vino)) {
				// compruebo que la puntuacion que se le da está entre 0 y 10
				if (vinoPuntuado.getRate() >= 0 && vinoPuntuado.getRate() <= 10) {
					// Añado puntuacion asociada al usuario que la ha puesto
					//lo añado siempre que no exista ya dentro, sino sobreescribo
					
					//obtengo la lista de vinos puntuados por el usuario actual (si no hay la creo)
					listaPuntuados = userRatedMap.getOrDefault(this.username, new ArrayList<>());
					
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
					userRatedMap.put(this.username, listaPuntuados);
					response.setResponse(true);
	                respuestaFinalFuncion.set_return(response);
	                System.out.println("Se ha puntuado el vino: '" + vino.getName() + "' con un: '" + vinoPuntuado.getRate() + "' con éxito.\n");
	                return respuestaFinalFuncion;
				} else {
					System.out.println("La puntuación debe estar entre 0 y 10.\n");
					return respuestaFinalFuncion;
				}
			} else {
				System.out.println("El vino: '" + vino.getName() + "' con: \n" +
				"\t\tTipo de uva: " + vino.getGrape() + "\n" +
				"\t\tAño: " + vino.getYear() + "\n" +
				"no existe en la red social.\n");
				return respuestaFinalFuncion;
			}
		} else
			System.out.println("Para puntuar un vino se debe haber iniciado sesión previamente.\n");
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
		List<WineRated> puntuados = userRatedMap.get(this.username);
		
		// INICIALIZACION RESPUESTA
		listaVinosPuntuados.setResult(false);
		respuestaFinalFuncion.set_return(listaVinosPuntuados);

		 // COMPROBACION DE LOGGEADO
		 if(loggeado) {
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
		 } else 
		 	System.out.println("Para ver los vinos debes haber iniciado sesión previamente.\n");
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
		if(loggeado && followerExist(nombreFollower)){
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
		} else {
			System.out.println("Para ver los vinos de un seguidor, debes haber iniciado sesión y el seguidor debe existir.\n");
		}
		respuestaFinalFuncion.set_return(listaPuntuados);
		return respuestaFinalFuncion;
	}

}
