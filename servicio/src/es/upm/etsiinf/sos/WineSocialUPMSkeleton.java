
/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;
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
import es.upm.fi.sos.t3.backend.UPMAuthenticationAuthorizationWSSkeletonSkeleton;
/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */
public class WineSocialUPMSkeleton {
	
	private User admin;
	private User usuarioActual;
	private UPMAuthenticationAuthorizationWSSkeletonSkeleton auth;

	private Map<String,FollowerList> followersMap; // KEY: Nombre usuario -- VALUE: lista de seguidores
	private List<Wine> winesList;
	private Map<Pair<Wine, User>, Integer> puntuacionVinoUser; // KEY: Pair<Vino, Usuario> -- VALUE: Puntuacion	

	
	public WineSocialUPMSkeleton() {
		this.admin = new User();
		this.usuarioActual = new User();

		admin.setName("admin");
		admin.setPwd("admin");
		auth = new UPMAuthenticationAuthorizationWSSkeletonSkeleton();

		followersMap = new HashMap<>();
		winesList = new ArrayList<>();
		puntuacionVinoUser = new HashMap<>();

		auth.getUsuariosRegistrados().put(admin.getName(), admin); //admin está ya dentro del sistema
		
	}

	private class Pair<F, S> {
		private F first;
		private S second;
	
		// Constructor
		public Pair(F first, S second) {
			this.first = first;
			this.second = second;
		}
	
		// Getters
		public F getFirst() {
			return first;
		}
	
		public S getSecond() {
			return second;
		}
	
		// Setters
		public void setFirst(F first) {
			this.first = first;
		}
	
		public void setSecond(S second) {
			this.second = second;
		}
	
		// Override toString method
		@Override
		public String toString() {
			return "Pair{" +
					"first: " + first +
					", second: " + second +
					'}';
		}
	
		// Override equals method
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
	
			Pair<?, ?> pair = (Pair<?, ?>) o;
	
			if (!first.equals(pair.first)) return false;
			return second.equals(pair.second);
		}
	}

	//Getters y Setters para pruebas

	//---------------------------------------------------

	public void setUserAdmin(User admin) {
		this.admin = admin;
	}

	public User getUserAdmin() {
		return this.admin;
	}

	public void setUserActual(User usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	public User getUserActual() {
		return this.usuarioActual;
	}

	public void setAuth(UPMAuthenticationAuthorizationWSSkeletonSkeleton auth) {
		this.auth = auth;
	}

	public UPMAuthenticationAuthorizationWSSkeletonSkeleton getAuth() {
		return this.auth;
	}

	//---------------------------------------------------

	// Metodos auxiliares

	/**
	 * Coge la contraseña asignada por el backend de un usuario
	 * @param name Usuario registrado del que se quiere la contraseña
	 * @return Contraseña del usuario
	 */
	public String getPwdUser(String name) {
		if (!auth.getUsuariosRegistrados().containsKey(name)) {
			return "Sin contraseña";
		}
		return auth.getUsuariosRegistrados().get(name).getPwd();
	}

	/**
	 * soyAdmin(user)
	 * Comprueba si user1 es el administador
	 * @param user Usuario a comprobar
	 * @return true si lo es, false en caso contrario
	 */
	private boolean soyAdmin(User user) {
		return (user.getName().equals(admin.getName())) && (user.getPwd().equals(admin.getPwd()));
	}

	/**
	 * usuarioRegistrado(user1)
	 * Comprueba si el usuario pasado como parametro está registrado
	 * @param nombreUsuario Nombre del usuario a comprobar
	 * @return true si está registrado, false en caso contrario
	 */
	private boolean usuarioRegistrado (String nombreUsuario) {
		return auth.getUsuariosRegistrados().containsKey(nombreUsuario);
	}

	/**
	 * Imprime los nombres de las personas loggeadas
	 * @return String representando un array con los nombres de las personas loggeadas
	 */
	public String getLoggeados() {
		String res = "[";
		for(User usuarioLog : auth.getUsuariosLoggeados()) {
			res += usuarioLog.getName() + " ";
		}
		return res + "]";
	}

	/**
	 * user1.estoyLoggeado()
	 * Comprueba si el usuario que la invoca está loggeado
	 * @return true si está loggeado, false en caso contrario
	 */
	private boolean estoyLoggeado() {
		for (User usuario : auth.getUsuariosLoggeados()) {
			if (usuario.getName().equals(this.usuarioActual.getName())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * usuarioLoggeado(user1)
	 * Comprueba si el usuario pasado como parametro está loggeado
	 * @param nombreUsuario Nombre del usuario a comprobar
	 * @return true si está loggeado, false en caso contrario
	 */
	private boolean usuarioLoggeado(String nombreUsuario) {
		boolean estoy = false;
		for(int i=0; i<auth.getUsuariosLoggeados().size(); i++) {
			if(auth.getUsuariosLoggeados().get(i).getName().equals(nombreUsuario)) {
				estoy = true;
			}
		}
		return estoy;
	}

	/**
	 * Comprueba si el usuario pasado como parametro es seguidor del usuario que la invoca
	 * @param name Nombre del usuario a comprobar
	 * @return true si es seguidor, false en caso contrario
	 */
	private boolean followerExist(String name) {
	    boolean existe = false;
	    if (followersMap.get(usuarioActual.getName()).getFollowers() != null) {
	        String[] seguidores = followersMap.get(usuarioActual.getName()).getFollowers();
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
        String[] seguidores = followersMap.get(usuarioActual.getName()).getFollowers();

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
            followersMap.get(usuarioActual.getName()).setFollowers(followersN);
        }
	}

	/**
	 * Imprime los nombres de las personas que tengo en mi lista de seguidores
	 * @return String representando un array con los nombres de las personas que tengo en mi lista de seguidores
	 */
	private String printStringListaFollowers() {
		String res = "";
		String[] arr = followersMap.get(usuarioActual.getName()).getFollowers();
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


	//---------------------------------------------------

	// Metodos principales

	/**
	 * userAdmin.addUser(user1)
	 * Añade e user1 a la red social
	 * @param addUser Objeto con los datos del usuario a añadir
	 * @return AddUserResponse: Objeto que contiene la contraseña + booleano de exito de operacion
	 */
	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) {
		AddUserResponse respuestaFinalFuncion = new AddUserResponse();
		Username username = addUser.getArgs0();

		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		es.upm.fi.sos.t3.backend.AddUserResponse respuestaBackend = new es.upm.fi.sos.t3.backend.AddUserResponse();

		es.upm.fi.sos.t3.backend.AddUser usuario = new es.upm.fi.sos.t3.backend.AddUser();
		es.upm.fi.sos.t3.backend.xsd.UserBackEnd usuarioBackend = new es.upm.fi.sos.t3.backend.xsd.UserBackEnd();

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// CREO EL USUARIO DEL BACKEND
		if (username.getUsername() == null || username.getUsername().equals(""))
		{
			System.out.println("Error. El nombre de usuario no puede ser nulo ni vacío.\n");
			return respuestaFinalFuncion;
		}
		usuarioBackend.setName(username.getUsername());
		usuario.setUser(usuarioBackend);
		
		/* // TODO: COMPROBACION LOGIN DEL ADMIN
		if(this.usuarioActual == null) {
			System.out.println("Inicie sesión para añadir usuarios...\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
		}
		*/

		// COMPROBACION ADMOIN
		if(soyAdmin(usuarioActual)) {
			respuestaBackend = auth.addUser(usuario); 
			
			if(respuestaBackend.get_return().getResult()) { // Ha creado el usuario		

				// Seteo la respuesta
				response.setResponse(true);
				response.setPwd(respuestaBackend.get_return().getPassword());
				respuestaFinalFuncion.set_return(response);

				System.out.println("Se ha añadido al usuario: '" + username.getUsername() + "'' con contraseña: '" + respuestaBackend.get_return().getPassword() + "'\n");
				return respuestaFinalFuncion;

			}
			else // No ha creado el usuario
				System.out.println("El usuario: '" + username.getUsername() + "' ya existe en el sistema. No se ha podido registrar'.\n");

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
	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) {
		LoginResponse respuestaFinalFuncion = new LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		es.upm.fi.sos.t3.backend.LoginResponse respuestaLogin = new es.upm.fi.sos.t3.backend.LoginResponse();
		es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd respuestaLoginBackend = new es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd();  
		
		es.upm.fi.sos.t3.backend.Login paramLogin = new es.upm.fi.sos.t3.backend.Login();
		es.upm.fi.sos.t3.backend.xsd.LoginBackEnd loginBackend = new es.upm.fi.sos.t3.backend.xsd.LoginBackEnd();

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
		
		//EL USUARIO ADMIN NO SE DEBE LOGGEAR ASI
		if (name.equals("admin")) {
			System.out.println("No está autorizado para iniciar sesión del usuario: '" + name + "'.\n");
			return respuestaFinalFuncion;
		}

		// LA COMPROBCION DE EXISTENCIA LO DEVUELVE EL BACKEND
		// Debemos llamar al backend para ver si da bien o mal (no existe o contraseña incorrecta)

		// COMPROBACION DE USUARIO AUTENTICADO
		if (estoyLoggeado()) {
			System.out.println("Usuario: '" + name + "' ya autenticado.\n");
			response.setResponse(true);
		}
		
		else { // En caso de no estar logeado --> Hacer login
			paramLogin.setLogin(loginBackend);
			respuestaLogin = auth.login(paramLogin);
			respuestaLoginBackend = respuestaLogin.get_return();
			
			//si ha ido bien el login => TRUE
			if(respuestaLoginBackend.getResult()) { // Caso de exito
				System.out.println("El usuario: '" + name + "' con la contraseña: '" + password +  "'' ha inciado sesión correctamente.\n");
				response.setResponse(true);

			} else { // Caso de fallo
				System.out.println("El usuario: '" + name + "' no se pudo autenticar.\n");
				return respuestaFinalFuncion;
			}
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	
	
	/**
	 * user1.logout()
	 * Cierra la sesión del usuario QUE LA INVOCA
	 * @param logout Objeto vacio (creo)
	 * @return logoutResponse Objeto indicando si se ha cerrado correctamente la sesion
	 */
	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) {
		LogoutResponse respuestaFinalFuncion = new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		boolean removed = false;

		// COMPROBACION SESION INICIADA
		for(User usuario : auth.getUsuariosLoggeados()) { //Comprobar con metodo estoyLoggeado();
			if(usuario.getName().equals(usuarioActual.getName())) {
				auth.getUsuariosLoggeados().remove(usuario); //TODO: Ahora mismo nuestras listas solo tienen un user aunque tenga muchas sesiones abiertas
				removed = true;
				break;
			}
		}
		//si se ha borrado de la lista correctamente
		if(removed) {
			this.usuarioActual = null;
			System.out.println("Has cerrado correctamente la sesión.\n");
			response.setResponse(true);
		}
		else {
			System.out.println("Para cerrar sesión se debe haber iniciado sesión previamente.\n");
			response.setResponse(false);
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	

	//TODO: Pasarle pruebas
	/**
	 * userAdmin.removeUser(user1) // user1.removeUser(user1)
	 * Elimina al usuario pasado como parametro del sistema
	 * @param removeUser Objeto con el nombre del usuario a borrar
	 * @return removeUserResponse Objeto indicando si se ha borrado correctamente
	 */
	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) {
		RemoveUserResponse respuestaFinalFuncion = new RemoveUserResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		es.upm.fi.sos.t3.backend.RemoveUserResponse respuestaRemove = new es.upm.fi.sos.t3.backend.RemoveUserResponse();
		
		es.upm.fi.sos.t3.backend.RemoveUser paramRemove = new es.upm.fi.sos.t3.backend.RemoveUser();
		es.upm.fi.sos.t3.backend.xsd.RemoveUser removeBackend = new es.upm.fi.sos.t3.backend.xsd.RemoveUser();
		
		boolean eliminado = false;
		boolean autenticado = false;

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// OBTENGO EL USUARIO DEL PARAMETRO
		Username usuario = removeUser.getArgs0();
		String nombre_usuario = usuario.getUsername();
		
		// PAARAMETROS A PASAR AL BACKEND
		removeBackend.setName(nombre_usuario);
		paramRemove.setRemoveUser(removeBackend);

		//EL USUARIO ADMIN NO SE PUEDE BORRAR
		if (nombre_usuario.equals("admin")) {
			System.out.println("No está autorizado para eliminar el usuario: '" + nombre_usuario + "'.\n");
			return respuestaFinalFuncion;
		}
		
		// LA COMPROBCION DE EXISTENCIA LO DEVUELVE EL BACKEND
		// Debemos llamar al backend para ver si da bien o mal

		// SOLO EL ADMIN O EL PROPIO USUARIIO PUEDEN BORRAR SU CUENTA
		if((soyAdmin(usuarioActual)) || (usuarioActual.getName().equals(nombre_usuario))) {

			// COMPROBACION DE USUARIO AUTENTICADO
			if(!estoyLoggeado()) {
				System.out.println("Para borrar un usuario se debe haber iniciado sesión previamente.\n");
				return respuestaFinalFuncion;
			}

			// ESTAMOS LOGGEADOS Y PODEMOS BORRAR
			respuestaRemove = auth.removeUser(paramRemove);
			eliminado = respuestaRemove.get_return().getResult();

			if (eliminado) {
				// Elimino el usuario de la lista de loggeados
				for(User usuarioLog : auth.getUsuariosLoggeados()) {
					if(usuarioLog.getName().equals(nombre_usuario)) {
						auth.getUsuariosLoggeados().remove(usuarioLog); //Ahora mismo nuestras listas solo tienen un user aunque tenga muchas sesiones abiertas
						System.out.println("Se ha eliminado al usuario: '" + nombre_usuario + "' de la lista de sesiones abiertas\n");
						break;
					}
				}
				System.out.println("Se ha eliminado al usuario: '" + nombre_usuario + "' del sistema\n");
				
				response.setResponse(true);
			}
			else {
				System.out.println("No se ha podido eliminar al usuario: '" + nombre_usuario + "' del sistema\n");
				return respuestaFinalFuncion;
			}
		} else {
			System.out.println("No tienes permisos para borrar el usuario.\n");
			return respuestaFinalFuncion;
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}

	
	//TODO: Checkear
	/**
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
		es.upm.fi.sos.t3.backend.xsd.ChangePasswordBackEnd cambioBackend = new es.upm.fi.sos.t3.backend.xsd.ChangePasswordBackEnd();
		
		//extraigo la contraseñas del parametro
		passw = changePassword.getArgs0();
		//extraigo cada contraseña por si quisiese imprimirlas
		String oldPassword = passw.getOldpwd();
		String newPassword = passw.getNewpwd();
		boolean existe = auth.getUsuariosRegistrados().containsKey(usuarioActual.getName());
		
		System.out.println("CONTRASEÑA ANTIGUA: " + oldPassword);
		System.out.println("CONTRASEÑA NUEVA: " + newPassword);
		
		//el cambio de contraseña del admin se trata de forma local
		if(soyAdmin(usuarioActual) && admin.getPwd().equals(oldPassword)) {
			admin.setPwd(newPassword);
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			System.out.println("Se ha cambiado la contraseña del admin correctamente!!");
		}
		
		//llamo a la funcion del UPMAuth... y obtengo la respuesta
		cambioBackend.setName(usuarioActual.getName());
		cambioBackend.setOldpwd(oldPassword);
		cambioBackend.setNewpwd(newPassword);
		
		paramAuth.setChangePassword(cambioBackend);
		respuestaAuth = auth.changePassword(paramAuth);
		respuestaBackend = respuestaAuth.get_return();
		
		
		//si se ha cambiado correctamente entro (TRUE)
		if(respuestaBackend.getResult() && existe) {
			System.out.println("Contraseña cambiada correctamente!!\n");
			response.setResponse(true);
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
	 */
	public es.upm.etsiinf.sos.AddFollowerResponse addFollower(es.upm.etsiinf.sos.AddFollower addFollower) {
		AddFollowerResponse respuestaFinalFuncion = new AddFollowerResponse();
		Response response = new Response();

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio
		
		// USUARIO A SEGUIR
		Username username = addFollower.getArgs0();
		String nombreUsuarioASeguir = username.getUsername(); //el usuario al que se va a seguir 

		// COMPROBACION DE LOGGEADO USER1 
		if (!estoyLoggeado()) {
			System.out.println("Para seguir a un usuario se debe haber iniciado sesión previamente.\n");
			return respuestaFinalFuncion;
		}

		// COMPROBACION DE EXISTENCIA USUARIO A SEGUIR
		if(!usuarioRegistrado(nombreUsuarioASeguir)) {
			System.out.println("El usuario: '" + nombreUsuarioASeguir + "' no existe en el sistema.\n");
			return respuestaFinalFuncion;
		}
		
		FollowerList listaSeguidores = followersMap.get(usuarioActual.getName()); //LISTA DE SEGUIDOS DE USUARIO ACTUAL
		
		if(listaSeguidores == null) { 
			listaSeguidores = new FollowerList();
			followersMap.put(usuarioActual.getName(), listaSeguidores);
		}
		
		// COMPROBACION EXISTENCIA USUAIRO
		if(!followerExist(nombreUsuarioASeguir)) {
			listaSeguidores.addFollowers(nombreUsuarioASeguir);
			response.setResponse(true);
			respuestaFinalFuncion.set_return(response);
			System.out.println("El usuario: '" + usuarioActual.getName() + "ha empezado a seguir a: '" + nombreUsuarioASeguir + "' como seguidor.\n");
			return respuestaFinalFuncion;
		}
		System.out.println("El usuario: '" + usuarioActual.getName() + "' ya sigue a: '" + nombreUsuarioASeguir + "'.\n");
		return respuestaFinalFuncion;
	}

	/**
	 * user1.unfollow(user2) --> user1 UNFOLLOWS a user2.
	 * @param unfollow Objeto con el nombre del usuario a dejar de seguir
	 * @return unfollowResponse Objeto indicando si se ha dejado de seguir correctamente
	 */
	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) {
		UnfollowResponse respuestaFinalFuncion = new UnfollowResponse();
		Response reponse = new Response();

		Username usuarioUnfollow = unfollow.getArgs0();
		String nombreUsuarioUnfollow = usuarioUnfollow.getUsername();

		// INICIALIZACION RESPUESTA
		reponse.setResponse(false);
		respuestaFinalFuncion.set_return(reponse); //False en incio

		// COMPROBACION DE LOGGEADO USER1 
		if (!estoyLoggeado()) {
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
			System.out.println("El usuario: '" + usuarioActual.getName() + "' ha dejado de seguir a: '" + nombreUsuarioUnfollow + "'.\n");
			return respuestaFinalFuncion;
		} else {
			System.out.println("El usuario: '" + usuarioActual.getName() + "' no sigue a: '" + nombreUsuarioUnfollow + "' y por tanto no lo puede borrar.\n");
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
		
		if(estoyLoggeado()) {
			listaSeguidores.setFollowers(followersMap.get(usuarioActual.getName()).getFollowers()); // METO SEGUIDORES DEL MAPA EN LA CLASE FollowersList
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
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// COMPROBACION DE ADMIN
		if(soyAdmin(usuarioActual)) {
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
		if(soyAdmin(usuarioActual)) {
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
		if(estoyLoggeado()) {
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

		Pair<Wine, User> pair = new Pair<Wine, User>(vino, usuarioActual);

		vino.setName(vinoPuntuado.getName());
		vino.setGrape(vinoPuntuado.getGrape());
		vino.setYear(vinoPuntuado.getYear());

		pair.setFirst(vino);
		pair.setSecond(usuarioActual);

		// INICIALIZACION RESPUESTA
		response.setResponse(false);
		respuestaFinalFuncion.set_return(response); //False en incio

		// COMPROBACION DE LOGGEADO
		if (estoyLoggeado()) {
			if (existeVino(vino)) {
				// Añadir puntuacion
				if (vinoPuntuado.getRate() >= 0 && vinoPuntuado.getRate() <= 10) {
					// Añadir puntuacion
					if (!puntuacionVinoUser.containsKey(pair)) {
						puntuacionVinoUser.put(pair, vinoPuntuado.getRate());
						// Respuesta
						response.setResponse(true);
						respuestaFinalFuncion.set_return(response);
						System.out.println("Se ha puntuado el vino: '" + vino.getName() + "' con un: '" + vinoPuntuado.getRate() + "'' con éxito.\n");
						return respuestaFinalFuncion;
					} else {
						puntuacionVinoUser.replace(pair, vinoPuntuado.getRate());
					}
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

		// WinesRatedList listaVinosPuntuados = new WinesRatedList();

		// // INICIALIZACION RESPUESTA
		// listaVinosPuntuados.setResult(false);
		// respuestaFinalFuncion.set_return(listaVinosPuntuados);

		// // COMPROBACION DE LOGGEADO
		// if(estoyLoggeado()) {
		// 	// MAX INDEX (Para recorrerla hacia atras)
		// 	int j = winesList.size() - 1;

		// 	// CREACION ARRAYS RESPUESTA
		// 	String[] nombresVinos = new String[winesList.size()];
		// 	String[] nombresUva = new String[winesList.size()];
		// 	int[] años = new int[winesList.size()];
			
		// 	for(int i=0; i<winesList.size(); i++) {
		// 		Wine vino = new Wine();

		// 		// Leemos
		// 		vino.setName(winesList.get(i).getName()); //cojo el nombre del vino
		// 		vino.setGrape(winesList.get(i).getGrape()); //cojo el tipo de uva
		// 		vino.setYear(winesList.get(i).getYear()); //cojo el año

		// 		// Escribimos
		// 		nombresVinos[j] = vino.getName();
		// 		nombresVinos[j] = vino.getName();
		// 		nombresUva[j] = vino.getGrape();
		// 		años[j] = vino.getYear();
		// 		j--;
		// 	}
		// 	listaVinos.setNames(nombresVinos);
		// 	listaVinos.setGrapes(nombresUva);
		// 	listaVinos.setYears(años);
		// 	listaVinos.setResult(true);
		// 	respuestaFinalFuncion.set_return(listaVinos);
		// 	return respuestaFinalFuncion;
		// } else 
		// 	System.out.println("Para ver los vinos debes haber iniciado sesión previamente.\n");
		// return respuestaFinalFuncion;

		

		
		return respuestaFinalFuncion;
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