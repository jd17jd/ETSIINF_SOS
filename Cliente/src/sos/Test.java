package sos;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;
public class Test {
	
	
	public static void main(String [] args) {
		try {
			Cliente cliente1 = new Cliente();
			
			System.out.println("PRIMERA PRUEBA");
			System.out.println("Prueba de login de admin.");
			System.out.println("------------------\n");
			
			cliente1.addUser("Juan");
//			cliente1.login("admin", "admin");
			
			
			
		} catch(Exception e) {
		System.out.println("Fallo en stub del cliente\n"); 
		e.printStackTrace();
	}
		
	}
	
	

}
