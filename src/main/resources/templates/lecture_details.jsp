<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lecture Details</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <h1>${lecture.title}</h1>
    <p>${lecture.content}</p>
    <h2>Discussions</h2>
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
    <form action="/lectures/${lecture.id}/discuss" method="post">
        <label for="discussion">Add Discussion:</label>
        <textarea id="discussion" name="content" required></textarea>
        <br>
        <button type="submit">Submit</button>
    </form>
    <a href="/classes/${lecture.classId}">Back to Class</a>
</body>
</html>
