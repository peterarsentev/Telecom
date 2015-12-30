<%--
  Created by IntelliJ IDEA.
  User: oleg
  Date: 20.12.2015
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="/resources/dist/css/bootstrap.css" >
	<title>Insert title here</title>
</head>
<body>
<h1>Persons</h1>

<c:if test="${isAdmin}">
	<a href="<c:url value="/app/admin/add"/>">add the new client</a>
</c:if>

<table style="border: 1px solid; width: 500px; text-align:center">
	<thead style="background:#fcf">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th colspan="3"></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${clients}" var="clients">
		<c:url var="editUrl" value="/app/admin/showDetails?id=${clients.id}" />
		<c:url var="deleteUrl" value="/app/admin/delete?id=${clients.id}" />
		<tr>
			<td><c:out value="${clients.name}" /></td>
			<td><c:out value="${clients.family}" /></td>
			<td><c:out value="${clients.email}" /></td>
			<td><a href="${editUrl}">Show client</a></td>
			<td><a href="<c:url value="/admin/delete?id=${clients.id}"/>">Delete</a></td>
		</tr>
	</c:forEach>
	<td><a href="${addUrl}">Edit</a></td>
	</tbody>
</table>

</body>
</html>
