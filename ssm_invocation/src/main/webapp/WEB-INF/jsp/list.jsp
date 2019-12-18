<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function fn1(pagenum,totalPage){
		if(pagenum>totalPage){
			pagenum = totalPage;
		}else if(pagenum<=0){
			pagenum=1;
		}
		$("#currentPage").val(pagenum);
		$("form").submit();
	}
</script>
</head>
<body>
<form action="list">
<table border="1px solid">
	<tr><td colspan="5" align="center">帖子列表</td></tr>
	<tr><td colspan="5" align="center">帖子标题：
		<input name="title" value="${title}"/>
		<input type="submit" value="搜索"/>
		<input type="hidden" name="currentPage" id="currentPage"/>
		</td>
	</tr>
	<tr><td>标题</td><td>内容摘要</td><td>作者</td><td>发布时间</td><td>操作</td></tr>
	<c:forEach items="${list}" var="invitation" varStatus="status">
		<tr>
			<td>${invitation.title }</td>
			<td>${invitation.summary }</td>
			<td>${invitation.author }</td>
			<td><fmt:formatDate value="<%=new Date() %>" pattern="yyyy-MM-dd"/></td>
			<td>
				<a href="${pageContext.request.contextPath}/replyList.html">查看回复</a>
				<a href="${pageContext.request.contextPath}/delete.html">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
	第${currentPage}/${totelPage}页
	<a href="#" onclick="fn1(1,${totelPage});">首页</a>
	<a href="#" onclick="fn1(${currentPage-1},${totelPage});">上一页</a>
	<a href="#" onclick="fn1(${currentPage+1},${totelPage});">下一页</a>
	<a href="#" onclick="fn1(${totelPage},${totelPage});">末页</a>
</form>
</body>
</html>