<%@ page contentType="application/json;charset=UTF-8" language="java" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="com.fsep.DAO.NameDao" %>
<%  String name = request.getParameter("name");
    JSONObject json = new JSONObject();
    json.accumulate("is-exists", NameDao.isExistsName(name));
%>
<%=json.toString()%>
