<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
    <base href="<%=basePath%>">
        <title>薪酬标准管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：招聘管理》职位发布管理-》查看职位信息</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="rec/demo1" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门：</td>
                    <td>
					<input type="text" value=" ${role.dept.deptName }"/>
					</td>
                </tr>
                <tr>
                    <td>招聘类型：</td>
                    <td>
						<select name="roleKind" >
						<option value="0" <c:if test="${role.roleRecritType==0 }">selected</c:if>>校园招聘</option>
						<option value="1" <c:if test="${role.roleRecritType==1 }">selected</c:if>>社会招聘</option>
						</select>
					</td>
                </tr>
                <tr>
                    <td>招聘人数：</td>
                     <td>
					<input type="text" value="${role.roleNum }">	
					</td>
                </tr>
                <tr>
                    <td>职位名称：</td>
                     <td>
						<input type="text" readonly="readonly" value="${role.roleName }">
					</td>
                </tr>
                <tr>
                    <td>职业编码：</td>
                     <td>
						<input type="text" readonly="readonly" value="${role.roleCode }">
					</td>
                </tr>
                <tr>
                    <td>职位分类：</td>
                     <td>
						<select>
						
							<option>技术</option>
						</select>
					</td>
                </tr>


				<tr>
                    <td>登记人:</td>
                     <td>
						${ub.userName }
					</td>               
                </tr>

				<tr>
                    <td>登记时间：</td>
                     <td>
						${role.startTime }
					</td>                
                </tr>

				<tr>
                    <td>截止日期：</td>
                    <td>
                        ${role.eddTime }
                    </td>                
                </tr>

				<tr>
                    <td>职位描述：</td>
                    <td>
                       <textarea cols="70" rows="12">
					   ${role.roleRemark }
					   </textarea>
                    </td>                
                </tr>

				<tr>
                    <td>招聘要求：</td>
                    <td>
                       <textarea cols="70" rows="12">
					 ${role.roleRequired }
					   </textarea>
                    </td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>