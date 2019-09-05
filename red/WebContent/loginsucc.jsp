<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>HR Regions</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${users}">
            <tr>
                <td>${cur.email}</td>
                <td>${cur.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>