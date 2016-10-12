<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:All Book</title>
</head>
<body>
<style type="text/css">
    body{
        background-image: url('image/6.jpg');
        background-repeat: no-repeat;
        background-size: contain;
        background-position: center;
    }
</style>
<center>
    <table>
        <tr>
            <td><center>ISBN</center></td>
            <td><center>书名</center></td>
            <td><center>作者编号</center></td>
            <td><center>出版社</center></td>
            <td><center>出版日期</center></td>
            <td><center>价格</center></td>
        </tr>
        <s:iterator value="bookList" status="st">
            <tr>
                <td><center><s:property value="ISBN"/></center></td>
                <td><center><s:property value="title"/></center></td>
                <td ><center><s:property value="authorID"/></center></td>
                <td><center><s:property value="publisher"/></center></td>
                <td><center><s:property value="publishData"/></center></td>
                <td><center><s:property value="price"/></center></td>
            </tr>
        </s:iterator>
    </table>
    <a href="index.jsp">返回</a>
</center>
</body>
</html>
