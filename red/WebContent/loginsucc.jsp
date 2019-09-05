<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/regions.css">
<sql:query dataSource="jdbc/hr" var="regions">select * from regions</sql:query>
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