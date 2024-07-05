package sos;

import java.rmi.RemoteException;

import java.util.Scanner;
import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;

public class Test_1 {

	private static final String ADMINUSER = "admin";
	private static final String ADMINPWD = "admin";
	private static final String NEW_ADMINPWD = "admin3";

	private static final String USER1 = "uB1";


	private static final String USER2 = "uB2";
	private static String USER2PWD = "";


	private static WineSocialUPMStub admin;
	private static WineSocialUPMStub stub1;
	private static WineSocialUPMStub stub2;
	private static WineSocialUPMStub stub3;

	static Logout logoutVacio = new Logout();
	

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

/* 	private static void borradoUsuarios() {
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

	} */

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

	private static RemoveUser createRemoveUserData(String username) {
		RemoveUser res = new RemoveUser();
		Username param = new Username();
		param.setUsername(username);
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

	private static int test1() throws RemoteException {
		System.out.println("********************** TEST 1 (value: 1)**********************");
		System.out.println("1) admin login, 2) admin change password, 3) admin logout, 4) admin login con nueva pwd, 5) admin logout");
		
		admin = getStub();

		//1
		Login loginData = createLoginData(ADMINUSER, ADMINPWD);
		boolean login = admin.login(loginData).get_return().getResponse();
		System.out.println("1. Result admin login (exp true) : " + login);

		//2
		ChangePassword changePass = createChangePWDData(ADMINPWD, NEW_ADMINPWD);
		boolean changePWD = admin.changePassword(changePass).get_return().getResponse();
		System.out.println("2. Result admin changePwd (exp true) : " + changePWD);

		//3
		LogoutResponse response = admin.logout(logoutVacio);
		boolean logout = response.get_return().getResponse();
		System.out.println("3. Result admin logout (exp true) : " + logout);

		//4
		Login loginDataNew = createLoginData(ADMINUSER, NEW_ADMINPWD);
		boolean loginNewPWD = admin.login(loginDataNew).get_return().getResponse();
		System.out.println("4. Result admin login with new pwd (exp true) : " + loginNewPWD);

		//5
		LogoutResponse response2 = admin.logout(logoutVacio);
		boolean logout2 = response2.get_return().getResponse();
		System.out.println("5. Result admin logout (exp true) : " + logout2);

		if (login && changePWD && logout && loginNewPWD && logout2) {
			System.out.println("SUCCESS");
			return 1;
		}
		else {
			System.out.println("FAIL");
			return 0;
		}
	}

	private static int test2() throws RemoteException {
		System.out.println("********************** TEST 2 (value: 1)**********************");
		System.out.println("1) admin login, 2) admin addUser(testu1) x2 (segundo debe fallar), 3) admin logout");
		
		admin = getStub();
		//1
		Login loginData = createLoginData(ADMINUSER, NEW_ADMINPWD);
		boolean login = admin.login(loginData).get_return().getResponse();
		System.out.println("1. Result admin login (exp true) : " + login);

		//2
		AddUser addData1 = createAddData(USER1);
		boolean adduser = admin.addUser(addData1).get_return().getResponse();
		System.out.println("2. Result admin add user1 (exp true) : " + adduser);

		AddUser addData2 = createAddData(USER1);
		boolean adduserFail = admin.addUser(addData2).get_return().getResponse();
		System.out.println("2. Result admin add user1 (exp false) : " + adduserFail);

		//3
		LogoutResponse response = admin.logout(logoutVacio);
		boolean logout = response.get_return().getResponse();
		System.out.println("3. Result admin logout (exp true) : " + logout);

		if (login && adduser && !adduserFail && logout) {
			System.out.println("SUCCESS");
			return 1;
		}
		else {
			System.out.println("FAIL");
			return 0;
		}
	}


	private static int test6() throws RemoteException {
		System.out.println("********************** TEST 6 (value: 1)**********************");
		System.out.println("1) user2 login (falla), 2) admin login, 3) admin addsUser user2, 4) user2 login, 5) user2 remove user1 (falla), 6) admin remove user1, 7) admin remove user500 (falla)");

		stub2 = getStub();

		//1
		Login loginData = createLoginData(USER2, USER2PWD);
		boolean loginFail = stub2.login(loginData).get_return().getResponse();
		System.out.println("1. Result user2 login (exp false becuase user not registered) : " + loginFail);

		admin = getStub();

		//2
		Login loginDataAdmin = createLoginData(ADMINUSER, NEW_ADMINPWD);
		boolean loginAdmin = admin.login(loginDataAdmin).get_return().getResponse();
		System.out.println("2. Result admin login (exp true) : " + loginAdmin);

		//3
		AddUser addData = createAddData(USER2);
		AddUserResponse response = admin.addUser(addData).get_return();
		boolean addUser = response.getResponse();
		USER2PWD = response.getPwd();
		System.out.println("3. Result add user2 (exp true) : " + addUser);

		//4 //AQUI FALLA CON UNKNOWN
		Login loginData2 = createLoginData(USER2, USER2PWD);
		boolean login = stub2.login(loginData2).get_return().getResponse();
		System.out.println("4. Result user2 login (exp true) : " + login);

		//5
		RemoveUser removeUserData = createRemoveUserData(USER1);
		boolean removeFail = stub2.removeUser(removeUserData).get_return().getResponse();
		System.out.println("5. Result user2 deletes user1 (exp false becuase not allowed) : " + removeFail);

		//6
		boolean remove = admin.removeUser(removeUserData).get_return().getResponse();
		System.out.println("6. Result admin deletes user1 (exp true) : " + remove);

		//7
		RemoveUser removeUserData2 = createRemoveUserData("user500");
		boolean removeFailAdmin = stub2.removeUser(removeUserData2).get_return().getResponse();
		System.out.println("7. Result admin deletes user500 (exp false bacause user500 didn't exist) : " + removeFailAdmin);

		if (!loginFail && loginAdmin && addUser && login && !removeFail && remove && !removeFailAdmin) {
			System.out.println("SUCCESS");
			return 1;
		}
		else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	
	private static int test8() throws RemoteException {
		System.out.println("********************** TEST 8 (value: 1)**********************");
		System.out.println("1) user2 login st1 y st2, 2) st1 logout, 3) changpwd en st1 (fail), 4) changpwd en st2");

		stub1 = getStub();

		// 1
		boolean login1 = stub1.login(createLoginData(USER2, USER2PWD)).get_return().getResponse();
		System.out.println("Result user2 login con stub1 (exp true) : " + login1);

		stub2 = getStub();

		// 2
		boolean login2 = stub2.login(createLoginData(USER2, USER2PWD)).get_return().getResponse();
		System.out.println("Result user2 login con stub2 (exp true) : " + login2);

		stub1.logout(logoutVacio);

		// 3)
		boolean changePwdFail = stub1.changePassword(createChangePWDData(USER2PWD, USER2NEWPWD)).get_return()
				.getResponse();
		System.out.println("Result user2 change pwd con stub1 (exp false because user2 has logout on stub1-session) : "
				+ changePwdFail);

		// 4)
		boolean changePwd = stub2.changePassword(createChangePWDData(USER2PWD, USER2NEWPWD)).get_return().getResponse();
		System.out.println("Result user2 change pwd con stub2 (exp true) : " + changePwd);

		resetStub(stub1);

		// hace logout del stub2
		stub2.logout(logoutVacio);

		resetStub(stub2);

		System.out.println();

		if (login1 && login2 && !changePwdFail && changePwd) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	private static int test10() throws RemoteException {
		System.out.println("********************** TEST 10 (value: 1)**********************");
		System.out.println("1) user2 login 2 veces en st1, 2) logout, 3) admin login st1 (fail), 4) logout, 5) admin login st1 (ok)");
		
		stub1 = getStub();
		
		//1
		boolean login1 = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
		System.out.println("Result user2 login (exp true) : " + login1);
		
		//1
		boolean login2 = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
		System.out.println("Result user2 login (exp true) : " + login2);
		
		//2
		boolean logout1 = stub1.logout(logoutVacio).get_return().getResponse();
		System.out.println("Result user2 logout (exp true) : " + logout1);
		
		//3
		boolean login3F = stub1.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login en mismo stub (exp false) : " + login3F);
		
		//4
		boolean logout2 = stub1.logout(logoutVacio).get_return().getResponse();
		System.out.println("Result user2 logout (exp true) : " + logout2);
		
		//5
		boolean login4 = stub1.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login en mismo stub (exp true) : " + login4);
		
		stub1.logout(logoutVacio);
		
		resetStub(stub1);
		
		admin.logout(logoutVacio);
		
		resetStub(admin);
		System.out.println();
		
		if (login1 && login2 && logout1 && logout2 && login4 && !login3F) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// System.out.println("BORRADO USUARIOS...");
		// borradoUsuarios();

		try {
			init();
		}
		catch (AxisFault e) {
			System.out.println("catch AxisFault with message: " + e.getMessage());
		}
		
		double totalMark = 0.0D;

		try {
			totalMark = test1() + test2() + test6();
			System.out.println("Total superadas Validador: " + totalMark);
			
		} catch (RemoteException e) {
			System.out.println("catch RemoteException with message: " + e.getMessage());
			System.out.println("FAILED");
		}

	}

}
