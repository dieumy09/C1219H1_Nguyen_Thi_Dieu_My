<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 08/04/2020
  Time: 8:00 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>PRODUCT</h1>
<p>
    <a href="product?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Producer</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/product?action=update&id=${product.getId()}">Update</a> </td>
            <td><a href="/product?action=delete&id=${product.getId()}">Delete</a> </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
