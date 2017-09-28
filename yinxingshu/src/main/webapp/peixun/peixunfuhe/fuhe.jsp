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
<link href="../../css/mine.css" type="text/css" rel="stylesheet">
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》培训管理 -》培训复核</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="../peixunfuhe/list.html">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="peixun/shenhe?pageNum=pageNum" method="post"
			enctype="multipart/form-data">
			<input type="hidden" name="pageNum" value="${requestScope.pageNum }">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">培训名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarName" readonly
						value="${requestScope.tb.tarName}" /></td>
				</tr>
				<tr>
					<td>培训讲师<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarTeacher" readonly value="${requestScope.tb.tarTeacher}" />
					</td>
				</tr>

				<tr>
					<td>培训时间<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarStartTime" readonly
						value="${requestScope.tb.tarStartTime}" /></td>
				</tr>
				<tr>
					<td>至</td>
					<td><input type="text" readonly name="tarEddTime" readonly
						value="${requestScope.tb.tarEddTime}" /></td>
				</tr>
				<tr>
					<td>培训目的<span style="color: red">*</span>：
					</td>
					<td><textarea name="tarResouce" value="${requestScope.tb.tarResouce}" readonly></textarea></td>
				</tr>


				<tr>
					<td>参训人员<span style="color: red">*</span>：
					</td>
					<td><textarea name="tarEmployee" value="${requestScope.tb.tarEmployee}" readonly></textarea>
					</td>
				</tr>

				<tr>
					<td>培训简介：</td>
					<td><textarea name="tarIntro" value="${requestScope.tb.tarIntro}" readonly></textarea>
					</td>
				</tr>

				<tr>
					<td>培训资料：</td>
					<td><input type="test" name="tarFile" value="${requestScope.tb.tarFile}" /></td>
				</tr>

				<tr>
					<td></td>
					<td><a href="">技术专家和教学专家的合作.zip</a> &nbsp;&nbsp;<a href="">删除</a>
					</td>
				</tr>
				<tr>
					<td>审核意见：</td>
					<td><textarea name="tarOpinion" value="${requestScope.tb.tarOpinion}"></textarea></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="审核通过"> <input type="button" value="驳回"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>