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
<title>培训管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("#bt").click(function(){
		location.href="peixun/fuhe?tarId=${requestScope.tb.tarId }&pageNum=${requestScope.pageNum }";
	});
});
</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》培训管理 -》修改培训计划</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="peixun/info?pageNum=${requestScope.pageNum }">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="peixun/update?pageNum=pageNum" method="get"
			enctype="multipart/form-data"> 
			<input type="hidden" name=tarId value=${requestScope.tb.tarId }>
			<input type="hidden" name=pageNum value=${requestScope.pageNum }>
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">培训名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarName"
						value="${requestScope.tb.tarName }" /></td>
				</tr>
				<tr>
					<td>培训讲师<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarTeacher" value="${requestScope.tb.tarTeacher }" /></td>
				</tr>

				<tr>
					<td>培训时间<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarStartTime" value="${requestScope.tb.tarStartTime }" /></td>
				</tr>
				<tr>
					<td>至</td>
					<td><input type="text" readonly name="tarEddTime"
						value="${requestScope.tb.tarEddTime }" /></td>
				</tr>
				<tr>
					<td>培训目的<span style="color: red">*</span>：
					</td>
					<td><textarea name="tarResouce" value="${requestScope.tb.tarResouce }">一个新开辟领域的探讨，探讨摸索</textarea></td>
				</tr>


				<tr>
					<td>参训人员<span style="color: red">*</span>：
					</td>
					<td><textarea name="tarEmployee" value="${requestScope.tb.tarEmployee }"></textarea>
					</td>
				</tr>

				<tr>
					<td>培训简介：</td>
					<td><textarea name="tarIntro" value="${requestScope.tb.tarIntro }"></textarea>
					</td>
				</tr>

				<tr>
					<td>培训资料：</td>
					<td><input type="file" name="tarFile" value="${requestScope.tb.tarFile }" /></td>
				</tr>
				<tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="保存">
						<input type="button" id="bt" onclick="fuhe()" value="申请复核">
                    </td>
                </tr> 
			</table>
		</form>
	</div>
</body>
</html>