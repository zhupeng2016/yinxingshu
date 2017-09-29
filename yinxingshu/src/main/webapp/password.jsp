<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC >

<html>
<base href="<%=basePath%>">
<head>
<title>个人信息</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<style type="text/css">
.c1 {
	color: red;
	font-size: 10px
}
</style>
<script type="text/javascript">
	$(function() {
		result = $("#myForm").validate({
			rules : {
				"ps" : {
					required : true,
					equalTo : "#ppp"
				},
				"ps1" : {
					required : true,
					maxlength : 20,
					minlength : 8
				},
				"password" : {
					required : true,
					equalTo : "#ps1"
				},
			}, //验证规则
			messages : {
				"ps" : {
					required : "请输入原密码",
					equalTo : "请输入正确密码!"
				},
				"ps1" : {
					required : "请输入新密码!",
					maxlength : "请输入8-20位密码!",
					minlength : "请输入8-20位密码!"
				},
				"password" : {
					required : "请确认密码!",
					equalTo : "两次密码输入不一致!"
				},
			}, //提示信息
			errorPlacement : function(error, element) { //提示信息的位置
				element.next().html(error.text());

			},
			success : function(label) {
				label.html();
			}
		});
	});
</script>
<script type="text/javascript">
	$(function() {
		$("#bt").click(function() {
			var is = confirm("是否修改?");
			if (is) {
				$("#myForm").submit();
			}
		});
	});
</script>
</head>
<body>
	<div class="div_head">
		<span> <span style="float: left">当前位置是：工作平台-》个人信息</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="right.jsp">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="password" method="post" enctype="multipart/form-data"
			id="myForm" target="_top">
			<input type="hidden" name="userId" value="${sessionScope.ub.userId}" />
			<input type="hidden" name="passowred" id="ppp" value="${sessionScope.ub.password}" />
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px">原密码：</td>
					<td><input type="password" name="ps" id="ps" value="" /> <span
						class="c1"></span></td>
				</tr>
				<tr>
					<td>新密码</td>
					<td><input type="password" name="ps1" id="ps1" value="" /> <span
						class="c1"></span></td>
				</tr>
				<tr>
					<td>密码确认：</td>
					<td><input type="password" name="password" id="ps2" value="" />
						<span class="c1"></span></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="button" id="bt"
						value="修改"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>