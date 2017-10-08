<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML >
<html>
    <head>
    <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>人事档案审批</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：人事管理-》人事档案审批管理</span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="#" method="get">
                    姓名: 
					<input type="text"  />
					建档时间：
					<input type="text" />至<input type="text"/>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="80px;">档案编码</td>
                        <td >姓名</td>
						<td>性别</td>
						<td>所属部门</td>
						<td>职位</td>
						<td>职称</td>
						<td>建档日期</td>
						<td>审核状态</td>
						<td>档案状态</td>                      
                        <td align="center" width="100px;">操作</td>
                    </tr>
                    <c:forEach  items="${reList}"   var="r">
                    <tr id="product1">
                        <td><input type="checkbox" /></td>
						<td>${r.archiveCode}</td>
						<td>${r.archiveName}</td>
						<td>
						<c:if test="${r.archiveSex==0}">男</c:if>
						<c:if test="${r.archiveSex==1}">女</c:if>
						</td>
						<td>${r.archiveDept}</td>
						<td>${r.archiveDuty}</td>
						<td>${r.archiveTitle}</td>
						<td>${r.archiveTime}</td>
						<td>
						<c:if test="${r.auditState==5}">审批中</c:if>
						</td>
						<td>
						<c:if test="${r.archiveState==0}">试用期</c:if>
						<c:if test="${r.archiveState==1}">正式员工</c:if>
						<c:if test="${r.archiveState==2}">离职</c:if>
						<c:if test="${r.archiveState==3}">已删除</c:if>
						</td>
						<td>
							
							<a href="transaction?archiveId=${r.archiveId}">办理</a>
						</td>
                    </tr>
                    </c:forEach>
                  


					
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