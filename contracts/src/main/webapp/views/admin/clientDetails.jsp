<%--
  Created by IntelliJ IDEA.
  User: oleg
  Date: 22.12.2015
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
  <title>Insert title here</title>
</head>
<table style="border: 1px solid; width: 500px; text-align:center">
    <thead style="background:#fcf">
    <tr>
        <th>Phone Number</th>
        <th>Traif</th>
        <th>ClientId</th>
        <th colspan="3"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${contracts}" var="contract">
        <tr>
            <td><c:out value="${contract.phoneNum}" /></td>
            <td><c:out value="${contract.tarifsByContractId.name}" /></td>
            <td><c:forEach items="${contract.connectionOptions}" var="option">
                <tr>
                   <c:out value="${option.name}" />
                </tr>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
    <td><a href="${addUrl}">Add</a></td>
    </tbody>
</table>
</body>
</html>
