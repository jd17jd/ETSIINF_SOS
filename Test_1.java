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
			boolean res = cliente1.login("joselito","noExiste");
			if(res) System.out.println("El joselito se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			//se loggea admin
			boolean res = cliente1.login("admin","admin");
			if(res) System.out.println("El admin se ha loggeado bien.");
			else System.out.println("Error con el login");
			
			// Añadir un nuevo usuario
	        AddUserResponse addUserResponse = cliente1.addUser("joselito");
	        if (addUserResponse.getResponse()) {
	        	System.out.println("Usuario joselito añadido correctamente.");
	            System.out.println("Contraseña autogenerada: " + addUserResponse.getPassword());
	        } else {
	        	System.out.println("Error al añadir usuario joselito.");
	        }
	        
	        
			

			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////	
			//////////////////////////////////////////////////////////////////////////////
						
//			System.out.println("TEST Nº 8");
//			System.out.println("------------------\n");
//			
//			
//			if(cliente1.login("user2","contraseñaDeUser2")) {
//				System.out.println("El user2 se ha loggeado bien en el stub1.");
//			}
//			
//			if(cliente2.login("user2","laMismaDeArriba")) {
//				System.out.println("El user2 se ha loggeado bien en el stub2.");
//			}
//			
//			if(cliente1.logout()) {
//				System.out.println("El user2 se ha desloggeado del stub1.");
//			}
//			
//			if(!(cliente1.changePassword("contraseñaDeAntes","nuevaContraseña"))) {
//				System.out.println("No se ha cambiado la contraseña en el stub1 prq hice logout.");
//			}
//			
//			if(!(cliente2.changePassword("contraseñaDeAntes","nuevaContraseña"))) {
//				System.out.println("Se ha cambiado la contraseña correctamente en el stub2.");
//			}
//			
//			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
//			System.out.println("TEST Nº 10");
//			System.out.println("------------------\n");
//			
//			
//			if(cliente1.login("user2","contraseñaDeUser2")) {
//				System.out.println("El user2 se ha loggeado bien en el stub1.");
//			}
//			
//			if(cliente1.login("user2","contraseñaDeUser2")) {
//				System.out.println("El user2 se VUELVE a loggear en el stub1.");
//			}
//			
//			if(cliente1.logout()) {
//				System.out.println("El user2 se ha desloggeado del stub1.");
//			}
//			
//			if(!(cliente1.login("admin","admin"))) {
//				System.out.println("El admin no se pudo loggear en el stub1.");
//			}
//			
//			if(cliente1.logout()) {
//				System.out.println("El user2 se ha desloggeado del stub1.");
//			}
//			
//			if(cliente1.login("admin","admin")) {
//				System.out.println("El admin se ha loggeado en el stub1.");
//			}
//			
//			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////

//			System.out.println("TEST Nº 11");
//			System.out.println("------------------\n");
//			
//			
//			if(cliente1.login("user2","contraseñaDeUser2")) {
//				System.out.println("El user2 se ha loggeado bien en el stub1.");
//			}
//			
//			if(cliente2.login("admin","admin")) {
//				System.out.println("El admin se loggea en el stub2.");
//			}
//			
//			if(cliente2.removeUser("user2")) {
//				System.out.println("El admin borra el user2.");
//			}
//			
//			if(cliente1.login("user2","contraseñaUser")) {
//				System.out.println("El user2 no se pudo loggear en el stub1.");
//			}
//						
//			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
//			System.out.println("TEST Nº 14");
//			System.out.println("------------------\n");
//			
//			
//			if(cliente2.login("admin","admin")) {
//				System.out.println("El admin se loggea en el stub2.");
//			}
//			
//			if(cliente2.addUser("user11")) {
//				System.out.println("El admin crea el 'user11'.");
//			}
//			
//			if(cliente1.login("user11","contraseñaUser11")) {
//				System.out.println("El user11 se loggea en el stub1.");
//			}
//			
//			if(cliente2.login("user11","contraseñaUser11")) {
//				System.out.println("El user11 se loggea en el stub2.");
//			}
//			
//			if(cliente1.removeUser("user11")) {
//				System.out.println("El user11 se borra a si mismo en stub1.");
//			}
//			
//			if(cliente2.login("user11","contraseñaUser11")) {
//				System.out.println("El user11 no se pudo loggear en el stub2.");
//			}
//						
//			System.out.println("------------------\n");
			
			
		}
		catch(Exception e) {

			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		} */
	}
	
	

}
