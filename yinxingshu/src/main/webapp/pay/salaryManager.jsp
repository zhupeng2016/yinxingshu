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
		//全选   全不选
		$("#checkedAll").click(function() {
			$("input[name='chosen']").prop("checked", $(this).prop("checked"));
		});
	});
	function del(salaryId) {
		var is = confirm("确认删除吗?");
		if (is) {
			location.href = "salary/delete?salaryId=" + salaryId
					+ "&pageNum=${requestScope.page.pageNum}";
		}
	}
	$(function() {
		$("#btn").click(function() {
			location.href = "salary/findAll?pageNum=1&flag=clear";
		});
	});
</script>
<style>
.tr_color {
	background-color: #9F88FF
}
<body>
</style>
<body>
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
			<form action="salary/findAll" method="post">
				<input type="hidden" name="pageNum" value="1"> 薪酬标准类型: <input
					type="text" name="salaryName"
					value="${sessionScope.salaryBean.salaryName }" /> 审核状态: <select
					name="salaryState">
					<option value="0">-- 请选择--</option>
					<option value="1"
						<c:if test="${sessionScope.salaryBean.salaryState == 1 }">selected</c:if>>--
						起草--</option>
					<option value="2"
						<c:if test="${sessionScope.salaryBean.salaryState == 2 }">selected</c:if>>--
						审核中--</option>
					<option value="3"
						<c:if test="${sessionScope.salaryBean.salaryState == 3 }">selected</c:if>>--
						已通过--</option>
					<option value="4"
						<c:if test="${sessionScope.salaryBean.salaryState == 4 }">selected</c:if>>--
						驳回--</option>
				</select> <input value="查询" type="submit" /> <input value="清空" type="button"
					id="btn" />
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
				<c:if test="${empty requestScope.salarylist}">
					<tr>
						<td colspan="7" style="color:red;font-size: 20px;text-align: center;">没有符合条件的数据!</td>
					</tr>
				</c:if>
				<c:if test="${!empty requestScope.salarylist}">
					<c:forEach items="${requestScope.salarylist}" var="sl"
						varStatus="li">
						<tr id="product1">
							<td>${li.index+1}</td>
							<td><input type="checkbox" name="chosen" /></td>
							<td>${sl.salaryCode}</td>
							<td><a href="salary/message?salaryId=${sl.salaryId}">${sl.salaryName}</a></td>
							<c:if test="${sl.salaryState==1}">
								<td>起草</td>
							</c:if>
							<c:if test="${sl.salaryState==2}">
								<td>审核中</td>
							</c:if>
							<c:if test="${sl.salaryState==3}">
								<td>已通过</td>
							</c:if>
							<c:if test="${sl.salaryState==4}">
								<td>驳回</td>
							</c:if>
							<td>${fn:substring(sl.registerTime,0,16)}</td>
							<td><c:if test="${sl.salaryState==1 || sl.salaryState==4 }">
									<a
										href="salary/updateMessage?salaryId=${sl.salaryId}&pageNum=${requestScope.page.pageNum}">修改</a>
									<a href="javascript:del(${sl.salaryId})">删除</a>
								</c:if></td>
						</tr>
					</c:forEach>
				</c:if>




				<tr>
					<td colspan="20" style="text-align: center;"><span> <a
							href="salary/findAll?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a
									href="salary/findAll?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="salary/findAll?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a
									href="salary/findAll?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a
							href="salary/findAll?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>