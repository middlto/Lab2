<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome to BookDB</title>
  </head>
  <body style="background: url('image/1.png') no-repeat">
  <center>
    <form id="search" action="search" method="post">
      <table>
        <tr>
          <td><label>作者姓名:</label></td>
          <td><input type="text" name="name"/></td>
          <td><input type="submit" value="搜索"/></td>
        </tr>
      </table>
    </form>
      <input type="button" onclick="location.href='allBook'" value="全部图书" />
      <input type="button" onclick="location.href='allAuthor'" value="全部作者"/>
      <input type="button" onclick="location.href='add.jsp'" value="添加图书" />
  </center>
  </body>
</html>
