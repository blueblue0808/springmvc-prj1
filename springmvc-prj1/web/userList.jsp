<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/11/16
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>用户列表</title>
</head>
<body>
<h1>用户列表</h1>
<a href="<c:url value="/user/input"/>">继续添加</a>
<table>
    <tr>
        <th>用户名</th>
        <th>兴趣爱好</th>
        <th>朋友</th>
        <th>职业</th>
        <th>户籍</th>
        <th>个人描述</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>
                <c:forEach items="${user.hobby}" var="hobby">
                    ${hobby}&nbsp;
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${user.friends}" var="friend">
                    ${friend}&nbsp;
                </c:forEach>
            </td>
            <td>${user.carrer}</td>
            <td>${user.houseRegister}</td>
            <td>${user.remark}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
