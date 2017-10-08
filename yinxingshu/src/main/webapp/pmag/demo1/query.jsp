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
        <title>人事档案管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》人事管理 -》人事档案管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">档案编码<span style="color:red">*</span>：</td>
                    <td><input type="text" name="" value="${recordBean.archiveCode}" readonly /></td>
                </tr>
                <tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="" value="${recordBean.archiveDept}" readonly /> 
                    </td>
                </tr>
               
                <tr>
                    <td>档案状态<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="" value="${recordBean.archiveState}" readonly /> 
					</td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="f_goods_image" readonly value="${recordBean.archiveDuty}" />
					</td>
                </tr>
                <tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveDutyCode}" />
                    </td>
                </tr>


				<tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image"  readonly value="${recordBean.archiveName}"/>
                    </td>                
                </tr>

				<tr>
                    <td>性别：</td>
                    <td>
                        <c:if test="${recordBean.archiveSex==0}">男</c:if>
                        <c:if test="${recordBean.archiveSex==1}">女</c:if>
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveEmail}"/>
                    </td>                
                </tr>

				<tr>
                    <td>联系电话：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archivePhone}" />
                    </td>                
                </tr>

				<tr>
                    <td>住址：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveAddress}" />
                    </td>                
                </tr>
				<tr>
                    <td>身份证号：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveCardId}" />
                    </td>                
                </tr>
				<tr>
                    <td>户口所在地：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveHomeAddress}" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archivePolitics}"/>
                    </td>                
                </tr>	

				<tr>
                    <td>毕业院校：</td>
                    <td>
						 <input type="text" readonly name="f_goods_name" readonly value="${recordBean.archiveGraduateSchool}" />
                    </td>
                </tr>


				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveMajor}"/>
                    </td>                
                </tr>
				<tr>
                    <td>学历：</td>
                    <td>
                   <input type="text" name="f_goods_image" readonly value="${recordBean.archiveEducation}"/>
                    </td>                
                </tr>
				<tr>
                    <td>薪酬标准：</td>
                    <td>
                     <input type="text" name="f_goods_image" readonly value="${recordBean.archiveSalary}"/>
                    </td>                
                </tr>
				<tr>
                    <td>开户行：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.bank}"/>
                    </td>                
                </tr>
				<tr>
                    <td>银行卡号：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.bankCard}"/>
                    </td>                
                </tr>
				<tr>
                    <td>社保卡号：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.socialCard}"/>
                    </td>                
                </tr>
				<tr>
                    <td>登记人：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="hanlu"/>
                    </td>                
                </tr>
				<tr>
                    <td>建档时间：</td>
                    <td>
                        <input type="text" name="f_goods_image" readonly value="${recordBean.archiveTime}"/>
                    </td>                
                </tr>
				<tr>
                    <td>个人履历：</td>
                    <td>
                     <input type="text" name="f_goods_image" readonly value="${recordBean.archiveResume}"/>
                    </td>                
                </tr>
				<tr>
                    <td>家庭关系信息：</td>
                    <td>
                       <input type="text" name="f_goods_image" readonly value="${recordBean.familyInfor}"/>
                    </td>                
                </tr>
				<tr>
                    <td>备注：</td>
                    <td>
                       <input type="text" name="f_goods_image" readonly value="${recordBean.archiveRemark}"/>
                    </td>                
                </tr>
				<tr>
                    <td>简历附件：</td>
                    <td>
                        <a href="">张华个人简历.doc</a>
                    </td>                
                </tr>
				
               
            </table>
            </form>
        </div>
    </body>
</html>