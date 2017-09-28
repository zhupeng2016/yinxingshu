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
		<title>职位发布登记</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<link href="../../css/mine.css" type="text/css" rel="stylesheet">
	</head>

	<body>

		<div class="div_head">
			<span>
                <span style="float:left">当前位置是：职位发布管理-》职位发布登记</span>
			<span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
			</span>
		</div>
		<div></div>

		<div style="font-size: 13px;margin: 10px 5px">
			<form action="list.html" method="post" enctype="multipart/form-data">
				<table border="1" width="100%" class="table_a">
					<tr>
						<td width="120px;">部门<span style="color:red">*</span>：</td>
						<td>
							<select>
								<option>人事部</option>
								<option>财务部</option>
								<option selected>技术部</option>
								<option>研发部</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>招聘类型<span style="color:red">*</span>：</td>
						<td>
							<select>
								<option>-请选择-</option>
								<option>校园招聘</option>
								<option>社会招聘</option>
							</select>
						</td>
					</tr>

					<tr>
						<td>招聘人数<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="" value="5" /></td>
					</tr>
					<tr>
						<td>职位名称<span style="color:red">*</span>：</td>
						<td>
							<select>
								<option>-请选择-</option>
								<option>高级工程师</option>
								<option>研发工程师</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>职位编码<span style="color:red">*</span>：</td>
						<td>
							<input type="text" readonly name="positionnum" value="JS001" />
						</td>
					</tr>
					<tr>
						<td>职位分类<span style="color:red">*</span>：</td>
						<td>
							<input type="text" readonly name="positioncategory" value="技术" />
						</td>
					</tr>
					<tr>
						<td>登记人<span style="color:red">*</span>：</td>
						<td>
							<input type="text" readonly name="f_goods_image" value="当前登录人" />
						</td>
					</tr>
					<tr>
						<td>登记时间<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="f_goods_image" readonly value="2015-10-28" />
						</td>
					</tr>
					<tr>
						<td>截止时间<span style="color:red">*</span>：</td>
						<td>
							<input type="text" name="f_goods_image" readonly value="2015-11-28" />
						</td>
					</tr>

					<tr>
						<td>职位描述<span style="color:red">*</span>：</td>
						<td>
							<textarea cols="70" rows="12">  
					 1、负责指导java产品技术方向，研发java教育产品。
					   2、为java产品提供专家级的技术支持。
					 
					   </textarea>
						</td>
					</tr>

					<tr>
						<td>招聘要求<span style="color:red">*</span>：</td>
						<td>
							<textarea cols="70" rows="12"> 
					  技能要求：
				1、至少5年以上大型B/S架构软件开发经验。
				2、精通SSH，有2年以上的使用经验持。
				3、至少具有一种主流数据库系统的缝隙使用经验，精通sql，熟悉基本的性能优化方法。
				4、。。。
				5.。。。
				素质要求：
				1、     热爱IT职业教育行业，具有良好的基本技术素质。
				2、     有较强的学习能力，沟通，表达能力强，有良好工作习惯。
				3、     。。。
				4、     。。。
					   </textarea>
						</td>
					</tr>

					<tr>
						<td colspan="2" align="center">
							<input type="submit" value=" 发布 ">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>