<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStockQuoteWSPortTypeProxyid" scope="session" class="StockQuoteService.StockQuoteWSPortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStockQuoteWSPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleStockQuoteWSPortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleStockQuoteWSPortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        StockQuoteService.StockQuoteWSPortType getStockQuoteWSPortType10mtemp = sampleStockQuoteWSPortTypeProxyid.getStockQuoteWSPortType();
if(getStockQuoteWSPortType10mtemp == null){
%>
<%=getStockQuoteWSPortType10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String symbol_1id=  request.getParameter("symbol18");
            java.lang.String symbol_1idTemp = null;
        if(!symbol_1id.equals("")){
         symbol_1idTemp  = symbol_1id;
        }
        java.lang.String[] getQuote15mtemp = sampleStockQuoteWSPortTypeProxyid.getQuote(symbol_1idTemp);
if(getQuote15mtemp == null){
%>
<%=getQuote15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getQuote15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getQuote15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 20:
        gotMethod = true;
        java.lang.String[] getFieldNames20mtemp = sampleStockQuoteWSPortTypeProxyid.getFieldNames();
if(getFieldNames20mtemp == null){
%>
<%=getFieldNames20mtemp %>
<%
}else{
        String tempreturnp21 = null;
        if(getFieldNames20mtemp != null){
        java.util.List listreturnp21= java.util.Arrays.asList(getFieldNames20mtemp);
        tempreturnp21 = listreturnp21.toString();
        }
        %>
        <%=tempreturnp21%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>