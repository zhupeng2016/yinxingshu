<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC >
<html>
<base href="<%=basePath%>">
<title>职位管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.defined.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/zhiwei.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	$("#bt").click(function(){
		var is=confirm("确定添加吗？");
		if(is){
			$("#myForm").submit();
		}
	});
	
});

</script>
</head>

<body>

	<div class="div_head">
		<span> <span style="float: left">当前位置是：-》职位管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="role/rolelist?pageNum=1">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="role/add" method="post" id="myForm" 
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">职位编码<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="roleCode" readonly value="${nextcode }" /></td>
				</tr>

				<tr>
					<td>职位名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="roleName" value="" /><span style="color: red" id="ls"></span></td>
				</tr>
				<tr>
					<td>职位分类<span style="color: red">*</span>：
					</td>
					<td><select name="roleKind">
							<option value="1">管理</option>
							<option value="2">技术</option>
							<option value="3">职能</option>
							<option value="4">业务</option>
					</select><span style="color: red" id="ls"></span></td>
				</tr>
				<tr>
					<td>所属部门<span style="color: red">*</span>：
					</td>
					<td><select name="deptId">
							<c:forEach items="${dls }" var="dept"  >
			<option value="${dept.deptId }" >${dept.deptName }</option>
							</c:forEach>
					</select><span style="color: red" id="ls"></span></td>
				</tr>

				<tr>
					<td>菜单权限<span style="color: red">*</span>：
					</td>
					<td><c:forEach items="${ml }" var="m">
						<c:if test="${m.parentMenu !=0 }"> &nbsp;&nbsp;&nbsp;</c:if>
						<input type="checkbox" name="menuIds" value="${m.menuId }"  />
						${m.menuName }<br />
					</c:forEach>
					<span style="color: red" id="ls"></span></td>
				</tr>


				<tr>
					<td>职位描述<span style="color: red">*</span>：
					</td>
					<td><textarea name="roleIntro"></textarea><span style="color: red" id="ls"></span></td>
				</tr>

				<tr>
					<td>备 注：</td>
					<td><textarea name="roleRemark"></textarea><span style="color: red" id="ls"></span></td>
				</tr>
				<tr>
					<td>是否启用：</td>
					<td><select>
							<option value="0">是</option>
							<option value="1">否</option>
					</select><span style="color: red" id="ls"></span></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="button" id="bt" value="添加">
						<input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>