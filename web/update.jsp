<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:Edit Book</title>
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
    <s:form action="update" method="POST">
        <s:hidden name="ISBN" value="%{book.ISBN}"/>
        <s:property value="book.title"/>
        <s:textfield name="publisher" label="出版社" value="%{book.publisher}"/>
        <s:textfield name="publishData" label="出版日期" value="%{book.publishData}"/>
        <s:textfield name="price" label="价格" value="%{book.price}"/>
        <s:textfield name="name" label="作者姓名" value="%{author.name}"/>
        <s:textfield name="age" label="作者年龄" value="%{author.age}"/>
        <s:textfield name="country" label="作者国籍" value="%{author.country}"/>
        <s:submit value="提交"/>
    </s:form>
    <s:a href="search.action?name=%{author.name}">返回</s:a>
</center>
</body>
</html>
