<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Add owner</title>
    <jsp:include page="navigation.jsp"/>
    <jsp:include page="headers.jsp"/>
</head>
<body>
<div class="container">

    <form>
        <div>
            <label>First name:</label>
            <input type="text">
        </div>
        <div>
            <label>Last name:</label>
            <input type="text">
        </div>
        <div>
            <label>Date of birth:</label>
            <input type="date">
        </div>

        <button type="submit">Save</button>
        <button type="reset">Reset</button>
    </form>

</div>
</body>
<footer>
    <jsp:include page="footers.jsp"/>
</footer>
</html>
