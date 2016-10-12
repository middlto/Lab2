<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:Add book</title>
</head>
<body>
<style type="text/css">
    body{
        background-image: url("image/9.jpg");
        background-repeat: no-repeat;
        background-size: contain;
        background-position: right;
    }
</style>
<center>
    图书信息添加成功!
    <br><br><br>
    <table>
        <tr><center><font size="5">作者</font></center></tr>
        <tr><td><center>编号</center></td><td>&nbsp</td><td><s:property value="authorID"/></td></tr>
        <tr><td><center>姓名</center></td><td>&nbsp</td><td><s:property value="name"/></td></tr>
        <tr><td><center>年龄</center></td><td>&nbsp</td><td><s:property value="age"/></td></tr>
        <tr><td><center>国籍</center></td><td>&nbsp</td><td><s:property value="country"/></td></tr>
    </table><br><br><br>
    <tr><center><font size="5">图书</font></center></tr>
    <table>
        <tr><td><center>ISBN</center></td><td>&nbsp</td><td><s:property value="ISBN"/></td></tr>
        <tr><td><center>书名</center></td><td>&nbsp</td><td><s:property value="title"/></td></tr>
        <tr><td><center>作者编号</center></td><td>&nbsp</td><td><s:property value="authorID"/></td></tr>
        <tr><td><center>出版社</center></td><td>&nbsp</td><td><s:property value="publisher"/></td></tr>
        <tr><td><center>出版日期</center></td><td>&nbsp</td><td><s:property value="publishData"/></td></tr>
        <tr><td><center>价格</center></td><td>&nbsp</td><td><s:property value="price"/></td></tr>
    </table><br><br><br><br>
    <a href="index.jsp">返回</a><br>
</center>
</body>
</html>
