package sos;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;

public class WineSocialUPMClient {
	
	public static void main (String [] args) {
		try {
			WineSocialUPMStub stub = new WineSocialUPMStub();
			stub._getServiceClient().getOptions().setManageSession(true);// ponemos la gestion en modo HTTP.
			stub._getServiceClient().engageModule("adressing");// lo ponemos en modo adressing.
			
			System.out.println("PRIMERA PRUEBA\n");
			System.out.println("Prueba de login de admin.\n");
			System.out.println("------------------\n");
			
			Login login = new Login();// creo el objeto login para usarlo en el metodo login.
			User user = new User();// creo el objeto user
			user.setName("admin");// pongo los parametros de admin.
			user.setPwd("admin");
			login.setArgs0(user);// metemos el user en el objeto.
			LoginResponse response = stub.login(login);// llamo a login .
			System.out.println(response.get_return().getResponse()+"\n");// vemos la respuesta
			
//			System.out.println("SEGUNDA PRUEBA");
//			System.out.println("Creamos un usuario nuevo con el admin.\n");
//			System.out.println("------------------\n");
//			AddUser addUser = new AddUser();// creo los respectivos objetos.
//			Username username = new Username();// creo el username.
//			username.setUsername("Antonio");// pongo el nombre
//			addUser.setArgs0(username);// lo pongo en el objeto adduser
//			AddUserResponseE respuesta = stub.addUser(addUser);//llamo a la función.
//			System.out.println(respuesta.get_return().getResponse()+"\n");// vemos la respuesta
//			
//			
//			//AHORA VAMOS A HACER LOGIN CON EL USUARIO CREADO.
//			System.out.println("TERCERA PRUEBA");
//			System.out.println("Iniciamos sesión con el nuevo usuario.\n");
//			System.out.println("------------------\n");
//			System.out.println("creamos el nuevo stub\n");
//			WineSocialUPMStub stub2 =new WineSocialUPMStub();
//			stub2._getServiceClient().getOptions().setManageSession(true);// ponemos la gestion en modo HTTP.
//			stub2._getServiceClient().engageModule("adressing");// lo ponemos en modo adressing.
//			System.out.println("Stub2 creado\n");
			
			
			
		}catch(Exception e) {
			System.out.println("Fallo en stub del cliente\n"); 
			e.printStackTrace();
		}
	}

}
