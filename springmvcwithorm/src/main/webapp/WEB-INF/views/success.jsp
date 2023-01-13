<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page isELIgnored="false" %> <!--  active karne ke leye expression lanquage ko -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background>
<h1 style="color:brown" >THIS IS SUCCESS PAGE</h1>
<h1 style="color:orange">${msg}</h1>
<hr>
<h1 style="color:red">welcome ${User.userName}</h1>
<h2 style="color:green">Apki Email-> ${User.userEmail}</h2>
<h3 style="color:black">Apka Password-> ${User.userPassword}</h3>
<hr>
</body>
</html>