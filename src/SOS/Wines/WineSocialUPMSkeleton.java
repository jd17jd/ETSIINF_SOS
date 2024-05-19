/**
 * WineSocialUPMSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package SOS.Wines;
import SOS.autor.*;
import java.util.HashMap;
import java.util.Map;
import es.upm.etsiinf.sos.*;
import es.upm.etsiinf.sos.model.xsd.Response;
import es.upm.fi.sos.t3.backend.LoginResponse;
import es.upm.fi.sos.t3.backend.xsd.LoginResponseBackEnd;
import es.upm.etsiinf.sos.model.*;

/**
 * WineSocialUPMSkeleton java skeleton for the axisService
 */

public class WineSocialUPMSkeleton {
	 
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";
	
	private UPMAuthenticationAuthorizationWSSkeletonSkeleton authService;
	
	
	public WineSocialUPMSkeleton() {
		//añado al admin como usuario local
		localUsers.put(ADMIN_USERNAME, ADMIN_PASSWORD);
		
		//inicializo el upmauthor...
		this.authService = new UPMAuthenticationAuthorizationWSSkeletonSkeleton();
	}
	

	/**
	 * Auto generated method signature
	 *
	 * @param getMyFollowers
	 * @return getMyFollowersResponse
	 */
	public es.upm.etsiinf.sos.GetMyFollowersResponse getMyFollowers(es.upm.etsiinf.sos.GetMyFollowers getMyFollowers) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyFollowers");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param removeUser
	 * @return removeUserResponse
	 */

	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#removeUser");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addFollower
	 * @return addFollowerResponse
	 */

	public es.upm.etsiinf.sos.AddFollowerResponse addFollower(es.upm.etsiinf.sos.AddFollower addFollower) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#addFollower");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param logout
	 * @return logoutResponse
	 */

	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) {
		LogoutResponse response = new LogoutResponse();
		
        // Redirigir el logout de otros usuarios al servicio web
//        es.upm.fi.sos.t3.backend.Logout backendLogout = new es.upm.fi.sos.t3.backend.Logout(username);
//        es.upm.fi.sos.t3.backend.LogoutResponse backendResponse = authService.logout(backendLogout);
        
        response.setSuccess(backendResponse);
        return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param removeWine
	 * @return removeWineResponse
	 */

	public es.upm.etsiinf.sos.RemoveWineResponse removeWine(es.upm.etsiinf.sos.RemoveWine removeWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#removeWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyRates
	 * @return getMyRatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyRatesResponse getMyRates(es.upm.etsiinf.sos.GetMyRates getMyRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyRates");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param unfollow
	 * @return unfollowResponse
	 */

	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#unfollow");
	}
	
	
	
	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */
	
	// TODO : fill this with the necessary business logic
	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) {
		String username = addUser.getArgs0().getUsername();
		AddUserResponse response = new AddUserResponse();
        Response addUserResponse = new Response();
		
		//la creacion del admin se hace localmente
		if(username.equals(ADMIN_USERNAME)) {
			addUserResponse.setResponse(false);
//			response.set_return(addUserResponse);
		}
		
		// Redirigir la creación de otros usuarios al servicio web
        es.upm.fi.sos.t3.backend.AddUser backendAddUser = new es.upm.fi.sos.t3.backend.AddUser();
        es.upm.fi.sos.t3.backend.AddUserResponse backendResponse = authService.addUser(backendAddUser);
        
//        response.setSuccess(backendResponse.isSuccess());
//        response.setPassword(backendResponse.getPassword());
        return response;
	}
	
	
	
	
	

	/**
	 * Auto generated method signature
	 * 
	 * @param rateWine
	 * @return rateWineResponse
	 */

	public es.upm.etsiinf.sos.RateWineResponse rateWine(es.upm.etsiinf.sos.RateWine rateWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#rateWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addWine
	 * @return addWineResponse
	 */

	public es.upm.etsiinf.sos.AddWineResponse addWine(es.upm.etsiinf.sos.AddWine addWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addWine");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getWines
	 * @return getWinesResponse
	 */

	public es.upm.etsiinf.sos.GetWinesResponse getWines(es.upm.etsiinf.sos.GetWines getWines) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getWines");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */

	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#changePassword");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) {
		LoginResponse respuesta = new LoginResponse();
		LoginResponseBackEnd respBack = respuesta.get_return();
		String username = login.getArgs0().getName();
		String password = login.getArgs0().getPwd();
        
		//si es admin lo hago localmente (no redirijo al backend)
        if (username.equals(ADMIN_USERNAME)) {
        	//TRATO AL ADMIN AQUI DENTRO
        } else {
        	//si no es admin lo tengo que redirigir al UPMAuthenticationAuthorization (es decir el backend)
        	es.upm.fi.sos.t3.backend.Login backendLogin = new es.upm.fi.sos.t3.backend.Login();
            es.upm.fi.sos.t3.backend.LoginResponse backendResponseLogin = authService.login(backendLogin);
            
        }
        
        return respuesta;
	}
	
	

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyFollowerRates
	 * @return getMyFollowerRatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyFollowerRatesResponse getMyFollowerRates(
			es.upm.etsiinf.sos.GetMyFollowerRates getMyFollowerRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyFollowerRates");
	}

}
