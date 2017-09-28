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
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript"
	src="js/My97DatePicker/WdatePicker.js"></script>
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
</script>
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：培训管理-》培训复核</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> </span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="peixun/fuhe" method="post">
				培训名称: <input type="text" /> 培训时间： <input type="text" id="st"
					onclick="WdatePicker()" onchange="checkTime()" />至<input
					type="text" id="et" onclick="WdatePicker()" onchange="checkTime()" />
				<input value="查询" type="submit" />

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
					<td width="15%">审核状态</td>
					<td align="center" width="15%">操作</td>
				</tr>

				<tr id="product1">
				<c:forEach items="${requestScope.l }" var="li">
					<td>${li.tarName }</td>
					<td>${li.tarTeacher }</td>
					<td>${li.tarStartTime }</td>
					<c:if test="${li.tarStartTime==1 }">
					<td>审核中</td>
					</c:if>
					<td><a href="peixun/hefu?tarId=${li.tarId }&pageNum=${requestScope.page.pageNum}">培训复核</a></td>
				</c:forEach>
				</tr>
				
				<tr>
					<td colspan="20" style="text-align: center;">
					<span> <a
							href="peixun/shenhe?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">
								<a
									href="peixun/shenhe?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">
								<c:if test="${requestScope.page.getPageNum()==num }">${num }</c:if>
								<c:if test="${requestScope.page.getPageNum()!=num }">
									<a href="peixun/shenhe?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
								<a
									href="peixun/shenhe?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
							</c:if> <a href="peixun/shenhe?pageNum=${requestScope.page.getPages() }">尾页</a>
							<span>总共${requestScope.page.getPages()}页
								总共${requestScope.page.getTotal() }条 </span>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>