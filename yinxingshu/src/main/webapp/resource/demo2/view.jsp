<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC >
<html>
<base href="<%=basePath%>">
<title>薪酬标准管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》薪酬标准管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="user/userlist?pageNum=${pageNum}">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="./admin.php?c=goods&a=add" method="post"
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号：</td>
					<td>${ub.userCode }</td>
				</tr>
				<tr>
					<td width="120px;">登录账号：</td>
					<td>${ub.loginName }</td>
				</tr>
				<tr>
					<td>用户姓名：</td>
					<td>${ub.userName }</td>
				</tr>
			<!-- 	<tr>
					<td>密码：</td>
					<td>......</td>
				</tr> -->
				<tr>
					<td>用户角色：</td>
					<td>${ub.rb.roleName }</td>
				</tr>
				<tr>
					<td>所属部门：</td>
					<td>${ub.db.deptShortName }</td>
				</tr>
				<tr>
					<td>身份证：</td>
					<td>${ub.idCard }</td>
				</tr>
				<tr>
					<td>联系电话：</td>
					<td>${ub.mobilePhone }</td>
				</tr>


				<tr>
					<td>邮箱：</td>
					<td>${ub.userEmail }</td>
				</tr>

				<tr>
					<td>联系地址：</td>
					<td>${ub.address }</td>
				</tr>



			</table>
		</form>
	</div>
</body>
</html>