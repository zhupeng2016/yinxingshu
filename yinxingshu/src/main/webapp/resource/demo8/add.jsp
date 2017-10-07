<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>菜单管理</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<link href="css/mine.css" type="text/css" rel="stylesheet">

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.defined.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/caidan.js"></script>
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
		<span> <span style="float: left">当前位置是：-》菜单管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold"> <a
				style="text-decoration: none" href="menu/menulist?pageNum=1">【返回】</a>
		</span>
		</span>
	</div>
	<div></div>

	<div style="font-size: 13px; margin: 10px 5px">
		<form action="menu/add" method="post" id="myForm" 
			enctype="multipart/form-data">
			<table border="1" width="100%" class="table_a">
				<tr>
					<td width="120px;">菜单名称<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="menuName" value="" />
					<span style="color: red"></span></td>
				</tr>
				<tr>
					<td>上级菜单<span style="color: red">*</span>：
					</td>
					<td><select name="parentMenu" >
					<c:forEach items="${mls }" var="ml" >
					    <c:if test="${ml.parentMenu==0 }">
					       <option  value="${ml.menuId }" >${ml.menuName }</option>
					    </c:if>
					</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>URL<span style="color: red">*</span>：
					</td>
					<td><input type="text" name="url" value=" " /></td>
				</tr>

				<tr>
					<td>状态<span style="color: red">*</span>：
					</td>
					<td><select name="menuState">
							<option  value="0" >启用</option>
							<option  value="1" >禁用</option>
					</select></td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><input type="text"  name="menuRemark" value="" />
					</td>
				</tr>




				<tr>
					<td colspan="2" align="center"><input type="button" id="bt" value="确认">
						<input type="reset" value="清空"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>