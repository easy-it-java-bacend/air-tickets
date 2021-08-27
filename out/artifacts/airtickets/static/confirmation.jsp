<%--
  Created by IntelliJ IDEA.
  User: Nodir
  Date: 8/27/2021
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation page</title>
</head>
<body>
    <h3>Please, check your info</h3>
    <hr>
    Email: ${param.email}
    <br>
    Password: ${param.password}

    <form action="main">
        <input type="Submit" value="Submit">
    </form>
</body>
</html>
