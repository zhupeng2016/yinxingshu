<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>制定标准</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<link href="../css/mine.css" type="text/css" rel="stylesheet">
	</head>

	<body>

		<div class="div_head">
			<span>
                <span style="float:left">当前位置是：薪酬管理-》制定工资标准</span>
			<span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="slary_ff.jsp">【返回】</a>
                </span>
			</span>
		</div>
		<div></div>

		<div style="font-size: 13px;margin: 10px 5px">
			<form action="list_payment.html" method="post" >
				<table border="1" width="100%" class="table_a">
					<tr>
						<td>部门</td>
						<td>
							<select name="">
								<option value="0">请选择</option>
								<option value="1">研发部</option>
								<option value="2">市场部</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>员工姓名</td>
						<td>
							<select name="">
								<option value="0">请选择</option>
								<option value="1">张三</option>
								<option value="2">李四</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>薪酬标准</td>
						<td>
							<select name="">
								<option value="0">请选择</option>
								<option value="1">研发工程师</option>
								<option value="2">项目工程师</option>
								<option value="3">部门经理</option>
							</select>
						</td>
					</tr>

					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="确定">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>