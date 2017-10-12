<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML >
<html>
    <head>
    <base href="<%=basePath%>">
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>人事管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript">
		function clear(){
			  window.location.href="RecordManage?pageNum=1&query=query";
		}
		
		</script>
		
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
                <span style="float: left;">当前位置是：人事管理-》人事档案管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="prepareData">【档案登记】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="" method="get">
                   姓名: 
					<input type="text" name="archiveName"   value="" />
					 审核状态: 
					<select>
						<option>--请选择--</option>
						<option>起草</option>
						<option>审核中</option>
						<option>审核通过</option>
						<option>驳回</option>
						<option>变更</option>
						<option>变更审核中</option>
					</select>
					档案状态：
					<select>
						<c:if test="${sessionScope.rb.archiveState==0 }">
					<option value="999">--请选择---</option>
					<option value="0" selected="selected">试用期</option>
					<option value="1">正式员工</option>
					<option value="2">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${sessionScope.rb.archiveState==1 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" selected="selected">正式员工</option>
					<option value="2">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${sessionScope.rb.archiveState==2 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2" selected="selected">离职</option>
					<option value="3">已删除</option>
					</c:if>
					<c:if test="${sessionScope.rb.archiveState==3 }">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2">离职</option>
					<option value="3" selected="selected" >已删除</option>
					</c:if>
					<c:if test="${sessionScope.rb.archiveState==null|| sessionScope.rb.archiveState==''||sessionScope.rb.archiveState==999}">
					<option value="999">--请选择---</option>
					<option value="0" >试用期</option>
					<option value="1" >正式员工</option>
					<option value="2">离职</option>
					<option value="3"  >已删除</option>
					</c:if>
					</select>
					建档时间：
					<input type="text" id="st" onclick="WdatePicker()" onchange="checkTime()" name="startTime" value="${sessionScope.rb.startTime }" /> 至 
				<input type="text" id="et" onclick="WdatePicker()" onchange="checkTime()" name="endTime" value="${sessionScope.rb.endTime }" />
				 <input value="查询" type="submit" />
				 <input value="清空" type="button" onclick="clear()">
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="80px;">档案编码</td>
                        <td >姓名</td>
						<td>性别</td>
						<td>所属部门</td>
						<td>职位</td>
						<td>职称</td>
						<td>建档日期</td>
						<td>审核状态</td>
						<td>档案状态</td>                      
                        <td align="center" width="100px;">操作</td>
                    </tr>

           <c:forEach    items="${recordList}"  var="r">
                    <tr id="product1">
                        <td><input type="checkbox" /></td>
						<td>${r.archiveCode}</td>
						<td>${r.archiveName}</td>
						<td>
						<c:if test="${r.archiveSex==0}">男</c:if>
						<c:if test="${r.archiveSex==1}">女</c:if>
						</td>
						<td>${r.archiveDept}</td>
						<td>${r.archiveDuty}</td>
						<td>${r.archiveTitle}</td>
						<td>${r.archiveTime}</td>
						<td>
						<c:if test="${r.auditState==0}">起草</c:if>
						<c:if test="${r.auditState==1}">审核通过</c:if>
						<c:if test="${r.auditState==2}">驳回</c:if>
						<c:if test="${r.auditState==3}">审核中</c:if>
						<c:if test="${r.auditState==4}">变更审核中</c:if>
						<c:if test="${r.auditState==5}">待审批</c:if>
						</td>
						<td>
						<c:if test="${r.archiveState==0}">试用期</c:if>
						<c:if test="${r.archiveState==1}">正式员工</c:if>
						<c:if test="${r.archiveState==2}">离职</c:if>
						<c:if test="${r.archiveState==3}">已删除</c:if>
						</td>
						<td>
						<c:if test="${r.auditState==3||r.auditState==4}">
							<a href="queryOneRecord?archiveId=${r.archiveId}">明细</a>
						</c:if>
							<c:if test="${r.auditState==0&&r.archiveState==0}">
							<a href="edit.html">修改</a>
							<a href="view.html">明细</a>
							</c:if>
							<c:if test="${r.auditState==1&&r.archiveState==1}">
							<a href="biangeng.html">变更</a>
							<a href="view.html">明细</a>
							</c:if>
							<c:if test="${r.auditState==1&&r.archiveState==2}">
							<a href="biangeng.html">变更</a>
							<a href="view.html">明细</a>
							<a href="#">删除</a>
							</c:if>
							<c:if test="${r.auditState==2&&r.archiveState==1}">
							<a href="fuhe.html">复核</a>
							<a href="view.html">明细</a>
							</c:if>
							<c:if test="${r.auditState==1&&r.archiveState==3}">
							<a href="view.html">明细</a>
							<a href="#">永久删除</a>
							<a href="#">恢复</a>
							</c:if>
						</td>
                    </tr>
					</c:forEach>
					 <!-- 分页中的get是什么意思？和组里他人的不一样 -->
					<tr>
					<td colspan="11" style="text-align: center;"><span> <a
							href="RecordManage?pageNum=1">首页</a> <c:if
								test="${requestScope.page.pageNum == 1 }">
				上一页
			</c:if> <c:if test="${requestScope.page.pageNum > 1 }">
								<a href="RecordManage?pageNum=${requestScope.page.pageNum-1 }">上一页</a>
							</c:if> <c:forEach items="${requestScope.page.navigatepageNums}"
								var="num">
								<c:if test="${requestScope.page.pageNum==num }">${num }</c:if>
								<c:if test="${requestScope.page.pageNum!=num }">
									<a href="RecordManage?pageNum=${num }">${num }</a>
								</c:if>
							</c:forEach> <c:if
								test="${requestScope.page.pageNum==requestScope.page.pages}">
			        	下一页
			          </c:if>
			    
			     <c:if test="${requestScope.page.pageNum < requestScope.page.pages }">
								<a href="RecordManage?pageNum=${requestScope.page.pageNum+1 }">下一页</a>
							</c:if> <a href="RecordManage?pageNum=${requestScope.page.pages }">尾页</a>
							<span>总共${requestScope.page.pages}页
								总共${requestScope.page.total }条 </span></td>
				</tr>
					
                    
                </tbody>
            </table>
        </div>
    </body>
</html>