<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 07/04/2020
  Time: 4:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post" action="/product?action=findById">
    ID:
    <input type="text" name="id">
    <input type="submit" value="Result">
</form>
</body>
</html>
