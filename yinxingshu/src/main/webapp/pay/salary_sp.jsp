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
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>薪酬标准管理</title>
<base href="<%=basePath%>">
<link href="css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<style>
.tr_color {
	background-color: #9F88FF
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		//全选   全不选
		$("#checkedAll").click(function() {
			$("input[name='chosen']").prop("checked", $(this).prop("checked"));
		});
	});
	$(function() {
		$("#btn").click(function() {
			location.href = "salary/findSp?pageNum=1&flag=clear";
		});
	});
</script>
</head>
<body>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：薪酬管理-》薪酬标准管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> </span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="salary/findSp" method="post">
				<input type="hidden" name="pageNum" value="1">薪酬标准类型: <input
					type="text" name="salaryName"
					value="${sessionScope.salaryBean.salaryName }" /> <input
					value="查询" type="submit" /> <input value="清空" type="button"
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
						<td colspan="7"
							style="color: red; font-size: 20px; text-align: center;">没有符合条件的数据!</td>
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
							<td>审核中</td>
							<td>${fn:substring(sl.registerTime,0,16)}</td>
							<td><a
								href="salary/spMessage?salaryId=${sl.salaryId}&pageNum=${requestScope.page.pageNum}">审批</a>
							</td>
						</tr>
					</c:forEach>
				</c:if>

				<tr>
					<td colspan="20" style="text-align: center;"><span> <a
							href="salary/findSp?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a
									href="salary/findSp?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="salary/findSp?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a
									href="salary/findSp?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a href="salary/findSp?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>