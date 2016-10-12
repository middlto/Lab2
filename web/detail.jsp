<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>BookDB:Detail Message</title>
</head>
<body>
<style type="text/css">
    body{
        background-image: url('image/2.jpg');
        background-repeat: no-repeat;
        background-size: contain;
    }
</style>
<center>
    <table>
        <tr><center><font size="5">作者</font></center></tr>
        <tr><td><center>编号</center></td><td>&nbsp</td><td><s:property value="author.authorID"/></td></tr>
        <tr><td><center>姓名</center></td><td>&nbsp</td><td><s:property value="author.name"/></td></tr>
        <tr><td><center>年龄</center></td><td>&nbsp</td><td><s:property value="author.age"/></td></tr>
        <tr><td><center>国籍</center></td><td>&nbsp</td><td><s:property value="author.country"/></td></tr>
    </table><br><br><br>
    <tr><center><font size="5">图书</font></center></tr>
    <table>
        <tr><td><center>ISBN</center></td><td>&nbsp</td><td><s:property value="book.ISBN"/></td></tr>
        <tr><td><center>书名</center></td><td>&nbsp</td><td><s:property value="book.title"/></td></tr>
        <tr><td><center>作者编号</center></td><td>&nbsp</td><td><s:property value="book.authorID"/></td></tr>
        <tr><td><center>出版社</center></td><td>&nbsp</td><td><s:property value="book.publisher"/></td></tr>
        <tr><td><center>出版日期</center></td><td>&nbsp</td><td><s:property value="book.publishData"/></td></tr>
        <tr><td><center>价格</center></td><td>&nbsp</td><td><s:property value="book.price"/></td></tr>
    </table><br><br><br><br>
    <s:a href="search.action?name=%{author.name}">返回</s:a>
</center>
</body>
</html>
