<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/04/2020
  Time: 8:31 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Converter</title>
  </head>
  <body>
  <h2>CONVERTER</h2>
  <form action="/converter" onsubmit="return validateForm()">
    <label>Rate:</label></br>
    <input type="text" name="rate" placeholder="RATE" value="220000" id="rate"/><br>
    <label>USD:</label></br>
    <input type="text" name="usd" id="usd"/><br>
    <input type="submit" value="Result" >
  </form>
  <script>
    function validateForm(){
      let rate = document.getElementById("rate").value;
      let usd = document.getElementById("usd").value;
      if (rate == "" || usd ==""){
          return false;
      }
    }
  </script>
  </body>
</html>

