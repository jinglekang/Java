<%--
  Created by IntelliJ IDEA.
  User: JING
  Date: 2019/5/16
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>签到数据转换报表</title>
    <link rel="layui/css/layui.css">
</head>
<body>
<div>
    <h1>上传表单</h1>
    <form action="upload" enctype="multipart/form-data" method="post">
        <input id="file" type="file">
        <button onclick="updateFile()" type="submit">点击上传</button>
    </form>
</div>
<script>
    function updateFile() {
        var file = document.getElementById("file");
        console.log(file.value);
    }
</script>
</body>
</html>
