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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link href="css/mine.css" type="text/css" rel="stylesheet">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#bt").click(function(){
		var is=confirm("确定添加吗？");
		if(is){
			$("#myForm").submit();
		}
		
	});
});

</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》资源管理》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="user/userlist?pageNum=1">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="user/add" method="post" id="myForm" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userCode" readonly id="usercode"
						value="${nextcode }" /></td>
				</tr>
				<tr>
					<td>登录账号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="loginName"
						value="" id="loginname" /></td>
				</tr>
				<tr>
					<td>密码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="password"
						value="" /></td>
				</tr>
				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId">
							<c:forEach items="${dls }" var="db">
								<option	value="${db.deptId }">${db.deptName }</option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td>所属职位<span style="color: red">*</span>：
					</td>
					<td><select name="roleId">
							<c:forEach items="${rls }" var="rb">
								<option	value="${rb.roleId }">${rb.roleName }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>用户姓名<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userName" id="username" 
						value="" /></td>
				</tr>
				
				<tr>
					<td>性别<span style="color: red">*</span>：
					</td>
					<td><input type="radio" name="sex" checked="checked"  
						value="0" />男&nbsp;&nbsp;
						<input type="radio" name="sex"
						value="1" />女</td>
				</tr>
				<tr>
					<td>身份证号<span style="color: red">*</span>：
					</td>
					<td><input type="text" maxlength=18 name="idCard" id="idcard"
						value="" /></td>
				</tr>
			<tr>
					<td>座机号<span style="color: red"></span>：
					</td>
					<td><input type="text" maxlength=10 name="phone" id="phone"
						value="" /></td>
				</tr>
				<tr>
					<td>手机号<span style="color: red">*</span>：
					</td>
					<td><input type="text" maxlength=11 name="mobilePhone" id="mobilephone"
						value="" /></td>
				</tr>
				<tr>
					<td>邮箱<span style="color: red">*</span>：
					</td>
					<td><input type="text"  name="userEmail" id="useremail"
						value="" /></td>
				</tr>
				<tr>
					<td>地址：
					</td>
					<td><input type="text" name="address" id="address"
						value="" /></td>
				</tr>
				<tr>
					<td>图片：
					</td>
					<td><input type="image"  name="userImg" id="userimg"
						 /></td>
				</tr>
				<tr>
					<td>添加时间：
					</td>
					<td><input type="text"  name="userTime" id="usertime" onclick="WdatePicker()"
						value="" /></td>
				</tr>
				<tr>
					<td>备注：
					</td>
					<td><input type="text"  name="userRemark" id="userremark"
						value="" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" id="bt" value="添加">
						<input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>