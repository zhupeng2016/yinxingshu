<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
     <base href="<%=basePath%>">
        <title>入职办理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》 录用管理 -》入职办理</span>
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
                    <td><input type="text" name="f_goods_name" value="CWB000001" /></td>
                </tr>
                <tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
						<td>
							<select>
								<option>--请选择--</option>
								<option>--人事部--</option>
								<option selected="selected">--财务部--</option>
								<option >--技术部--</option>
								<option>--研发部--</option>
							</select>
						</td>
                </tr>
               
                <tr>
                    <td>档案状态<span style="color:red">*</span>：</td>
                    <td>
						<select>
							<option>--请选择--</option>
							<option>试用期</option>
							<option>正式员工</option>
							<option>实习员工</option>
						</select>
					</td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="f_goods_image" value="技术培训师" />
					</td>
                </tr>
                <tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="" readonly value="BM0011" />
                    </td>
                </tr>


				<tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image"  value="张华"/>
                    </td>                
                </tr>

				<tr>
                    <td>性别<span style="color:red">*</span>：</td>
                    <td>
                        <input type="radio" checked value="1"/>男 <input type="radio" value="0"/>女
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="**@sina.com"/>
                    </td>                
                </tr>

				<tr>
                    <td>联系电话<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="13988877753" />
                    </td>                
                </tr>

				<tr>
                    <td>住址<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="北京市朝阳区团结湖101号" />
                    </td>                
                </tr>
				<tr>
                    <td>身份证号<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="4118876546897865689" />
                    </td>                
                </tr>
				<tr>
                    <td>户口所在地：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="北京市" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="党员"/>
                    </td>                
                </tr>	

				<tr>
                    <td>毕业院校：</td>
                    <td>
						 <input type="text" readonly name="f_goods_name" value="北京航空航天大学" />
                    </td>
                </tr>


				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="计算机应用与科学"/>
                    </td>                
                </tr>
				<tr>
                    <td>学历：</td>
                    <td>
                        <select>
							<option>--请选择--</option>
							<option>专科</option>
							<option>本科</option>
							<option selected>硕士</option>
							<option>博士</option>
						</select>
                    </td>                
                </tr>
				<tr>
                    <td>薪酬标准：</td>
                    <td>
                        <select>
							<option>--请选择--</option>
							<option>高级软件工程师</option>
							<option>中级软件工程师</option>
							<option selected>初级软件工程师</option>
						</select>
                    </td>                
                </tr>
				<tr>
                    <td>开户行：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="工行北京市团结湖支行"/>
                    </td>                
                </tr>
				<tr>
                    <td>银行卡号：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="63304578623159"/>
                    </td>                
                </tr>
				<tr>
                    <td>社保卡号：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="63304578623159"/>
                    </td>                
                </tr>
				<tr>
                    <td>登记人：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="当前登录人"  readonly="readonly"/>
                    </td>                
                </tr>
				<tr>
                    <td>建档时间：</td>
                    <td>
                        <input type="text" readonly="readonly" name="f_goods_image" value="当前系统时间 年月日"/>
                    </td>                
                </tr>
				<tr>
                    <td>个人履历：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>家庭关系信息：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>备注：</td>
                    <td>
                        <textarea></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>简历附件：</td>
                    <td>
                        <a href="">***的简历.zip</a>
                    </td>                
                </tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加">
						<input type="reset" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>