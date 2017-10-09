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
    <base href="<%=basePath%>" />
        <title>职位发布登记</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
        <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript">
			function checkTime() {
				var st = document.getElementById("st");
				var et = document.getElementById("et");
				if (st.value != null && st.value != "" && et.value != null
						&& et.value != "") {
					if (st.value > et.value) {
						st.value = "";
						et.value = "";
						alert("请输入正确的时间!");
					}
				}
			}
		</script>
    </head>
    <body>
         <div class="div_head">
            <span>
                <span style="float:left">当前位置是：职位发布管理-》职位发布登记</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="rec/demo1">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="rec/edit" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
            	<input type="hidden" name="roleId" value="${role.roleId }"/>
                <tr>
                    <td width="120px;">部门<span style="color:red">*</span>：</td>
                    <td><select name="deptId">
						    <option>-请选择-</option>
						<c:forEach items="${dept }" var="d">
						    <option value="${d.deptId }" <c:if test="${d.deptId==role.deptId }">selected</c:if>>${d.deptName }</option>
						</c:forEach>
					</select></td>
                </tr>
                <tr>
                    <td>招聘类型<span style="color:red">*</span>：</td>
                    <td>
                     <select name="roleRecritType">
						<option>-请选择-</option>
						<option value="0" <c:if test="${role.roleRecritType==0 }">selected</c:if>>校园招聘</option>
						<option value="1" <c:if test="${role.roleRecritType==1 }">selected</c:if>>社会招聘</option>
					 </select>
                    </td>
                </tr>
               
                <tr>
                    <td>招聘人数<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="roleNum" value="${role.roleNum }" /></td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="roleName" value="${role.roleName }" />
					</td>
                </tr>
				<tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="roleCode" value="${role.roleCode }" />
					</td>
                </tr>
				<tr>
                    <td>职位分类<span style="color:red">*</span>：</td>
                    <td>
						
						<select name="roleKind">
						    <option value="0" <c:if test="${role.roleKind==0 }">selected</c:if>>管理</option>
						     <option value="1" <c:if test="${role.roleKind==1 }">selected</c:if>>技术</option>
						     <option value="2" <c:if test="${role.roleKind==2 }">selected</c:if>>业务</option>
						</select>
					</td>
                </tr>
				<tr>
                    <td>登记人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="userName" value="${ub.userName }" />
					</td>
                </tr>
                <tr>
                    <td>登记时间<span style="color:red">*</span>：</td>
                    <td>
                    <input type="text" name="startTime" readonly value="${role.startTime }" id="st" onclick="WdatePicker()" onchange="checkTime()"/>
                    </td>
                </tr>
<tr>
                    <td>截止时间<span style="color:red">*</span>：</td>
                    <td>
                    <input type="text" name="eddTime"  value="${role.eddTime }"  id="et" onclick="WdatePicker()" onchange="checkTime()"/>
                    </td>
                </tr>

				<tr>
                    <td>职位描述<span style="color:red">*</span>：</td>
                    <td>
                       <textarea cols="70" rows="12">  
					${role.roleRemark }
					 
					   </textarea>
                    </td>                
                </tr>

				<tr>
                    <td>招聘要求<span style="color:red">*</span>：</td>
                    <td>
                       <textarea cols="70" rows="12"> 
					${role.roleRequired }
					   </textarea>
                    </td>                
                </tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value=" 确认 ">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>