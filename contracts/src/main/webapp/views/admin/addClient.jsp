<%--
  Created by IntelliJ IDEA.
  User: oleg
  Date: 22.12.2015
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/admin/add" method="POST">
  <table width="600
  " border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="300">Имя</td>
    <td width="300"><input type="text" name="name"></td>
  </tr>
  <tr>
    <td>Фамилия</td>
    <td><input type="text" name="family"></td>
  </tr>
  <tr>
    <td>Дата рождения</td>
    <td><input type="text" name="berthdate"></td>
  </tr>
  <tr>
    <td>Паспортные данные</td>
    <td><input type="text" name="passport"></td>
  </tr>
  <tr>
    <td>Адрес</td>
    <td><input type="text" name="adress"></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input type="text" name="email"></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input type="text" name="password"></td>
  </tr>
</table>

  <input type="submit" value="Add" name="Submit">
</form>
</body>
</html>
