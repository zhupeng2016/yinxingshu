<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
<base href="<%=basePath%>" />
<meta http-equiv="content-type" content="text/html; 

charset=UTF-8" />

<title>会员列表</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<style>
.tr_color {
	background-color: #9F88FF
}
</style>
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
<script type="text/javascript">
	function del(roleId) {
		var is = confirm("确认删除吗?");
		if (is) {
			location.href = "rec/deleteRole?roleId=" + roleId
					+ "&pageNum=${requestScope.page.pageNum}";
		}
	}
</script>

</head>

<body>
	<div class="div_head">
		<span> <span style="float: left;">当前 位置是：招聘管理-》职位发布管理</span> <span
			style="float: right; margin- right: 8px; font-weight: bold;">
				<a style="text-decoration: none;" href="rec/padd">【添加】</a>
		</span>
		</span>
	</div>

	<div class="div_search">
		<span>
			<form action="#" method="get">
				职位名称: <input type="text" name="roleName" value="" /> 
					
				</select> 职位分类: <select name="roleKind" style="width: 100px;">
					<option value="0"
						<c:if test="${role.roleKind==333 }">selected</c:if>>-请选择-</option>
					<option value="0" <c:if test="${role.roleKind==0 }">selected</c:if>>管理</option>
					<option value="1" <c:if test="${role.roleKind==1 }">selected</c:if>>技术</option>
					<option value="2" <c:if test="${role.roleKind==2 }">selected</c:if>>业务</option>
				</select> 登记日期: <input type="text" name="startTime" readonly
					value="${role.startTime }" id="st" onclick="WdatePicker()"
					onchange="checkTime()" /> 截止日期: <input type="text" name="eddTime"
					value="${role.eddTime }" id="et" onclick="WdatePicker()"
					onchange="checkTime()" /> <input value="查询" type="submit" />

			</form>
		</span>

	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="40px;">职位编码</td>
					<td width="40px;">职位名称</td>
					<td width="40px;">职位分类</td>
					<td width="40px;">所属部门</td>
					<td width="40px;">招聘人数</td>
					<td width="40px;">登记日期</td>
					<td width="40px;">截止日期</td>
					<td align="center" width="70px;">操作</td>
				</tr>
				<c:forEach items="${roleList }" var="roleList">
					<tr id="product1">
						<td>${roleList.roleCode }</td>
						<td><a href="rec/view?roleId=${roleList.roleId }">

								${roleList.roleName }</a></td>
						<c:if test="${roleList.roleKind==0 }">

							<td>管理</td>
						</c:if>
						<c:if test="${roleList.roleKind==1 }">

							<td>技术</td>
						</c:if>
						<c:if test="${roleList.roleKind==2 }">

							<td>业务</td>
						</c:if>
	              <c:if test="${roleList.deptId==0 }">

							<td>银杏树信息管理公司</td>
						</c:if>
						<c:if test="${roleList.deptId==1 }">

							<td>管理部</td>
						</c:if>
						<c:if test="${roleList.deptId==2 }">

							<td>人事部</td>
						</c:if>
						<c:if test="${roleList.deptId==3 }">

							<td>财务部</td>
						</c:if>
						<c:if test="${roleList.deptId==4 }">

							<td>技术部</td>
						</c:if>
						<c:if test="${roleList.deptId==5 }">

							<td>后勤部</td>
						</c:if>
						<td>${roleList.roleNum }</td>
						<td>${roleList.startTime }</td>
						<td>${roleList.eddTime }</td>
						<td><a
							href="rec/viewtwo?roleId=${roleList.roleId }&pageNum=

${requestScope.page.pageNum}">变更</a>

							&nbsp;&nbsp; <a href="javascript:del(${roleList.roleId})">删除</a></td>
					</tr>
				</c:forEach>

				<tr>
					<td colspan="20" style="text-align: center;"><span> <a
							href="rec/demo1?pageNum=1">首页</a> <c:if
								test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.getPageNum() > 1 }">


								<a
									href="rec/demo1?pageNum=

${requestScope.page.getPageNum()-1 }">上一页</a>


							</c:if> <c:forEach items="${requestScope.page.getNavigatepageNums()}"
								var="num">


								<c:if test="${requestScope.page.getPageNum()

==num }">${num }</c:if>


								<c:if test="${requestScope.page.getPageNum()!=num }">


									<a href="rec/demo1?pageNum=${num }"> ${num }</a>


								</c:if>


							</c:forEach> <c:if
								test="${requestScope.page.getPageNum()

==requestScope.page.getPages()}">
				下一页
			</c:if> <c:if
								test="${requestScope.page.getPageNum() < 

requestScope.page.getPages() }">


								<a
									href="rec/demo1?pageNum=

${requestScope.page.getPageNum()+1 }">下一页</a>


							</c:if> <a href="rec/demo1?pageNum=

${requestScope.page.getPages() }">尾页</a>


							<span>总共${requestScope.page.getPages()}页


								总共${requestScope.page.getTotal() }条 </span></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>

</html>