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

<title>菜单管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》菜单管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="menu/menulist?pageNum=${sessionScope.pageNum }">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="menu/update?menuId=${mb.menuId }" method="post"
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">菜单名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="menuName" value="${mb.menuName }" /></td>
				</tr>
				<tr>
					<td>上级菜单<span style="color: red">*</span>：
					</td>
					<td>
					<c:forEach items="${mls }" var="ml" >
					<c:if test="${mb.parentMenu==0 }">
					银杏树信息管理公司
					</c:if>
					<c:if test="${mb.parentMenu==ml.menuId }">
					${ml.menuName }
					</c:if>
					</c:forEach>
					
						<!-- 	<option >顶级菜单</option>
							<option>个人信息</option>
							<option>薪酬管理</option>
							<option>人事管理</option> -->
					</td>
				</tr>
				<tr>
					<td>URL<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="url" value="${mb.url }" /></td>
				</tr>

				<tr>
					<td>状态<span style="color: red">*</span>：
					</td>
					<td>
					<c:if test="${mb.menuState==0 }">启用</c:if>
					<c:if test="${mb.menuState==1 }">禁用</c:if>
					<%-- <select name="menuState">
							<option <c:if test="${mb.menuState==0 }">selected</c:if> value="0" >启用</option>
							<option <c:if test="${mb.menuState==1 }">selected</c:if> value="1" >禁用</option>
					</select> --%>
					</td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><input type="text"  name="menuRemark" value="${mb.menuRemark }" />
					</td>
				</tr>




				<!-- <tr>
					<td colspan="2" align="center"><input type="submit" value="确认">
						<input type="reset" value="清空"></td>
				</tr> -->
			</table>
		</form>
	</div>
</body>
</html>