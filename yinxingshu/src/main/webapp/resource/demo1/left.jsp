<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <link href="css/admin.css" type="text/css" rel="stylesheet" />
		<link rel="StyleSheet" href="resource/demo1/dtree/dtree.css" type="text/css" />
		<script type="text/javascript" src="resource/demo1/dtree/dtree.js"></script>
		<script type="text/javascript"></script>
		<script type="text/javascript">
            function expand(el)
            {
                childobj = document.getElementById("child" + el);

                if (childobj.style.display == 'none')
                {
                    childobj.style.display = 'block';
                }
                else
                {
                    childobj.style.display = 'none';
                }
                return;
            }
        </script>
    </head>
    <body>
	
        <table height="100%" cellspacing=0 cellpadding=0  width=170px    border=0>
            <tr>
                <td valign=top align=middle>
                   

				   <table cellspacing=0 cellpadding=0 width="100%" border=0>
						<tr>
                            <td height=10></td>
						</tr>
					</table>
               			
				</td>
                <td width=1 bgcolor=#d1e6f7></td>
            </tr>
        </table>
        
		<script type="text/javascript">
					
					d = new dTree('d');
					d.config.target = "main_right";
					d.add(0,-1,'部门管理');	
					
			  <c:forEach items="${deptlist }" var="dt">
		            d.add("${dt.deptId}","${dt.parentDept}",""+"${dt.deptShortName}"+"","dept/showDept/${dt.deptId}");
		        </c:forEach>
					
					
			/* 	    d.add(1,0,'人事部','view.html');
					d.add(2,0,'财务部','view.html');
					d.add(3,0,'教学部','view.html');
					d.add(4,3,'教务','view.html');					
					d.add(5,3,'教学','view.html');
					d.add(6,3,'项目','view.html?id=3');	
					d.add(7,0,'业务部门','view.html');	
					d.add(8,7,'业务一部','view.html');	
					d.add(9,7,'业务二部','view.html');	
					d.add(10,7,'业务三部','view.html');	
					d.add(11,7,'业务四部','view.html');	
					d.add(12,7,'业务五部','view.html');	
					d.add(13,7,'业务六部','view.html');	 */					
					document.write(d);
					
				</script>
   
   </body>
</html>