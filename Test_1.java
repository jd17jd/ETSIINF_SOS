package sos;

import java.rmi.RemoteException;

import java.util.Scanner;
import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;


public class Test_1 {

	public static void prueba_login(Cliente cliente) {
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
			if(res) System.out.println("Admin se desloggea.");
			else System.out.println("Error con el logout");

			res = cliente.login(username, "adminNew");
			if(res) System.out.println("El admin se ha loggeado de nuevo bien.");
			else System.out.println("Error con el login");

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) { //Logout
			e.printStackTrace();
		}
	} 
	
	
	public static void main(String [] args) {
		try {
			Cliente clienteAdmin = new Cliente();
			
			prueba_login(clienteAdmin);
			
		}
		catch(Exception e) {
			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		}
		
		
		
		/* try {
			
			//stubs cada cliente ejecuta operaciones
			Cliente clienteAdmin = new Cliente();
			Cliente cliente1 = new Cliente();
			Cliente cliente2 = new Cliente();
			Cliente cliente3 = new Cliente();
			Cliente cliente4 = new Cliente();
			Cliente cliente5 = new Cliente();
			
			//TODO: Como sabemos la contraseña que se genera en el stub¿? 
			//¿Ejecutamos una vez y vemos la contraseña (se guarda en backend) y luego podemos
			//seguir ejecutando las demas pruebas? => Mejor opcion hacerlo secuencial.
			
			System.out.println("TEST Nº 1");
			System.out.println("------------------\n");
			
			
			if(cliente1.login("admin","admin")) {
				System.out.println("El admin se ha loggeado bien.");
			}
			
			if(cliente1.changePassword("admin","adminNew")) {
				System.out.println("Admin ha cambiado la contraseña.");
			}
			
			if(cliente1.logout()) {
				System.out.println("Admin se desloggea.");
			}
			
			if(cliente1.login("admin","adminNew")) {
				System.out.println("El admin se ha loggeado de nuevo bien.");
			}
			
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////

			System.out.println("TEST Nº 2");
			System.out.println("------------------\n");
			
			
			if(cliente1.login("admin","admin")) {
				System.out.println("El admin se ha loggeado.");
			}
			
			if(cliente1.addUser("user")) {
				System.out.println("El admin añade al usuario 'user'.");
			}
			
			if(!(cliente1.addUser("user"))) {
				System.out.println("El admin no debería haber añadido al usuario 'user' prq ya existe.");
			}
			
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
			System.out.println("TEST Nº 6");
			System.out.println("------------------\n");

			clienteAdmin.login("admin", "admin");
			
			if(!(cliente2.login("user2","contraseñaDaIgual"))) {
				System.out.println("Ha dado false prq no existe ese usuario.");
			}
			
			if(cliente2.login("admin","admin")) {
				System.out.println("El admin se ha loggeado bien.");
			}
			
			if(cliente2.addUser("user2")) {
				System.out.println("Admin ha creado el user2.");
			}
			
			//como se que contraseña usar¿?
			if(cliente3.login("user2","user2145")) {
				System.out.println("Se loggea el user2 desde otro stub.");
			}
			
			if(!(cliente2.removeUser("user1"))) {
				System.out.println("No se ha borrado el user1 prq no tenia permisos.");
			}
			
			if(clienteAdmin.removeUser("user1")) {
				System.out.println("Admin ha borrado el user1.");
			}
			
			if(!(clienteAdmin.removeUser("user500"))) {
				System.out.println("No se ha borrado el user500 prq no existe.");
			}
			
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////	
			//////////////////////////////////////////////////////////////////////////////
						
			System.out.println("TEST Nº 8");
			System.out.println("------------------\n");
			
			
			if(cliente1.login("user2","contraseñaDeUser2")) {
				System.out.println("El user2 se ha loggeado bien en el stub1.");
			}
			
			if(cliente2.login("user2","laMismaDeArriba")) {
				System.out.println("El user2 se ha loggeado bien en el stub2.");
			}
			
			if(cliente1.logout()) {
				System.out.println("El user2 se ha desloggeado del stub1.");
			}
			
			if(!(cliente1.changePassword("contraseñaDeAntes","nuevaContraseña"))) {
				System.out.println("No se ha cambiado la contraseña en el stub1 prq hice logout.");
			}
			
			if(!(cliente2.changePassword("contraseñaDeAntes","nuevaContraseña"))) {
				System.out.println("Se ha cambiado la contraseña correctamente en el stub2.");
			}
			
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
			System.out.println("TEST Nº 10");
			System.out.println("------------------\n");
			
			
			if(cliente1.login("user2","contraseñaDeUser2")) {
				System.out.println("El user2 se ha loggeado bien en el stub1.");
			}
			
			if(cliente1.login("user2","contraseñaDeUser2")) {
				System.out.println("El user2 se VUELVE a loggear en el stub1.");
			}
			
			if(cliente1.logout()) {
				System.out.println("El user2 se ha desloggeado del stub1.");
			}
			
			if(!(cliente1.login("admin","admin"))) {
				System.out.println("El admin no se pudo loggear en el stub1.");
			}
			
			if(cliente1.logout()) {
				System.out.println("El user2 se ha desloggeado del stub1.");
			}
			
			if(cliente1.login("admin","admin")) {
				System.out.println("El admin se ha loggeado en el stub1.");
			}
			
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////

			System.out.println("TEST Nº 11");
			System.out.println("------------------\n");
			
			
			if(cliente1.login("user2","contraseñaDeUser2")) {
				System.out.println("El user2 se ha loggeado bien en el stub1.");
			}
			
			if(cliente2.login("admin","admin")) {
				System.out.println("El admin se loggea en el stub2.");
			}
			
			if(cliente2.removeUser("user2")) {
				System.out.println("El admin borra el user2.");
			}
			
			if(cliente1.login("user2","contraseñaUser")) {
				System.out.println("El user2 no se pudo loggear en el stub1.");
			}
						
			System.out.println("------------------\n");
			
			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			
			System.out.println("TEST Nº 14");
			System.out.println("------------------\n");
			
			
			if(cliente2.login("admin","admin")) {
				System.out.println("El admin se loggea en el stub2.");
			}
			
			if(cliente2.addUser("user11")) {
				System.out.println("El admin crea el 'user11'.");
			}
			
			if(cliente1.login("user11","contraseñaUser11")) {
				System.out.println("El user11 se loggea en el stub1.");
			}
			
			if(cliente2.login("user11","contraseñaUser11")) {
				System.out.println("El user11 se loggea en el stub2.");
			}
			
			if(cliente1.removeUser("user11")) {
				System.out.println("El user11 se borra a si mismo en stub1.");
			}
			
			if(cliente2.login("user11","contraseñaUser11")) {
				System.out.println("El user11 no se pudo loggear en el stub2.");
			}
						
			System.out.println("------------------\n");
			
			
		}
		catch(Exception e) {

			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		} */
	}
	
	

}
