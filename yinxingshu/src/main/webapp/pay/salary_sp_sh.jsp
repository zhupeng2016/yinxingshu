<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>薪酬——审核</title>
        <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
        <script type="text/javascript">
        $(document).ready(function() {
    		$("#btn1").click(function() {
    			var is = confirm("确定审核通过吗？");
    			if (is) {
    				location.href = "salary/shenHe?salaryState=3&salaryId=${message.salaryId}&pageNum=${pageNum}";
    			}
    		});
    		
    		
    		$("#btn2").click(function() {
    			var is = confirm("确定驳回吗？");
    			if (is) {
    				location.href = "salary/shenHe?salaryState=4&salaryId=${message.salaryId}&pageNum=${pageNum}";
    			}
    		});
    	});
        </script>
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》薪酬标准审核</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascripr:void(0)" onclick="history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="salary/findSp" method="post" enctype="multipart/form-data" id="us">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">薪酬标准编号<span style="color:red">*</span>：</td>
                    <td><input type="text" name="salaryCode" readonly value="${message.salaryCode}" /></td>
                </tr>
                <tr>
                    <td>薪酬标准名称<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="salaryName" readonly value="${message.salaryName}" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>制定人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="salaryMaker" readonly value="${message.salaryMaker}" /></td>
                </tr>
                <tr>
                    <td>登记人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="salaryRegister" value="${message.salaryRegister}" />
					</td>
                </tr>
                <tr>
                    <td>登记时间<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="registerTime" readonly value="${message.registerTime }" />
                    </td>
                </tr>


				<tr>
                    <td>基本工资<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="basePay" readonly  value="${message.basePay}"/>元
                    </td>                
                </tr>

				<tr>
                    <td>绩效奖金：</td>
                    <td>
                        <input type="text" name="addPay" readonly value="${message.addPay }" />元
                    </td>                
                </tr>

				<tr>
                    <td>交通补助：</td>
                    <td>
                        <input type="text" name="trafficPay" readonly value="${message.trafficPay }"/>元
                    </td>                
                </tr>

				<tr>
                    <td>通讯补助：</td>
                    <td>
                        <input type="text" name="phonePay" readonly value="${message.phonePay }" />元
                    </td>                
                </tr>

				<tr>
                    <td>餐补：</td>
                    <td>
                        <input type="text" name="foodPay" readonly value="${message.foodPay }" />元
                    </td>                
                </tr>
				<tr>
                    <td>住房补助：</td>
                    <td>
                        <input type="text" name="housePay" readonly value="${message.housePay }" />元
                    </td>                
                </tr>
				<tr>
                    <td>出差补助：</td>
                    <td>
                        <input type="text" name="awayPay" readonly value="${message.awayPay }" />元
                    </td>                
                </tr>
				<tr>
                    <td>加班补助：</td>
                    <td>
                        <input type="text" name="overtimePay" readonly value="${message.overtimePay }"/>元
                    </td>                
                </tr>	

				<tr>
                    <td>薪酬总额：</td>
                    <td>
						 <input type="text" readonly name="allSalary" value="${message.allSalary}" />元
                    </td>
                </tr>


				<tr>
                    <td>备注：</td>
                    <td>
                        <input type="text" readonly name="salaryRemark" value="${message.salaryRemark }"/>
                    </td>                
                </tr>
                <tr>
                    <td colspan="2" align="center">
                       <input type="button" value="审核通过" id="btn1" >
						<input type="button" value="驳回" id="btn2">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>