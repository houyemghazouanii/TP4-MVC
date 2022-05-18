<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client</title>
</head>
<body>
<jsp:useBean id="client" class="beans.ClientBean" scope="session"></jsp:useBean>
<h3> Client est crée avec succées </h3>
Nom :<jsp:getProperty property="nom" name="client"/><br>
Prenom :<jsp:getProperty property="prenom" name="client"/><br>
Adresse :<jsp:getProperty property="adresse" name="client"/><br>
Telephone :<jsp:getProperty property="num" name="client"/><br>
Email :<jsp:getProperty property="email" name="client"/>
 
 


</body>
</html>