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
<title>培训管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$("#bnt").click(function(){
		var is = confirm("确定添加吗？");
		if(is){
			$("#myForm").submit();
		}
	})
	});
</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》培训管理 -》培训反馈</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="peixun/fankui/pageNum=${requestScope.pageNum }">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<table border="1" width="100%" class="table_a">
			<tr>
				<td width="120px;">培训名称<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarName}</td>
			</tr>
			<tr>
				<td>培训讲师<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarTeacher}</td>
			</tr>

			<tr>
				<td>培训时间<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarStartTime}
			</tr>
			<tr>
				<td>至</td>
				<td>${requestScope.tb.tarEddTime}</td>
			</tr>
			<tr>
				<td>培训目的<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarResouce}</td>
			</tr>


			<tr>
				<td>参训人员<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarEmployee}</td>
			</tr>

			<tr>
				<td>培训简介：</td>
				<td>${requestScope.tb.tarIntro}</td>
			</tr>

			<tr>
				<td></td>
				<td><a href="">技术专家和教学专家的合作.zip</a></td>
			</tr>
			<tr>
				<td>审核意见：</td>
				<td>${requestScope.tb.tarOpinion}</td>
			</tr>


		</table>


	</div>
	<hr>
	<form action="peixun/extra" method="post" id="myForm">
		<input type="hidden" name="tarId" value="${requestScope.tb.tarId}">
		<input type="hidden" name="pageNum" value="${requestScope.pageNum }">
	培训反馈
	<div style="font-size: 13px; margin: 10px 5px">
		<table border="1" width="100%" class="table_a">
			<tr>
				<td width="120px;">培训反馈<span style="color: red">*</span>：
				</td>
				<td><select name="tarRequired" value="">
						<option>请选择</option>
						<option value="优">优</option>
						<option value="良">良</option>
						<option value="差">差</option>
				</select></td>
			</tr>
			<tr>
				<td>培训总结<span style="color: red">*</span>：
				</td>
				<td><textarea name="tarSummary" value=""></textarea></td>
			</tr>

			<tr>
				<td>考核结果<span style="color: red">*</span>：
				</td>
				<td><textarea name="evalutionResult" value=""></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" id="bnt" value="保存">
				</td>
			</tr>


		</table>
	</div>
	</form>
</body>
</html>