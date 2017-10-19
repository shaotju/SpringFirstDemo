
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <style>
        a{
            display: block;
        }
    </style>
    <script type="text/javascript" src="<%=basePath%>js/jQuery/jquery-2.0.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#testJson").click(function (e) {
                $.post("<%=basePath%>user/userJson.action",{name:"张三丰",age:150}, function (data) {
                    $("#age").val(data.age);
                    $("#name").val(data.name);
                },
                "json");
                e.preventDefault();
            });
            $("#testJsonList").click(function (e) {
                $.post("<%=basePath%>user/userJsonList.action",{name:"张三丰",age:150}, function (data) {
                            $("#age").val(data.age);
                            $("#name").val(data.name);
                        },
                        "json");
                e.preventDefault();
            });
            $("#testJsonMap").click(function (e) {
                $.post("<%=basePath%>user/userJsonMap.action",{name:"张三丰",age:150}, function (data) {
                            $("#age").val(data.age);
                            $("#name").val(data.name);
                        },
                        "json");
                e.preventDefault();
            });
            $("#testJsonObject").click(function (e) {
                $.post("<%=basePath%>user/userJsonObject.action",{name:"张三丰",age:150}, function (data) {
                            $("#age").val(data.age);
                            $("#name").val(data.name);
                        },
                        "json");
                e.preventDefault();
            });
        })
    </script>
</head>
<body>
<h2>Hello World!</h2>
<a href="<%=basePath%>user/userTest.action">测试</a>
<a href="#" id="testJson">测试JSON</a>
<a href="#" id="testJsonList">测试UserList</a>
<a href="#" id="testJsonMap">测试UserMap</a>
<a href="#" id="testJsonObject">测试JSONObject</a>
</body>
</html>
