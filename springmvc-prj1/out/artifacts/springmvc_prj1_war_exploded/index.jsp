<%--
  Created by IntelliJ IDEA.
  User: 86135
  Date: 2023/11/14
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>JSON测试</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.0.0.min.js"></script>
    <script type="text/javascript">
      function testJson(){
        //获取输入的值username为id
        var pname=$("#username").val();
        var password=$("#password").val();
        var page=$("#page").val();
        $.ajax({
          //请求路径
          url:"${pageContext.request.contextPath }/testJson",
          //请求类型
          type:"post",
          //data表示发送的数据
          data:JSON.stringify({username:pname,password:password,page:page}),
          //定义发送请求的数据格式为JSON字符串
          contentType:"application/json;charset=utf-8",
          //定义回调相应的数据格式为JSON字符串，该属性可以省略
          dataType:"json",
          //成功响应的结果
          success:function (data){
            if(data!=null){
              alert("输入的用户名："+data.username+"，密码："+data.password+"，年龄："+data.page);
            }
          }
        });
      }
    </script>
  </head>
  <body>
  <form action="">
    用户名：<input type="text" name="username" id="username"/><br>
    密码：<input type="password" name="password" id="password"/><br>
    年龄：<input type="text" name="page" id="page"/><br>
    <input type="button" value="测试" onclick="testJson()"/>
  </form>
  </body>
</html>
