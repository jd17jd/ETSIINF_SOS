package sos;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.ETSIINFSocialStub.AddUserResponse;

public class Main {

	private static Client client;
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		try {
			client = new Client();
			
			while(true) {
				printMenu();
				
				System.out.println("Escribe una opcion...");
				
				int opcion = leeInt();
				
				ejecutaOpcion(opcion);
			}
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void printMenu() {
		System.out.println("************");
		System.out.println("1. 	Login");
		System.out.println("2. 	Logout");
		System.out.println("3. 	AddUser");
		System.out.println("4. 	RemoveUser");
		System.out.println("5. 	ChangePassword");
		System.out.println("6. 	AddFriend");
		System.out.println("7. 	RemoveFriend");
		System.out.println("8. 	GetMyFriends");
		System.out.println("9. 	PublishState");
		System.out.println("10. GetMyStates");
		System.out.println("11. GetMyFriendStates");
		System.out.println("************");
		
	}
	
	public static void ejecutaOpcion(int opcion) {
		switch(opcion) {
		case 1:
			login();
			break;
		case 2:
			logout();
			break;
		case 3:
			addUser();
			break;
		case 4:
			removeUser();
			break;
		case 5:
			changePassword();
			break;
		case 6:
			addFriend();
			break;
		case 7:
			removeFriend();
			break;
		case 8:
			getMyFriends();
			break;
		case 9:
			publishState();
			break;
		case 10:
			getMyStates();
			break;
		case 11:
			getMyFriendStates();
			break;
			
		}
	}
	
	public static void login() {
		System.out.println("Escibe un nombre de usuario...");
		String username = leeString();
		
		System.out.println("Escribe una contraseña...");
		String password = leeString();
		
		try {
			boolean res = client.login(username, password);
			
			if(res)	
				System.out.println("Se ha hecho login correctamente");
			else
				System.out.println("Error con el login");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void logout() {
		
		try {
			client.logout();
			System.out.println("Logout realizado");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addUser() {
		System.out.println("Escribe el nombre...");
		String name = leeString();
		
		try {
			AddUserResponse res = client.addUser(name);
			
			if(res.getResponse()) {
				System.out.println("Creado usuario con contraseña: " + res.getPwd());
			} else {
				System.out.println("Error al crear el usuario");
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeUser() {
		System.out.println("Escribe el nombre...");
		String name = leeString();
		
		try {
			boolean res = client.removeUser(name);
			
			if(res) {
				System.out.println("Borrado el usuario: " + name);
			} else {
				System.out.println("Error al borrar el usuario");
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void changePassword() {
		System.out.println("Escibe la contraseña antigua...");
		String oldPwd = leeString();
		
		System.out.println("Escribe la contraseña nueva...");
		String newPwd = leeString();
		
		try {
			boolean res = client.changePassword(oldPwd, newPwd);
			
			if(res)	
				System.out.println("Se ha cambiado correctamente");
			else
				System.out.println("Error al cambiar la contraseña");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addFriend() {
		System.out.println("Escibe el nombre del amigo...");
		String name = leeString();
		
		try {
			boolean res = client.addFriend(name);
			
			if(res)	
				System.out.println("Se ha añadido correctamente");
			else
				System.out.println("Error al añadir al amigo");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeFriend() {
		System.out.println("Escibe el nombre del amigo...");
		String name = leeString();
		
		try {
			boolean res = client.removeFriend(name);
			
			if(res)	
				System.out.println("Se ha removido correctamente");
			else
				System.out.println("Error al remover al amigo");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getMyFriends() {
		
		try {
			String[] res = client.getMyFriends();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				
				lista += "]";
				System.out.println("Lista: " + lista);
			}else
				System.out.println("Error al retornar amigos");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void publishState() {
		System.out.println("Escibe el text del estado...");
		String text = leeString();
		
		try {
			boolean res = client.publishState(text);
			
			if(res)	
				System.out.println("Se ha añadido correctamente el estado: " + text);
			else
				System.out.println("Error al añadir el estado");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getMyStates() {
		
		try {
			String[] res = client.getMyStates();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				
				lista += "]";
				
				System.out.println("Lista: " + lista);
			}else
				System.out.println("Error al get los estados");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getMyFriendStates() {
		System.out.println("Escribe el nombre del amigo...");
		String name = leeString();
		
		try {
			String[] res = client.getMyFriendStates(name);
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				
				lista += "]";
			
				System.out.println("Lista de estados de "+ name + ": " + lista);
			} else
				System.out.println("Error al get los estados del amigo");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int leeInt() {
		
		int res = sc.nextInt();
		sc.nextLine(); //https://stackoverflow.com/a/23450551
		
		return res;
	}
	
	public static String leeString() {
		
		String res = sc.nextLine();
		
		
		return res;
	}
	
	

}
