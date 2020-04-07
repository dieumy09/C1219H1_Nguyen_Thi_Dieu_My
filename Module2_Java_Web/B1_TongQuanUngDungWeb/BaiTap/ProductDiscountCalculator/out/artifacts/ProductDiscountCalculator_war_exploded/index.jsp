<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 03/04/2020
  Time: 10:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div id="content">
    <h1>Product Discount Calculator</h1>
    <form action="result.jsp" method="post">
      <div id="data">
        <label>Product Description</label>
        <input type="text" name="description">
        <br>
        <label>Price</label>
        <input type="text" name="price">
        <br>
        <label>Discount Percent</label>
        <input type="text" name="discount">
      </div>
      <div>
        <br>
        <input type="submit" value="Discount Product">
      </div>
    </form>

  </div>
  </body>
</html>
