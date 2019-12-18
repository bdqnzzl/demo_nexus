<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
    <script src="statics/js/jquery-1.8.3.min.js" type="text/javascript"></script>
</head>
<script>
    function fn1(obj) {
        $(obj.parentElement).find(".menu_son").toggle();
    }
</script>
<body>
    <c:if test="${empty list_menu}">
        暂无菜单<br/>
    </c:if>
    <c:if test="${! empty list_menu}">
        <c:forEach items="${list_menu}" var="menu" varStatus="status">
            <c:if test="${menu.parentId==''}">
                <div>
                    <a href="#" onclick="fn1(this);">${menu.menuId}:${menu.menuName}</a><br/>
                    <span class="menu_son" style="display: none;">
                    <c:forEach items="${list_menu}" var="menu_son">
                        <c:if test="${menu_son.parentId==menu.menuId}">
                            ${menu_son.menuName}<br/>
                        </c:if>
                    </c:forEach>
                    </span>
                </div>
            </c:if>
        </c:forEach>
    </c:if>
</body>
</html>
