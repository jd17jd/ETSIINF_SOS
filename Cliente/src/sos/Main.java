package sos;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponse;;

public class Main {

	private static Cliente cliente;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		try {
			cliente = new Cliente();
			
			while(true) {
				printMenu();
				
				System.out.println("Selecciona una opcion");
				
				int opcion = leeInt();
				
				ejecutaOpcion(opcion);
			}
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void printMenu() {
		System.out.println("\n1. 	AddUser");
		System.out.println("2. 	Login");
		System.out.println("3. 	Logout");
		System.out.println("4. 	RemoveUser");
		System.out.println("5. 	ChangePassword");
		System.out.println("6. 	AddFollower");
		System.out.println("7. 	Unfollow");
		System.out.println("8. 	GetMyFollowers");
		System.out.println("9. 	AddWine");
		System.out.println("10. RemoveWine");
		System.out.println("11. GetWines");
		System.out.println("12. RateWine");		
		System.out.println("13. GetMyRates");
		System.out.println("14. GetMyFollowerRates\n");		
	}
	
	public static void ejecutaOpcion(int opcion) {
		switch(opcion) {
		case 1:
			addUser();
			break;
		case 2:
			login();
			break;
		case 3:
			logout();
			break;
		case 4:
			removeUser();
			break;
		case 5:
			changePassword();
			break;
		case 6:
			addFollower();
			break;
		case 7:
			unfollow();
			break;
		case 8:
			getMyFollowers();
			break;
		case 9:
			addWine();
			break;
		case 10:
			removeWine();
			break;
		case 11:
			getWines();
			break;
		case 12:
			rateWine();
			break;
		case 13:
			getMyRates();
			break;
		case 14:
			getMyFollowerRates();
			
		}
	}
	
	public static void addUser() {
		System.out.println("Escribe el nombre del nuevo usuario...");
		String name = leeString();
		
		try {
			AddUserResponse res = cliente.addUser(name);
			
			if(res.getResponse()) {
				System.out.println("Creado usuario con contraseña: " + res.getPwd());
			} else {
				System.out.println("Error al crear el usuario");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void login() {
		System.out.println("Escibe un nombre de usuario...");
		String username = leeString();
		
		System.out.println("Escribe una contraseña...");
		String password = leeString();
		
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
	
	
	public static void logout() {
		try {
			cliente.logout();
			System.out.println("Logout realizado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void removeUser() {
		System.out.println("Escribe el nombre...");
		String name = leeString();
		
		try {
			boolean res = cliente.removeUser(name);
			
			if(res)
				System.out.println("Borrado el usuario: " + name);
			else
				System.out.println("Error al borrar el usuario");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void changePassword() {
		System.out.println("Escibe la contraseña antigua...");
		String oldPwd = leeString();
		
		System.out.println("Escribe la contraseña nueva...");
		String newPwd = leeString();
		
		try {
			boolean res = cliente.changePassword(oldPwd, newPwd);
				
			if(res)	
				System.out.println("Se ha cambiado correctamente");
			else
				System.out.println("Error al cambiar la contraseña");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void addFollower() {
		System.out.println("Escibe el nombre del usuario a seguir...");
		String name = leeString();
		
		try {
			boolean res = cliente.addFollower(name);
			
			if(res)	
				System.out.println("Se ha añadido correctamente");
			else
				System.out.println("Error al añadir al seguidor");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void unfollow() {
		System.out.println("Escibe el nombre del usuario a dejar de seguir...");
		String name = leeString();
		
		try {
			boolean res = cliente.unfollow(name);
			
			if(res)
				System.out.println("Se ha eliminado correctamente");
			else
				System.out.println("Error al eliminar el seguidor");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void getMyFollowers() {
		try {
			String[] res = cliente.getMyFollowers();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				lista += "]";
				System.out.println("Lista: " + lista);
				
			} else
				System.out.println("Error al retornar seguidores");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void addWine() {
		System.out.println("Escibe el nombre del vino a añadir...");
		String name = leeString();
		
		System.out.println("Escibe su tipo de uva...");
		String grape = leeString();
		
		System.out.println("Escibe su año...");
		int year = leeInt();
		
		try {
			boolean res = cliente.addWine(name, grape, year);
			
			if(res)	
				System.out.println("Se ha añadido correctamente");
			else
				System.out.println("Error al añadir el vino");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void removeWine() {
		System.out.println("Escibe el nombre del vino que desea eliminar...");
		String name = leeString();
		
		System.out.println("Escibe su tipo de uva...");
		String grape = leeString();
		
		System.out.println("Escibe su año...");
		int year = leeInt();
		
		try {
			boolean res = cliente.removeWine(name, grape, year);
			
			if(res)	
				System.out.println("Se ha eliminado correctamente");
			else
				System.out.println("Error al eliminar el vino");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void getWines() {
		try {
			String[] res = cliente.getWines();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				lista += "]";
				System.out.println("Lista: " + lista);
			} else
				System.out.println("Error al retornar vinos");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void rateWine() {
		System.out.println("Escibe el nombre del vino a puntuar...");
		String name = leeString();
		
		System.out.println("Escibe su tipo de uva...");
		String grape = leeString();
		
		System.out.println("Escibe su año...");
		int year = leeInt();
		
		System.out.println("Escibe su puntuacion...");
		int rate = leeInt();
		
		try {
			boolean res = cliente.rateWine(name, grape, year, rate);
			
			if(res)	
				System.out.println("Se ha puntuado correctamente");
			else
				System.out.println("Error al puntuar el vino");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void getMyRates() {
		try {
			String[] res = cliente.getMyRates();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				lista += "]";
				System.out.println("Lista: " + lista);
			} else
				System.out.println("Error al retornar mis vinos puntuados");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void getMyFollowerRates() {
		try {
			String[] res = cliente.getMyFollowerRates();
			
			if(res != null)	{
				String lista = "[";
				
				for(int i = 0; i < res.length; i++) {
					lista += res[i] + ",";
				}
				lista += "]";
				System.out.println("Lista: " + lista);
			} else
				System.out.println("Error al retornar los vinos puntuados de mis seguidores");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	
	public static int leeInt() {
		int res = scanner.nextInt();
		scanner.nextLine(); //https://stackoverflow.com/a/23450551
		
		return res;
	}
	
	public static String leeString() {
		String res = scanner.nextLine();
		
		return res;
	}
	
}
