<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta http-equiv=content-type content="text/html; charset=utf-8" />
<meta http-equiv=pragma content=no-cache />
<meta http-equiv=cache-control content=no-cache />
<meta http-equiv=expires content=-1000 />

<title>银杏树人力资源管理V1.0</title>
<script type="text/javascript">
	function show(){
		var msg = "${msg}";
		if (msg != null && msg != "") {
			alert(msg);
		}
	}
</script>

</head>

	
<frameset cols="170, *" onload="show()">
	<frame name=left src="resource/demo1/left.jsp" frameborder=0 noresize />
                <frame name=main_right src="resource/demo1/wecom.jsp"
		frameborder=0 noresize scrolling=yes />
		</frameset>		
    <noframes>	
    </noframes>
   

</html>