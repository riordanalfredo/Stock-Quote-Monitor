<HTML>
    <HEAD>
        <TITLE>Using Multiple Forms</TITLE>
    </HEAD>

    <BODY>
        <H1>Using Multiple Forms</H1>
        <% 
            if(request.getParameter("buttonName") != null) {
        %>
            You clicked 
            <%= request.getParameter("buttonName") %>
        <%
            }
        %>

        <FORM NAME="form1" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName" VALUE="button 1">
            <INPUT TYPE="SUBMIT" VALUE="Button 1">
        </FORM>

        <FORM NAME="form2" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName" VALUE="button 2">
            <INPUT TYPE="SUBMIT" VALUE="Button 2">
        </FORM>

        <FORM NAME="form3" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName" VALUE="button 3">
            <INPUT TYPE="SUBMIT" VALUE="Button 3">
        </FORM>
    </BODY>
</HTML>