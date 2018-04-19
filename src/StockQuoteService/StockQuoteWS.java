/**
 * StockQuoteWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package StockQuoteService;

public interface StockQuoteWS extends javax.xml.rpc.Service {
    public java.lang.String getStockQuoteWSSOAP11port_httpAddress();

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP11port_http() throws javax.xml.rpc.ServiceException;

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getStockQuoteWSSOAP12port_httpAddress();

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP12port_http() throws javax.xml.rpc.ServiceException;

    public StockQuoteService.StockQuoteWSPortType getStockQuoteWSSOAP12port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
