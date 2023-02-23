<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Index page</title>
</head>
<body>
<c:redirect url="animals">
    <c:param name="command" value="read" />
</c:redirect>
</body>
</html>