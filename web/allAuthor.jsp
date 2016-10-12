<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:All Author</title>
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
            <td><center>编号</center></td>
            <td><center>姓名</center></td>
            <td><center>年龄</center></td>
            <td><center>国籍</center></td>
        </tr>
        <s:iterator value="authorList" status="st">
            <tr>
                <td><center><s:property value="authorID"/></center></td>
                <td><center><s:property value="name"/></center></td>
                <td ><center><s:property value="age"/></center></td>
                <td><center><s:property value="country"/></center></td>
            </tr>
        </s:iterator>
    </table>
    <a href="index.jsp">返回</a>
</center>
</body>
</html>
