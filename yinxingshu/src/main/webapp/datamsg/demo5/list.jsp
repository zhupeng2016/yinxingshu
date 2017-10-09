<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<!DOCTYPE>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>数据分析</title>

<link href="css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function qingchu() {
		window.location.href = "guanli?flag=query";
	}
</script>
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是数据分析》》》公司各体系结构分析</span>

		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="guanli" method="get">
				年度： <select name="guanliId">
					<option value="999">---请选择---</option>
					<c:forEach items="${l }" var="l">

						<c:if test="${sessionScope.guabliBean.guanliId==l.guanliId }">
							<option value="${l.guanliId }" selected="selected">${l.yean }</option>
						</c:if>

						<c:if test="${sessionScope.guabliBean.guanliId!=l.guanliId }">
							<option value="${l.guanliId }">${l.yean }</option>
						</c:if>

					</c:forEach>
					<!--  <option>2007</option>
                        <option>2008</option>
                        <option>2009</option>
                        <option>2010</option>
                        <option>2012</option> -->
				</select> <input value="查询" type="submit" />
    <input value="清除" type="button"
					onclick="qingchu()">
			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="80%">
			<tbody>
				<tr style="font-weight: bold;">
					<td>
						<table width="100%">
							<tr>
								<td width="100%" style="text-align: right">异动类型</td>
							</tr>
							<tr>
								<td style="text-align: left">时间</td>
							</tr>
						</table>
					</td>
					<td>管理体系--高层</td>
					<td>管理体系--底层</td>
					<td>业务体系</td>
					<td>职能体系</td>
					<td>技术体系</td>
				</tr>
				<c:forEach items="${list }" var="l">
					<tr id="product1">
						<td>${l.yean }</td>
						<td>${l.gaoceng }</td>
						<td>${l.diceng }</td>
						<td>${l.yewu }</td>
						<td>${l.zhineng }</td>
						<td>${l.jishu }</td>
					</tr>
				</c:forEach>
				<!-- <tr id="product1">
                       <td><a href="">2008年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
					<tr id="product1">
                       <td><a href="">2009年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
					<tr id="product1">
                       <td><a href="">2010年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
                    <tr id="product1">
                       <td><a href="">2011年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
                    <tr id="product1">
                       <td><a href="">2012年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr> 
                    <tr id="product1">
                       <td><a href="">2013年</a></td>
                       <td></td>
                       <td></td>
                       <td></td> 
                       <td></td>
                       <td></td>              
                    </tr>  -->
			</tbody>
		</table>
	</div>
</body>
</html>