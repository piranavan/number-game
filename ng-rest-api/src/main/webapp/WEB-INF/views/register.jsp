<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <form:form modelAttribute="player" method="POST" enctype="utf8">
        <tr>
            <td><label>First Name:</label></td> <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><label>Last Name:</label></td> <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td><label>Password:</label></td> <td><form:input path="password"/></td>
        </tr>
        <button type="submit">Register</button>
    </form:form>
</body>
</html>