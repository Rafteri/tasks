<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Привет!</title>
    <style>
        <%@include file="resources/css/hello.css" %>
    </style>
    <script>
        <%@include file="resources/js/hello.js" %>
    </script>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td align="center" class="hello">
            <% String name = request.getParameter("name");
                name = name == null || name.length() == 0 ? "стесняшка" : name.trim();%>
            Привет, <span id="name"><%= name %></span>!
        </td>
    </tr>
</table>
</body>
</html>