<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Customer.Customer" %>

<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 03/04/2020
  Time: 11:32 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>




<html>
  <head>
    <title>LIST CUSTOMER</title>
  </head>
  <body>
  <form method="get" action="customer">
    <h1 align="center">DANH SACH KHACH HANG</h1>
    <table align="center">
      <%
        ArrayList<Customer> list = (ArrayList<Customer>) request.getAttribute("list");
        if (list != null) {%>
          <tr>
        <th>Ten</th>
        <th>Ngay Sinh</th>
        <th>Dia Chi</th>
        <th>Anh</th>
      </tr> <%
          for (int i=0; i<list.size(); i++){%>
            <tr>
              <td>
                <%= list.get(i).getName()%>
              </td>
              <td>
                <%= list.get(i).getBirthday()%>
              </td>
              <td>
                <%= list.get(i).getAddress()%>
              </td>
              <td>
                <img src="<%= list.get(i).getImage()%>" style="width: 70px; height: 70px">
              </td>
            </tr>
        <% }
          } else {%>
      <button type="submit">SHOW</button>
      <%}%>
    </table>

  </form>
  </body>
</html>
