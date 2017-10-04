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
<title>用户管理</title>
<link href="css/mine.css" type="text/css" rel="stylesheet" />
<link type="text/css" rel="stylesheet"
	href="css/jquery.autocomplete.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
<script type="text/javascript">
$(function() {
	//全选   全不选
	$("#checkedAll").click(function() {
		$("input[name='chosen']").prop("checked", $(this).prop("checked"));
	});
});

function show(){
	var msg="${msg}";
	if(msg!=null && msg!=""){
		alert(msg);
	}
}
function del(userId){
	var is=confirm("确定删除吗？");
	if(is){
		location.href="user/delete?userId="+userId+"";
	}
}
</script>
</head>
<body onload="show()">
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：系统管理-》用户管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="user/padd">【添加】</a> <!-- <a style="text-decoration: none;" href="#">【删除】</a> -->
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="#" method="get">
				姓名： <input type="text" /> 角色: <input type="text" /> 所属部门: <input
					type="text" /> <input value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" /></td>
					<td width="40px;">序号</td>
					<td width="80px;">账号</td>
					<td width="80px;">姓名</td>
					<td>角色</td>
					<td width="100px;">所属部门</td>
					<td align="center" width="100px;">操作</td>
				</tr>

				<c:forEach items="${uls }" var="ub" varStatus="st">
					<tr id="product1">
						<td><input type="checkbox" /></td>
						<td>${st.index+1 }</td>
						<td>${ub.loginName }</td>
						<td><a href="user/look?userId=${ub.userId }">${ub.userName }</a></td>
						<td>${ub.rb.roleName }</td>
						<td>${ub.db.deptShortName }</td>
						<td><a href="user/pupdate?userId=${ub.userId }">修改</a> <a
							href="javascript:del(${ub.userId })" >删除</a></td>
					</tr>

				</c:forEach>
				<tr>
					<td colspan="20" style="text-align: center;"><a
						style="text-decoration: none;" href="#"> 首页 上一页 ... 7 8 9 10
							11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a></td>
				</tr>
			</tbody>
		</table>
	</div>
	
</body>
</html>