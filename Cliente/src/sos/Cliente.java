package sos;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.WineSocialUPMStub;
import es.upm.etsiinf.sos.WineSocialUPMStub.*;

public class Cliente {
	
	private WineSocialUPMStub stub;
	
	public Cliente() throws AxisFault {
		stub = new WineSocialUPMStub();
		stub._getServiceClient().engageModule("adressing");
		stub._getServiceClient().getOptions().setManageSession(true);
	}
	
	
	public AddUserResponse addUser(String name) throws RemoteException {
		AddUserResponseE res;
		
		Username username = new Username();
		AddUser addUser = new AddUser();
		
		username.setUsername(name);
		addUser.setArgs0(username);
		
		res = stub.addUser(addUser);
		
		return res.get_return();
	}
	
	public boolean login(String username, String password)  throws RemoteException {
		Login login = new Login();
		User user = new User();
		
		user.setName(username);
		user.setPwd(password);
		login.setArgs0(user);
		
		return stub.login(login).get_return().getResponse();
	}
	
	public void logout() throws Exception {
		if (stub == null) throw new Exception("Error generando el stub");
		stub.logout(new Logout());
	}
	
	public boolean removeUser(String name) throws RemoteException {
		RemoveUserResponse res;
		
		RemoveUser removeUser = new RemoveUser();
		Username username = new Username();
		
		username.setUsername(name);
		removeUser.setArgs0(username);
		
		res = stub.removeUser(removeUser);
		
		return res.get_return().getResponse();
	}
	
	public boolean changePassword(String oldPassword, String newPassword) throws RemoteException {
		ChangePasswordResponse res;
		
		ChangePassword changePassword = new ChangePassword();
		PasswordPair passwordPair = new PasswordPair();
		
		passwordPair.setOldpwd(oldPassword);
		passwordPair.setNewpwd(newPassword);
		changePassword.setArgs0(passwordPair);
		
		res = stub.changePassword(changePassword);
		
		return res.get_return().getResponse();
	}
	
	public boolean addFollower(String name) throws RemoteException {
		AddFollowerResponse res;
		
		AddFollower addFollower = new AddFollower();
		Username username = new Username();
		
		username.setUsername(name);
		addFollower.setArgs0(username);
		
		res = stub.addFollower(addFollower);
		
		return res.get_return().getResponse();
	}
	
	public boolean unfollow(String name) throws RemoteException {
		UnfollowResponse res;
		
		Unfollow unfollow = new Unfollow();
		Username username  = new Username();
		
		username.setUsername(name);
		unfollow.setArgs0(username);
		
		res = stub.unfollow(unfollow);
		
		return res.get_return().getResponse();
	}
	
	public String[] getMyFollowers() throws RemoteException {
		String[] res = null;
		
		GetMyFollowers followers = new GetMyFollowers();
		GetMyFollowersResponse response = stub.getMyFollowers(followers);
		
		if (response.get_return().getResult())
			res = response.get_return().getFollowers();
		
		return res;
	}
	
	public boolean addWine(String name, String grape, int year) throws RemoteException {
		AddWineResponse res;
		
		AddWine addWine = new AddWine();
		Wine wine = new Wine();
		
		wine.setName(name);
		wine.setGrape(grape);
		wine.setYear(year);
		addWine.setArgs0(wine);
		
		res = stub.addWine(addWine);
		
		return res.get_return().getResponse();
	}
	
	public boolean removeWine(String name) throws RemoteException {
		RemoveWineResponse res;
		
		RemoveWine removeWine = new RemoveWine();
		Wine wine = new Wine();
		
		wine.setName(name);
		removeWine.setArgs0(wine);
		
		res = stub.removeWine(removeWine);
		
		return res.get_return().getResponse();
	}
	
	public String[] getWines() throws RemoteException {
		String[] res = null;
		
		GetWines wines = new GetWines();
		GetWinesResponse response = stub.getWines(wines);
		
		if (response.get_return().getResult())
			res = response.get_return().getNames(); //TODO: Check
		
		return res;
	}
	
	public boolean rateWine(String name, String grape, int year, int rate) throws RemoteException {
		RateWineResponse res;
		
		RateWine rateWine = new RateWine();
		WineRated wineRated = new WineRated();
		
		wineRated.setName(name);
		wineRated.setGrape(grape);
		wineRated.setYear(year);
		wineRated.setRate(rate);
		rateWine.setArgs0(wineRated);
		
		res = stub.rateWine(rateWine);
		
		return res.get_return().getResponse();
	}
	
	public String[] getMyRates() throws RemoteException {
		String[] res = null;
	
		GetMyRates getMyRates = new GetMyRates();
		GetMyRatesResponse response = stub.getMyRates(getMyRates);
		
		if (response.get_return().getResult())
			res = response.get_return().getNames(); //TODO: Check
		
		return res;
	}
	
	public String[] getMyFollowerRates() throws RemoteException {
		String[] res = null;
		
		GetMyFollowerRates getMyFollowerRates = new GetMyFollowerRates();
		GetMyFollowerRatesResponse response = stub.getMyFollowerRates(getMyFollowerRates);
		
		if (response.get_return().getResult())
			res = response.get_return().getNames(); //TODO: Check
				
		
		return res;
	}
	
}
