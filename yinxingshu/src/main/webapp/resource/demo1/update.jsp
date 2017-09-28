<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>部门管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-系统管理》部门管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                  
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
        
            <form action="dept/update/${db.deptId }" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门编码：<span style="color:red">*</span>：</td>
                    <td><input type="text" name="deptCode"  value="${db.deptCode }" /></td>
                </tr>
                <tr>
                    <td>部门简称：<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="deptShortName" value="${db.deptShortName }" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>部门全称：<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="deptName" value="${db.deptName }" /></td>
                </tr>
                <tr>
                    <td>上级部门：<span style="color:red">*</span>：</td>
                    <td>
                    <%-- <c:if test="${db.parentDept==0 }">
						<input type="text"  name="parentDept" readonly value="银杏树信息管理公司" />
					</c:if> --%>
					<%-- <c:forEach items="${deptlist }" var="dbs" >
					   <c:if test="${dbs.deptId==${db.parentDept }">
					   <input type="text"  name="parentDept" readonly value="${dbs.deptName }" />
					   </c:if>
					</c:forEach> --%>
					
					
					
					<select name="parentDept" >
					<c:forEach items="${deptlist }" var="dbs" >
					   <option value="${dbs.deptId }" >
					 <c:if test="${dbs.deptId==db.parentDept }"></c:if>
					     ${dbs.deptName }
					   </option>
					</c:forEach>
					</select>
					   
					
					
					</td>
                </tr>
                <tr>
                    <td>地址<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="deptAddress"  value="${db.deptAddress }" />
                    </td>
                </tr>


				<tr>
                    <td>简介：</td>
                    <td>
						 <textarea name="deptIntro">${db.deptIntro }</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>备注：</td>
                    <td>
                        
						 <textarea name="deptRemark">${db.deptRemark }</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>是否启用：</td>
                    <td>
                        <select name="deptState" >
							<option value="0">是</option>
							<option value="1">否</option>
						</select>
                    </td>                
                </tr>

                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="确认">
						<input type="reset" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>