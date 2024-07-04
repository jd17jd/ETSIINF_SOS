package sos;

import java.rmi.RemoteException;

import java.util.Scanner;
import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;


public class Test_1 {

	public static void Prueba_1(Cliente cliente) {
		String username = "admin";
		String password = "admin";
		boolean res = false;
		
		try {
			res = cliente.login(username, password);
			if(res) System.out.println("El admin se ha loggeado bien.");
			else System.out.println("Error con el login");

			res = cliente.changePassword(username, "adminNew");
			if(res) System.out.println("Admin ha cambiado la contraseña.");
			else System.out.println("Error con el cambio de contraseña");

			cliente.logout();
			System.out.println("Usuario desloggeado");

			res = cliente.login(username, "adminNew");
			if(res) System.out.println("El admin se ha loggeado de nuevo bien.");
			else System.out.println("Error con el login");

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) { //Logout
			e.printStackTrace();
		}
	}
	
	public static void Prueba_2(Cliente cliente) {
		String username = "admin";
		String password = "admin";
		boolean res = false;
		
		try {
			res = cliente.login(username, password);
			if(res) System.out.println("El admin se ha loggeado bien.");
			else System.out.println("Error con el login");

			cliente.addUser("usuarioP");
			System.out.println("Admin ha añadido a 'usuarioP'.");
//			else System.out.println("Error al añadir usuario 'usuarioP'.");

			cliente.addUser("usuarioP");
			System.out.println("Admin ha añadido a 'usuarioP'.");
//			else System.out.println("Error al añadir usuario 'usuarioP'");

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) { //Logout
			e.printStackTrace();
		}
	}
	
	public static void Prueba_6(Cliente cliente,Cliente cliente2) {
		boolean res = false;
		
		try {
			res = cliente.login("user2", "contraseñaMal");
			if(res) System.out.println("El user2 se ha loggeado bien.");
			else System.out.println("Error con el login");

			res = cliente.login("admin", "admin");
			if(res) System.out.println("El admin se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			cliente.addUser("usuario2");
			if(res) System.out.println("Admin ha añadido a 'usuario2'.");
			else System.out.println("Error al añadir usuario 'usuario2'");


		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) { //Logout
			e.printStackTrace();
		}
	}
	
	
	public static void main(String [] args) {
		try {
			
			//stubs cada cliente ejecuta operaciones
			Cliente clienteAdmin = new Cliente();
			Cliente cliente1 = new Cliente();
			Cliente cliente2 = new Cliente();
			Cliente cliente3 = new Cliente();
			Cliente cliente4 = new Cliente();
			Cliente cliente5 = new Cliente();
			
			//user => usuarioP
			//user2 => joselito
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
			System.out.println("TEST Nº 6");
			System.out.println("------------------\n");

			//se loggea user2 y da mal
			boolean res = cliente1.login("qq","noExiste");
			if(res) System.out.println("El joselito se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			//se loggea admin
			boolean res2 = cliente1.login("admin","admin");
			if(res2) System.out.println("El admin se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			// Añadir un nuevo usuario
	        AddUserResponse addUserResponse = cliente1.addUser("j");
	        if (addUserResponse.getResponse()) {
	        	System.out.println("Usuario joselito añadido correctamente.");
	            System.out.println("Contraseña autogenerada: " + addUserResponse.getPwd());
	        } else {
	        	System.out.println("Error al añadir usuario joselito.");
	        }
	        
	        //login en otro stub(2)
	        boolean res3 = cliente2.login("joselito","joselito8419");
			if(res3) System.out.println("El joselito se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			//intenta borrar user1 pero no tiene permisos
			boolean res4 = cliente2.removeUser("usuarioP");
			if(res4) System.out.println("El usuarioP se ha borrado.");
			else System.out.println("Error con el remove prq no tiene permisos.");
			
			//admin intenta borrar user1 (deberia poder)
			boolean res5 = cliente1.removeUser("usuarioP");
			if(res) System.out.println("El usuarioP se ha borrado.");
			else System.out.println("Error con el remove");
			
			//admin intenta borrar user1 (NO deberia poder)
			boolean res6 = cliente1.removeUser("user500");
			if(res6) System.out.println("El usuarioP se ha borrado.");
			else System.out.println("Error con el remove prq el usuario no existe.");

			System.out.println("------------------\n");
			
			
			//////////////////////////////////////////////////////////////////////////////	
			//////////////////////////////////////////////////////////////////////////////
			
			
		}
		catch(Exception e) {

			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		}
	}
}
