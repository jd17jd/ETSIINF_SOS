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
		
		//simulamos que el admin ha iniciado sesion
		servicio.usuarioActual = admin;
		
		// Prueba de AddUser
        System.out.println("===== Añadir Usuario =====");
        AddUser addUser = new AddUser();
        Username username = new Username();
       
        username.setUsername("user1");
        addUser.setArgs0(username);
        
        AddUserResponse addUserResponse = servicio.addUser(addUser);
        System.out.println("Respuesta de añadir usuario: " + addUserResponse.get_return().getResponse());
        
        System.out.println("=======================");
	}
}
