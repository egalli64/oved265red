<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Super Users</title>
</head>
<body>
    <table>
        <tr>
            <th>superusers_username</th>
            <th>superusers_password</th>
        </tr>
        <c:forEach var="superUsers" items="${superUsers}">
            <tr>
                <td>${superUsers.superUsername}</td>
                <td>${superUsers.superPassword}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>