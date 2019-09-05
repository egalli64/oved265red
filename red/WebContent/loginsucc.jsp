<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Login success</title>
</head>
<body>
<h1>
Welcome <c:if test="${users != null }">Utente
</c:if>
<c:if test="${superUsers != null }">Amministratore
</c:if>
</h1>

    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${users}">
            <tr>
                <td>${cur.name}</td>
                <td>${cur.password}</td>
            </tr>
        </c:forEach>
        
                <c:forEach var="superUsers" items="${superUsers}">
            <tr>
                <td>${superUsers.superUsername}</td>
                <td>${superUsers.superPassword}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>