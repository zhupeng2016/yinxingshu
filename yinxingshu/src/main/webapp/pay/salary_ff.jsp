<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>会员列表</title>

        <link href="../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：薪酬管理-》工资发放管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                  	 <a style="text-decoration: none;" href="salary_ff_add.jsp">【添加】</a>
					<a style="text-decoration: none;" href="#">【导出】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="#" method="get">
                    姓名: 
					<input type="text"  />                   
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">序号</td>
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="50px;">姓名</td>                       
						<td width="100px;">薪酬标准</td>    
						<td width="100px;">部门</td>    
						<td>工资总额</td>						
                        <td>操作</td>
                    </tr>

                    <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>张XXX</td>
                        <td>研发工程师</td> 
						<td width="100px;">研发部</td>    
						<td>6000</td> 	
						<td><a href="salary_ff_update.jsp">修改</a>						   
							<a href="#">删除</a></td>
                    </tr> 
					  
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>