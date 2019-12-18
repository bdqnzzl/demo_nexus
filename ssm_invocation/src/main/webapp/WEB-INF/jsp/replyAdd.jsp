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
</script>
</head>
<body>
<form action="list">
	<table border="1px solid">
		<tr><td colspan="6 align="center">添加回复</td></tr>
		<tr><td colspan="6" align="center">
			回复内容：<input type="reset"/>
			回复昵称：<input type="text"/>
		</td>
		</tr>
		<tr><td colspan="6" align="center">
			<a href="${pageContext.request.contextPath}/addSave.html">提交</a>
			<a href="${pageContext.request.contextPath}/replyList.html">返回</a>
		</td>
		</tr>
	</table>
</form>
</body>
</html>