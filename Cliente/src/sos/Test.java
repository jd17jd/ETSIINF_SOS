package sos;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;
public class Test {


	public static void prueba_login() {
		String username = "user2";
		String password = "contraseñaDaigual";
		
		try {
			boolean res = cliente.login(username, password);
			
			if(res)
				System.out.println("Se ha hecho login correctamente");
			else
				System.out.println("Error con el login");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	} 
	
	
	public static void main(String [] args) {
		try {
			Cliente admin = new Cliente();
			Cliente cliente2 = new Cliente();
			Cliente cliente3 = new Cliente();
			Cliente cliente4 = new Cliente();
			Cliente cliente5 = new Cliente();
			
			System.out.println("PRIMERA PRUEBA");
			System.out.println("Prueba de login de user2.");
			System.out.println("------------------\n");

			cliente2.login("user2", "contraseñaDaigual"); //False


			System.out.println("SEGUNDA PRUEBA");
			System.out.println("Prueba de login de admin.");
			System.out.println("------------------\n");

			admin.login("admin", "admin"); //True

			System.out.println("TERCERA PRUEBA");
			System.out.println("Prueba de crear de admin.");
			System.out.println("------------------\n");

			admin.addUser("user2"); //True

			System.out.println("TERCERA PRUEBA");
			System.out.println("Prueba de crear de admin.");
			System.out.println("------------------\n");

			cliente2.login("user1"); //True


		}
		catch(Exception e) {

			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		}
	}
	
	

}
