<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	<tr><td colspan="3" align="center">回复信息列表</td></tr>
	<tr><td colspan="3" align="right">
		<a href="${pageContext.request.contextPath}/replyAdd.html">添加回复</a>
		<a href="${pageContext.request.contextPath}/list.html">返回帖子列表</a>
		<input type="hidden" name="currentPage" id="currentPage"/>
	</td>
	</tr>
	<tr><td>回复内容</td><td>回复昵称</td><td>发布时间</td></tr>
	<c:forEach items="${list}" var="replyDetail" varStatus="status">
		<tr>
			<td>${replyDetail.content}</td>
			<td>${replyDetail.author}</td>
			<td>${invitation.createdate}</td>
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