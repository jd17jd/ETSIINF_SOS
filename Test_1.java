package sos;

import java.rmi.RemoteException;

import java.util.Scanner;
import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;

public class Test_1 {

	/*
	 * public static void Prueba_1(Cliente cliente) { String username = "admin";
	 * String password = "admin"; boolean res = false;
	 * 
	 * try { res = cliente.login(username, password); if(res)
	 * System.out.println("El admin se ha loggeado bien."); else
	 * System.out.println("Error con el login");
	 * 
	 * res = cliente.changePassword(username, "adminNew"); if(res)
	 * System.out.println("Admin ha cambiado la contraseña."); else
	 * System.out.println("Error con el cambio de contraseña");
	 * 
	 * cliente.logout(); System.out.println("Usuario desloggeado");
	 * 
	 * res = cliente.login(username, "adminNew"); if(res)
	 * System.out.println("El admin se ha loggeado de nuevo bien."); else
	 * System.out.println("Error con el login");
	 * 
	 * } catch (RemoteException e) { e.printStackTrace(); } catch (Exception e) {
	 * //Logout e.printStackTrace(); } }
	 * 
	 * public static void Prueba_2(Cliente cliente) { String username = "admin";
	 * String password = "admin"; boolean res = false;
	 * 
	 * try { res = cliente.login(username, password); if(res)
	 * System.out.println("El admin se ha loggeado bien."); else
	 * System.out.println("Error con el login");
	 * 
	 * cliente.addUser("usuarioP");
	 * System.out.println("Admin ha añadido a 'usuarioP'."); // else
	 * System.out.println("Error al añadir usuario 'usuarioP'.");
	 * 
	 * cliente.addUser("usuarioP");
	 * System.out.println("Admin ha añadido a 'usuarioP'."); // else
	 * System.out.println("Error al añadir usuario 'usuarioP'");
	 * 
	 * } catch (RemoteException e) { e.printStackTrace(); } catch (Exception e) {
	 * //Logout e.printStackTrace(); } }
	 * 
	 * public static void Prueba_6(Cliente cliente,Cliente cliente2) { boolean res =
	 * false;
	 * 
	 * try { res = cliente.login("user2", "contraseñaMal"); if(res)
	 * System.out.println("El user2 se ha loggeado bien."); else
	 * System.out.println("Error con el login");
	 * 
	 * res = cliente.login("admin", "admin"); if(res)
	 * System.out.println("El admin se ha loggeado bien."); else
	 * System.out.println("Error con el login");
	 * 
	 * cliente.addUser("usuario2"); if(res)
	 * System.out.println("Admin ha añadido a 'usuario2'."); else
	 * System.out.println("Error al añadir usuario 'usuario2'");
	 * 
	 * 
	 * } catch (RemoteException e) { e.printStackTrace(); } catch (Exception e) {
	 * //Logout e.printStackTrace(); } }
	 * 
	 */

	static WineSocialUPMStub admin;
	static WineSocialUPMStub stub1;
	static WineSocialUPMStub stub2;
	static WineSocialUPMStub stub3;
	static Logout logoutVacio = new Logout();
	static RemoveUser userBorrar = new RemoveUser();

	private static void init() throws AxisFault {
		admin = getStub();
		stub1 = getStub();
		stub2 = getStub();
		stub3 = getStub();
	}

	private static WineSocialUPMStub getStub() throws AxisFault {
		WineSocialUPMStub stub = new WineSocialUPMStub();
		stub._getServiceClient().getOptions().setManageSession(true);
		stub._getServiceClient().engageModule("addressing");
		return stub;
	}

	private static WineSocialUPMStub resetStub(WineSocialUPMStub stub) throws AxisFault {
		stub = new WineSocialUPMStub();
		stub._getServiceClient().getOptions().setManageSession(true);
		stub._getServiceClient().engageModule("addressing");
		return stub;
	}

	private static void borradoUsuarios() {
		try {
			UPMAuthenticationAuthorizationWSSkeletonStub st = new UPMAuthenticationAuthorizationWSSkeletonStub();
			RemoveUserE removeUser0 = new RemoveUserE();
			es.upm.etsiinf.client.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser param = new es.upm.etsiinf.client.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();
			param.setName("test%");
			removeUser0.setRemoveUser(param);
			RemoveUserResponseE res = st.removeUser(removeUser0);
			System.out.println("RESULTADO REMOVE: " + !res.get_return().getResult());
		} catch (RemoteException var4) {
			var4.printStackTrace();
		}

	}

	private static Login createLoginData(String username, String password) {
		Login res = new Login();
		User user = new User();
		user.setName(username);
		user.setPwd(password);
		res.setArgs0(user);
		return res;
	}

	private static AddUser createAddData(String username) {
		AddUser res = new AddUser();
		Username param = new Username();
		param.setUsername(username);
		res.setArgs0(param);
		return res;
	}

	private static ChangePassword createChangePWDData(String oldpwd, String newpwd) {
		ChangePassword res = new ChangePassword();
		PasswordPair param = new PasswordPair();
		param.setNewpwd(newpwd);
		param.setOldpwd(oldpwd);
		res.setArgs0(param);
		return res;
	}

	private static AddFollower createFollowerData(String username) {
		AddFollower addFriend1 = new AddFollower();
		Username param = new Username();
		param.setUsername(username);
		addFriend1.setArgs0(param);
		return addFriend1;
	}

	private static AddWine createWineData(String name, String grape, int year) {
		AddWine res = new AddWine();
		Wine vino = new Wine();
		vino.setName(name);
		vino.setGrape(grape);
		vino.setYear(year);
		res.setArgs0(vino);
		return res;
	}

	private static RemoveWine removeWineData(String name, String grape, int year) {
		RemoveWine wineData = new RemoveWine();
		Wine vino = new Wine();
		vino.setName(name);
		vino.setGrape(grape);
		vino.setYear(year);
		wineData.setArgs0(vino);
		return wineData;
	}

	private static RateWine rateWineData(String name, String grape, int year, int rate) {
		RateWine rateWine = new RateWine();
		WineRated vino = new WineRated();
		vino.setName(name);
		vino.setGrape(grape);
		vino.setYear(year);
		vino.setRate(rate);
		rateWine.setArgs0(vino);
		return rateWine;
	}

	private static int test6() throws RemoteException {
		try {
			System.out.println("********************** TEST 6 (value: 1)**********************");
			System.out.println(
					"user2 login (falla), admin login, crea user2, user2 login otro st, remove user1 (falla), admin borra user1 (ok) borra user que no existe (falla)");
			stub2 = getStub();
			boolean loginFail = stub2.login(createLoginData(USER2, USER2PWD)).get_return().getResponse();
			System.out.println("Result user login (exp false becuase user not registered) : " + loginFail);
			admin = getStub();
			boolean adminLogin = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
			System.out.println("Result admin login (exp true) : " + adminLogin);
			AddUserResponseE res = admin.addUser(createAddData(USER2));
			boolean addUser2 = res.get_return().getResponse();
			USER2PWD = res.get_return().getPwd();
			System.out.println("Result add user2 (exp true) : " + addUser2);
			boolean login = stub2.login(createLoginData(USER2, USER2PWD)).get_return().getResponse();
			System.out.println("Result user2 login (exp true) : " + login);
			Username username = new Username();
			username.setUsername(USER1);
			userBorrar.setArgs0(username);
			boolean deleteFail = stub2.removeUser(userBorrar).get_return().getResponse();
			System.out.println("Result user2 deletes user1 (exp false becuase not allowed) : " + deleteFail);
			boolean delete = admin.removeUser(userBorrar).get_return().getResponse();
			System.out.println("Result admin deletes user1 (exp true) : " + delete);
			username.setUsername("user500");
			userBorrar.setArgs0(username);
			boolean deleteFailAdmin = admin.removeUser(userBorrar).get_return().getResponse();
			System.out.println(
					"Result admin deletes user500 (exp false bacause user500 didn't exist) : " + deleteFailAdmin);
			stub2.logout(logoutVacio);
			resetStub(stub2);
			admin.logout(logoutVacio);
			resetStub(admin);
			System.out.println();
			if (!loginFail && adminLogin && addUser2 && login && !deleteFail && delete && !deleteFailAdmin) {
				System.out.println("SUCCESS");
				return 1;
			} else {
				System.out.println("FAIL");
				return 0;
			}
		} catch (NullPointerException var9) {
			System.out.println();
			System.out.println("FAIL - NULLPOINTER");
			return 0;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("BORRADO USUARIOS...");
		borradoUsuarios();

		try {
			init();
		} catch (AxisFault var19) {
			System.out.println("catch AxisFault with message: " + var19.getMessage());
		}

		double totalMark = 0.0D;
		int[] arrayNotas = new int[28];
		String notas = "";

		try {
			nota = test6();
			arrayNotas[5] = nota;
			totalMark += (double) nota;
			notas = notas + nota + " / ";
		} catch (RemoteException var16) {
			System.out.println("catch RemoteException with message: " + var16.getMessage());
			System.out.println("FAILED");
		}

	}

}
