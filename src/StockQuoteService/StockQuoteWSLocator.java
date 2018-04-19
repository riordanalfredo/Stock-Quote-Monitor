/**
 * StockQuoteWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package StockQuoteService;

public class StockQuoteWSLocator extends org.apache.axis.client.Service implements StockQuoteService.StockQuoteWS {

    public StockQuoteWSLocator() {
    }


    public StockQuoteWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StockQuoteWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StockQuoteWSSOAP11port_http
    private java.lang.String StockQuoteWSSOAP11port_http_address = "http://viper.infotech.monash.edu.au:8180/ASXStockQuote/services/StockQuoteWS";

    public java.lang.String getStockQuoteWSSOAP11port_httpAddress() {
        return StockQuoteWSSOAP11port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockQuoteWSSOAP11port_httpWSDDServiceName = "StockQuoteWSSOAP11port_http";

    public java.lang.String getStockQuoteWSSOAP11port_httpWSDDServiceName() {
        return StockQuoteWSSOAP11port_httpWSDDServiceName;
    }

    public void setStockQuoteWSSOAP11port_httpWSDDServiceName(java.lang.String name) {
        StockQuoteWSSOAP11port_httpWSDDServiceName = name;
    }

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP11port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockQuoteWSSOAP11port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockQuoteWSSOAP11port_http(endpoint);
    }

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            StockQuoteService.StockQuoteWSSOAP11BindingStub _stub = new StockQuoteService.StockQuoteWSSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getStockQuoteWSSOAP11port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockQuoteWSSOAP11port_httpEndpointAddress(java.lang.String address) {
        StockQuoteWSSOAP11port_http_address = address;
    }


    // Use to get a proxy class for StockQuoteWSSOAP12port_http
    private java.lang.String StockQuoteWSSOAP12port_http_address = "http://viper.infotech.monash.edu.au:8180/ASXStockQuote/services/StockQuoteWS";

    public java.lang.String getStockQuoteWSSOAP12port_httpAddress() {
        return StockQuoteWSSOAP12port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockQuoteWSSOAP12port_httpWSDDServiceName = "StockQuoteWSSOAP12port_http";

    public java.lang.String getStockQuoteWSSOAP12port_httpWSDDServiceName() {
        return StockQuoteWSSOAP12port_httpWSDDServiceName;
    }

    public void setStockQuoteWSSOAP12port_httpWSDDServiceName(java.lang.String name) {
        StockQuoteWSSOAP12port_httpWSDDServiceName = name;
    }

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP12port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockQuoteWSSOAP12port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockQuoteWSSOAP12port_http(endpoint);
    }

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP12port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            StockQuoteService.StockQuoteWSSOAP12BindingStub _stub = new StockQuoteService.StockQuoteWSSOAP12BindingStub(portAddress, this);
            _stub.setPortName(getStockQuoteWSSOAP12port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockQuoteWSSOAP12port_httpEndpointAddress(java.lang.String address) {
        StockQuoteWSSOAP12port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (StockQuoteService.StockQuoteWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                StockQuoteService.StockQuoteWSSOAP11BindingStub _stub = new StockQuoteService.StockQuoteWSSOAP11BindingStub(new java.net.URL(StockQuoteWSSOAP11port_http_address), this);
                _stub.setPortName(getStockQuoteWSSOAP11port_httpWSDDServiceName());
                return _stub;
            }
            if (StockQuoteService.StockQuoteWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                StockQuoteService.StockQuoteWSSOAP12BindingStub _stub = new StockQuoteService.StockQuoteWSSOAP12BindingStub(new java.net.URL(StockQuoteWSSOAP12port_http_address), this);
                _stub.setPortName(getStockQuoteWSSOAP12port_httpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StockQuoteWSSOAP11port_http".equals(inputPortName)) {
            return getStockQuoteWSSOAP11port_http();
        }
        else if ("StockQuoteWSSOAP12port_http".equals(inputPortName)) {
            return getStockQuoteWSSOAP12port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://StockQuoteService", "StockQuoteWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://StockQuoteService", "StockQuoteWSSOAP11port_http"));
            ports.add(new javax.xml.namespace.QName("http://StockQuoteService", "StockQuoteWSSOAP12port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StockQuoteWSSOAP11port_http".equals(portName)) {
            setStockQuoteWSSOAP11port_httpEndpointAddress(address);
        }
        else 
if ("StockQuoteWSSOAP12port_http".equals(portName)) {
            setStockQuoteWSSOAP12port_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
