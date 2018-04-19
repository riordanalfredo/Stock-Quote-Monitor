package StockQuoteService;

public class StockQuoteWSPortTypeProxy implements StockQuoteService.StockQuoteWSPortType {
  private String _endpoint = null;
  private StockQuoteService.StockQuoteWSPortType stockQuoteWSPortType = null;
  
  public StockQuoteWSPortTypeProxy() {
    _initStockQuoteWSPortTypeProxy();
  }
  
  public StockQuoteWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockQuoteWSPortTypeProxy();
  }
  
  private void _initStockQuoteWSPortTypeProxy() {
    try {
      stockQuoteWSPortType = (new StockQuoteService.StockQuoteWSLocator()).getStockQuoteWSSOAP11port_http();
      if (stockQuoteWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockQuoteWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockQuoteWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockQuoteWSPortType != null)
      ((javax.xml.rpc.Stub)stockQuoteWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public StockQuoteService.StockQuoteWSPortType getStockQuoteWSPortType() {
    if (stockQuoteWSPortType == null)
      _initStockQuoteWSPortTypeProxy();
    return stockQuoteWSPortType;
  }
  
  public java.lang.String[] getQuote(java.lang.String symbol) throws java.rmi.RemoteException{
    if (stockQuoteWSPortType == null)
      _initStockQuoteWSPortTypeProxy();
    return stockQuoteWSPortType.getQuote(symbol);
  }
  
  public java.lang.String[] getFieldNames() throws java.rmi.RemoteException{
    if (stockQuoteWSPortType == null)
      _initStockQuoteWSPortTypeProxy();
    return stockQuoteWSPortType.getFieldNames();
  }
  
  
}