<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 07/04/2020
  Time: 5:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<p>
    <a href="/product">Back to customer list</a>
</p>
<table>
    <c:if test='${requestScope["products"] == null }'>
        <p>Khong tim thay</p>
    </c:if>
    <c:forEach items='${requestScope["products"]}' var="product" >
        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${product.getDescription()}</td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td>${product.getProducer()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
