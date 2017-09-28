<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE>
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>培训管理</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<link href="css/jquery.autocomplete.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.pagination.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
<script type="text/javascript">
	function checkTime() {
		var st = document.getElementById("st");
		var et = document.getElementById("et");
		if (st.value != null && st.value != "" && et.value != null
				&& et.value != "") {
			if (st.value > et.value) {
				st.value = "";
				et.value = "";
				alert("请输入正确的时间!");
			}
		}
	}
	$(function() {
		$("#n").AutoComplete({
			'data' : 'peixun/auto', //去服务器获得所有的提示信息
			'width' : "auto",//提示框宽度
			'itemheight' : 30
		//每个补全信息的高度
		});
	});
</script>
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：培训管理-》培训计划</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;"
				href="peixun/peixunjihua/add.jsp?pageNum=${requestScope.page.getPageNum()}">【新增培训计划】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="peixun/auto?pageNum=pageNum" method="post" id="myForm">
			<input type="hidden" name="pageNum" value="${requestScope.page.pageNum }">
				培训名称: <input type="text" id="n" name="tarName" value=""/> 审核状态: <select name="tarState" value="">
					<option>--请选择--</option>
					<option value="0">起草</option>
					<option value="1">审核中</option>
					<option value="2">审核通过</option>
					<option value="3">驳回</option>
				</select> 培训时间： <input type="text" id="st" onclick="WdatePicker()"
					onchange="checkTime()" name="tarStartTime" value="" />至<input type="text" id="et"
					onclick="WdatePicker()" onchange="checkTime()" name="tarEddTime" value="" /> <input
					value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="">培训名称</td>
					<td width="15%">培训讲师</td>
					<td width="15%">培训时间</td>
					<td>培训反馈</td>
					<td width="15%">审核状态</td>
					<td align="center" width="15%">操作</td>
				</tr>
				<c:forEach items="${requestScope.l}" var="tb">
					<tr id="product1">
						<td>${tb.tarName}</td>
						<td>${tb.tarTeacher}</td>
						<td>${tb.tarStartTime}</td>
						<td>${tb.tarRequired}</td>
						<c:if test="${tb.tarResult==0 }">
							<c:if test="${tb.tarState==0}">
								<td>起草</td>
								<td><a href="peixun/see?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">修改</a> <a
									href="peixun/view?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">明细</a>
									<a href="peixun/delete?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">删除</a></td>
							</c:if>
							<c:if test="${tb.tarState==1}">
								<td>审核中</td>
								<td><a
									href="peixun/view?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">明细</a>
								</td>
							</c:if>
							<c:if test="${tb.tarState==2}">
								<td>审核通过</td>
								<td><a href="peixun/result?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">培训结果</a> <a
									href="peixun/view?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">明细</a>
								</td>
							</c:if>
							<c:if test="${tb.tarState==3}">
								<td>驳回</td>
								<td><a
									href="peixun/view?tarId=${tb.tarId }&pageNum=${requestScope.page.getPageNum()}">明细</a>
								</td>
							</c:if>
						</c:if>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="20" style="text-align: center;"><span> <a
							href="peixun/info?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a
									href="peixun/info?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="peixun/info?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a
									href="peixun/info?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a href="peixun/info?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>