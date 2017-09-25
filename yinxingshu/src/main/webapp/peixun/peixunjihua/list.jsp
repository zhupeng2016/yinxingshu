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
		<span> <span style="float: left;">当前位置是：培训管理-》培训计划</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="add.html">【新增培训计划】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="TarController" method="post" id="myForm">
				培训名称: <input type="text" /> 审核状态: <select>
					<option>--请选择--</option>
					<option>起草</option>
					<option>审核中</option>
					<option>审核通过</option>
					<option>驳回</option>
				</select> 培训时间： <input type="text" id="st" onclick="WdatePicker()"
					onchange="checkTime()" />至<input type="text" id="et"
					onclick="WdatePicker()" onchange="checkTime()" /> <input value="查询"
					type="submit" />

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

				<tr id="product1">
					<td>人人都要懂教学设计</td>
					<td>李明</td>
					<td>2013-10-10</td>
					<td>优</td>
					<td>审核通过</td>
					<td><a href="result.html">培训结果</a> <a href="view.html">明细</a>
					</td>
				</tr>
				<tr id="product1">
					<td>技术专家和教学专家的合作</td>
					<td>杨驰</td>
					<td>2013-12-10</td>
					<td></td>
					<td>起草</td>
					<td><a href="edit.html">修改</a> <a href="view.html">明细</a> <a
						href="">删除</a></td>
				</tr>

				<tr id="product1">
					<td>自动化测试</td>
					<td>王芹芹</td>
					<td>2013-12-1</td>
					<td></td>
					<td>审核中</td>
					<td><a href="view.html">明细</a></td>
				</tr>



				<tr>
					<td colspan="20" style="text-align: center;"><a
						style="text-decoration: none;" href="#"> 首页 上一页 ... 7 8 9 10
							11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>