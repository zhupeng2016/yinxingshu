<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript">
	
</script>

</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-系统管理》部门管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none"
				href="dept/pupdate?deptId=${db.deptId}">【修改】</a> <c:if
					test="${db.parentDept==0 }">
					<%-- <a style="text-decoration: none" href="dept/addChildDept">【添加子部门】</a> --%>
				</c:if> <a style="text-decoration: none" target="_parent"
				href="dept/delete?deptId=${db.deptId}">【删除】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="./admin.php?c=goods&a=add" method="post"
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">部门编码：</td>
					<td>${db.deptCode }</td>
				</tr>
				<tr>
					<td>部门简称：</td>
					<td>${db.deptShortName }</td>
				</tr>
				<tr>
					<td>部门全称：</td>
					<td>${db.deptName }</td>
				</tr>
				<tr>
					<td>上级部门：</td>
					<td>
					<c:forEach items="${deptlist }" var="dbs">
					<c:if test="${dbs.deptId==db.parentDept }">${dbs.deptName }</c:if>
					</c:forEach>
					<%-- <select name="parentDept">
							<c:forEach items="${deptlist }" var="dbs">
								<option value="${dbs.deptId }"
									<c:if test="${dbs.deptId==db.parentDept }">selected="selected"</c:if>>${dbs.deptName }</option>
							</c:forEach>
					</select> --%>
					</td>
				</tr>
				<tr>
					<td>地址：</td>
					<td>${db.deptAddress }</td>
				</tr>
				<tr>
					<td>简介：</td>
					<td>${db.deptIntro }</td>
				</tr>

				<tr>
					<td>备注：</td>
					<td>${db.deptRemark }</td>
				</tr>

				<tr>
					<td>是否启用：</td>
					<td><c:if test="${db.deptState==0 }">
					启用					
				    </c:if> <c:if test="${db.deptState==1 }">
					禁用					
				    </c:if></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>