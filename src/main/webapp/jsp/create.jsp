<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>New animal</title>
    <link href="../css/style.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h2>Add animal</h2>
    <form method="post" action="animals">
        <input type="hidden" name="command" value="create">
        <div class="user-boxes">
            <div class="user-box">
                <input id="nameInput" placeholder="Enter name" type="text" name="name">
            </div>
            <div class="user-box">
                <input id="weightInput" type="text" placeholder='Enter weight' name="weight">
            </div>
        </div>
        <button class="btn color" type="submit" name="command" value="create">CREATE ANIMAL</button>
        <a class="btn" href="${pageContext.request.contextPath}/index.jsp">CANCEL</a>
    </form>
</div>
</body>
</html>
