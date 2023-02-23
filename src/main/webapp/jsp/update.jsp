<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Edit animal</title>
    <link href="../css/style.css" rel="stylesheet">
</head>

<body>

<div class="login-box">

    <h2>Edit animal</h2>
    <form action="animals" method="post">
        <input type="hidden" name="id" value=${id}>
        <div class="user-boxes">
            <div class="user-box">
                <input placeholder="Enter name" id="nameInput" type="text" name="name" value=${name}>
            </div>
            <div class="user-box">
                <input placeholder="Enter weight" id="weightInput" type="text" name="weight" value=${weight}>
            </div>
        </div>
        <button class="btn color" type="submit" name="command" value="update">UPDATE</button>
        <button class="btn" type="submit" name="command" value="read">CANCEL</button>
    </form>
</div>
</body>
</html>
