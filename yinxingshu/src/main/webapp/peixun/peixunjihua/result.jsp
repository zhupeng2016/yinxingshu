<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE>
<html>
<base href="<%=basePath%>">
<head>
<title>修改</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》培训管理 -》查看培训结果</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="peixun/info?pageNum=${requestScope.pageNum }">【返回】</a>
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
				<td>${requestScope.tb.tarStartTime}</td>
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
	培训反馈
	<div style="font-size: 13px; margin: 10px 5px">
		<table border="1" width="100%" class="table_a">
			<tr>
				<td width="120px;">培训反馈<span style="color: red">*</span>：
				</td>
				<td>${requestScope.tb.tarRequired}</td>
			</tr>
			<tr>
				<td>培训总结<span style="color: red">*</span>：
				</td>
				<td><textarea value="${requestScope.tb.tarSummary}"></textarea></td>
			</tr>

			<tr>
				<td>考核结果<span style="color: red">*</span>：
				</td>
				<td><textarea value="${requestScope.tb.evalutionResult}"></textarea></td>
			</tr>


		</table>
	</div>
</body>
</html>