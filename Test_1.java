package sos;

import java.rmi.RemoteException;

import java.util.Scanner;
import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;

public class Test_1 {

	private static String ADMINUSER = "admin";
	private static String ADMINPWD = "admin";
	private static String ADMINNEWPWD2 = "adminNEW";
	private static String USER1 = "test1u1";
	private static String USER1PWD = "user1";
	private static String USER1NEWPWD;
	private static String USER2 = "test1u2";
	private static String USER2PWD;
	private static String USER2NEWPWD = "nuevaa";
	private static String USER3 = "test1u3";
	private static String USER3PWD;
	private static String USER4 = "test1u4";
	private static String USER4PWD;
	private static String USER5 = "test1u5";
	private static String USER5PWD;
	private static String USER6 = "test1u6";
	private static String USER6PWD;
	private static String USER7 = "test1u7";
	private static String USER7PWD;
	private static String USER8 = "test1u8";
	private static String USER8PWD;
	private static String USER9 = "test1u9";
	private static String USER9PWD;
	private static String USER10 = "test1u10";
	private static String USER10PWD;
	private static String USER11 = "test1u11";
	private static String USER11PWD;
	private static String USER12 = "test1u12";
	private static String USER12PWD;
	private static String USER13 = "test1u13";
	private static String USER13PWD;
	private static String USER14 = "test1u14";
	private static String USER14PWD;
	private static String USER15 = "test1u15";
	private static String USER15PWD;
	private static String USERN = "test1uN";
	private static String USERNPWD;

	static RemoveUser userBorrar = new RemoveUser();

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

	//SUCCESS
	private static int test1() throws RemoteException {
		System.out.println("********************** TEST 1 (value: 1)**********************");
		System.out.println("1) admin login, 2) admin change password, 3) admin logout, 4) admin login con nueva pwd, 5) admin logout");
		
		admin = getStub();

		//1
		Login loginData = createLoginData(ADMINUSER, ADMINPWD);
		boolean login = admin.login(loginData).get_return().getResponse();
		System.out.println("1. Result admin login (exp true) : " + login);

		//2
		ChangePassword changePass = createChangePWDData(ADMINPWD, ADMINNEWPWD2);
		boolean changePWD = admin.changePassword(changePass).get_return().getResponse();
		System.out.println("2. Result admin changePwd (exp true) : " + changePWD);

		//3
		LogoutResponse response = admin.logout(logoutVacio);
		boolean logout = response.get_return().getResponse();
		System.out.println("3. Result admin logout (exp true) : " + logout);

		//4
		Login loginDataNew = createLoginData(ADMINUSER, ADMINNEWPWD2);
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
	
	//SUCCES
	private static int test2() throws RemoteException {
		System.out.println("********************** TEST 2 (value: 1)**********************");
		System.out.println("1) admin login, 2) admin addUser(testu1) x2 (segundo debe fallar), 3) admin logout");
		
		admin = getStub();
		//1
		Login loginData = createLoginData(ADMINUSER, ADMINNEWPWD2);
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

	//SUCCESS
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
		Login loginDataAdmin = createLoginData(ADMINUSER, ADMINNEWPWD2);
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
	
	//SUCCESS
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
		ChangePassword changePasswordData = createChangePWDData(USER2PWD, USER2NEWPWD);
		USER2NEWPWD = changePasswordData.getArgs0().getNewpwd();
		boolean changePwdFail = stub1.changePassword(changePasswordData).get_return().getResponse();
		System.out.println("3. Result user2 change pwd con stub1 (exp false because user2 has logout on stub1-session) : " + changePwdFail);

		// 4)
		boolean changePwd = stub2.changePassword(createChangePWDData(USER2PWD, USER2NEWPWD)).get_return().getResponse();
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
	
	//REVISAAAAAAAR
	private static int test10() throws RemoteException {
		System.out.println("********************** TEST 10 (value: 1)**********************");
		System.out.println("1) user2 login 2 veces en st1, 2) logout, 3) admin login st1 (fail), 4) logout, 5) admin login st1 (ok)");
		
		stub1 = getStub();
		
		//1
		boolean login1 = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
		System.out.println("1. Result user2 login (exp true) : " + login1);
		
		//1
		boolean login2 = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
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
	
	//SUCCESS
	private static int test11() throws RemoteException {
		System.out.println("********************** TEST 11 (value: 1)**********************");
		System.out.println("user2 login st1, admin login st2, admin borrar user2, st1 hacer login user2 (fail)");
		
		stub1 = getStub();
		
		boolean login1 = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
		System.out.println("Result user2 login (exp true) : " + login1);
		
		admin = getStub();
		
		boolean login2 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login2);
		
		Username username = new Username();
		username.setUsername(USER2);
		userBorrar.setArgs0(username);
		boolean delete = admin.removeUser(userBorrar).get_return().getResponse();
		System.out.println("Result admin deletes user2 (exp true): " + delete);
		
		boolean loginFail = stub1.login(createLoginData(USER2, USER2NEWPWD)).get_return().getResponse();
		System.out.println("Result user2 login (exp fail) cause was removed : " + loginFail);
		
		stub1.logout(logoutVacio);
		resetStub(stub1);
		admin.logout(logoutVacio);
		resetStub(admin);
		System.out.println();
		
		if (login1 && login2 && delete && !loginFail) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	   }
	
	//SUCCESS
	private static int test14() throws RemoteException {
		System.out.println("********************** TEST 14 (value: 1)**********************");
		System.out.println(
				"admin crea usuer11, user11 se logea en dos stubs, st1 y st2, en uno se borra y en otro no debe permitir hacer nada.");

		admin = getStub();
		
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);
		AddUserResponseE res = admin.addUser(createAddData(USER11));
		
		boolean addUser = res.get_return().getResponse();
		USER11PWD = res.get_return().getPwd();
		System.out.println("Result admin create user11 (exp true) : " + addUser);
		admin.logout(logoutVacio);
		
		stub1 = getStub();
		
		boolean login2 = stub1.login(createLoginData(USER11, USER11PWD)).get_return().getResponse();
		System.out.println("Result user11 login (exp true) : " + login2);
		
		stub2 = getStub();
		
		boolean login3 = stub2.login(createLoginData(USER11, USER11PWD)).get_return().getResponse();
		System.out.println("Result user11 login en otro stub (exp true) : " + login3);
		Username username = new Username();
		username.setUsername(USER11);
		userBorrar.setArgs0(username);
		
		boolean delete = stub1.removeUser(userBorrar).get_return().getResponse();
		System.out.println("Result user11 deletes user11 en stub11(exp true) : " + delete);
		
		boolean login3F = stub2.login(createLoginData(USER11, USER11PWD)).get_return().getResponse();
		System.out.println("Result user login en stub2 (exp false) : " + login3F);
		
		resetStub(admin);
		stub1.logout(logoutVacio);
		resetStub(stub1);
		resetStub(stub2);
		System.out.println();
		if (login1 && addUser && login2 && login3 && delete && !login3F) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	//SUCCESS
	private static int test15() throws RemoteException {
		System.out.println("********************** TEST 15 (value: 1)**********************");
		System.out.println(
				"admin crea user4, user4 addF user 5 en st2 (fail), user4 login en st2, user4 addFol user5 (fail), admin crear user5, use4 añade al user5 (ok)");

		admin = getStub();
		
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);
		
		AddUserResponseE res = admin.addUser(createAddData(USER4));
		boolean addUser = res.get_return().getResponse();
		USER4PWD = res.get_return().getPwd();
		System.out.println("Result admin create user4 (exp true) : " + addUser);
		
		stub1 = getStub();
		
		boolean follower1F = stub1.addFollower(createFollowerData(USER5)).get_return().getResponse();
		System.out.println("Result user4 addfollower user5 (exp false) : " + follower1F);
		
		boolean login2 = stub1.login(createLoginData(USER4, USER4PWD)).get_return().getResponse();
		System.out.println("Result user4 login (exp true) : " + login2);
		
		boolean follower2F = stub1.addFollower(createFollowerData(USER5)).get_return().getResponse();
		System.out.println("Result user4 addfollower user5 (exp false) : " + follower2F);
		
		AddUserResponseE res2 = admin.addUser(createAddData(USER5));
		boolean addUser2 = res2.get_return().getResponse();
		USER5PWD = res2.get_return().getPwd();
		System.out.println("Result admin create user5 (exp true) : " + addUser2);
		
		admin.logout(logoutVacio);
		
		boolean follower3 = stub1.addFollower(createFollowerData(USER5)).get_return().getResponse();
		System.out.println("Result user4 addfollower user5 (exp true) : " + follower3);
		
		resetStub(admin);
		stub1.logout(logoutVacio);
		resetStub(stub1);
		System.out.println();
		if (login1 && addUser && !follower1F && login2 && !follower2F && addUser2 && follower3) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	//SUCCESS
	private static int test16() throws RemoteException {
		System.out.println("********************** TEST 16 (value: 1)**********************");
		System.out.println("user4 log en st1 y getFollower, ok y user5. user5 logea en st2 y getfollowers, ok y nada.");

		stub1 = getStub();

		boolean login1 = stub1.login(createLoginData(USER4, USER4PWD)).get_return().getResponse();
		System.out.println("Result user4 login (exp true) : " + login1);
		
		GetMyFollowers getFollowers = new GetMyFollowers();
		FollowerList res1 = stub1.getMyFollowers(getFollowers).get_return();
		
		boolean followers1 = res1.getResult();
		String[] lista = res1.getFollowers();
		if (lista != null) {
			System.out.println("Result user4 getFollowers (exp true) en st1: " + followers1 + " - must have user5 ("
					+ lista[0] + "): " + (lista.length == 1));
			followers1 = true;
		} else {
			System.out.println("ListFollowers is null (FAIL)");
		}

		stub2 = getStub();
		
		boolean login2 = stub2.login(createLoginData(USER5, USER5PWD)).get_return().getResponse();
		System.out.println("Result user5 login (exp true) : " + login2);
		
		getFollowers = new GetMyFollowers();
		FollowerList res2 = stub2.getMyFollowers(getFollowers).get_return();
		
		boolean followers2 = res2.getResult();
		String[] lista2 = res2.getFollowers();
		System.out.println("Result user5 getFollowers (exp true) : " + followers2 + "-- " + lista2);
		
		stub1.logout(logoutVacio);
		resetStub(stub1);
		stub2.logout(logoutVacio);
		resetStub(stub2);
		System.out.println();
		if (login1 && followers1 && login2 && followers2 && lista2 == null) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	//SUCCESS
	private static int test18() throws RemoteException {
		System.out.println("********************** TEST 18 (value: 1)**********************");
		System.out.println(
				"admin login, admin addW vino 1; ok, getWines; ok y vino1. addW vino2, getWines; ok y vino2-vino1\tvinos en un stub");

		admin = getStub();
		
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);
		
		boolean addw1 = admin.addWine(createWineData("vino1", "tinto", 2015)).get_return().getResponse();
		System.out.println("Result admin createWine (exp true) : " + addw1);
		
		GetWines getWines = new GetWines();
		WineList res1 = admin.getWines(getWines).get_return();
		
		boolean wines1 = res1.getResult();
		String[] lista = res1.getNames();
		if (lista != null) {
			System.out.println("Result admin getWines (exp true) en st1: " + wines1 + " - must have vino1 (" + lista[0]
					+ "): " + (lista.length == 1));
			wines1 = lista[0].equals("vino1") && lista.length == 1;
		} else {
			System.out.println("ListWines is null (FAIL)");
		}

		boolean addw2 = admin.addWine(createWineData("vino2", "blanco", 2012)).get_return().getResponse();
		System.out.println("Result admin createWine (exp true) : " + addw2);
		
		getWines = new GetWines();
		WineList res2 = admin.getWines(getWines).get_return();
		
		boolean wines2 = res2.getResult();
		String[] lista2 = res2.getNames();
		if (lista2 != null) {
			System.out.println("Result admin getWines (exp true) en st1: " + wines2 + " - must have vino2 (" + lista2[0]
					+ "): " + (lista2.length == 2));
			wines2 = lista2[0].equals("vino2") && lista2.length == 2;
		} else {
			System.out.println("ListWines is null (FAIL)");
		}

		admin.logout(logoutVacio);
		resetStub(admin);
		System.out.println();
		if (login1 && addw1 && wines1 && addw2 && wines2) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}

	//SUCCESS
	private static int test19() throws RemoteException {
		System.out.println("********************** TEST 19 (value: 1)**********************");
		System.out.println(
				"admin login, admin addW vino3 y vino4 en stb1. Login de otro user en st2 y getW en orden correcto");

		admin = getStub();
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);

		boolean addw1 = admin.addWine(createWineData("vino3", "tinto", 2015)).get_return().getResponse();
		System.out.println("Result admin createWine (exp true) : " + addw1);
		boolean addw2 = admin.addWine(createWineData("vino4", "blanco", 2012)).get_return().getResponse();
		System.out.println("Result admin createWine (exp true) : " + addw2);
		stub1 = getStub();
		boolean login2 = stub1.login(createLoginData(USER4, USER4PWD)).get_return().getResponse();
		System.out.println("Result user4 login (exp true) : " + login2);
		GetWines getWines = new GetWines();
		WineList res2 = stub1.getWines(getWines).get_return();
		boolean wines2 = res2.getResult();
		String[] lista2 = res2.getNames();
		if (lista2 != null) {
			System.out.println("Result user4 getWines (exp true) en st1: " + wines2 + " - must have vino4 (" + lista2[0]
					+ "): " + (lista2.length == 4));
			wines2 = lista2[0].equals("vino4") && lista2.length == 4;
		} else {
			System.out.println("ListWines is null (FAIL)");
		}

		admin.logout(logoutVacio);
		resetStub(admin);
		stub1.logout(logoutVacio);
		resetStub(stub1);
		System.out.println();
		if (login1 && addw1 && addw2 && login2 && wines2) {
			System.out.println("SUCCESS");
			return 1;
		} else {
			System.out.println("FAIL");
			return 0;
		}
	}
	
	//SUCCESS
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
	
	//SUCCESS
	private static int test25() throws RemoteException {
		System.out.println("********************** TEST 25 (value: 1)**********************");
		System.out.println(
				"admin login y borra user9, user8 log en st2, getfollowers, ok y vacio, getfollowersRates, false");

		admin = getStub();
		
		boolean login1 = admin.login(createLoginData(ADMINUSER, ADMINPWD)).get_return().getResponse();
		System.out.println("Result admin login (exp true) : " + login1);
		
		Username username = new Username();
		username.setUsername(USER9);
		userBorrar.setArgs0(username);
		
		boolean delete = admin.removeUser(userBorrar).get_return().getResponse();
		System.out.println("Result admin deletes user9 (exp true) : " + delete);
		
		stub1 = getStub();
		
		boolean login2 = stub1.login(createLoginData(USER8, USER8PWD)).get_return().getResponse();
		System.out.println("Result user8 login en st1 (exp true) : " + login2);
		
		GetMyFollowers getFollowers = new GetMyFollowers();
		FollowerList res1 = stub1.getMyFollowers(getFollowers).get_return();
		boolean followers1 = res1.getResult();
		String[] lista = res1.getFollowers();
		System.out.println("Result user8 getFollowers (exp true) en st1: " + followers1
				+ " - lista must be empty or null): " + lista);
		
		GetMyFollowerRates followerRate = new GetMyFollowerRates();
		Username user = new Username();
		user.setUsername(USER9);
		followerRate.setArgs0(user);
		WinesRatedList res4 = stub1.getMyFollowerRates(followerRate).get_return();
		boolean ratesF = res4.getResult();
		System.out.println("Result user8 getFollowers->user9 (exp false) en st1: " + ratesF);
		
		admin.logout(logoutVacio);
		
		resetStub(admin);
		
		stub1.logout(logoutVacio);
		
		resetStub(stub1);
		System.out.println();
		if (login1 && delete && login2 && followers1 && !ratesF) {
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
			totalMark = test1() + test2() + test6() + test8() + test10() + test11() + test14() + test15() + test16() + test18() + test19() + test24() + test25();
			System.out.println("Total superadas Validador: " + totalMark);
			
		} catch (RemoteException e) {
			System.out.println("catch RemoteException with message: " + e.getMessage());
			System.out.println("FAILED");
		}

	}

}
