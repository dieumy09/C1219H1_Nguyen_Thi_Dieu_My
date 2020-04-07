<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 07/04/2020
  Time: 3:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        ${requestScope["message"]}
    </c:if>
</p>
<p>
    <a href="/product" > Back to list product </a>
</p>
<form method="post" action="/product?action=create">
    <table>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description"></td>
        </tr>
        <tr>
            <th>Producer</th>
            <td><input type="text" name="producer"></td>
        </tr>
        <td></td>
        <td><input type="submit" value="Create New Product"></td>
    </table>
</form>
</body>
</html>
