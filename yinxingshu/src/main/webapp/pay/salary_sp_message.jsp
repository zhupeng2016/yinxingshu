<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>薪酬标准管理</title>
        <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》薪酬标准管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="javascript:void(0)" onclick="history.back()">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">薪酬标准编号：</td>
                    <td>
					${message.salaryCode}
					</td>
                </tr>
                <tr>
                    <td>薪酬标准名称：</td>
                    <td>
						${message.salaryName}
					</td>
                </tr>
                <tr>
                    <td>薪酬总额：</td>
                     <td>
						${message.allSalary}
					</td>
                </tr>
                <tr>
                    <td>制定人：</td>
                     <td>
						${message.salaryMaker}
					</td>
                </tr>
                <tr>
                    <td>登记人：</td>
                     <td>
						${message.salaryRegister}
					</td>
                </tr>
                <tr>
                    <td>登记时间：</td>
                     <td>
						${message.registerTime}
					</td>
                </tr>


				<tr>
                    <td>基本工资：</td>
                     <td>
						${message.basePay}
					</td>               
                </tr>

				<tr>
                    <td>绩效奖金：</td>
                     <td>
						${message.addPay}
					</td>                
                </tr>

				<tr>
                    <td>交通补助：</td>
                    <td>
                        ${message.trafficPay}
                    </td>                
                </tr>

				<tr>
                    <td>通讯补助：</td>
                    <td>
                       ${message.phonePay}
                    </td>                
                </tr>

				<tr>
                    <td>餐补：</td>
                    <td>
                        ${message.foodPay}
                    </td>                
                </tr>
				<tr>
                    <td>住房补助：</td>
                    <td>
                       ${message.housePay}
                    </td>                
                </tr>
				<tr>
                    <td>出差补助：</td>
                    <td> 
                       ${message.awayPay}
                    </td>                
                </tr>
				<tr>
                    <td>加班补助：</td>
                    <td>
                        ${message.overtimePay}
                    </td>                
                </tr>	
				<tr>
                    <td>备注：</td>
                    <td>
                    ${message.salaryRemark}
                    </td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>