package tests;
import es.upm.etsiinf.sos.*;
import es.upm.etsiinf.sos.AddUserResponse;
import es.upm.etsiinf.sos.model.xsd.*;

public class TestServicio {
	
	public static void main(String[] args) {
		WineSocialUPMSkeleton servicio = new WineSocialUPMSkeleton(); 
		
		User admin = new User();
		admin.setName("admin");
		admin.setPwd("admin");
		
//		System.out.println("El admin tiene => Usuario: '" + admin.getName() + "'\n"
//				+ "\t\tContraseña: '" + admin.getPwd() + "'\n");
		
		//simulamos que el admin ha iniciado sesion
		servicio.usuarioUsado = admin;
		
		//System.out.println("El usuario con el que accedo al servicio es: " + servicio.usuarioActual.getName());
		
		
		
        System.out.println("========= PRUEBA addUser =========");
        
        AddUser addUser = new AddUser();
        Username username = new Username();
        username.setUsername("pepito");
        addUser.setArgs0(username);
        //System.out.println("El usuario que quiero añadir es => " + addUser.getArgs0().getUsername());
        AddUserResponse addUserResponse = servicio.addUser(addUser);
        
        System.out.println("Respuesta de añadir usuario: " + addUserResponse.get_return().getResponse());
        
        System.out.println("==================================");
        
        
		
		
		
		
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
        AddUserResponse addUserResponse = servicio.addUser(addUser);
        System.out.println("Respuesta de añadir usuario: " + addUserResponse.get_return().getResponse());
        
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
		usuarioPepito.setPwd("contraseñaAutoGenerada");
		
		servicio.usuarioUsado = usuarioPepito;
        
        
        Logout logout = new Logout();
        LogoutResponse logoutResponse = servicio.logout(logout);
        System.out.println("Respuesta de cierre de sesión: " + logoutResponse.get_return().getResponse());
        System.out.println("=================================");
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
        
        
        
//        // Probar cambio de contraseña del admin
//        System.out.println("===== Cambio de Contraseña =====");
//        ChangePassword changePassword = new ChangePassword();
//        PasswordPair passwordPair = new PasswordPair();
//        passwordPair.setOldpwd("admin");
//        passwordPair.setNewpwd("newadmin");
//        changePassword.setArgs0(passwordPair);
//        ChangePasswordResponse changePasswordResponse = servicio.changePassword(changePassword);
//        System.out.println("Respuesta de cambio de contraseña: " + changePasswordResponse.get_return().getResponse());
//
//        // Intentar iniciar sesión con la nueva contraseña del admin
//        System.out.println("===== Re-Inicio de Sesión (Admin) =====");
//        admin.setPwd("newadmin");
//        login.setArgs0(admin);
//        loginResponse = servicio.login(login);
//        System.out.println("Respuesta de re-inicio de sesión: " + loginResponse.get_return().getResponse());        
	}
}
