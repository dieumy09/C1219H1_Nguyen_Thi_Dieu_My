<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 03/04/2020
  Time: 10:49 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    String description = request.getParameter("description");
    float price = Float.parseFloat(request.getParameter("price"));
    int discount_percent = Integer.parseInt(request.getParameter("discount"));
    float discount = price * discount_percent;
    float total = price - discount;
%>
<h1>Product Description: <%= description%></h1>
<h1>Price: <%= price%></h1>
<h1>Discount Percent: <%= discount_percent%></h1>
<h1>Discount: <%= discount%></h1>
<h1>Total: <%= total%></h1>

</body>
</html>
