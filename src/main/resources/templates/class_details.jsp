<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class Details</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>${classRoom.name}</h1>
    <h2>Units</h2>
    <ul>
        <c:forEach var="unit" items="${classRoom.units}">
            <li>
                <a href="/units/${unit.id}">${unit.name}</a>
            </li>
        </c:forEach>
    </ul>
    <h2>Sessions</h2>
    <ul>
        <c:forEach var="session" items="${classRoom.sessions}">
            <li>
                <a href="/sessions/${session.id}">${session.name}</a>
            </li>
        </c:forEach>
    </ul>
    <a href="/class-list">Back to Class List</a>
</body>
</html>
