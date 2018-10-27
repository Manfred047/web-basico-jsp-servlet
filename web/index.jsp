<%--
  Created by IntelliJ IDEA.
  User: Manfred
  Date: 26/10/2018
  Time: 03:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>AJAX JSP Servelts</title>
  </head>
  <body>
  <div id="app">
    {{ message }}
    <button @click="getData()">Obtener info</button>
    <table cellspacing="1" bgcolor="#0099cc">
      <tr>
        <td rowspan="7" align="center" bgcolor="#f8f8f8"> NOMBRE </td>
        <td rowspan="7" align="center" bgcolor="#f8f8f8"> APELLIDO </td>
        <td rowspan="7" align="center" bgcolor="#f8f8f8"> EDAD </td>
      </tr>
      <tr v-for="(user, index) in users" :key="index">
        <td rowspan="7" align="center" bgcolor="#f8f8f8">{{ user.name }}</td>
        <td rowspan="7" align="center" bgcolor="#f8f8f8">{{ user.lastName }}</td>
        <td rowspan="7" align="center" bgcolor="#f8f8f8">{{ user.age }}</td>
      </tr>
    </table>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/app.js"></script>
  </body>
</html>
