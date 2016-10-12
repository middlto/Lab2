<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:Add Book</title>
</head>
<body>
<style type="text/css">
    body{
        background-image: url('image/7.jpg');
        background-size: 60%;
        background-position: bottom;
        background-repeat: no-repeat;
    }
</style>
<center>
    <s:form action="add" method="POST">
        <s:textfield name="ISBN" label="ISBN"/>
        <s:textfield name="title" label="书名"/>
        <s:textfield name="publisher" label="出版社"/>
        <s:textfield name="publishData" label="出版日期"/>
        <s:textfield name="price" label="价格"/>
        <s:textfield name="name" label="作者姓名"/>
        <s:textfield name="age" label="作者年龄"/>
        <s:textfield name="country" label="作者国籍"/>
        <s:submit value="添加"/>
    </s:form>
    <a href="index.jsp">返回</a>
</center>
</body>
</html>
