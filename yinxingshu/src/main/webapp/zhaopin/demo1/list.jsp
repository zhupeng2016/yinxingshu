<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>    
<!DOCTYPE >
<html>
  <head>
  <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>会员列表</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
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
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：招聘管理-》职位发布管理</span>
                 <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="rec/padd">【添加】</a>
                </span>
            </span>
        </div>
        
        <div class="div_search">
            <span>
                <form action="#" method="get">
				 职位名称: 
					<input type="text"  />
                    职位分类: 
					<select name="s_product_mark" style="width: 100px;">

                        <option selected="selected" >-请选择-</option>
						<option value="0">管理</option>
                        <option value="1">技术</option>
						<option value="2">业务</option>
                    </select>
                   
					 登记日期: 
					<input type="text"  id="st" onclick="WdatePicker()" onchange="checkTime()"/>
                    截止日期:<input type="text"  id="et" onclick="WdatePicker()" onchange="checkTime()"/>
					
					<input value="查询" type="submit" />
					
                </form>
            </span>
			
        </div>
		 <!--  <div style="font-size: 13px; margin: 10px 5px;">
		  <p><a href="add.html"><button style="background-color:#E8F2FC">职位发布登记 </button></a></p>
		  </div> -->
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">职位编码</td>
                        <td width="40px;">职位名称</td>						
                        <td width="40px;">职位分类</td>
                        <td width="40px;">所属部门</td>
						<td width="40px;">招聘人数</td>
                        <td width="40px;">登记日期</td>
						<td width="40px;">截止日期</td>						
                        <td align="center" width="70px;">操作</td>
                    </tr>
                    <c:forEach items="${list }" var="roleList">
                    <tr id="product1">
                        <td>${roleList.roleCode }</td>
                        <td><a href="rec/view?roleId=${roleList.roleId }">${roleList.roleName }</a></td>
                        <c:if test="${roleList.roleKind==0 }"><td>管理</td></c:if>
						<c:if test="${roleList.roleKind==1 }"><td>技术</td></c:if>
						<c:if test="${roleList.roleKind==2 }"><td>业务</td></c:if>
					
						<c:if test="${roleList.deptId==1 }"><td>管理部</td></c:if>
                         <c:if test="${roleList.deptId==2 }"><td>人事部</td></c:if>
                         <c:if test="${roleList.deptId==3 }"><td>财务部</td></c:if>
                         <c:if test="${roleList.deptId==4 }"><td>技术部</td></c:if>
                         <c:if test="${roleList.deptId==5 }"><td>后勤部</td></c:if>
                         <%-- <c:if test="${roleList.deptId==6 }"><td></td></c:if>
                         <c:if test="${roleList.deptId==7 }"><td></td></c:if> --%>
						<td>${roleList.roleNum }</td> 						
                        <td>${roleList.startTime }</td>
						<td>${roleList.eddTime }</td>
                        <td><a href="rec/viewtwo?roleId=${roleList.roleId }">变更</a> &nbsp;&nbsp;<a href="#">删除</a> </td>                        
                    </tr> 
                    </c:forEach>
					 <!-- <tr id="product1">
                        <td>BDQN-BM03</td>
                        <td><a href="view.html">技术培训师</a></td>
						<td>技术</td>
                        <td>产品设计中心</td> 
						<td>5</td> 						
                        <td>2013-10-18</td>
						<td>2013-10-23</td>
                        <td><a href="edit.html">变更</a> &nbsp;&nbsp;<a href="#">删除</a> </td>                        
                    </tr>  -->
					
                    <tr>
                        <td colspan="8" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
