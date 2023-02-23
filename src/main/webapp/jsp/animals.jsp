<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Animals</title>
    <link href="../css/style.css" rel="stylesheet">
</head>
<body>
<div class="table-container">
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Weight</th>
            <th colspan=2>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.animals}" var="animal" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${animal.name}</td>
                <td>${animal.weight}</td>
                <td>
                    <form action="animals" method="get">
                        <input type="hidden" name="command" value="update">
                        <input type="hidden" name="id" value=${animal.id}>
                        <button class="button" type="submit" value="edit">EDIT</button>
                    </form>
                </td>
                <td>
                    <form action="animals" method="post">
                        <input type="hidden" name="command" value="delete">
                        <input type="hidden" name="id" value=${animal.id}>
                        <button class="button" type="submit" value="delete">DELETE</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <form action="animals" method="get">
        <button class="btn" type="submit" name="command" value="create">CREATE ANIMAL</button>
    </form>

</div>
</body>
</html>