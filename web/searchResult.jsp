<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookDB:Search Result</title>
</head>
<body>
<style type="text/css">
    body {
        background-image: url('image/2.jpg');
        background-repeat: no-repeat;
        background-size: contain;
    }
</style>
<center>
    <table>
        <s:iterator id="iter" value="searchList">
            <tr>
                <td><s:property value="title"/></td>
                <td>&nbsp<input type="button" onclick="location.href='detail?ISBN=${ISBN}'" value="详情"/></td>
                <td>&nbsp<input type="button" onclick="location.href='edit?ISBN=${ISBN}'" value="编辑"/></td>
                <td>&nbsp<input type="button" onclick="location.href='delete?ISBN=${ISBN}'" value="删除"/></td>
            </tr>
        </s:iterator>
    </table>
    <a href="index.jsp">返回</a>
</center>
</body>
</html>
