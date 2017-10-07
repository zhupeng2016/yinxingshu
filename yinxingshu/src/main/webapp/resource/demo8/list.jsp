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

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<link type="text/css" rel="stylesheet"	href="css/jquery.autocomplete.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
<style>
.tr_color {
	background-color: #9F88FF
}
</style>

<script type="text/javascript">
 function show(){
	 var msg="${msg}";
	 if(msg!=null && msg!=""){
	 alert(msg);
	 }
 }
 
 $(function() {
		$("#mn").AutoComplete({
			 'data' : 'menu/autoComplete', //去服务器获得所有的提示信息
		 	 'width' : "auto", //提示框宽度
			'itemheight' : 30//每个补全信息的高度
			
		
		/* 	width:"auto",
	        url:'menu/autoComplete',
	        callback:function(data){
	            //alert(data.title);    
	        } */
		
		});
	
	});
</script>
</head>
<body onload="show()">

	<div class="div_head">
		<span> <span style="float: left;">当前位置是：系统管理-》菜单管理</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> <a
				style="text-decoration: none;" href="menu/padd">【添加】</a>
		</span>
		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="menu/menulist?pageNum=1" method="post" >
				菜单名称: <input type="text" name="menuName" id="mn" value="${sessionScope.menuBean.menuName }" /> 
				状态: <select name="menuState" id="mstate">
					<option value="999">-请选择-</option>
					<option value="0" <c:if test="${sessionScope.menuBean.menuState==0}">selected</c:if> >启用</option>
					<option value="1" <c:if test="${sessionScope.menuBean.menuState==1}">selected</c:if>>禁用</option>
				</select>&nbsp;&nbsp;&nbsp;
				
				 <input value="查询" type="submit" />&nbsp;
                <a href="menu/menulist?method=clear"> <input type="button" value="清空"  /></a>
			</form>
		</span>
	</div>


	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="30px;"><input type="checkbox" name="ms" /></td>
					<td width="30px;">序号</td>
					<td width="100pxpx;">菜单名称</td>
					<td>URL</td>
					<td width="100px;">状态</td>

					<td align="center" width="140px;">操作</td>
				</tr>
				
				<c:forEach items="${mls }" var="ml" varStatus="st"> 
				<tr id="product1">
					<td><input type="checkbox" value="${ml.menuId }" /></td>
					<td>${st.index+1 }</td>
					<td>${ml.menuName }</td>
					<td><a href="view.html">${ml.url }</a></td>
					<td>
					<c:if test="${ml.menuState ==0 }">启用</c:if>
					<c:if test="${ml.menuState ==1 }">禁用</c:if>
				  
					</td>
					<td><a href="menu/look?menuId=${ml.menuId }&pageNum=${page.getPageNum() }">查看</a> &nbsp;&nbsp;&nbsp;
					<a href="menu/pupdate?menuId=${ml.menuId }&pageNum=${page.getPageNum() }">修改</a> &nbsp;&nbsp;&nbsp;
					<a href="menu/delete?menuId=${ml.menuId }&pageNum=${page.getPageNum() }">删除</a></td>
				</tr>
				</c:forEach>
				
				
				


				<!-- <tr id="product1">
					<td>2</td>
					<td><input type="checkbox" /></td>
					<td>培训惯例</td>
					<td><a href="view.html">px/px.do</a></td>
					<td>启用</td>
					<td><a href="add.html">修改</a> <a href="#">删除</a></td>
				</tr>
 -->
				<tr>
					<td colspan="20" style="text-align: center;"><!-- <a
						style="text-decoration: none;" href="#"> 首页 上一页 ... 7 8 9 10
							11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a> -->
							
						<span>
			<a href="menu/menulist?pageNum=1">首页</a>
			<c:if test="${requestScope.page.getPageNum() == 1 }">
				上一页
			</c:if>
			<c:if test="${requestScope.page.getPageNum() > 1 }">
				<a href="menu/menulist?pageNum=${requestScope.page.getPageNum()-1 }">上一页</a>
			</c:if>
			 &nbsp;&nbsp;
			<c:forEach items="${requestScope.page.getNavigatepageNums()}" var="num" >
					<c:if test="${requestScope.page.getPageNum()==num }">&nbsp;${num }&nbsp;</c:if>
				    <c:if test="${requestScope.page.getPageNum()!=num }">
					<a href="menu/menulist?pageNum=${num }">${num }</a>
				</c:if>
			</c:forEach>
			 &nbsp;&nbsp;
			<c:if test="${requestScope.page.getPageNum()==requestScope.page.getPages()}">
				下一页
			</c:if>
			 <c:if test="${requestScope.page.getPageNum() < requestScope.page.getPages() }">
				<a href="menu/menulist?pageNum=${requestScope.page.getPageNum()+1 }">下一页</a>
			</c:if>
			 <a href="menu/menulist?pageNum=${requestScope.page.getPages() }">尾页</a>
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