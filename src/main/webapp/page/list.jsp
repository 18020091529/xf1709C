<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/css.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="/list.do" method="post">
	编号<input type="text" name="id"><br>
	编号<input type="text" name="ver"><br>
	编号<input type="text" name="ms"><br>
	编号<input type="text" name="cname"><br>
	编号<input type="text" name="cp"><br>
	编号<input type="text" name="home"><br>
	编号<input type="text" name="tz"><br>
	编号<input type="text" name="cr"><br>
	编号<input type="text" name="nj"><br>
	<input type="submit" value="百度一下">
</form>
	<table>
  <tr>
    <th>编号</th>
    <th>关键字</th>
    <th>描述</th>
    <th>公司名称</th>
    <th>主营产品</th>
    <th>地址</th>
    <th>注册资本</th>
    <th>成立时间</th>
    <th>年检日期</th>
    <th>年检状态</th>
    <th>备注</th>
  </tr>
  <c:forEach var="s" items="${plist.list }">
  <tr>
    <td>${s.id }</td>
    <td>${s.ver }</td>
    <td>${s.ms }</td>
    <td>${s.cname }</td>
    <td>${s.cp }</td>
    <td>${s.home }</td>
    <td>${s.tz }</td>
    <td>${s.cr }</td>
    <td>${s.nj }</td>
    <td>${s.tb }</td>
    <td>${s.bz }</td>
  </tr>
  </c:forEach>
  <tr>
  <td colspan="11">
  <a href="list.do?pageNum=1">首页</a>
  <a href="list.do?pageNum=${plist.prePage}">上一页</a>
  <a href="list.do?pageNum=${plist.nextPage}">下一页</a>
  <a href="list.do?pageNum=${plist.pages}">未页</a>
  </td>
  </tr>
</table>

</body>
</html>