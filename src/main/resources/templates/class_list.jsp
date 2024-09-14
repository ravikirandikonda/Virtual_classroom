<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>Class List</h1>
    <ul>
        <c:forEach var="classRoom" items="${classes}">
            <li>
                <a href="/classes/${classRoom.id}">${classRoom.name}</a>
            </li>
        </c:forEach>
    </ul>
    <a href="/create-class">Create New Class</a>
</body>
</html>
