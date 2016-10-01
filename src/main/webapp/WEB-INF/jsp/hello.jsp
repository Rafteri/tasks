<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
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
            <% String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
                name = name == null || name.length() == 0 ? "стесняшка" : name.trim();%>
            Привет, <span id="name"><%= name %></span>!
        </td>
    </tr>
</table>
</body>
</html>