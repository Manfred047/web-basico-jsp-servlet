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
    <style>
      table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
      }

      td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
      }

      tr:nth-child(even) {
        background-color: #dddddd;
      }
    </style>
  </head>
  <body>
  <div id="app">
    {{ message }}
    <br>
    <button @click="getData()">Obtener info</button>
    <br>
    {{ formMessage }}
    <form v-on:submit.prevent="store">
      Nombre:<br>
      <input type="text" name="name" v-model="form.name">
      <br>
      Apellidos:<br>
      <input type="text" name="lastName" v-model="form.lastName">
      <br>
      Edad:<br>
      <input type="number" name="age" v-model="form.age">
      <br><br>
      <button type="submit">A&ntilde;adir a tabla</button>
    </form>
    <table>
      <tr>
        <th>Nombre</th>
        <th>Apellidos</th>
        <th>Edad</th>
      </tr>
      <tr v-for="(user, index) in users" :key="index">
        <td>{{ user.name }}</td>
        <td>{{ user.lastName }}</td>
        <td>{{ user.age }}</td>
      </tr>
    </table>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/app.js"></script>
  </body>
</html>
