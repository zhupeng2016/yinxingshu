<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE>
<html>
<base href="<%=basePath%>">
<head>
<title>培训计划增加</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.defined.js"></script>
<script type="text/javascript" src="js/tarjqueryz.js">
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js">
</script>
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
	$(function(){
		$("#bnt").click(function(){
			var is = confirm("确定添加吗？");
			if(is){
				$("#myForm").submit();
			}
		})
		});
</script>
<script type="text/javascript">
	
</script>
</head>

<body>
	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》培训管理 -》修改培训计划</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none"
				href="peixun/info?pageNum=${param.pageNum }">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="peixun/add?" method="post"
			enctype="multipart/form-data" id="myForm">
			<input type="hidden" name=pageNum value="${param.pageNum }">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">培训名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarName" value="" /> <span></span></td>
				</tr>
				<tr>
					<td>培训讲师<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarTeacher" value="" /> <span></span></td>
				</tr>

				<tr>
					<td>培训时间<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="tarStartTime" id="st"
						onclick="WdatePicker()" onchange="checkTime()" /> <span></span></td>
				</tr>
				<tr>
					<td>至</td>
					<td><input type="text" name="tarEddTime" id="et"
						onclick="WdatePicker()" onchange="checkTime()"/>
						<span></span></td>
				</tr>
				<tr>
					<td>培训目的<span style="color: red">*</span>：
					</td>
					<td><textarea name=tarResouce></textarea> <span></span></td>
				</tr>


				<tr>
					<td>参训人员<span style="color: red">*</span>：
					</td>
					<td><textarea name="tarEmployee"></textarea> <span></span></td>
				</tr>

				<tr>
					<td>培训简介：</td>
					<td><textarea name="tarIntro" value=""></textarea> <span></span>
					</td>
				</tr>

				<tr>
					<td>培训资料：</td>
					<td><input type="text" name="tarFile" value="" /> <span></span></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="button" id="bnt"
						value="保存"> <input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>