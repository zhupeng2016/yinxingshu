<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html>
<base href="<%=basePath%>">
<head>
<title>职位管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》职位管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold">
			 <a style="text-decoration: none"  href="role/rolelist?pageNum=${sessionScope.pageNum }">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="rec/rolelist" method="post"
			enctype="multipart/form-data">
			<table border="1" width="100%"  class="table_a" >
				<tr>
					<td width="120px;">职位编码：</td>
					<td>${rb.roleCode }</td>
				</tr>
				<tr>
					<td>职位名称：</td>
					<td>${rb.roleName }</td>
				</tr>
				<tr>
					<td>职位分类：</td>
					<td>
					<c:if test="${rb.roleKind == 0 }">管理</c:if>
					<c:if test="${rb.roleKind == 1 }">技术</c:if>
					<c:if test="${rb.roleKind == 2 }">职能</c:if>	
					<c:if test="${rb.roleKind == 3 }">业务</c:if>		
					</td>
				</tr>
				<tr>
					<td>所属部门：</td>
					<td>${rb.dept.deptName }</td>
				</tr>
				<tr>
					<td>菜单权限<span style="color: red">*</span>：
					</td>
					<td > 
			<c:forEach items="${ml }" var="m">
						<c:if test="${m.parentMenu !=0 }"> &nbsp;&nbsp;&nbsp;</c:if>
						<input type="checkbox" value="${m.menuId }"  checked />
						${m.menuName }<br />
			</c:forEach>
					</td>   
				</tr>	
				<tr>
					<td>职位描述：</td>
					<td>${rb.roleIntro }</td>
				</tr>
				<tr>
					<td>备 注：</td>
					<td>${rb.roleRemark }</td>
				</tr>


				<tr>
					<td>是否启用：</td>
					<td>
             		<c:if test="${rb.roleState == 0 }">启用</c:if>
					<c:if test="${rb.roleState == 1 }">禁用</c:if>
					</td>
				</tr>


			</table>
		</form>
	</div>
</body>
</html>