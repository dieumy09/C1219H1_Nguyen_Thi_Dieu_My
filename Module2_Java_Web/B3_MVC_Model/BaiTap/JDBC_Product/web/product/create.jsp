<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 08/04/2020
  Time: 8:14 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description"></td>
            </tr>
            <tr>
                <td>Producer:</td>
                <td><input type="text" name="producer"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create New Product"></td>
                <td></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
