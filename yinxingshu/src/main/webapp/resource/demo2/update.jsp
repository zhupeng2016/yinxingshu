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
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">


  $(function(){
	  $("#bt").click(function(){
		  var is=confirm("确认修改吗？");
		  if(is){
			  
		  $("#myForm").submit();
		  }
	  });
  })
</script>
</head>

<body >

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》资源管理》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="user/userlist?pageNum=${pageNum}">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="user/update?userId=${user.userId }&pageNum=${pageNum}" id="myForm" method="post" enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">用户编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userCode" readonly value="${user.userCode }" /></td>
				</tr>
				<tr>
					<td>登录账号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="loginName"  value="${user.loginName }" />
					</td>
				</tr>

				<tr>
					<td>用户姓名<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userName" value="${user.userName }" /></td>
				</tr>
				<%-- <tr>
					<td>密码<span style="color: red">*</span>：
					</td>
					<td><input type="text" readonly name="f_goods_image"
						value="${user.userCode }" /></td>
				</tr> --%>
				<tr>
					<td>所属部门<span style="color: red" >*</span>：
					</td>
					<td>
					<select name="deptId">
					<c:forEach items="${dls }" var="db" >
					  <option  <c:if test="${db.deptId==user.deptId }">selected="selected"</c:if> value="${db.deptId }" >${db.deptName }</option>
					</c:forEach>
					</select></td>
				</tr>
				
				<tr>
					<td>所属职位<span style="color: red">*</span>：
					</td>
					<td>
					<select name="roleId">
					<c:forEach items="${rls }" var="rb" >
					
					  <option  <c:if test="${rb.roleId==user.roleId }">selected="selected"</c:if> value="${rb.roleId }">${rb.roleName }</option>
					</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td>身份证<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="idCard"
						value="${user.idCard }" /></td>
				</tr>

				<tr>
					<td>联系电话<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="mobilePhone"
						value="${user.mobilePhone }" /></td>
				</tr>

				<tr>
					<td>邮箱<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="userEmail"
						value="${user.userEmail }" /></td>
				</tr>

				<tr>
					<td>联系地址：</td>
					<td><input type="text" name="address" value="${user.address }" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input id="bt" type="button" value="确认">
						<input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>