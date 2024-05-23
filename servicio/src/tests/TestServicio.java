package tests;

import es.upm.etsiinf.sos.*;
import es.upm.etsiinf.sos.AddUserResponse;
import es.upm.etsiinf.sos.model.xsd.*;

public class TestServicio {
	
	public static void main(String[] args) {

        System.out.println("==================================== PRUEBAS TOTALES ====================================");

        System.out.println("=========================== INICIALIZACION WineSocialUPMSkeleton ===========================");

		WineSocialUPMSkeleton servicio = new WineSocialUPMSkeleton(); 

        User user_1 = new User();
        user_1.setName("admin");
        user_1.setPwd("admin");


        System.out.println("El admin tiene\n"
                + "\t\tUsuario:     '" + servicio.getUserAdmin().getName() + "'\n"
                + "\t\tContraseña:  '" + servicio.getUserAdmin().getPwd() + "'\n");
                
        servicio.setUserActual(user_1);

        System.out.println("El user actual tiene\n"
        + "\t\tUsuario:     '" + servicio.getUserActual().getName() + "'\n"
        + "\t\tContraseña:  '" + servicio.getUserActual().getPwd() + "'\n");
        
    

        System.out.println("=========================== PRUEBAS addUser ===========================");
        
        es.upm.etsiinf.sos.AddUser addUser = new es.upm.etsiinf.sos.AddUser();
        es.upm.etsiinf.sos.model.xsd.Username username = new es.upm.etsiinf.sos.model.xsd.Username();
        username.setUsername("Pepito");
        addUser.setArgs0(username);

        // Prueba1: Añadir un usuario
        System.out.println("Usuario a añadir: " + addUser.getArgs0().getUsername());
        AddUserResponse res = servicio.addUser(addUser);
        System.out.println("addUser(Pepito): " + res.get_return().getResponse() + "\n");

        // Prueba2: Añadir un usuario que ya existe
        System.out.println("Usuario a añadir: " + addUser.getArgs0().getUsername());
        AddUserResponse res2 = servicio.addUser(addUser);
        System.out.println("addUser(Pepito): " + res2.get_return().getResponse() + "\n");

        // Prueba3: Añadir un usuario con nombre vacio
        es.upm.etsiinf.sos.AddUser addUser2 = new es.upm.etsiinf.sos.AddUser();
        es.upm.etsiinf.sos.model.xsd.Username username2 = new es.upm.etsiinf.sos.model.xsd.Username();
        username2.setUsername("");
        addUser2.setArgs0(username2);

        System.out.println("Usuario a añadir: " + addUser2.getArgs0().getUsername());
        AddUserResponse res3 = servicio.addUser(addUser2);
        System.out.println("addUser(''): " + res3.get_return().getResponse() + "\n");

        // Prueba4: Añadir un usuario con nombre nulo
        es.upm.etsiinf.sos.AddUser addUser3 = new es.upm.etsiinf.sos.AddUser();
        es.upm.etsiinf.sos.model.xsd.Username username3 = new es.upm.etsiinf.sos.model.xsd.Username();
        username3.setUsername(null);
        addUser3.setArgs0(username3);
        
        System.out.println("Usuario a añadir: " + addUser3.getArgs0().getUsername());
        AddUserResponse res4 = servicio.addUser(addUser3);
        System.out.println("addUser(null): " + res4.get_return().getResponse());

        System.out.println("=========================== FIN addUser ===========================\n");


        System.out.println("=========================== PRUEBAS login ===========================");

        // Prueba1: Iniciar sesión con un usuario que existe
        es.upm.etsiinf.sos.Login login = new es.upm.etsiinf.sos.Login();
        es.upm.etsiinf.sos.model.xsd.User user = new es.upm.etsiinf.sos.model.xsd.User();
        user.setName("Pepito");
        user.setPwd(servicio.getPwdUser("Pepito"));
        login.setArgs0(user);

        System.out.println("Usuario a loggear: " + login.getArgs0().getName() + ", con contraseña: " + login.getArgs0().getPwd());
        es.upm.etsiinf.sos.LoginResponse res5 = servicio.login(login);
        System.out.println("login(Pepito): " + res5.get_return().getResponse() + "\n");

        // Prueba2: Iniciar sesión con un usuario que no existe
        es.upm.etsiinf.sos.Login login2 = new es.upm.etsiinf.sos.Login();
        es.upm.etsiinf.sos.model.xsd.User user2 = new es.upm.etsiinf.sos.model.xsd.User();
        user2.setName("NoExisto");
        user2.setPwd(servicio.getPwdUser("NoExisto"));
        login2.setArgs0(user2);

        System.out.println("Usuario a loggear: " + login2.getArgs0().getName() + ", con contraseña: " + login2.getArgs0().getPwd());
        es.upm.etsiinf.sos.LoginResponse res6 = servicio.login(login2);
        System.out.println("login(NoExisto): " + res6.get_return().getResponse() + "\n");

        // Prueba3: Iniciar sesion con un usuario que ya habia iniciado sesion previamente
        es.upm.etsiinf.sos.Login login3 = new es.upm.etsiinf.sos.Login();
        es.upm.etsiinf.sos.model.xsd.User user3 = new es.upm.etsiinf.sos.model.xsd.User();
        user3.setName("Pepito");
        user3.setPwd("contraseñaIncorrecta");
        login3.setArgs0(user3);

        System.out.println("Usuario a loggear: " + login3.getArgs0().getName() + ", con contraseña: " + login3.getArgs0().getPwd());
        es.upm.etsiinf.sos.LoginResponse res7 = servicio.login(login3);
        System.out.println("login(Pepito): " + res7.get_return().getResponse() + "\n");

        // Prueba4: Iniciar sesión con un usuario que tiene la contraseña incorrecta
            // Previamente debe estar registrado
        es.upm.etsiinf.sos.AddUser addUser4 = new es.upm.etsiinf.sos.AddUser();
        es.upm.etsiinf.sos.model.xsd.Username username4 = new es.upm.etsiinf.sos.model.xsd.Username();
        username4.setUsername("Juanita");
        addUser4.setArgs0(username4);

        System.out.println("Usuario a añadir: " + addUser4.getArgs0().getUsername());
        AddUserResponse res8 = servicio.addUser(addUser4);
        System.out.println("addUser(Juanita): " + res8.get_return().getResponse() + "\n");

            // Y ahora sí, intentar iniciar sesión con la contraseña incorrecta
        es.upm.etsiinf.sos.Login login4 = new es.upm.etsiinf.sos.Login();
        es.upm.etsiinf.sos.model.xsd.User user4 = new es
        .upm.etsiinf.sos.model.xsd.User();
        user4.setName("Juanita");
        user4.setPwd("contraseñaIncorrecta");
        login4.setArgs0(user4);

        System.out.println("Usuario a loggear: " + login4.getArgs0().getName() + ", con contraseña: " + login4.getArgs0().getPwd());
        es.upm.etsiinf.sos.LoginResponse res9 = servicio.login(login4);
        System.out.println("login(Juanita): " + res9.get_return().getResponse() + "\n");


        // Prueba5: Iniciar sesión con el usuario admin
        es.upm.etsiinf.sos.Login login5 = new es.upm.etsiinf.sos.Login();
        es.upm.etsiinf.sos.model.xsd.User user5 = new es.upm.etsiinf.sos.model.xsd.User();
        user5.setName("admin");
        user5.setPwd("admin");
        login5.setArgs0(user5);

        System.out.println("Usuario a loggear: " + login5.getArgs0().getName() + ", con contraseña: " + login5.getArgs0().getPwd());
        es.upm.etsiinf.sos.LoginResponse res10 = servicio.login(login5);
        System.out.println("login(admin): " + res10.get_return().getResponse() + "\n");
        



        System.out.println("=========================== FIN login ===========================\n");












		/*
		System.out.println("\n");
        System.out.println("======== PRUEBA login ========");

        // Crear un nuevo usuario
        AddUser addUser = new AddUser();
        User newUser = new User();
        newUser.setName("pepitoPlayer"); //esto se lo paso al login y al addUser
        newUser.setPwd("contraseñaAutoGenerada"); //esta no es la contraseña del usuario
        Username username = new Username();
        username.setUsername(newUser.getName());
        addUser.setArgs0(username); //añado al usuario pero la contraseña se settea en el backend (contraseñaAutoGenerada)
        
        // Añadir el usuario al sistema
        AddUserResponse addUserResponse1 = servicio.addUser(addUser);
        System.out.println("Respuesta de añadir usuario: " + addUserResponse1.get_return().getResponse());
        //hasta aqui se ha añadido el usuario con nombre "pepito" y contraseña la que se ha autogenerado en backend
        //cuando intente hacer el login con la contraseña que he setteado al 'newUser' me va a dar error
        //prq la contraseña que tiene es "password1" y la que ha generado el backend es "contraseñaAutoGenerada"
        
        // Intentar hacer login con el nuevo usuario
        es.upm.etsiinf.sos.Login login = new es.upm.etsiinf.sos.Login();
        login.setArgs0(newUser);
        es.upm.etsiinf.sos.LoginResponse loginResponse = servicio.login(login);
        System.out.println("Respuesta de inicio de sesión: " + loginResponse.get_return().getResponse());
        //System.out.println(servicio.getLoggeados());
        System.out.println("=================================");
        */
        
	
		
        
        /*
        System.out.println("\n");
        System.out.println("======== PRUEBA logout ========");
        
        User usuarioPepito = new User();
		usuarioPepito.setName("pepitoPlayer");
		//usuarioPepito.setPwd("contraseñaAutoGenerada");
		
		servicio.usuarioUsado = usuarioPepito;
        
        
        Logout logout = new Logout();
        LogoutResponse logoutResponse = servicio.logout(logout);
        System.out.println("Respuesta de cierre de sesión: " + logoutResponse.get_return().getResponse());
        System.out.println("=================================");
        
        System.out.println("LISTA DE LOGGEADOS =>" + servicio.getLoggeados());
		*/
		
		/*
        //User usuarioPepito = new User();
		//usuarioPepito.setName("pepitoPlayer");
		//usuarioPepito.setPwd("contraseñaAutoGenerada");
		//servicio.usuarioUsado = usuarioPepito;
        
		System.out.println("\n");
        System.out.println("======== PRUEBA removeUser ========");
        
        RemoveUser removeUser = new RemoveUser();
        Username usernameRemove = new Username();
        usernameRemove.setUsername("pepito");
        removeUser.setArgs0(usernameRemove);
        RemoveUserResponse removeUserResponse = servicio.removeUser(removeUser);
        System.out.println("Respuesta de eliminación de usuario: " + removeUserResponse.get_return().getResponse());
        System.out.println("=================================");
		*/
        
        /*
        User usuarioPepito = new User();
		usuarioPepito.setName("pepito");
		usuarioPepito.setPwd("contraseñaAutoGenerada");
		servicio.usuarioUsado = usuarioPepito;
        
        
        System.out.println("\n");
        System.out.println("======== PRUEBA changePassword ========");
        
        ChangePassword changePassword = new ChangePassword();
        PasswordPair passwordPair = new PasswordPair();
        passwordPair.setOldpwd("contraseñaAutoGenerada");
        passwordPair.setNewpwd("newPepitoPss1-2-3");
        changePassword.setArgs0(passwordPair);
        ChangePasswordResponse changePasswordResponse = servicio.changePassword(changePassword);
        System.out.println("Respuesta de cambio de contraseña: " + changePasswordResponse.get_return().getResponse());
        System.out.println("=================================");
        */
        
        
        
        
//        // Intentar iniciar sesión con la nueva contraseña del admin
//        System.out.println("===== Re-Inicio de Sesión (Admin) =====");
//        admin.setPwd("newadmin");
//        login.setArgs0(admin);
//        loginResponse = servicio.login(login);
//        System.out.println("Respuesta de re-inicio de sesión: " + loginResponse.get_return().getResponse());        
	}
}
