<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body>
   <jsp:useBean id="auth" class="beans.AuthentificationBean" scope="session"></jsp:useBean>
   <%if (request.getParameter("nom").equals("")){ %>
	     <h3> Bienvenue a votre session <br></h3>
	      <h4> Nom :<jsp:getProperty property="nom" name="auth"/><br>
	      Prenom :<jsp:getProperty property="prenom" name="auth"/></h4>
	      
   <%} else{ %> 
   <h3> Bienvenue a votre session <br> </h3>
    <h4> nom  : <%= request.getParameter("nom")%><br>
     prenom  : <%= request.getParameter("prenom")%></h4>
     <% } %>
      


</body>
</html>