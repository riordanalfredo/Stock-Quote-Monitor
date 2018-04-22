<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="myList" value="CBA, NAB,BHP,CLH,BPT,STO,ORA,S32,FMG,HOG"/> <!-- Example of list -->


<HTML>
<HEAD>
<TITLE>Methods</TITLE>
<link href="css/index.css"  type="text/css" rel="stylesheet">
<link href="css/input.css"  type="text/css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</HEAD>
<BODY>
<H1 class="title-accent">Stock Inputs</H1>

<hr>
<div class="symbols">
 	
	<!-- here the code to ADD stocks -->
	<h3>Add Stock Symbols</h3>
	<FORM name="addStock" METHOD="POST" >
		<INPUT TYPE="TEXT" NAME="ADD" placeholder="e.g. CBA">
		<INPUT class='button' TYPE="SUBMIT" VALUE="Add" >
	</FORM>
	<hr>
	
	<!-- here the code to DELETE stocks -->
	<h3>Remove Stock</h3>
	<FORM NAME="removeStock" METHOD="POST" >
		<select id="dropdownDelete" name="stockDelete">
		    <c:forEach var="item" items="${myList}">
		        <option value="<c:out value='${item}' />">
		            <c:if test="${param.selectValue == item ? 'selected':''})"> Remove Stock </c:if>  
		            <c:out value="${item}" />
		        </option>
		    </c:forEach>
		</select> 
		<INPUT class='button' TYPE="SUBMIT" VALUE="Remove" >
	</FORM>
	
	<!-- Removing the stock notification -->
	You have removed: 
	<font style="color:red">
		<%= request.getParameter("stockDelete") %>
	</font>
	
	<hr>
</div>






<!-- <UL> <LI><A HREF="Input.jsp?method=2" TARGET="inputs"> getEndpoint()</A></LI> </UL> -->
</BODY>
<script>
/*To create neat list.
 *
 * <div class="container">
 <div class="row">
 <div class="col-md-4">
     <h3>Stocks List</h3>
     <div class="list-group">
         <a class="list-group-item clearfix" onclick="alert('Action1 -> Details');">
             CBA
             <span class="pull-right">
                 <span class="btn btn-xs btn-default" onclick="alert('Action1 -> Play'); event.stopPropagation();">
                     <span class="glyphicon  glyphicon-remove" aria-hidden="true"></span>
                 </span>
             </span>
         </a>
         <a class="list-group-item clearfix" onclick="alert('Action2 -> Details');">
             NAB
             <span class="pull-right">
                 <span class="btn btn-xs btn-default" onclick="alert('Action2 -> Play'); event.stopPropagation();">
                     <span class="glyphicon  glyphicon-remove" aria-hidden="true"></span>
                 </span>
             </span>
         </a>
     </div>
 </div>
</div>
</div>
 */


</script>


</HTML>