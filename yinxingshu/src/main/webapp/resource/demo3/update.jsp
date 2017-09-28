<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>

<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
 <script type="text/javascript">
    $(function(){
    	
        $("#bt").click(function(){
        	
        	$.ajax({
        		url:'emp/ajax2',
        		aysnc:true,
        		type:'get',
        	datatype:'json',
        	data:$("#myForm").serialize(),
        	success:function(res){}
        	});
        	$("#myForm").submit();
        });
    }); 
    
    
    
    </script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》职位管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="rec/rolelist">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="rec/update?roleId=${rb.roleId }" method="post" id="myForm" 
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">职位编码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="roleCode" value="${rb.roleCode }"
						readonly="readonly" /></td>
				</tr>

				<tr>
					<td>职位名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="roleName" value="${rb.roleName }"  /></td>
				</tr>
				<tr>
					<td>职位分类<span style="color: red">*</span>：
					</td>
					<td><select name="roleKind">
							<option value="1"
								<c:if test="${rb.roleKind == 1 }">selected</c:if>>管理</option>
							<option value="2"
								<c:if test="${rb.roleKind == 2 }">selected</c:if>>
								技术</option>
							<option value="3"
								<c:if test="${rb.roleKind == 3 }">selected</c:if>>职能</option>
							<option value="4"
								<c:if test="${rb.roleKind == 4 }">selected</c:if>>业务</option>
					</select></td>
				</tr>
				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId">
							<c:forEach items="${dls }" var="dept"  >
			<option value="${dept.deptId }" <c:if test="${dept.deptId==rb.dept.deptId }">selected</c:if> >${dept.deptName }</option>
							</c:forEach>
							<!-- <option value="0" selected="selected">银杏树</option>
							<option value="1">人事部</option> -->
					</select></td>
				</tr>

				<tr>
					<td>菜单权限<span style="color: red">*</span>：
					</td>
					<td > 
					
					<c:forEach items="${ml }" var="m">
						<c:if test="${m.parentMenu !=0 }"> &nbsp;&nbsp;&nbsp;</c:if>
						<input type="checkbox" name="menuIds" value="${m.menuId }" <c:if test="${m.is }">checked</c:if> />
						${m.menuName }<br />
					</c:forEach>
					
					</td>   
					      <!-- <input type="checkbox" />个人信息修改  <br /> 
					       &nbsp;&nbsp;&nbsp;<input type="checkbox" />密码修改<br /> 
					       <input type="checkbox" />薪酬管理<br />
						          &nbsp;&nbsp;&nbsp;<input type="checkbox" />薪酬标准管理<br />
						          &nbsp;&nbsp;&nbsp;<input type="checkbox" />薪酬标准审批<br />
						          &nbsp;&nbsp;&nbsp;<input type="checkbox" />薪酬发放管理<br /> -->
				</tr>


				<tr>
					<td>职位描述<span style="color: red">*</span>：
					</td>
					<td><textarea name="roleIntro">${rb.roleIntro }</textarea></td>
				</tr>

				<tr>
					<td>备 注：</td>
					<td><textarea name="roleRemark">${rb.roleRemark }</textarea></td>
				</tr>
				<tr>
					<td>是否启用：</td>
					<td><select name="roleState">
							<option value="0"
								<c:if test="${rb.roleState == 0 }">selected</c:if>>启用</option>
							<option value="1"
								<c:if test="${rb.roleState == 1 }">selected</c:if>>禁用</option>
					</select></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="button" value="确定" id="bt">
						<input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>