
/**
 * WineSocialUPMCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package es.upm.etsiinf.sos;

    /**
     *  WineSocialUPMCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WineSocialUPMCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WineSocialUPMCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WineSocialUPMCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMyFollowers method
            * override this method for handling normal response from getMyFollowers operation
            */
           public void receiveResultgetMyFollowers(
                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyFollowers operation
           */
            public void receiveErrorgetMyFollowers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUser method
            * override this method for handling normal response from removeUser operation
            */
           public void receiveResultremoveUser(
                    es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUser operation
           */
            public void receiveErrorremoveUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addFollower method
            * override this method for handling normal response from addFollower operation
            */
           public void receiveResultaddFollower(
                    es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addFollower operation
           */
            public void receiveErroraddFollower(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyRates method
            * override this method for handling normal response from getMyRates operation
            */
           public void receiveResultgetMyRates(
                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyRates operation
           */
            public void receiveErrorgetMyRates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeWine method
            * override this method for handling normal response from removeWine operation
            */
           public void receiveResultremoveWine(
                    es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeWine operation
           */
            public void receiveErrorremoveWine(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for unfollow method
            * override this method for handling normal response from unfollow operation
            */
           public void receiveResultunfollow(
                    es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from unfollow operation
           */
            public void receiveErrorunfollow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUser method
            * override this method for handling normal response from addUser operation
            */
           public void receiveResultaddUser(
                    es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUser operation
           */
            public void receiveErroraddUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for rateWine method
            * override this method for handling normal response from rateWine operation
            */
           public void receiveResultrateWine(
                    es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from rateWine operation
           */
            public void receiveErrorrateWine(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addWine method
            * override this method for handling normal response from addWine operation
            */
           public void receiveResultaddWine(
                    es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addWine operation
           */
            public void receiveErroraddWine(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWines method
            * override this method for handling normal response from getWines operation
            */
           public void receiveResultgetWines(
                    es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWines operation
           */
            public void receiveErrorgetWines(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changePassword method
            * override this method for handling normal response from changePassword operation
            */
           public void receiveResultchangePassword(
                    es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changePassword operation
           */
            public void receiveErrorchangePassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyFollowerRates method
            * override this method for handling normal response from getMyFollowerRates operation
            */
           public void receiveResultgetMyFollowerRates(
                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyFollowerRates operation
           */
            public void receiveErrorgetMyFollowerRates(java.lang.Exception e) {
            }
                


    }
    