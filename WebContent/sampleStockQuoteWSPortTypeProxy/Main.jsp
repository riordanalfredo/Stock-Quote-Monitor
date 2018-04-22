<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Result</title>
</head>
<body>

<H1>Test using JSP file</H1>

<jsp:useBean id="sampleStockQuoteWSPortTypeProxyid" scope="session" class="StockQuoteService.StockQuoteWSPortTypeProxy" />
<%
/*
* @author: rdalf2@student.monash.edu
* Created 20 April 2018
*/
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
	sampleStockQuoteWSPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;
try{
	boolean gotMethod = true;
	//Symbols, 
        
        String[] symbols = {"CBA", "NAB","BHP"};
        
        for(String stock: symbols){
        	// Initialize symbols in java language string
        	java.lang.String symbol_1idTemp = null;
        	
        	// fill temporary symbol_1id.
        	  if(!stock.equals("")){
               	symbol_1idTemp  = stock; 
              } 
        	// Call the function to getQuote. 
        	java.lang.String[] getQuote15mtemp = sampleStockQuoteWSPortTypeProxyid.getQuote(symbol_1idTemp); // Get the Quote 1
 		
        	// Print the results
	        String conReturn = "";
	        if(getQuote15mtemp != null) {
	        	java.util.List ListReturn = java.util.Arrays.asList(getQuote15mtemp);
	        	conReturn += "Symbols: " + ListReturn.get(0).toString() + "<br>";
	        	conReturn += "LastTrade: " + ListReturn.get(1).toString() + "<br>";
	        	conReturn += "Date: " + ListReturn.get(2).toString() + "<br>";
	        	conReturn += "Time: " + ListReturn.get(3).toString() + "<br>";
	        	conReturn += "\n";
	        }
        //Print it in raw HTML using JSP tag, It can be rearranged into neat details using CSS or etc.

        %>
        	<%=conReturn%> <br> ------------------------ <br>
        <%
        
      }
//Catch an error from web service
	} catch (Exception e) { 
	
%>
	Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
	Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
	return;
}
%>
</body>
</html>