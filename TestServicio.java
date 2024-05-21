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
		servicio.usuarioActual = admin;
		
		//System.out.println("El usuario con el que accedo al servicio es: " + servicio.usuarioActual.getName());
		//System.out.println("\n\n");
		
		
        System.out.println("========= PRUEBA addUser =========");
        
        AddUser addUser = new AddUser();
        Username username = new Username();
        username.setUsername("user1");
        addUser.setArgs0(username);
        //System.out.println("El usuario que quiero añadir es => " + addUser.getArgs0().getUsername());
        AddUserResponse addUserResponse = servicio.addUser(addUser);
        
        System.out.println("Respuesta de añadir usuario: " + addUserResponse.get_return().getResponse());
        
        System.out.println("==================================");
        
        
        
        /*
        System.out.println("\n");
        System.out.println("======== PRUEBA login ========");
        
        User newUser = new User();
        newUser.setName("user1");
        newUser.setPwd(addUserResponse.get_return().getPwd());
        
        Login login = new Login();
        login.setArgs0(newUser);
        LoginResponse loginResponse = servicio.login(login);
        System.out.println("Respuesta de inicio de sesión: " + loginResponse.get_return().getResponse());
        
        System.out.println("=================================");
        */
        
//
//        // Probar cierre de sesión
//        System.out.println("===== Cierre de Sesión =====");
//        Logout logout = new Logout();
//        LogoutResponse logoutResponse = servicio.logout(logout);
//        System.out.println("Respuesta de cierre de sesión: " + logoutResponse.get_return().getResponse());
//
//        // Probar eliminación de usuario
//        System.out.println("===== Eliminación de Usuario =====");
//        RemoveUser removeUser = new RemoveUser();
//        removeUser.setArgs0(username);
//        RemoveUserResponse removeUserResponse = servicio.removeUser(removeUser);
//        System.out.println("Respuesta de eliminación de usuario: " + removeUserResponse.get_return().getResponse());
//
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
