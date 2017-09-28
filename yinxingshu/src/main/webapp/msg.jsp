<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC >
<html>
<base href="<%=basePath%>">
    <head>
        <title>个人信息</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：工作平台-》个人信息</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="right.jsp">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="msg" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px">姓名</td>
                    <td>
						<input type="text" name="userName" value="${u.userName}" />
					</td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>
                    	<c:if test="${u.sex==1}"></c:if>
						<c:if test="${u.sex==0}"></c:if>
                       	<input type="radio" name="sex" value="0"/>男 <input type="radio" name="sex" value="1"/>女 
                    </td>
                </tr>
              
                <tr>
                    <td>身份证号：</td>
                    <td>
						<input type="text" name="idCard" value="${u.idCard}" />
					</td>
                </tr>
                <tr>
                    <td>办公电话：</td>
                    <td>
						<input type="text" name="phone" value="${u.phone}" />
					</td>
                </tr>
                <tr>
                    <td>手机：</td>
                    <td>
                       	<input type="text" name="mobilePhone" value="${u.mobilePhone}" />
                    </td>
                </tr>
				<tr>
                    <td>邮箱：</td>
                    <td>
                        	<input type="text" name="userEmail" value="${u.userEmail}"/>
                    </td>
                </tr>
				<tr>
                    <td>更换头像：</td>
                    <td>
						<input type="file" name="f_goods_image" />
					</td>
                </tr>
				<tr>
                    <td>备注：</td>
                    <td>
                        <input name="userRemark"  value="${u.userRemark}" />
                    </td> 
                </tr>
                
				
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="修改">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>