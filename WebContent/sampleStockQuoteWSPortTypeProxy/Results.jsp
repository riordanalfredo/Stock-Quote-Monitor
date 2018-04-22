<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/index.css"  type="text/css" rel="stylesheet">
<link href="css/result.css"  type="text/css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Result</title>
</head>

<body>
<div class="header">
	<h1 class="title">Stock Quote Monitor</h1>
	<hr>

	<b> Refreshed in </b> <font id="countdownTimer"></font>

</div>
<br>

<!-- Content -->
<div class="content">
<jsp:useBean id="sampleStockQuoteWSPortTypeProxyid" scope="session" class="StockQuoteService.StockQuoteWSPortTypeProxy" />
<%
/*
* @author: rdalf2@student.monash.edu
* Created 20 April 2018
*/
try{
	boolean gotMethod = true;
		//Symbols, 
        String[] symbols = {"CBA", "NAB","BHP","CLH","BPT","STO","ORA","S32","FMG","HOG"};
		
     	// Create table
        String tableStocks = "<table width='100%'> <thead> <tr> <th> Symbols </th> <th>Last Trade</th> <th>Date</th> <th>Time</th> </tr></thead><tbody>";
        String conReturn = "";
        for(String stock: symbols){
        	// Initialize symbols in java language string
        	java.lang.String symbol_1idTemp = null;
        	
        	// fill temporary symbol_1id.
        	  if(!stock.equals("")){
               	symbol_1idTemp  = stock; 
              } 
        	// Call the function to getQuote. 
        	java.lang.String[] getQuote15mtemp = sampleStockQuoteWSPortTypeProxyid.getQuote(symbol_1idTemp); // Get the Quote 1
 		
        	
        	// build row per symbols
	        if(getQuote15mtemp != null) {
	        	conReturn += "<tr>";
	        	java.util.List ListReturn = java.util.Arrays.asList(getQuote15mtemp);
	        	conReturn += "<td>" + ListReturn.get(0).toString() + "</td>";
	        	conReturn += "<td> " + ListReturn.get(1).toString() + "</td>";
	        	conReturn += "<td> " + ListReturn.get(2).toString() + "</td>";
	        	conReturn += "<td> " + ListReturn.get(3).toString() + "</td>";
	    
	        	conReturn += "</tr>";
	        }
        //Print it in raw HTML using JSP tag, It can be rearranged into neat details using CSS or etc.
        }
        
        //end of table
        tableStocks += conReturn + "</tbody></table>";
        
        %>
        	<%=tableStocks%>
        <%
        
     
//Catch an error from web service
	} catch (Exception e) { 
	
%>
	Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
	Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
	return;
}
%>
</div>
<footer>By BobTheBuilder Team</footer>
</body>
<script src="js/result.js" type="text/javascript"></script>
	

</html>