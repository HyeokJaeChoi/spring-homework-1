<%--
  Created by IntelliJ IDEA.
  User: 최혁재
  Date: 2020-09-27
  Time: 오전 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Success</title>
</head>

<body>
<h1>You registered successfully.</h1>
<p>
<ul>
    <li>Id: ${customer.id}</li>
    <li>password : ${customer.password}</li>
    <li>gender : ${customer.gender}</li>
    <li>name : ${customer.name}</li>
    <li>email : ${customer.email}</li>
</ul>
</p>

<p>
    <a href="/"> go to home page </a>
</p>
</body>
</html>