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
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>简历管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：招聘管理-》简历管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="zhaopin/demo2/add.jsp">【添加】</a>
                </span>
            </span>
        </div>
        <div></div>
         <div class="div_search">
            <span>
                <form action="#" method="get">
					姓名: 
					<input type="text" size="10px" />
					 应聘职位: 
					<select>
								<option>--请选择--</option>
								<option>高级工程师</option>
								<option>研发工程师</option>
							</select>
					工作经验: 
					<input type="text" size="10px" />
					登记日期: 
					<input type="text" size="20px" />
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="30px;">姓名</td>
                        <td width="30px;">性别</td>						
                        <td width="70px;">毕业院校</td>
                        <td width="30px">学历</td>
						<td width="30px">专业</td>
						<td width="100px;">应聘职位</td>
                        <td width="40px;">工作经验</td> 
						<td width="70px;">登记日期</td>
                        <td align="center" width="100px;">操作</td>
                    </tr>
                    <c:forEach items="${resumeList }" var="re"> 
                    <tr id="product1">
                    	<%-- <c:if test="${ub.userId }"><td><a href="view.html">${ub.userName }</a></td></c:if> --%>
                    	<td><a href="zhaopin/demo2/view.jsp">朱鹏</a></td>
                        <c:if test="${re.resumeSex==0 }"><td>男</td></c:if>
                        <c:if test="${re.resumeSex==1 }"><td>女</td></c:if>
						<td>${re.graduateSchool }</td>
						<c:if test="${re.education==0 }"><td>本科</td></c:if>
                         <c:if test="${re.education==1 }"><td>专科</td></c:if>
						<td>${re.major }</td> 						
                        <td>${role.roleName }</td>
						<td>${re.workYear }</td>
						<td>${role.startTime }</td>
						
                        <td>
							<a href="zhaopin/demo2/edit.jsp">修改</a>						   
							<a href="#">删除</a>
							<select>
							<option>存档</option>
							<option>推荐面试</option>
						</select>
						</td>                        
                    </tr> 
                   </c:forEach> 
					<!--  <tr id="product1">
                        <td><a href="view.html">王宇</a></td>
                        <td>男</td>
						<td>清华大学</td>
                        <td>本科</td> 
						<td>软件工程与开发</td> 						
                        <td>技术培训师</td>
						<td>2年</td>
						<td>2013-09-08</td>
						
                        <td>
							<a href="edit.html">修改</a>						   
							<a href="#">删除</a>
							<select>
								<option>存档</option>
								<option>推荐面试</option>
							</select>
						</td>                        
                    </tr> 
					
					<tr id="product1">
                        <td><a href="view.html">张茜</a></td>
                        <td>女</td>
						<td>北京矿业大学</td>
                        <td>本科</td> 
						<td>人力资源管理</td> 						
                        <td>人事专员</td>
						<td>5年</td>
						<td>2013-09-08</td>
						
                        <td>
							<a href="edit.html">修改</a>						   
							<a href="#">删除</a>
							<select>
								<option>存档</option>
								<option>推荐面试</option>
							</select>
						</td>                        
                    </tr> 
					<tr id="product1">
                        <td><a href="view.html">李梅</a></td>
                        <td>女</td>
						<td>北京财经大学</td>
                        <td>本科</td> 
						<td>会计</td> 						
                        <td>财务主管</td>
						<td>5年</td>
						<td>2013-09-08</td>
						
                        <td>
							<a href="edit.html">修改</a>						   
							<a href="#">删除</a>
							<select>
								<option>存档</option>
								<option>推荐面试</option>
							</select>
						</td>                        
                    </tr>  -->
                    <tr>
                        <td colspan="10" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>