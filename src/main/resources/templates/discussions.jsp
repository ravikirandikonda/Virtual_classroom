<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Discussions</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>Discussions</h1>
    <ul>
        <c:forEach var="discussion" items="${discussions}">
            <li>
                <p>${discussion.content}</p>
                <ul>
                    <c:forEach var="reply" items="${discussion.replies}">
                        <li>${reply.content}</li>
                    </c:forEach>
                </ul>
            </li>
        </c:forEach>
    </ul>
    <a href="/classes">Back to Classes</a>
</body>
</html>
