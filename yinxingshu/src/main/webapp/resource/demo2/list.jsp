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
<link href="css/mine.css" type="text/css" rel="stylesheet" />
<link type="text/css" rel="stylesheet"	href="css/jquery.autocomplete.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
<script type="text/javascript">
	$(function() {
		//全选   全不选
		$("#checkedAll").click(function() {
			$("input[name='chosen']").prop("checked", $(this).prop("checked"));
		});
		$("#username").AutoComplete({
			'data' : 'user/auto', //去服务器获得所有的提示信息
			'width' : "auto",//提示框宽度
			'itemheight' : 30//每个补全信息的高度
		});
		
	});

	function show() {
		var msg = "${msg}";
		if (msg != null && msg != "") {
			alert(msg);
		}
	}
	function del(userId) {
		var is = confirm("确定删除吗？");
		if (is) {
			location.href = "user/delete?userId=" + userId
					+ "&pageNum=${page.getPageNum()}";
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
			<form action="user/userlist?pageNum=1"	method="post">
				姓名： <input type="text" name="userName" id="username"
					value="${sessionScope.userBean.userName }" /> 角色: <input
					type="text" name="roleName"
					value="${sessionScope.userBean.roleName }" /> 所属部门: <input
					type="text" name="deptName"
					value="${sessionScope.userBean.deptName }" /> <input value="查询"
					type="submit" /> <a href="user/userlist?method=clear&pageNum=1">
					<input type="button" value="清空" />
				</a>
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
						<td><a
							href="user/look?userId=${ub.userId }&pageNum=${page.getPageNum()}">${ub.userName }</a></td>
						<td>${ub.rb.roleName }</td>
						<td>${ub.db.deptShortName }</td>
						<td><a
							href="user/pupdate?userId=${ub.userId }&pageNum=${page.getPageNum()}">修改</a>
							<a href="javascript:del(${ub.userId })">删除</a></td>
					</tr>

				</c:forEach>
				<tr>
					<td colspan="20" style="text-align: center;"><span> <a
							href="user/userlist?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a
									href="user/userlist?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> &nbsp;&nbsp; <c:forEach
								items="${requestScope.page.getNavigatepageNums()}" var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">&nbsp;${num }&nbsp;</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="user/userlist?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> &nbsp;&nbsp; <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a
									href="user/userlist?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a href="user/userlist?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>