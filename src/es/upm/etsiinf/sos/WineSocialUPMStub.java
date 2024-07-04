
/**
 * WineSocialUPMStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos;

        

/*
*  WineSocialUPMStub java implementation
*/


public class WineSocialUPMStub extends org.apache.axis2.client.Stub
{
protected org.apache.axis2.description.AxisOperation[] _operations;

//hashmaps to keep the fault mapping
private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
private java.util.HashMap faultMessageMap = new java.util.HashMap();

private static int counter = 0;

private static synchronized java.lang.String getUniqueSuffix(){
    // reset the counter if it is greater than 99999
    if (counter > 99999){
        counter = 0;
    }
    counter = counter + 1; 
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
}


private void populateAxisService() throws org.apache.axis2.AxisFault {

//creating the Service with a unique name
_service = new org.apache.axis2.description.AxisService("WineSocialUPM" + getUniqueSuffix());
addAnonymousOperations();

//creating the operations
org.apache.axis2.description.AxisOperation __operation;

_operations = new org.apache.axis2.description.AxisOperation[14];

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getMyFollowers"));
_service.addOperation(__operation);




    _operations[0]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "removeUser"));
_service.addOperation(__operation);




    _operations[1]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "addFollower"));
_service.addOperation(__operation);




    _operations[2]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "logout"));
_service.addOperation(__operation);




    _operations[3]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "removeWine"));
_service.addOperation(__operation);




    _operations[4]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getMyRates"));
_service.addOperation(__operation);




    _operations[5]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "unfollow"));
_service.addOperation(__operation);




    _operations[6]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "addUser"));
_service.addOperation(__operation);




    _operations[7]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "rateWine"));
_service.addOperation(__operation);




    _operations[8]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "addWine"));
_service.addOperation(__operation);




    _operations[9]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getWines"));
_service.addOperation(__operation);




    _operations[10]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "changePassword"));
_service.addOperation(__operation);




    _operations[11]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "login"));
_service.addOperation(__operation);




    _operations[12]=__operation;
    

           __operation = new org.apache.axis2.description.OutInAxisOperation();
        

    __operation.setName(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getMyFollowerRates"));
_service.addOperation(__operation);




    _operations[13]=__operation;
    

}

//populates the faults
private void populateFaults(){
 


}

/**
*Constructor that takes in a configContext
*/

public WineSocialUPMStub(org.apache.axis2.context.ConfigurationContext configurationContext,
java.lang.String targetEndpoint)
throws org.apache.axis2.AxisFault {
 this(configurationContext,targetEndpoint,false);
}


/**
* Constructor that takes in a configContext  and useseperate listner
*/
public WineSocialUPMStub(org.apache.axis2.context.ConfigurationContext configurationContext,
java.lang.String targetEndpoint, boolean useSeparateListener)
throws org.apache.axis2.AxisFault {
 //To populate AxisService
 populateAxisService();
 populateFaults();

_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);


_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
        targetEndpoint));
_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    //Set the soap version
    _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


}

/**
* Default Constructor
*/
public WineSocialUPMStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

            this(configurationContext,"http://localhost:8080/axis2/services/WineSocialUPM" );
        
}

/**
* Default Constructor
*/
public WineSocialUPMStub() throws org.apache.axis2.AxisFault {

            this("http://localhost:8080/axis2/services/WineSocialUPM" );
        
}

/**
* Constructor taking the target endpoint
*/
public WineSocialUPMStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
this(null,targetEndpoint);
}




            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#getMyFollowers
             * @param getMyFollowers0
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse getMyFollowers(

                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers getMyFollowers0)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("urn:getMyFollowers");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyFollowers0,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowers")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowers"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startgetMyFollowers
            * @param getMyFollowers0
        
        */
        public  void startgetMyFollowers(

         es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers getMyFollowers0,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
     _operationClient.getOptions().setAction("urn:getMyFollowers");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyFollowers0,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowers")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowers"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultgetMyFollowers(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetMyFollowers(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowers"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorgetMyFollowers(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowers(f);
                                    }
                                } else {
                                    callback.receiveErrorgetMyFollowers(f);
                                }
                            } else {
                                callback.receiveErrorgetMyFollowers(f);
                            }
                        } else {
                            callback.receiveErrorgetMyFollowers(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgetMyFollowers(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[0].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#removeUser
             * @param removeUser2
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse removeUser(

                    es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser removeUser2)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("urn:removeUser");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            removeUser2,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeUser")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeUser"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startremoveUser
            * @param removeUser2
        
        */
        public  void startremoveUser(

         es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser removeUser2,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
     _operationClient.getOptions().setAction("urn:removeUser");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            removeUser2,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeUser")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeUser"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultremoveUser(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorremoveUser(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorremoveUser(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveUser(f);
                                    }
                                } else {
                                    callback.receiveErrorremoveUser(f);
                                }
                            } else {
                                callback.receiveErrorremoveUser(f);
                            }
                        } else {
                            callback.receiveErrorremoveUser(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorremoveUser(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[1].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#addFollower
             * @param addFollower4
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse addFollower(

                    es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower addFollower4)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("urn:addFollower");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addFollower4,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addFollower")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addFollower"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startaddFollower
            * @param addFollower4
        
        */
        public  void startaddFollower(

         es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower addFollower4,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
     _operationClient.getOptions().setAction("urn:addFollower");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addFollower4,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addFollower")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addFollower"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultaddFollower(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroraddFollower(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addFollower"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErroraddFollower(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddFollower(f);
                                    }
                                } else {
                                    callback.receiveErroraddFollower(f);
                                }
                            } else {
                                callback.receiveErroraddFollower(f);
                            }
                        } else {
                            callback.receiveErroraddFollower(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErroraddFollower(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[2].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#logout
             * @param logout6
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse logout(

                    es.upm.etsiinf.sos.WineSocialUPMStub.Logout logout6)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("urn:logout");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            logout6,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "logout")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "logout"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startlogout
            * @param logout6
        
        */
        public  void startlogout(

         es.upm.etsiinf.sos.WineSocialUPMStub.Logout logout6,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
     _operationClient.getOptions().setAction("urn:logout");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            logout6,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "logout")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "logout"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultlogout(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorlogout(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logout"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorlogout(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogout(f);
                                    }
                                } else {
                                    callback.receiveErrorlogout(f);
                                }
                            } else {
                                callback.receiveErrorlogout(f);
                            }
                        } else {
                            callback.receiveErrorlogout(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorlogout(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[3].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#removeWine
             * @param removeWine8
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse removeWine(

                    es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine removeWine8)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("urn:removeWine");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            removeWine8,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeWine"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startremoveWine
            * @param removeWine8
        
        */
        public  void startremoveWine(

         es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine removeWine8,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
     _operationClient.getOptions().setAction("urn:removeWine");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            removeWine8,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "removeWine"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultremoveWine(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorremoveWine(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeWine"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorremoveWine(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorremoveWine(f);
                                    }
                                } else {
                                    callback.receiveErrorremoveWine(f);
                                }
                            } else {
                                callback.receiveErrorremoveWine(f);
                            }
                        } else {
                            callback.receiveErrorremoveWine(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorremoveWine(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[4].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#getMyRates
             * @param getMyRates10
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse getMyRates(

                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates getMyRates10)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("urn:getMyRates");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyRates10,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyRates")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyRates"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startgetMyRates
            * @param getMyRates10
        
        */
        public  void startgetMyRates(

         es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates getMyRates10,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
     _operationClient.getOptions().setAction("urn:getMyRates");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyRates10,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyRates")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyRates"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultgetMyRates(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetMyRates(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyRates"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorgetMyRates(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyRates(f);
                                    }
                                } else {
                                    callback.receiveErrorgetMyRates(f);
                                }
                            } else {
                                callback.receiveErrorgetMyRates(f);
                            }
                        } else {
                            callback.receiveErrorgetMyRates(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgetMyRates(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[5].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#unfollow
             * @param unfollow12
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse unfollow(

                    es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow unfollow12)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("urn:unfollow");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            unfollow12,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "unfollow")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "unfollow"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startunfollow
            * @param unfollow12
        
        */
        public  void startunfollow(

         es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow unfollow12,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
     _operationClient.getOptions().setAction("urn:unfollow");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            unfollow12,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "unfollow")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "unfollow"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultunfollow(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorunfollow(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unfollow"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorunfollow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorunfollow(f);
                                    }
                                } else {
                                    callback.receiveErrorunfollow(f);
                                }
                            } else {
                                callback.receiveErrorunfollow(f);
                            }
                        } else {
                            callback.receiveErrorunfollow(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorunfollow(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[6].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#addUser
             * @param addUser14
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE addUser(

                    es.upm.etsiinf.sos.WineSocialUPMStub.AddUser addUser14)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("urn:addUser");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addUser14,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addUser")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addUser"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startaddUser
            * @param addUser14
        
        */
        public  void startaddUser(

         es.upm.etsiinf.sos.WineSocialUPMStub.AddUser addUser14,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
     _operationClient.getOptions().setAction("urn:addUser");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addUser14,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addUser")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addUser"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultaddUser(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroraddUser(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErroraddUser(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddUser(f);
                                    }
                                } else {
                                    callback.receiveErroraddUser(f);
                                }
                            } else {
                                callback.receiveErroraddUser(f);
                            }
                        } else {
                            callback.receiveErroraddUser(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErroraddUser(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[7].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#rateWine
             * @param rateWine16
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse rateWine(

                    es.upm.etsiinf.sos.WineSocialUPMStub.RateWine rateWine16)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("urn:rateWine");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            rateWine16,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "rateWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "rateWine"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startrateWine
            * @param rateWine16
        
        */
        public  void startrateWine(

         es.upm.etsiinf.sos.WineSocialUPMStub.RateWine rateWine16,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
     _operationClient.getOptions().setAction("urn:rateWine");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            rateWine16,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "rateWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "rateWine"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultrateWine(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorrateWine(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"rateWine"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorrateWine(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorrateWine(f);
                                    }
                                } else {
                                    callback.receiveErrorrateWine(f);
                                }
                            } else {
                                callback.receiveErrorrateWine(f);
                            }
                        } else {
                            callback.receiveErrorrateWine(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorrateWine(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[8].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#addWine
             * @param addWine18
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse addWine(

                    es.upm.etsiinf.sos.WineSocialUPMStub.AddWine addWine18)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("urn:addWine");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addWine18,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addWine"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startaddWine
            * @param addWine18
        
        */
        public  void startaddWine(

         es.upm.etsiinf.sos.WineSocialUPMStub.AddWine addWine18,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
     _operationClient.getOptions().setAction("urn:addWine");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            addWine18,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addWine")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "addWine"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultaddWine(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroraddWine(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addWine"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErroraddWine(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErroraddWine(f);
                                    }
                                } else {
                                    callback.receiveErroraddWine(f);
                                }
                            } else {
                                callback.receiveErroraddWine(f);
                            }
                        } else {
                            callback.receiveErroraddWine(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErroraddWine(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[9].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#getWines
             * @param getWines20
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse getWines(

                    es.upm.etsiinf.sos.WineSocialUPMStub.GetWines getWines20)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("urn:getWines");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getWines20,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getWines")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getWines"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startgetWines
            * @param getWines20
        
        */
        public  void startgetWines(

         es.upm.etsiinf.sos.WineSocialUPMStub.GetWines getWines20,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
     _operationClient.getOptions().setAction("urn:getWines");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getWines20,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getWines")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getWines"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultgetWines(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetWines(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getWines"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorgetWines(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetWines(f);
                                    }
                                } else {
                                    callback.receiveErrorgetWines(f);
                                }
                            } else {
                                callback.receiveErrorgetWines(f);
                            }
                        } else {
                            callback.receiveErrorgetWines(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgetWines(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[10].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#changePassword
             * @param changePassword22
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse changePassword(

                    es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword changePassword22)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("urn:changePassword");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            changePassword22,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "changePassword")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "changePassword"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startchangePassword
            * @param changePassword22
        
        */
        public  void startchangePassword(

         es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword changePassword22,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
     _operationClient.getOptions().setAction("urn:changePassword");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            changePassword22,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "changePassword")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "changePassword"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultchangePassword(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorchangePassword(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorchangePassword(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorchangePassword(f);
                                    }
                                } else {
                                    callback.receiveErrorchangePassword(f);
                                }
                            } else {
                                callback.receiveErrorchangePassword(f);
                            }
                        } else {
                            callback.receiveErrorchangePassword(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorchangePassword(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[11].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#login
             * @param login24
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse login(

                    es.upm.etsiinf.sos.WineSocialUPMStub.Login login24)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("urn:login");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            login24,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "login")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "login"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startlogin
            * @param login24
        
        */
        public  void startlogin(

         es.upm.etsiinf.sos.WineSocialUPMStub.Login login24,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
     _operationClient.getOptions().setAction("urn:login");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            login24,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "login")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "login"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultlogin(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorlogin(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorlogin(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorlogin(f);
                                    }
                                } else {
                                    callback.receiveErrorlogin(f);
                                }
                            } else {
                                callback.receiveErrorlogin(f);
                            }
                        } else {
                            callback.receiveErrorlogin(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorlogin(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[12].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        
            /**
             * Auto generated method signature
             * 
             * @see es.upm.etsiinf.sos.WineSocialUPM#getMyFollowerRates
             * @param getMyFollowerRates26
            
             */

            

                    public  es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse getMyFollowerRates(

                    es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates getMyFollowerRates26)
                

            throws java.rmi.RemoteException
            
            {
      org.apache.axis2.context.MessageContext _messageContext = null;
      try{
       org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("urn:getMyFollowerRates");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      

      // create a message context
      _messageContext = new org.apache.axis2.context.MessageContext();

      

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyFollowerRates26,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowerRates")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowerRates"));
                                        
//adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// set the message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message contxt to the operation client
_operationClient.addMessageContext(_messageContext);

//execute the operation client
_operationClient.execute(true);

 
       org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                   org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
        org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
        
        
                        java.lang.Object object = fromOM(
                                     _returnEnv.getBody().getFirstElement() ,
                                     es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse.class,
                                      getEnvelopeNamespaces(_returnEnv));

                       
                                return (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse)object;
                           
 }catch(org.apache.axis2.AxisFault f){

    org.apache.axiom.om.OMElement faultElt = f.getDetail();
    if (faultElt!=null){
        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"))){
            //make the fault by reflection
            try{
                java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"));
                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                //message class
                java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"));
                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                           new java.lang.Class[]{messageClass});
                m.invoke(ex,new java.lang.Object[]{messageObject});
                

                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            }catch(java.lang.ClassCastException e){
               // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }catch (java.lang.NoSuchMethodException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            } catch (java.lang.reflect.InvocationTargetException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }  catch (java.lang.IllegalAccessException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }   catch (java.lang.InstantiationException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        }else{
            throw f;
        }
    }else{
        throw f;
    }
    } finally {
        if (_messageContext.getTransportOut() != null) {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }
}
    
        /**
        * Auto generated method signature for Asynchronous Invocations
        * 
        * @see es.upm.etsiinf.sos.WineSocialUPM#startgetMyFollowerRates
            * @param getMyFollowerRates26
        
        */
        public  void startgetMyFollowerRates(

         es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates getMyFollowerRates26,

          final es.upm.etsiinf.sos.WineSocialUPMCallbackHandler callback)

        throws java.rmi.RemoteException{

      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
     _operationClient.getOptions().setAction("urn:getMyFollowerRates");
     _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      
      
          addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
      


      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env=null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

            
                            //Style is Doc.
                            
                                            
                                            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                            getMyFollowerRates26,
                                            optimizeContent(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowerRates")), new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                            "getMyFollowerRates"));
                                        
// adding SOAP soap_headers
 _serviceClient.addHeadersToEnvelope(env);
// create message context with that soap envelope
_messageContext.setEnvelope(env);

// add the message context to the operation client
_operationClient.addMessageContext(_messageContext);


            
                _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                        
                                java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                 es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse.class,
                                                                 getEnvelopeNamespaces(resultEnv));
                                callback.receiveResultgetMyFollowerRates(
                                (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse)object);
                                
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetMyFollowerRates(e);
                    }
                    }

                    public void onError(java.lang.Exception error) {
                        if (error instanceof org.apache.axis2.AxisFault) {
                            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                            org.apache.axiom.om.OMElement faultElt = f.getDetail();
                            if (faultElt!=null){
                                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"))){
                                    //make the fault by reflection
                                    try{
                                            java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"));
                                            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                                            //message class
                                            java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMyFollowerRates"));
                                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                            java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                                            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                                    new java.lang.Class[]{messageClass});
                                            m.invoke(ex,new java.lang.Object[]{messageObject});
                                            
            
                                            callback.receiveErrorgetMyFollowerRates(new java.rmi.RemoteException(ex.getMessage(), ex));
                                    } catch(java.lang.ClassCastException e){
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (java.lang.ClassNotFoundException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (java.lang.NoSuchMethodException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (java.lang.reflect.InvocationTargetException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (java.lang.IllegalAccessException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (java.lang.InstantiationException e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    } catch (org.apache.axis2.AxisFault e) {
                                        // we cannot intantiate the class - throw the original Axis fault
                                        callback.receiveErrorgetMyFollowerRates(f);
                                    }
                                } else {
                                    callback.receiveErrorgetMyFollowerRates(f);
                                }
                            } else {
                                callback.receiveErrorgetMyFollowerRates(f);
                            }
                        } else {
                            callback.receiveErrorgetMyFollowerRates(error);
                        }
                    }

                    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                        onError(fault);
                    }

                    public void onComplete() {
                        try {
                            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                        } catch (org.apache.axis2.AxisFault axisFault) {
                            callback.receiveErrorgetMyFollowerRates(axisFault);
                        }
                    }
        });
                

  org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
   _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
  _operations[13].setMessageReceiver(
            _callbackReceiver);
}

   //execute the operation client
   _operationClient.execute(false);

            }
        


/**
*  A utility method that copies the namepaces from the SOAPEnvelope
*/
private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
java.util.Map returnMap = new java.util.HashMap();
java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
while (namespaceIterator.hasNext()) {
    org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
    returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
}
return returnMap;
}



private javax.xml.namespace.QName[] opNameArray = null;
private boolean optimizeContent(javax.xml.namespace.QName opName) {


if (opNameArray == null) {
    return false;
}
for (int i = 0; i < opNameArray.length; i++) {
    if (opName.equals(opNameArray[i])) {
        return true;   
    }
}
return false;
}
//http://localhost:8080/axis2/services/WineSocialUPM
public static class RemoveUserResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "removeUserResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":removeUserResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "removeUserResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RemoveUserResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RemoveUserResponse object =
        new RemoveUserResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"removeUserResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RemoveUserResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Logout
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "logout",
        "ns2");

    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":logout",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "logout",
                   xmlWriter);
           }

       
           }
       
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

        

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Logout parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Logout object =
        new Logout();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"logout".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Logout)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class User
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = User
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Name
                */

                
                            protected java.lang.String localName ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNameTracker = false ;

                   public boolean isNameSpecified(){
                       return localNameTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getName(){
                       return localName;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Name
                       */
                       public void setName(java.lang.String param){
                    localNameTracker = true;
                           
                                    this.localName=param;
                            

                       }
                    

                /**
                * field for Pwd
                */

                
                            protected java.lang.String localPwd ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localPwdTracker = false ;

                   public boolean isPwdSpecified(){
                       return localPwdTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getPwd(){
                       return localPwd;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Pwd
                       */
                       public void setPwd(java.lang.String param){
                    localPwdTracker = true;
                           
                                    this.localPwd=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":User",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "User",
                   xmlWriter);
           }

       
           }
        if (localNameTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "name", xmlWriter);
                     

                                  if (localName==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localName);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localPwdTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "pwd", xmlWriter);
                     

                                  if (localPwd==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localPwd);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localNameTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "name"));
                         
                                 elementList.add(localName==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                            } if (localPwdTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "pwd"));
                         
                                 elementList.add(localPwd==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPwd));
                            }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static User parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    User object =
        new User();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"User".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (User)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","name").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setName(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","pwd").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setPwd(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class RateWineResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "rateWineResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":rateWineResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "rateWineResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RateWineResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RateWineResponse object =
        new RateWineResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"rateWineResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RateWineResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Wine
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = Wine
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Grape
                */

                
                            protected java.lang.String localGrape ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localGrapeTracker = false ;

                   public boolean isGrapeSpecified(){
                       return localGrapeTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getGrape(){
                       return localGrape;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Grape
                       */
                       public void setGrape(java.lang.String param){
                    localGrapeTracker = true;
                           
                                    this.localGrape=param;
                            

                       }
                    

                /**
                * field for Name
                */

                
                            protected java.lang.String localName ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNameTracker = false ;

                   public boolean isNameSpecified(){
                       return localNameTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getName(){
                       return localName;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Name
                       */
                       public void setName(java.lang.String param){
                    localNameTracker = true;
                           
                                    this.localName=param;
                            

                       }
                    

                /**
                * field for Year
                */

                
                            protected int localYear ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localYearTracker = false ;

                   public boolean isYearSpecified(){
                       return localYearTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int
                   */
                   public  int getYear(){
                       return localYear;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Year
                       */
                       public void setYear(int param){
                    
                               // setting primitive attribute tracker to true
                               localYearTracker =
                               param != java.lang.Integer.MIN_VALUE;
                           
                                    this.localYear=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":Wine",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "Wine",
                   xmlWriter);
           }

       
           }
        if (localGrapeTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "grape", xmlWriter);
                     

                                  if (localGrape==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localGrape);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localNameTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "name", xmlWriter);
                     

                                  if (localName==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localName);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localYearTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "year", xmlWriter);
                     
                                       if (localYear==java.lang.Integer.MIN_VALUE) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("year cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYear));
                                       }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localGrapeTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "grape"));
                         
                                 elementList.add(localGrape==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrape));
                            } if (localNameTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "name"));
                         
                                 elementList.add(localName==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                            } if (localYearTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "year"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYear));
                    }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Wine parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Wine object =
        new Wine();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"Wine".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Wine)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grape").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setGrape(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","name").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setName(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","year").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"year" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setYear(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                                       object.setYear(java.lang.Integer.MIN_VALUE);
                                   
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class WinesRatedList
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = WinesRatedList
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Grapes
                * This was an Array!
                */

                
                            protected java.lang.String[] localGrapes ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localGrapesTracker = false ;

                   public boolean isGrapesSpecified(){
                       return localGrapesTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String[]
                   */
                   public  java.lang.String[] getGrapes(){
                       return localGrapes;
                   }

                   
                


                       
                      /**
                       * validate the array for Grapes
                       */
                      protected void validateGrapes(java.lang.String[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Grapes
                      */
                      public void setGrapes(java.lang.String[] param){
                      
                           validateGrapes(param);

                       localGrapesTracker = true;
                              
                              this.localGrapes=param;
                      }

                       
                     
                     /**
                     * Auto generated add method for the array for convenience
                     * @param param java.lang.String
                     */
                     public void addGrapes(java.lang.String param){
                           if (localGrapes == null){
                           localGrapes = new java.lang.String[]{};
                           }

                    
                         //update the setting tracker
                        localGrapesTracker = true;
                    

                       java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localGrapes);
                       list.add(param);
                       this.localGrapes =
                     (java.lang.String[])list.toArray(
                    new java.lang.String[list.size()]);

                     }
                     

                /**
                * field for Names
                * This was an Array!
                */

                
                            protected java.lang.String[] localNames ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNamesTracker = false ;

                   public boolean isNamesSpecified(){
                       return localNamesTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String[]
                   */
                   public  java.lang.String[] getNames(){
                       return localNames;
                   }

                   
                


                       
                      /**
                       * validate the array for Names
                       */
                      protected void validateNames(java.lang.String[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Names
                      */
                      public void setNames(java.lang.String[] param){
                      
                           validateNames(param);

                       localNamesTracker = true;
                              
                              this.localNames=param;
                      }

                       
                     
                     /**
                     * Auto generated add method for the array for convenience
                     * @param param java.lang.String
                     */
                     public void addNames(java.lang.String param){
                           if (localNames == null){
                           localNames = new java.lang.String[]{};
                           }

                    
                         //update the setting tracker
                        localNamesTracker = true;
                    

                       java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localNames);
                       list.add(param);
                       this.localNames =
                     (java.lang.String[])list.toArray(
                    new java.lang.String[list.size()]);

                     }
                     

                /**
                * field for Rates
                * This was an Array!
                */

                
                            protected int[] localRates ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localRatesTracker = false ;

                   public boolean isRatesSpecified(){
                       return localRatesTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int[]
                   */
                   public  int[] getRates(){
                       return localRates;
                   }

                   
                


                       
                      /**
                       * validate the array for Rates
                       */
                      protected void validateRates(int[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Rates
                      */
                      public void setRates(int[] param){
                      
                           validateRates(param);

                       localRatesTracker = true;
                              
                              this.localRates=param;
                      }

                       
                     

                /**
                * field for Result
                */

                
                            protected boolean localResult ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localResultTracker = false ;

                   public boolean isResultSpecified(){
                       return localResultTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return boolean
                   */
                   public  boolean getResult(){
                       return localResult;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Result
                       */
                       public void setResult(boolean param){
                    
                               // setting primitive attribute tracker to true
                               localResultTracker =
                               true;
                           
                                    this.localResult=param;
                            

                       }
                    

                /**
                * field for Years
                * This was an Array!
                */

                
                            protected int[] localYears ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localYearsTracker = false ;

                   public boolean isYearsSpecified(){
                       return localYearsTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int[]
                   */
                   public  int[] getYears(){
                       return localYears;
                   }

                   
                


                       
                      /**
                       * validate the array for Years
                       */
                      protected void validateYears(int[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Years
                      */
                      public void setYears(int[] param){
                      
                           validateYears(param);

                       localYearsTracker = true;
                              
                              this.localYears=param;
                      }

                       
                     



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":WinesRatedList",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "WinesRatedList",
                   xmlWriter);
           }

       
           }
        if (localGrapesTracker){
                     if (localGrapes!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localGrapes.length;i++){
                                
                                    if (localGrapes[i] != null){
                                
                                        writeStartElement(null, namespace, "grapes", xmlWriter);

                                    
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrapes[i]));
                                            
                                        xmlWriter.writeEndElement();
                                      
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "grapes", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "grapes", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localNamesTracker){
                     if (localNames!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localNames.length;i++){
                                
                                    if (localNames[i] != null){
                                
                                        writeStartElement(null, namespace, "names", xmlWriter);

                                    
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNames[i]));
                                            
                                        xmlWriter.writeEndElement();
                                      
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "names", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "names", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localRatesTracker){
                     if (localRates!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localRates.length;i++){
                                
                                           if (localRates[i]!=java.lang.Integer.MIN_VALUE) {
                                       
                                        writeStartElement(null, namespace, "rates", xmlWriter);

                                    
                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRates[i]));
                                        xmlWriter.writeEndElement();
                                    
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "rates", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "rates", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localResultTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "result", xmlWriter);
                     
                                       if (false) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("result cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                                       }
                            
                           xmlWriter.writeEndElement();
                     } if (localYearsTracker){
                     if (localYears!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localYears.length;i++){
                                
                                           if (localYears[i]!=java.lang.Integer.MIN_VALUE) {
                                       
                                        writeStartElement(null, namespace, "years", xmlWriter);

                                    
                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYears[i]));
                                        xmlWriter.writeEndElement();
                                    
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "years", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "years", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localGrapesTracker){
                    if (localGrapes!=null){
                          for (int i = 0;i < localGrapes.length;i++){
                              
                                 if (localGrapes[i] != null){
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrapes[i]));
                                  } else {
                                     
                                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                                            elementList.add(null);
                                        
                                  }
                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                            elementList.add(null);
                        
                    }

                } if (localNamesTracker){
                    if (localNames!=null){
                          for (int i = 0;i < localNames.length;i++){
                              
                                 if (localNames[i] != null){
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNames[i]));
                                  } else {
                                     
                                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                                            elementList.add(null);
                                        
                                  }
                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                            elementList.add(null);
                        
                    }

                } if (localRatesTracker){
                    if (localRates!=null){
                          for (int i = 0;i < localRates.length;i++){
                              
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                                                               "rates"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRates[i]));

                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "rates"));
                            elementList.add(null);
                        
                    }

                } if (localResultTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "result"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                    } if (localYearsTracker){
                    if (localYears!=null){
                          for (int i = 0;i < localYears.length;i++){
                              
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                                                               "years"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYears[i]));

                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "years"));
                            elementList.add(null);
                        
                    }

                }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static WinesRatedList parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    WinesRatedList object =
        new WinesRatedList();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"WinesRatedList".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (WinesRatedList)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                java.util.ArrayList list1 = new java.util.ArrayList();
            
                java.util.ArrayList list2 = new java.util.ArrayList();
            
                java.util.ArrayList list3 = new java.util.ArrayList();
            
                java.util.ArrayList list5 = new java.util.ArrayList();
            
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grapes").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list1.add(null);
                                               
                                          reader.next();
                                      } else {
                                    list1.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone1 = false;
                                    while(!loopDone1){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone1 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grapes").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list1.add(null);
                                                           
                                                      reader.next();
                                                  } else {
                                                list1.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone1 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                            object.setGrapes((java.lang.String[])
                                                list1.toArray(new java.lang.String[list1.size()]));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","names").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list2.add(null);
                                               
                                          reader.next();
                                      } else {
                                    list2.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone2 = false;
                                    while(!loopDone2){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone2 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","names").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list2.add(null);
                                                           
                                                      reader.next();
                                                  } else {
                                                list2.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone2 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                            object.setNames((java.lang.String[])
                                                list2.toArray(new java.lang.String[list2.size()]));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","rates").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list3.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                               
                                          reader.next();
                                      } else {
                                    list3.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone3 = false;
                                    while(!loopDone3){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone3 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","rates").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list3.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                                           
                                                      reader.next();
                                                  } else {
                                                list3.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone3 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                    object.setRates((int[])
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    int.class,list3));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","result").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"result" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setResult(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","years").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list5.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                               
                                          reader.next();
                                      } else {
                                    list5.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone5 = false;
                                    while(!loopDone5){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone5 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","years").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list5.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                                           
                                                      reader.next();
                                                  } else {
                                                list5.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone5 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                    object.setYears((int[])
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    int.class,list5));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class WineRated
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = WineRated
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Grape
                */

                
                            protected java.lang.String localGrape ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localGrapeTracker = false ;

                   public boolean isGrapeSpecified(){
                       return localGrapeTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getGrape(){
                       return localGrape;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Grape
                       */
                       public void setGrape(java.lang.String param){
                    localGrapeTracker = true;
                           
                                    this.localGrape=param;
                            

                       }
                    

                /**
                * field for Name
                */

                
                            protected java.lang.String localName ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNameTracker = false ;

                   public boolean isNameSpecified(){
                       return localNameTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getName(){
                       return localName;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Name
                       */
                       public void setName(java.lang.String param){
                    localNameTracker = true;
                           
                                    this.localName=param;
                            

                       }
                    

                /**
                * field for Rate
                */

                
                            protected int localRate ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localRateTracker = false ;

                   public boolean isRateSpecified(){
                       return localRateTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int
                   */
                   public  int getRate(){
                       return localRate;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Rate
                       */
                       public void setRate(int param){
                    
                               // setting primitive attribute tracker to true
                               localRateTracker =
                               param != java.lang.Integer.MIN_VALUE;
                           
                                    this.localRate=param;
                            

                       }
                    

                /**
                * field for Year
                */

                
                            protected int localYear ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localYearTracker = false ;

                   public boolean isYearSpecified(){
                       return localYearTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int
                   */
                   public  int getYear(){
                       return localYear;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Year
                       */
                       public void setYear(int param){
                    
                               // setting primitive attribute tracker to true
                               localYearTracker =
                               param != java.lang.Integer.MIN_VALUE;
                           
                                    this.localYear=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":WineRated",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "WineRated",
                   xmlWriter);
           }

       
           }
        if (localGrapeTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "grape", xmlWriter);
                     

                                  if (localGrape==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localGrape);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localNameTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "name", xmlWriter);
                     

                                  if (localName==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localName);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localRateTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "rate", xmlWriter);
                     
                                       if (localRate==java.lang.Integer.MIN_VALUE) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("rate cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRate));
                                       }
                            
                           xmlWriter.writeEndElement();
                     } if (localYearTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "year", xmlWriter);
                     
                                       if (localYear==java.lang.Integer.MIN_VALUE) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("year cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYear));
                                       }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localGrapeTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "grape"));
                         
                                 elementList.add(localGrape==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrape));
                            } if (localNameTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "name"));
                         
                                 elementList.add(localName==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                            } if (localRateTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "rate"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRate));
                    } if (localYearTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "year"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYear));
                    }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static WineRated parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    WineRated object =
        new WineRated();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"WineRated".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (WineRated)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grape").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setGrape(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","name").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setName(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","rate").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"rate" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setRate(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                                       object.setRate(java.lang.Integer.MIN_VALUE);
                                   
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","year").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"year" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setYear(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                                       object.setYear(java.lang.Integer.MIN_VALUE);
                                   
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class RemoveWineResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "removeWineResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":removeWineResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "removeWineResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RemoveWineResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RemoveWineResponse object =
        new RemoveWineResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"removeWineResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RemoveWineResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddWineResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addWineResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addWineResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addWineResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddWineResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddWineResponse object =
        new AddWineResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addWineResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddWineResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddUserResponse
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = AddUserResponse
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Pwd
                */

                
                            protected java.lang.String localPwd ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localPwdTracker = false ;

                   public boolean isPwdSpecified(){
                       return localPwdTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getPwd(){
                       return localPwd;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Pwd
                       */
                       public void setPwd(java.lang.String param){
                    localPwdTracker = true;
                           
                                    this.localPwd=param;
                            

                       }
                    

                /**
                * field for Response
                */

                
                            protected boolean localResponse ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localResponseTracker = false ;

                   public boolean isResponseSpecified(){
                       return localResponseTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return boolean
                   */
                   public  boolean getResponse(){
                       return localResponse;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Response
                       */
                       public void setResponse(boolean param){
                    
                               // setting primitive attribute tracker to true
                               localResponseTracker =
                               true;
                           
                                    this.localResponse=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":AddUserResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "AddUserResponse",
                   xmlWriter);
           }

       
           }
        if (localPwdTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "pwd", xmlWriter);
                     

                                  if (localPwd==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localPwd);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localResponseTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "response", xmlWriter);
                     
                                       if (false) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("response cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponse));
                                       }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localPwdTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "pwd"));
                         
                                 elementList.add(localPwd==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPwd));
                            } if (localResponseTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "response"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponse));
                    }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddUserResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddUserResponse object =
        new AddUserResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"AddUserResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddUserResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","pwd").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setPwd(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","response").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"response" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setResponse(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyFollowerRatesResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyFollowerRatesResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected WinesRatedList local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return WinesRatedList
                   */
                   public  WinesRatedList get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(WinesRatedList param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyFollowerRatesResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyFollowerRatesResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyFollowerRatesResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyFollowerRatesResponse object =
        new GetMyFollowerRatesResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyFollowerRatesResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyFollowerRatesResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(WinesRatedList.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyRatesResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyRatesResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected WinesRatedList local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return WinesRatedList
                   */
                   public  WinesRatedList get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(WinesRatedList param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyRatesResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyRatesResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyRatesResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyRatesResponse object =
        new GetMyRatesResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyRatesResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyRatesResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(WinesRatedList.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class RemoveUser
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "removeUser",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Username localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Username
                   */
                   public  Username getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Username param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":removeUser",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "removeUser",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RemoveUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RemoveUser object =
        new RemoveUser();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"removeUser".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RemoveUser)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Username.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetWines
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getWines",
        "ns2");

    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getWines",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getWines",
                   xmlWriter);
           }

       
           }
       
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

        

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetWines parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetWines object =
        new GetWines();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getWines".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetWines)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class RemoveWine
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "removeWine",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Wine localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Wine
                   */
                   public  Wine getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Wine param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":removeWine",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "removeWine",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RemoveWine parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RemoveWine object =
        new RemoveWine();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"removeWine".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RemoveWine)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Wine.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class ChangePassword
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "changePassword",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected PasswordPair localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return PasswordPair
                   */
                   public  PasswordPair getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(PasswordPair param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":changePassword",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "changePassword",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static ChangePassword parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    ChangePassword object =
        new ChangePassword();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"changePassword".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (ChangePassword)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(PasswordPair.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class UnfollowResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "unfollowResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":unfollowResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "unfollowResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static UnfollowResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    UnfollowResponse object =
        new UnfollowResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"unfollowResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (UnfollowResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class ExtensionMapper{

  public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                               java.lang.String typeName,
                                               javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "Username".equals(typeName)){
           
                    return  Username.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "User".equals(typeName)){
           
                    return  User.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "PasswordPair".equals(typeName)){
           
                    return  PasswordPair.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "Wine".equals(typeName)){
           
                    return  Wine.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "Response".equals(typeName)){
           
                    return  Response.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "WinesRatedList".equals(typeName)){
           
                    return  WinesRatedList.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "WineRated".equals(typeName)){
           
                    return  WineRated.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "FollowerList".equals(typeName)){
           
                    return  FollowerList.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "WineList".equals(typeName)){
           
                    return  WineList.Factory.parse(reader);
                

          }

      
          if (
          "http://model.sos.etsiinf.upm.es/xsd".equals(namespaceURI) &&
          "AddUserResponse".equals(typeName)){
           
                    return  AddUserResponse.Factory.parse(reader);
                

          }

      
     throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
  }

}

public static class PasswordPair
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = PasswordPair
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Newpwd
                */

                
                            protected java.lang.String localNewpwd ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNewpwdTracker = false ;

                   public boolean isNewpwdSpecified(){
                       return localNewpwdTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getNewpwd(){
                       return localNewpwd;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Newpwd
                       */
                       public void setNewpwd(java.lang.String param){
                    localNewpwdTracker = true;
                           
                                    this.localNewpwd=param;
                            

                       }
                    

                /**
                * field for Oldpwd
                */

                
                            protected java.lang.String localOldpwd ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localOldpwdTracker = false ;

                   public boolean isOldpwdSpecified(){
                       return localOldpwdTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getOldpwd(){
                       return localOldpwd;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Oldpwd
                       */
                       public void setOldpwd(java.lang.String param){
                    localOldpwdTracker = true;
                           
                                    this.localOldpwd=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":PasswordPair",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "PasswordPair",
                   xmlWriter);
           }

       
           }
        if (localNewpwdTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "newpwd", xmlWriter);
                     

                                  if (localNewpwd==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localNewpwd);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     } if (localOldpwdTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "oldpwd", xmlWriter);
                     

                                  if (localOldpwd==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localOldpwd);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localNewpwdTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "newpwd"));
                         
                                 elementList.add(localNewpwd==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewpwd));
                            } if (localOldpwdTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "oldpwd"));
                         
                                 elementList.add(localOldpwd==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOldpwd));
                            }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static PasswordPair parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    PasswordPair object =
        new PasswordPair();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"PasswordPair".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (PasswordPair)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","newpwd").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setNewpwd(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","oldpwd").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setOldpwd(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddFollowerResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addFollowerResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addFollowerResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addFollowerResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddFollowerResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddFollowerResponse object =
        new AddFollowerResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addFollowerResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddFollowerResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyFollowers
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyFollowers",
        "ns2");

    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyFollowers",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyFollowers",
                   xmlWriter);
           }

       
           }
       
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

        

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyFollowers parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyFollowers object =
        new GetMyFollowers();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyFollowers".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyFollowers)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class ChangePasswordResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "changePasswordResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":changePasswordResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "changePasswordResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static ChangePasswordResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    ChangePasswordResponse object =
        new ChangePasswordResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"changePasswordResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (ChangePasswordResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyFollowersResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyFollowersResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected FollowerList local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return FollowerList
                   */
                   public  FollowerList get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(FollowerList param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyFollowersResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyFollowersResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyFollowersResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyFollowersResponse object =
        new GetMyFollowersResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyFollowersResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyFollowersResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(FollowerList.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddUserResponseE
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addUserResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected AddUserResponse local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return AddUserResponse
                   */
                   public  AddUserResponse get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(AddUserResponse param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addUserResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addUserResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddUserResponseE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddUserResponseE object =
        new AddUserResponseE();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addUserResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddUserResponseE)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(AddUserResponse.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class LogoutResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "logoutResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":logoutResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "logoutResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static LogoutResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    LogoutResponse object =
        new LogoutResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"logoutResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (LogoutResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Unfollow
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "unfollow",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Username localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Username
                   */
                   public  Username getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Username param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":unfollow",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "unfollow",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Unfollow parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Unfollow object =
        new Unfollow();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"unfollow".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Unfollow)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Username.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Username
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = Username
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Username
                */

                
                            protected java.lang.String localUsername ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localUsernameTracker = false ;

                   public boolean isUsernameSpecified(){
                       return localUsernameTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String
                   */
                   public  java.lang.String getUsername(){
                       return localUsername;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Username
                       */
                       public void setUsername(java.lang.String param){
                    localUsernameTracker = true;
                           
                                    this.localUsername=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":Username",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "Username",
                   xmlWriter);
           }

       
           }
        if (localUsernameTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "username", xmlWriter);
                     

                                  if (localUsername==null){
                                      // write the nil attribute
                                      
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                          
                                  }else{

                                
                                           xmlWriter.writeCharacters(localUsername);
                                    
                                  }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localUsernameTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "username"));
                         
                                 elementList.add(localUsername==null?null:
                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
                            }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Username parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Username object =
        new Username();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"Username".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Username)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","username").equals(reader.getName())){
                        
                               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setUsername(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                    
                               } else {
                                   
                                   
                                   reader.getElementText(); // throw away text nodes if any.
                               }
                              
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyRates
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyRates",
        "ns2");

    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyRates",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyRates",
                   xmlWriter);
           }

       
           }
       
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

        

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyRates parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyRates object =
        new GetMyRates();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyRates".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyRates)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetWinesResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getWinesResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected WineList local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return WineList
                   */
                   public  WineList get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(WineList param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getWinesResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getWinesResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetWinesResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetWinesResponse object =
        new GetWinesResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getWinesResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetWinesResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(WineList.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class LoginResponse
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "loginResponse",
        "ns2");

    

                /**
                * field for _return
                */

                
                            protected Response local_return ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean local_returnTracker = false ;

                   public boolean is_returnSpecified(){
                       return local_returnTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Response
                   */
                   public  Response get_return(){
                       return local_return;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param _return
                       */
                       public void set_return(Response param){
                    local_returnTracker = true;
                           
                                    this.local_return=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":loginResponse",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "loginResponse",
                   xmlWriter);
           }

       
           }
        if (local_returnTracker){
                            if (local_return==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "return", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             local_return.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (local_returnTracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "return"));
                    
                    
                            elementList.add(local_return==null?null:
                            local_return);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static LoginResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    LoginResponse object =
        new LoginResponse();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"loginResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (LoginResponse)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","return").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.set_return(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.set_return(Response.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Response
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = Response
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Response
                */

                
                            protected boolean localResponse ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localResponseTracker = false ;

                   public boolean isResponseSpecified(){
                       return localResponseTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return boolean
                   */
                   public  boolean getResponse(){
                       return localResponse;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Response
                       */
                       public void setResponse(boolean param){
                    
                               // setting primitive attribute tracker to true
                               localResponseTracker =
                               true;
                           
                                    this.localResponse=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":Response",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "Response",
                   xmlWriter);
           }

       
           }
        if (localResponseTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "response", xmlWriter);
                     
                                       if (false) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("response cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponse));
                                       }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localResponseTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "response"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponse));
                    }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Response parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Response object =
        new Response();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"Response".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Response)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","response").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"response" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setResponse(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class RateWine
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "rateWine",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected WineRated localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return WineRated
                   */
                   public  WineRated getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(WineRated param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":rateWine",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "rateWine",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static RateWine parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    RateWine object =
        new RateWine();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"rateWine".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (RateWine)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(WineRated.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class FollowerList
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = FollowerList
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Followers
                * This was an Array!
                */

                
                            protected java.lang.String[] localFollowers ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localFollowersTracker = false ;

                   public boolean isFollowersSpecified(){
                       return localFollowersTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String[]
                   */
                   public  java.lang.String[] getFollowers(){
                       return localFollowers;
                   }

                   
                


                       
                      /**
                       * validate the array for Followers
                       */
                      protected void validateFollowers(java.lang.String[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Followers
                      */
                      public void setFollowers(java.lang.String[] param){
                      
                           validateFollowers(param);

                       localFollowersTracker = true;
                              
                              this.localFollowers=param;
                      }

                       
                     
                     /**
                     * Auto generated add method for the array for convenience
                     * @param param java.lang.String
                     */
                     public void addFollowers(java.lang.String param){
                           if (localFollowers == null){
                           localFollowers = new java.lang.String[]{};
                           }

                    
                         //update the setting tracker
                        localFollowersTracker = true;
                    

                       java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localFollowers);
                       list.add(param);
                       this.localFollowers =
                     (java.lang.String[])list.toArray(
                    new java.lang.String[list.size()]);

                     }
                     

                /**
                * field for Result
                */

                
                            protected boolean localResult ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localResultTracker = false ;

                   public boolean isResultSpecified(){
                       return localResultTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return boolean
                   */
                   public  boolean getResult(){
                       return localResult;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Result
                       */
                       public void setResult(boolean param){
                    
                               // setting primitive attribute tracker to true
                               localResultTracker =
                               true;
                           
                                    this.localResult=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":FollowerList",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "FollowerList",
                   xmlWriter);
           }

       
           }
        if (localFollowersTracker){
                     if (localFollowers!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localFollowers.length;i++){
                                
                                    if (localFollowers[i] != null){
                                
                                        writeStartElement(null, namespace, "followers", xmlWriter);

                                    
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFollowers[i]));
                                            
                                        xmlWriter.writeEndElement();
                                      
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "followers", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "followers", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localResultTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "result", xmlWriter);
                     
                                       if (false) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("result cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                                       }
                            
                           xmlWriter.writeEndElement();
                     }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localFollowersTracker){
                    if (localFollowers!=null){
                          for (int i = 0;i < localFollowers.length;i++){
                              
                                 if (localFollowers[i] != null){
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "followers"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFollowers[i]));
                                  } else {
                                     
                                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "followers"));
                                            elementList.add(null);
                                        
                                  }
                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "followers"));
                            elementList.add(null);
                        
                    }

                } if (localResultTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "result"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                    }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static FollowerList parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    FollowerList object =
        new FollowerList();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"FollowerList".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (FollowerList)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                java.util.ArrayList list1 = new java.util.ArrayList();
            
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","followers").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list1.add(null);
                                               
                                          reader.next();
                                      } else {
                                    list1.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone1 = false;
                                    while(!loopDone1){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone1 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","followers").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list1.add(null);
                                                           
                                                      reader.next();
                                                  } else {
                                                list1.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone1 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                            object.setFollowers((java.lang.String[])
                                                list1.toArray(new java.lang.String[list1.size()]));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","result").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"result" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setResult(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddUser
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addUser",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Username localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Username
                   */
                   public  Username getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Username param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addUser",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addUser",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddUser object =
        new AddUser();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addUser".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddUser)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Username.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class GetMyFollowerRates
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "getMyFollowerRates",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Username localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Username
                   */
                   public  Username getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Username param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":getMyFollowerRates",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "getMyFollowerRates",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static GetMyFollowerRates parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    GetMyFollowerRates object =
        new GetMyFollowerRates();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"getMyFollowerRates".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetMyFollowerRates)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Username.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class WineList
implements org.apache.axis2.databinding.ADBBean{
/* This type was generated from the piece of schema that had
        name = WineList
        Namespace URI = http://model.sos.etsiinf.upm.es/xsd
        Namespace Prefix = ns1
        */
    

                /**
                * field for Grapes
                * This was an Array!
                */

                
                            protected java.lang.String[] localGrapes ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localGrapesTracker = false ;

                   public boolean isGrapesSpecified(){
                       return localGrapesTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String[]
                   */
                   public  java.lang.String[] getGrapes(){
                       return localGrapes;
                   }

                   
                


                       
                      /**
                       * validate the array for Grapes
                       */
                      protected void validateGrapes(java.lang.String[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Grapes
                      */
                      public void setGrapes(java.lang.String[] param){
                      
                           validateGrapes(param);

                       localGrapesTracker = true;
                              
                              this.localGrapes=param;
                      }

                       
                     
                     /**
                     * Auto generated add method for the array for convenience
                     * @param param java.lang.String
                     */
                     public void addGrapes(java.lang.String param){
                           if (localGrapes == null){
                           localGrapes = new java.lang.String[]{};
                           }

                    
                         //update the setting tracker
                        localGrapesTracker = true;
                    

                       java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localGrapes);
                       list.add(param);
                       this.localGrapes =
                     (java.lang.String[])list.toArray(
                    new java.lang.String[list.size()]);

                     }
                     

                /**
                * field for Names
                * This was an Array!
                */

                
                            protected java.lang.String[] localNames ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localNamesTracker = false ;

                   public boolean isNamesSpecified(){
                       return localNamesTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return java.lang.String[]
                   */
                   public  java.lang.String[] getNames(){
                       return localNames;
                   }

                   
                


                       
                      /**
                       * validate the array for Names
                       */
                      protected void validateNames(java.lang.String[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Names
                      */
                      public void setNames(java.lang.String[] param){
                      
                           validateNames(param);

                       localNamesTracker = true;
                              
                              this.localNames=param;
                      }

                       
                     
                     /**
                     * Auto generated add method for the array for convenience
                     * @param param java.lang.String
                     */
                     public void addNames(java.lang.String param){
                           if (localNames == null){
                           localNames = new java.lang.String[]{};
                           }

                    
                         //update the setting tracker
                        localNamesTracker = true;
                    

                       java.util.List list =
                    org.apache.axis2.databinding.utils.ConverterUtil.toList(localNames);
                       list.add(param);
                       this.localNames =
                     (java.lang.String[])list.toArray(
                    new java.lang.String[list.size()]);

                     }
                     

                /**
                * field for Result
                */

                
                            protected boolean localResult ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localResultTracker = false ;

                   public boolean isResultSpecified(){
                       return localResultTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return boolean
                   */
                   public  boolean getResult(){
                       return localResult;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Result
                       */
                       public void setResult(boolean param){
                    
                               // setting primitive attribute tracker to true
                               localResultTracker =
                               true;
                           
                                    this.localResult=param;
                            

                       }
                    

                /**
                * field for Years
                * This was an Array!
                */

                
                            protected int[] localYears ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localYearsTracker = false ;

                   public boolean isYearsSpecified(){
                       return localYearsTracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return int[]
                   */
                   public  int[] getYears(){
                       return localYears;
                   }

                   
                


                       
                      /**
                       * validate the array for Years
                       */
                      protected void validateYears(int[] param){
                     
                      }


                     /**
                      * Auto generated setter method
                      * @param param Years
                      */
                      public void setYears(int[] param){
                      
                           validateYears(param);

                       localYearsTracker = true;
                              
                              this.localYears=param;
                      }

                       
                     



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
       return factory.createOMElement(dataSource,parentQName);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://model.sos.etsiinf.upm.es/xsd");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":WineList",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "WineList",
                   xmlWriter);
           }

       
           }
        if (localGrapesTracker){
                     if (localGrapes!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localGrapes.length;i++){
                                
                                    if (localGrapes[i] != null){
                                
                                        writeStartElement(null, namespace, "grapes", xmlWriter);

                                    
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrapes[i]));
                                            
                                        xmlWriter.writeEndElement();
                                      
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "grapes", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "grapes", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localNamesTracker){
                     if (localNames!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localNames.length;i++){
                                
                                    if (localNames[i] != null){
                                
                                        writeStartElement(null, namespace, "names", xmlWriter);

                                    
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNames[i]));
                                            
                                        xmlWriter.writeEndElement();
                                      
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "names", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "names", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                } if (localResultTracker){
                            namespace = "http://model.sos.etsiinf.upm.es/xsd";
                            writeStartElement(null, namespace, "result", xmlWriter);
                     
                                       if (false) {
                                   
                                                 throw new org.apache.axis2.databinding.ADBException("result cannot be null!!");
                                              
                                       } else {
                                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                                       }
                            
                           xmlWriter.writeEndElement();
                     } if (localYearsTracker){
                     if (localYears!=null) {
                           namespace = "http://model.sos.etsiinf.upm.es/xsd";
                           for (int i = 0;i < localYears.length;i++){
                                
                                           if (localYears[i]!=java.lang.Integer.MIN_VALUE) {
                                       
                                        writeStartElement(null, namespace, "years", xmlWriter);

                                    
                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYears[i]));
                                        xmlWriter.writeEndElement();
                                    
                                        } else {
                                           
                                                   // write null attribute
                                                    namespace = "http://model.sos.etsiinf.upm.es/xsd";
                                                    writeStartElement(null, namespace, "years", xmlWriter);
                                                    writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                    xmlWriter.writeEndElement();
                                               
                                        }

                           }
                     } else {
                         
                                 // write the null attribute
                                // write null attribute
                                   writeStartElement(null, "http://model.sos.etsiinf.upm.es/xsd", "years", xmlWriter);

                                   // write the nil attribute
                                   writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                   xmlWriter.writeEndElement();
                            
                     }

                }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://model.sos.etsiinf.upm.es/xsd")){
        return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localGrapesTracker){
                    if (localGrapes!=null){
                          for (int i = 0;i < localGrapes.length;i++){
                              
                                 if (localGrapes[i] != null){
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGrapes[i]));
                                  } else {
                                     
                                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                                            elementList.add(null);
                                        
                                  }
                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "grapes"));
                            elementList.add(null);
                        
                    }

                } if (localNamesTracker){
                    if (localNames!=null){
                          for (int i = 0;i < localNames.length;i++){
                              
                                 if (localNames[i] != null){
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNames[i]));
                                  } else {
                                     
                                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                                            elementList.add(null);
                                        
                                  }
                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "names"));
                            elementList.add(null);
                        
                    }

                } if (localResultTracker){
                              elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                              "result"));
                         
                        elementList.add(
                           org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResult));
                    } if (localYearsTracker){
                    if (localYears!=null){
                          for (int i = 0;i < localYears.length;i++){
                              
                                  elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                                                               "years"));
                                  elementList.add(
                                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYears[i]));

                              

                          }
                    } else {
                      
                            elementList.add(new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd",
                                                                      "years"));
                            elementList.add(null);
                        
                    }

                }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static WineList parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    WineList object =
        new WineList();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"WineList".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (WineList)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                java.util.ArrayList list1 = new java.util.ArrayList();
            
                java.util.ArrayList list2 = new java.util.ArrayList();
            
                java.util.ArrayList list4 = new java.util.ArrayList();
            
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grapes").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list1.add(null);
                                               
                                          reader.next();
                                      } else {
                                    list1.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone1 = false;
                                    while(!loopDone1){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone1 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","grapes").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list1.add(null);
                                                           
                                                      reader.next();
                                                  } else {
                                                list1.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone1 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                            object.setGrapes((java.lang.String[])
                                                list1.toArray(new java.lang.String[list1.size()]));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","names").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list2.add(null);
                                               
                                          reader.next();
                                      } else {
                                    list2.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone2 = false;
                                    while(!loopDone2){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone2 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","names").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list2.add(null);
                                                           
                                                      reader.next();
                                                  } else {
                                                list2.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone2 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                            object.setNames((java.lang.String[])
                                                list2.toArray(new java.lang.String[list2.size()]));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","result").equals(reader.getName())){
                        
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                throw new org.apache.axis2.databinding.ADBException("The element: "+"result" +"  cannot be null");
                            }
                            

                            java.lang.String content = reader.getElementText();
                            
                                      object.setResult(
                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                      
                                reader.next();
                            
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","years").equals(reader.getName())){
                        
                            
                            
                            // Process the array and step past its final element's end.
                            
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          list4.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                               
                                          reader.next();
                                      } else {
                                    list4.add(reader.getElementText());
                                    }
                                    //loop until we find a start element that is not part of this array
                                    boolean loopDone4 = false;
                                    while(!loopDone4){
                                        // Ensure we are at the EndElement
                                        while (!reader.isEndElement()){
                                            reader.next();
                                        }
                                        // Step out of this element
                                        reader.next();
                                        // Step to next element event.
                                        while (!reader.isStartElement() && !reader.isEndElement())
                                            reader.next();
                                        if (reader.isEndElement()){
                                            //two continuous end elements means we are exiting the xml structure
                                            loopDone4 = true;
                                        } else {
                                            if (new javax.xml.namespace.QName("http://model.sos.etsiinf.upm.es/xsd","years").equals(reader.getName())){
                                                 
                                                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                  if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                      list4.add(String.valueOf(java.lang.Integer.MIN_VALUE));
                                                           
                                                      reader.next();
                                                  } else {
                                                list4.add(reader.getElementText());
                                                }
                                            }else{
                                                loopDone4 = true;
                                            }
                                        }
                                    }
                                    // call the converter utility  to convert and set the array
                                    
                                    object.setYears((int[])
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    int.class,list4));
                                        
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class Login
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "login",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected User localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return User
                   */
                   public  User getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(User param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":login",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "login",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static Login parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    Login object =
        new Login();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"login".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (Login)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(User.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddFollower
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addFollower",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Username localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Username
                   */
                   public  Username getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Username param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addFollower",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addFollower",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddFollower parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddFollower object =
        new AddFollower();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addFollower".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddFollower)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Username.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

public static class AddWine
implements org.apache.axis2.databinding.ADBBean{

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://sos.etsiinf.upm.es",
        "addWine",
        "ns2");

    

                /**
                * field for Args0
                */

                
                            protected Wine localArgs0 ;
                        
                   /*  This tracker boolean wil be used to detect whether the user called the set method
                  *   for this attribute. It will be used to determine whether to include this field
                   *   in the serialized XML
                   */
                   protected boolean localArgs0Tracker = false ;

                   public boolean isArgs0Specified(){
                       return localArgs0Tracker;
                   }

                   

                   /**
                   * Auto generated getter method
                   * @return Wine
                   */
                   public  Wine getArgs0(){
                       return localArgs0;
                   }

                   
                
                    /**
                       * Auto generated setter method
                       * @param param Args0
                       */
                       public void setArgs0(Wine param){
                    localArgs0Tracker = true;
                           
                                    this.localArgs0=param;
                            

                       }
                    



/**
*
* @param parentQName
* @param factory
* @return org.apache.axiom.om.OMElement
*/
public org.apache.axiom.om.OMElement getOMElement (
       final javax.xml.namespace.QName parentQName,
       final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



       org.apache.axiom.om.OMDataSource dataSource =
               new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
       return factory.createOMElement(dataSource,MY_QNAME);
    
}

 public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter)
                        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                   serialize(parentQName,xmlWriter,false);
 }

 public void serialize(final javax.xml.namespace.QName parentQName,
                       javax.xml.stream.XMLStreamWriter xmlWriter,
                       boolean serializeType)
    throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
    
        


        java.lang.String prefix = null;
        java.lang.String namespace = null;
        

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
        
          if (serializeType){
       

           java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://sos.etsiinf.upm.es");
           if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   namespacePrefix+":addWine",
                   xmlWriter);
           } else {
               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                   "addWine",
                   xmlWriter);
           }

       
           }
        if (localArgs0Tracker){
                            if (localArgs0==null){

                                writeStartElement(null, "http://sos.etsiinf.upm.es", "args0", xmlWriter);

                               // write the nil attribute
                              writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                              xmlWriter.writeEndElement();
                            }else{
                             localArgs0.serialize(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0"),
                                xmlWriter);
                            }
                        }
            xmlWriter.writeEndElement();
       

}

private static java.lang.String generatePrefix(java.lang.String namespace) {
    if(namespace.equals("http://sos.etsiinf.upm.es")){
        return "ns2";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
}

/**
 * Utility method to write an element start tag.
 */
private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                               javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
        xmlWriter.writeStartElement(namespace, localPart);
    } else {
        if (namespace.length() == 0) {
            prefix = "";
        } else if (prefix == null) {
            prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
}

/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (xmlWriter.getPrefix(namespace) == null) {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace,attName,attValue);
}

/**
 * Util method to write an attribute without the ns prefix
 */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                            java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName,attValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace,attName,attValue);
    }
}


   /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }
/**
 *  method to handle Qnames
 */

private void writeQName(javax.xml.namespace.QName qname,
                        javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix,namespaceURI);
        }

        if (prefix.trim().length() > 0){
            xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
}

private void writeQNames(javax.xml.namespace.QName[] qnames,
                         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
                stringToWrite.append(" ");
            }
            namespaceURI = qnames[i].getNamespaceURI();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
    }

}


/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);
            if (uri == null || uri.length() == 0) {
                break;
            }
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
}



/**
* databinding method to get an XML representation of this object
*
*/
public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException{



         java.util.ArrayList elementList = new java.util.ArrayList();
         java.util.ArrayList attribList = new java.util.ArrayList();

         if (localArgs0Tracker){
                    elementList.add(new javax.xml.namespace.QName("http://sos.etsiinf.upm.es",
                                                              "args0"));
                    
                    
                            elementList.add(localArgs0==null?null:
                            localArgs0);
                        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
    
    

}



/**
*  Factory class that keeps the parse method
*/
public static class Factory{




/**
* static method to create the object
* Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
*                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
* Postcondition: If this object is an element, the reader is positioned at its end element
*                If this object is a complex type, the reader is positioned at the end element of its outer element
*/
public static AddWine parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
    AddWine object =
        new AddWine();

    int event;
    java.lang.String nillableValue = null;
    java.lang.String prefix ="";
    java.lang.String namespaceuri ="";
    try {
        
        while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

        
        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
          java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
          if (fullTypeName!=null){
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1){
                nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix==null?"":nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
            
                    if (!"addWine".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (AddWine)ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }
                

          }
        

        }

        

        
        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();
        

        
            
            reader.next();
        
                            
                            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                        
                            if (reader.isStartElement() && new javax.xml.namespace.QName("http://sos.etsiinf.upm.es","args0").equals(reader.getName())){
                        
                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                  object.setArgs0(null);
                                  reader.next();
                                    
                                    reader.next();
                                  
                              }else{
                            
                                        object.setArgs0(Wine.Factory.parse(reader));
                                      
                                reader.next();
                            }
                      }  // End of if for expected property start element
                        
                            else {
                                
                            }
                          
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();
                    
                        if (reader.isStartElement())
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                    



    } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
    }

    return object;
}

}//end of factory class



}
   

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.Logout param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Logout.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddUser param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddUser.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RateWine param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RateWine.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddWine param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddWine.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetWines param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetWines.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.Login param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Login.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

    private  org.apache.axiom.om.OMElement  toOM(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse param, boolean optimizeContent)
    throws org.apache.axis2.AxisFault {

    
                try{
                     return param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                } catch(org.apache.axis2.databinding.ADBException e){
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            

    }

                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.Logout param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Logout.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.AddUser param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddUser.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.RateWine param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.RateWine.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.AddWine param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.AddWine.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.GetWines param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetWines.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.Login param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.Login.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     
                            
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{

                                     
                                            try{

                                                    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates.MY_QNAME,factory));
                                                    return emptyEnvelope;
                                                } catch(org.apache.axis2.databinding.ADBException e){
                                                    throw org.apache.axis2.AxisFault.makeFault(e);
                                                }
                                        

                                }
                        
                     
                     /* methods to provide back word compatibility */

                     


/**
*  get the default envelope
*/
private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
return factory.getDefaultEnvelope();
}


private  java.lang.Object fromOM(
org.apache.axiom.om.OMElement param,
java.lang.Class type,
java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

try {

        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RemoveUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddFollower.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddFollowerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.Logout.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWine.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RemoveWineResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyRatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.Unfollow.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.UnfollowResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddUser.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RateWine.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RateWine.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.RateWineResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddWine.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddWine.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.AddWineResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetWines.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetWines.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetWinesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.ChangePassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.ChangePasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.Login.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
        if (es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse.class.equals(type)){
        
                   return es.upm.etsiinf.sos.WineSocialUPMStub.GetMyFollowerRatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            

        }
   
} catch (java.lang.Exception e) {
throw org.apache.axis2.AxisFault.makeFault(e);
}
   return null;
}




}
