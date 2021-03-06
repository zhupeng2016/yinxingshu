<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC >
<html>
<base href="<%=basePath%>">
<title>职位管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/mine.css" type="text/css" rel="stylesheet" />
<link type="text/css" rel="stylesheet" href="css/jquery.autocomplete.css"/>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
<script type="text/javascript">
function show(){
	 var msg="${msg}";
	 if(msg!=null && msg!=""){
	 alert(msg);
	 }
};

$(function() {
		//全选   全不选
		$("#checkedAll").click(function() {
			$("input[name='chosen']").prop("checked", $(this).prop("checked"));
		});
		$("#roleName").AutoComplete({
			'data' : 'role/autoComplete', //去服务器获得所有的提示信息
			'width' : "auto",//提示框宽度
			'itemheight' : 30//每个补全信息的高度
		});
	
	});
</script>
</head>
<body onload="show()" >
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：系统管理-》职位设置</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="role/padd">【添加】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="role/rolelist?pageNum=1" method="post">
				职位名称: <input type="text" name="roleName" id="roleName" value="${sessionScope.roleBean.roleName }"/> 
				所属部门: <input type="text"  name="deptName" value="${sessionScope.roleBean.deptName }"/> 
				是否启用: <select name="roleState">
					<option value="999">---请选择---</option>
					<option value="0" <c:if test="${sessionScope.roleBean.roleState==0}">selected</c:if> >启用</option>
					<option value="1"  <c:if test="${sessionScope.roleBean.roleState==1}">selected</c:if> >禁用</option>
				</select> <input value="查询" type="submit" />
  <a href="role/rolelist?method=clear"> <input type="button" value="清空"  /></a>
			</form>
		</span>
	</div>
	
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" id="checkedAll" /></td>
					<td width="40px;">序号</td>
					<td width="80px;">职位编码</td>
					<td>职位名称</td>
					<td width="100px;">职位分类</td>
					<td width="120px;">所属部门</td>
					<td width="120px;">状态</td>
					<td align="center" width="100px;">操作</td>
				</tr>
				
               <c:forEach items="${rls }" var="rl" varStatus="st">
				<tr id="product1">
					<td><input type="checkbox" name="chosen" value="${rl.roleId }" /></td>
					<td>${st.index+1 }</td>
					<td>${rl.roleCode }</td>
					<td><a href="role/look?roleId=${rl.roleId }&pageNum=${page.getPageNum() }">${rl.roleName }</a></td>
					<td>
					<c:if test="${rl.roleKind==1 }">管理</c:if>
					<c:if test="${rl.roleKind==2 }">技术</c:if>
					<c:if test="${rl.roleKind==3 }">业务</c:if>
					<c:if test="${rl.roleKind==4 }">职能</c:if>
					</td>
					<td>${rl.dept.deptName }</td>
					<td>
					<c:if test="${rl.roleState==0 }">启用</c:if>
					<c:if test="${rl.roleState==1 }">禁用</c:if>
                   </td>
					<td><a href="role/pupdate?roleId=${rl.roleId }&pageNum=${page.getPageNum() }">修改</a> <a href="role/delete?roleId=${rl.roleId }&pagenum=${page.getPageNum() }">删除</a></td>
				</tr>
            </c:forEach>



				<tr>
					<td colspan="20" style="text-align: center;">
					<!-- <a
						style="text-decoration: none;" href="#"> 
						首页 上一页 ... 7 8 9 10
							11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a> -->
					<span>
			<a href="role/rolelist?pageNum=1">首页</a>
			<c:if test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if>
			<c:if test="${requestScope.page.getPageNum() > 1 }">
				<a href="role/rolelist?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
			</c:if>
			 &nbsp;&nbsp;
			<c:forEach items="${requestScope.page.getNavigatepageNums()}" var="num" >
					<c:if test="${requestScope.page.getPageNum()==num }">&nbsp;${num }&nbsp;</c:if>
				    <c:if test="${requestScope.page.getPageNum()!=num }">
					<a href="role/rolelist?pageNum=${num }">${num }</a>
				</c:if>
			</c:forEach>
			 &nbsp;&nbsp;
			<c:if test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if>
			 <c:if test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
				<a href="role/rolelist?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
			</c:if>
			 <a href="role/rolelist?pageNum=${requestScope.page.getPages() }">尾页</a>
			<span>总共${requestScope.page.getPages()}页
				总共${requestScope.page.getTotal() }条
		</span> 	
									
							
							</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>