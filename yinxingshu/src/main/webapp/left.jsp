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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/admin.css" type="text/css" rel="stylesheet" />
<script language=javascript>
	function expand(el) {
		childobj = document.getElementById("child" + el);
		if (childobj.style.display == 'none') {
			childobj.style.display = 'block';
		} else {
			childobj.style.display = 'none';
		}
		return;
	}
</script>
</head>
<body background=img/menu_bg.jpg>
	<table height="100%" cellspacing=0 cellpadding=0 width=170
		background=img/menu_bg.jpg border=0>
		<tr>
			<td valign=top align=middle>
				<table cellspacing=0 cellpadding=0 width="100%" border=0>
					<tr>
						<td height=10></td>
					</tr>
				</table> <c:forEach items="${sessionScope.ml }" var="m" varStatus="st">
					<c:if test="${m.parentMenu == 0 }">
						<table cellspacing=0 cellpadding=0 width=150 border=0>
							<tr height=22>
								<td style="padding-left: 30px" background=img/menu_bt.jpg>
									<a class=menuparent onclick="expand(${m.menuId})"
									href="javascript:void(0);">${m.menuName }</a>
								</td>
							</tr>
							<tr height=4>
								<td></td>
							</tr>
						</table>
					</c:if>

					<table id="child${m.menuId}" style="display: none" cellspacing=0
						cellpadding=0 width=150 border=0>
						<c:forEach items="${sessionScope.ml }" var="mm">
							<c:if test="${mm.parentMenu == m.menuId }">
								<tr height=20>
									<td align=middle width=30><img height=9
										src="img/menu_icon.gif" width=9></td>
									<td><a class=menuchild href="${mm.url }" target="right">${mm.menuName }</a>
									</td>
								</tr>
							</c:if>
						</c:forEach>
						<tr height=4>
							<td colspan=2></td>
						</tr>
					</table>
				</c:forEach>
			</td>
			<td width=1 bgcolor=#d1e6f7></td>
		</tr>
	</table>
</body>
</html>