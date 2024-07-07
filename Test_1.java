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

	private static final String USER1 = "uD1";
	private static final String USER2 = "uD2";
	
	private static String USER2PWD = "";
	private static String NEW_USER2PWD = "Nuevaa";

	private static String USER8 = "joselq8";
	private static String USER8PWD;
	
	private static String USER9 = "pepilq9";
	private static String USER9PWD;

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
		System.out.println("1. Result user2 login con stub1 (exp true) : " + login1);

		stub2 = getStub();

		// 2
		boolean login2 = stub2.login(createLoginData(USER2, USER2PWD)).get_return().getResponse();
		System.out.println("2. Result user2 login con stub2 (exp true) : " + login2);

		stub1.logout(logoutVacio);

		// 3)
		ChangePassword changePasswordData = createChangePWDData(USER2PWD, NEW_USER2PWD);
		NEW_USER2PWD = changePasswordData.getArgs0().getNewpwd();
		boolean changePwdFail = stub1.changePassword(changePasswordData).get_return().getResponse();
		System.out.println("3. Result user2 change pwd con stub1 (exp false because user2 has logout on stub1-session) : " + changePwdFail);

		// 4)
		boolean changePwd = stub2.changePassword(createChangePWDData(USER2PWD, NEW_USER2PWD)).get_return().getResponse();
		System.out.println("4. Result user2 change pwd con stub2 (exp true) : " + changePwd);

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
		boolean login1 = stub1.login(createLoginData(USER2, NEW_USER2PWD)).get_return().getResponse();
		System.out.println("1. Result user2 login (exp true) : " + login1);
		
		//1
		boolean login2 = stub1.login(createLoginData(USER2, NEW_USER2PWD)).get_return().getResponse();
		System.out.println("1. Result user2 login (exp true) : " + login2);
		
		//2
		boolean logout1 = stub1.logout(logoutVacio).get_return().getResponse();
		System.out.println("2. Result user2 logout (exp true) : " + logout1);
		
		//3
		boolean login3F = stub1.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("2. Result admin login en mismo stub (exp false) : " + login3F);
		
		//4
		boolean logout2 = stub1.logout(logoutVacio).get_return().getResponse();
		System.out.println("4. Result user2 logout (exp true) : " + logout2);
		
		//5
		boolean login4 = stub1.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("5. Result admin login en mismo stub (exp true) : " + login4);
		
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
	
	
	private static int test24() throws RemoteException {
		System.out.println("********************** TEST 24 (value: 1)**********************");
		System.out.println("1) admin login, 2) crea user8 y 3) user9. 4) user8 log en st1 y 5) user9 en st2."
				+ "6) user8 sigue a user9, 7) user8 getfollowerrates; ok. 8) User9 puntua vino1 y vino3. "
				+ "9) user8 getfollowerRates de user9; ok y vino3-1");

		admin = getStub();
		
		//1
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);
		
		boolean addw1 = admin.addWine(createWineData("vino1", "tinto", 2015)).get_return().getResponse();
        System.out.println("Result admin createWine (exp true) : " + addw1);
        
        boolean addw2 = admin.addWine(createWineData("vino3", "tinto", 2015)).get_return().getResponse();
        System.out.println("Result admin createWine (exp true) : " + addw2);
		
		//2
		AddUserResponseE res = admin.addUser(createAddData(USER8));
		boolean addUser = res.get_return().getResponse();
		USER8PWD = res.get_return().getPwd();
		System.out.println("Result admin create user8 (exp true) : " + addUser);
		
		//3
		AddUserResponseE res2 = admin.addUser(createAddData(USER9));
		boolean addUser2 = res2.get_return().getResponse();
		USER9PWD = res2.get_return().getPwd();
		System.out.println("Result admin create user9 (exp true) : " + addUser2);
		
		//4
		stub1 = getStub();
		boolean login2 = stub1.login(createLoginData(USER8, USER8PWD)).get_return().getResponse();
		System.out.println("Result user8 login en st1 (exp true) : " + login2);
		
		//5
		stub2 = getStub();
		boolean login3 = stub2.login(createLoginData(USER9, USER9PWD)).get_return().getResponse();
		System.out.println("Result user9 login en st2 (exp true) : " + login3);
		
		//6
		boolean follower1 = stub1.addFollower(createFollowerData(USER9)).get_return().getResponse();
		System.out.println("Result user8 addfollower user9 (exp true) : " + follower1);
		
		//7
		GetMyFollowers getFollowers = new GetMyFollowers();
		FollowerList res3 = stub1.getMyFollowers(getFollowers).get_return();
		boolean followers1 = res3.getResult();
		String[] lista = res3.getFollowers();
		if (lista != null) {
			System.out.println("Result user8 getFollowers (exp true) en st1: " + followers1 + " - must have user9 ("
					+ lista[0] + "): " + (lista.length == 1));
			followers1 = lista.length == 1 && lista[0].equals(USER9);
		} else {
			System.out.println("ListFollowers is null (FAIL)");
		}

		//8
		boolean rate1 = stub2.rateWine(rateWineData("vino1", "tinto", 2015, 10)).get_return().getResponse();
		System.out.println("Result user9 puntua vino1 en st2 (exp true) : " + rate1);
		boolean rate2 = stub2.rateWine(rateWineData("vino3", "tinto", 2015, 6)).get_return().getResponse();
		System.out.println("Result user9 puntua vino3 en st2 (exp true) : " + rate2);
		
		//9
		GetMyFollowerRates followerRate = new GetMyFollowerRates();
		Username user = new Username();
		user.setUsername(USER9);
		followerRate.setArgs0(user);
		WinesRatedList res4 = stub1.getMyFollowerRates(followerRate).get_return();
		boolean rates = res4.getResult();
		String[] lista2 = res4.getNames();
		if (lista2 != null) {
			System.out.println("Result user8 getFollowers (exp true) en st1: " + rates + " - must have vino3 ("
					+ lista2[0] + "): " + (lista2.length == 2));
			rates = lista2.length == 2 && lista2[0].equals("vino3");
		} else {
			System.out.println("List is null (FAIL)");
		}

		admin.logout(logoutVacio);
		resetStub(admin);
		stub2.logout(logoutVacio);
		resetStub(stub2);
		stub1.logout(logoutVacio);
		resetStub(stub1);
		System.out.println();
		if (login1 && addUser && addUser2 && login2 && login3 && follower1 && followers1 && rate1 && rate2 && rates) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		try {
			init();
		}
		catch (AxisFault e) {
			System.out.println("catch AxisFault with message: " + e.getMessage());
		}
		
		double totalMark = 0.0D;

		try {
			totalMark = test24();
			System.out.println("Total superadas Validador: " + totalMark);
			
		} catch (RemoteException e) {
			System.out.println("catch RemoteException with message: " + e.getMessage());
			System.out.println("FAILED");
		}

	}

}
