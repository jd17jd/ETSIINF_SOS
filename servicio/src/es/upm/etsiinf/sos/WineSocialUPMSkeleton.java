
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
	private User usuarioActual;
	private UPMAuthenticationAuthorizationWSSkeletonSkeleton auth;
	
	public WineSocialUPMSkeleton() {
		this.admin = new User();
		this.usuarioActual = new User();
		admin.setName("admin");
		admin.setPwd("admin");
		auth = new UPMAuthenticationAuthorizationWSSkeletonSkeleton();
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

	private boolean soyAdmin(User user) {
		return (user.getName().equals(admin.getName())) && (user.getPwd().equals(admin.getPwd()));
	}

	private boolean estoyLoggeado() {
		for (User usuario : auth.getUsuariosLoggeados()) {
			if (usuario.getName().equals(this.usuarioActual.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getLoggeados() {
		String res = "[";
		for(User usuarioLog : auth.getUsuariosLoggeados()) {
			res += usuarioLog.getName() + " ";
		}
		return res + "]";
	}


	//---------------------------------------------------

	// Metodos principales

	/**
	 * Añade el usuario username a la red social
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
		if (username.getUsername().equals(""))
		{
			System.out.println("Error. El nombre de usuario no puede ser vacío.\n");
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
			System.out.println("Error. No se es administrador\n");
		}
		return respuestaFinalFuncion;
	}

	
	//TODO: gestionar el login del admin AQUI, NO en el UPMAuth...
	/**
	 * Comienza una nueva sesión para un usuario
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
		
		if (name.equals("admin")) { //EL USUARIO ADMIN NO SE DEBE LOGGEAR ASI
			System.out.println("El usuario: '" + name + "' no se puede loggear.\n");
			return respuestaFinalFuncion;
		}

		// LA COMPROBCION DE EXISTENCIA LO DEVUELVE EL BACKEND
		// Debemos llamar al backend para ver si da bien o mal (no existe o contraseña incorrecta)

		if(auth.getUsuariosLoggeados().contains(usuario)) { // Usuario ya conectado --> TRUE
			System.out.println("Usuario: '" + name + "' ya autenticado!!\n");
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
				System.out.println("El usuario: '" + name + "' no se pudo autenticar :(\n");
				return respuestaFinalFuncion;
			}
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	
	
	//EN TEORIA YA ESTÁ FUNCIONANDO BIEN
	/**
	 * Cierra la sesión del usuario que la invoca
	 * @param logout
	 * @return logoutResponse
	 */
	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) {
		LogoutResponse respuestaFinalFuncion = new LogoutResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		
		boolean removed = false;

		// COMPROBACION SESION INICIADA
		if(estoyLoggeado()) {
			for(User usuario : auth.getUsuariosLoggeados()) {
				if(usuario.getName().equals(usuarioActual.getName())) {
					auth.getUsuariosLoggeados().remove(usuario);
					removed = true;
					break; //TODO: Checkear bucle para quitar break
				}
			}
			//si se ha borrado de la lista correctamente
			if(removed) {
				this.usuarioActual = null;
				System.out.println("Has cerrado correctamente la sesión.\n");
				response.setResponse(true);
			//el logout ha dado un erro un no se ha podido cerrar sesion bien 
			} else {
				System.out.println("Hubo un error en el cierre de sesión.\n");
				response.setResponse(false);
			}
		//si no estaba loggeado no podria hacer logout
		} else {
			System.out.println("Para cerrar sesión se debe haber iniciado sesión previamente.\n");
			response.setResponse(false);
		}
		respuestaFinalFuncion.set_return(response);
		return respuestaFinalFuncion;
	}
	

	//EN TEORIA YA ESTÁ FUNCIONANDO BIEN
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
		es.upm.fi.sos.t3.backend.xsd.RemoveUser removeBackend = new es.upm.fi.sos.t3.backend.xsd.RemoveUser();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.fi.sos.t3.backend.ExistUser usuarioExiste = new es.upm.fi.sos.t3.backend.ExistUser();
		es.upm.fi.sos.t3.backend.ExistUserResponse respuestaUsuarioExiste = new es.upm.fi.sos.t3.backend.ExistUserResponse();
		es.upm.fi.sos.t3.backend.xsd.Username username = new es.upm.fi.sos.t3.backend.xsd.Username();
		
		boolean eliminado = false;
		
		//obtengo el usuario y nombre del parametro de la funcion
		Username usuario = removeUser.getArgs0();
		String nombre_usuario = usuario.getUsername();
		username.setName(nombre_usuario);
		
		removeBackend.setName(nombre_usuario);
		//setteo ese remove del backend en el parametro del que le paso a la funcion de UPMAuth...
		paramRemove.setRemoveUser(removeBackend);
		
		
		//El admin NUNCA se puede borrar
		if(nombre_usuario.equals("admin")) {
			System.out.println("Hubo un error! No se puede borrar el usuario 'admin'\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
			return respuestaFinalFuncion;
		}
		
		usuarioExiste.setUsername(username);
		respuestaUsuarioExiste = auth.existUser(usuarioExiste);
		boolean existe = respuestaUsuarioExiste.get_return().getResult();
		
		//si el usuario no existe, obviamente NO se puede borrar
		if(!existe) {
			System.out.println("Hubo un error! No existe el usuario: '" + nombre_usuario +"'\n");
			response.setResponse(false);
			respuestaFinalFuncion.set_return(response);
			return respuestaFinalFuncion;
		}
		
		
		//solo el admin o el propio usuario pueden borrar
		if((soyAdmin(usuarioActual)) || (usuarioActual.getName().equals(nombre_usuario))) {
			System.out.println("Si he entrado aqui, o soy el admin o soy el usuario que se quiere borrar...\n");
			//llamo a la funcion y me devuelve una respuesta
			respuestaRemove = auth.removeUser(paramRemove);
			eliminado = respuestaRemove.get_return().getResult();
			//TODO: if de si ha ido mal el borrado
			System.out.println("Se ha eliminado al usuario: '" + nombre_usuario + "'\n");
			response.setResponse(eliminado);
			respuestaFinalFuncion.set_return(response);
		} else {
			System.out.println("No tienes permisos para borrar el usuario.\n");
			response.setResponse(false);
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

	//EN TEORIA YA ESTÁ FUNCIONANDO BIEN
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