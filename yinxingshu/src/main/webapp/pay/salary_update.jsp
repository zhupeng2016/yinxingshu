<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>薪酬标准管理添加</title>
<base href="<%=basePath%>">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function count() {
		var s = $("#c1").val() + "+" + $("#c2").val() + "+" + $("#c3").val()
				+ "+" + $("#c4").val() + "+" + $("#c5").val() + "+"
				+ $("#c6").val() + "+" + $("#c7").val() + "+" + $("#c8").val();
		$("#c9").val(eval(s));
	}
	$(document).ready(function(){
		$("#btn1").click(function(){
			var is = confirm("确定修改吗？");
			if(is){
				$("#up").submit();
			}
		});
		$(document).ready(function(){
			$("#btn2").click(function(){
				var is = confirm("确定审核吗？");
				if(is){
					$("#up").append("<input type='hidden' name='flag' value='1'>");  
					$("#up").submit();
				}
			});
	});
</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》薪酬标准管理》添加</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="javascript:void(0)"
				onclick="history.back()">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="salary/update" method="post"
			enctype="multipart/form-data" id="up">
			<input type="hidden" name="pageNum" value="${requestScope.pageNum }" />
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">薪酬标准编号<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="salaryCode"
						value="${message.salaryCode}" /></td>
				</tr>
				<tr>
					<td>薪酬标准名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="salaryName"
						value="${message.salaryName}" /></td>
				</tr>

				<tr>
					<td>制定人<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="salaryMaker"
						value="${message.salaryMaker}" /></td>
				</tr>
				<tr>
					<td>登记人<span style="color: red">*</span>：
					</td>
					<td><input type="text" readonly name="salaryRegister"
						value="${message.salaryRegister}" /></td>
				</tr>
				<tr>
					<td>登记时间<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="registerTime" readonly
						value="${message.registerTime }" /></td>
				</tr>


				<tr>
					<td>基本工资<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="basePay"
						value="${message.basePay}" onblur="count()" id="c1" />元</td>
				</tr>

				<tr>
					<td>绩效奖金：</td>
					<td><input type="text" name="addPay"
						value="${message.addPay }" onblur="count()" id="c2" />元</td>
				</tr>

				<tr>
					<td>交通补助：</td>
					<td><input type="text" name="trafficPay"
						value="${message.trafficPay }" onblur="count()" id="c3" />元</td>
				</tr>

				<tr>
					<td>通讯补助：</td>
					<td><input type="text" name="phonePay"
						value="${message.phonePay }" onblur="count()" id="c4" />元</td>
				</tr>

				<tr>
					<td>餐补：</td>
					<td><input type="text" name="foodPay"
						value="${message.foodPay }" onblur="count()" id="c5" />元</td>
				</tr>
				<tr>
					<td>住房补助：</td>
					<td><input type="text" name="housePay"
						value="${message.housePay }" onblur="count()" id="c6" />元</td>
				</tr>
				<tr>
					<td>出差补助：</td>
					<td><input type="text" name="awayPay" value="${message.awayPay }"
						onblur="count()" id="c7" />元</td>
				</tr>
				<tr>
					<td>加班补助：</td>
					<td><input type="text" name="overtimePay"
						value="${message.overtimePay }" onblur="count()" id="c8" />元</td>
				</tr>

				<tr>
					<td>薪酬总额：</td>
					<td><input type="text" readonly name="allSalary"
						value="${message.allSalary}" id="c9" />元</td>
				</tr>


				<tr>
					<td>备注：</td>
					<td><input type="text" name="salaryRemark"
						vaaue="${message.salaryRemark }" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" value="确认" id="btn1">
						<input type="button" value="提交审核" id="btn2"> <input type="reset"
						value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>