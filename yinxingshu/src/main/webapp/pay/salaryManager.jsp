<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>薪酬标准管理</title>

<link href="/yinxingshu/css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$("#checkedAll").click(function() {
			$("input[name='chosen']").prop("checked", $(this).prop("checked"));
		});
	});
</script>
<style>
.tr_color {
	background-color: #9F88FF
}
<
body
>
</style>
<div class="div_head">
	<span> <span style="float: left;">当前位置是：薪酬管理-》薪酬标准管理</span> <span
		style="float: right; margin-right: 8px; font-weight: bold;"> <a
			style="text-decoration: none;" href="salary/prepare">【添加】</a>
	</span>
	</span>
</div>
<div></div>
<div class="div_search">
	<span>
		<form action="findAll" method="post">
			薪酬标准类型: <input type="text" /> 审核状态: <select>
				<option>-- 请选择--</option>
				<option>-- 起草--</option>
				<option>-- 审核中--</option>
				<option>-- 已通过--</option>
			</select> <input value="查询" type="submit" />
		</form>
	</span>
</div>
<div style="font-size: 13px; margin: 10px 5px;">
	<table class="table_a" border="1" width="100%">
		<tbody>
			<tr style="font-weight: bold;">
				<td width="40px;">序号</td>
				<td width="30px;"><input type="checkbox" id="checkedAll" /></td>
				<td width="80px;">薪酬编码</td>
				<td>薪酬标准类型</td>
				<td width="100px;">审核状态</td>
				<td width="120px;">时间</td>
				<td align="center" width="100px;">操作</td>
			</tr>
			<c:forEach items="${requestScope.salarylist}" var="sl" varStatus="li">
				<tr id="product1">
					<td>${li.index+1}</td>
					<td><input type="checkbox" name="chosen" /></td>
					<td>${sl.salaryCode}</td>
					<td><a href="pay/salary_sp_message.jsp">${sl.salaryName}</a></td>
					<c:if test="${sl.salaryState==0}">
						<td>起草</td>
					</c:if>
					<c:if test="${sl.salaryState==1}">
						<td>审核中</td>
					</c:if>
					<c:if test="${sl.salaryState==2}">
						<td>已通过</td>
					</c:if>
					<td>${fn:substring(sl.registerTime,0,16)}</td>
					<td><a href="pay/salary_update.jsp">修改</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>

			<tr>
				<td colspan="20" style="text-align: center;"><a
					style="text-decoration: none;" href="#"> 首页 上一页 ... 7 8 9 10 11
						12 ... 下一页 尾页 共1234条 每页显示 10/23 </a></td>
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>