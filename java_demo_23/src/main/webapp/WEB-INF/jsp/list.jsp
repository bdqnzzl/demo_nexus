<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
    <script src="statics/js/jquery-1.8.3.min.js" type="text/javascript"></script>
</head>
<script>
    $(function () {
        $("#second").html("<option value=\"\">请选择</option>");
        $("#third").html("<option value=\"\">请选择</option>");
    })
    function fn1(obj){
        var firstId = $(obj).val();
        if(firstId!=""){
           $.ajax({
               url: "get_second",
               type:"get",
               dataType: "json",
               data: {firstId:firstId},
               success: function (result) {
                   var str_html = "  <option value=\"\">请选择</option>";
                   for (var i = 0; i <result.length ; i++) {
                       str_html+="<option value='"+result[i].id+"'>"+result[i].categoryName+"</option>";
                   }
                   $("#second").html(str_html);
               }
           });
        }
        $("#second").html("<option value=\"\">请选择</option>");
        $("#third").html("<option value=\"\">请选择</option>");
    }

    function fn2(obj){
        var secondId = $(obj).val();
        if(secondId!=""){
            $.ajax({
                url: "get_third",
                type:"get",
                dataType: "json",
                data: {secondId:secondId},
                success: function (result) {
                    var str_html = "  <option value=\"\">请选择</option>";
                    for (var i = 0; i <result.length ; i++) {
                        str_html+="<option value='"+result[i].id+"'>"+result[i].categoryName+"</option>";
                    }
                    $("#third").html(str_html);
                }
            });
        }
    }
</script>
<body>
    一级菜单
    <select name="first" id="first" onchange="fn1(this);">
        <option value="">请选择</option>
        <c:forEach items="${list_first}" var="list">
            <option value="${list.id}">${list.categoryName}</option>
        </c:forEach>
    </select>
    <br/>
    二级菜单
    <select name="second" id="second" onchange="fn2(this);">
    </select>
    <br/>
    三级菜单
    <select name="third" id="third">
    </select>
</body>
</html>
