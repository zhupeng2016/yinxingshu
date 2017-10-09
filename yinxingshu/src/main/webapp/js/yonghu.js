var result;
$(function(){
	result = $("#myForm").validate({
		rules:{
			"loginName":{
				required: true, //必填项
				remote:{
					url:"user/onlyone",
					type:"post",
					dataType:"json",
					data:{
						"method":"onlyOne",
						"loginName":function(){
							return $("#loginname").val()
						}
					}
				}
			},
			"sex":{
				required:true
			},
			"password":{
				required:true,
				maxlength:20,
				minlength:6
			},
			"password2":{
				required:true,
				equalTo:$("#password")
			},
			"deptId":{
				required: true //必填项
			},
			"roleId":{
				required: true //必填项
			},
			"userName":{
				required: true //必填项
			},
			"idCard":{
				required: true //必填项
			},
			"userEmail":{
				required:true,
				email:true
			},
			"mobilePhone":{
				required:true,
				mobilePhone:true
			},
			"userTime":{
				required:true
			}
			
		},
		messages:{
			"loginName":{
				required: "登录账号不能为空!",
				remote:"该账号已使用！"
			},
			"sex":{
				required:"请选择性别!"
			},
			"password":{
				required:"密码不能为空!",
				maxlength:"请输入6-20位密码!",
				minlength:"请输入6-20位密码!"
			},
			"password2":{
				required:"再次输入密码!",
				equalTo:"两次输入密码不一致!"			
			},
			"deptId":{
				required: "部门不能为空!"
			},
			"roleId":{
				required: "职位不能为空!"
			},
			"userName":{
				required: "姓名不能为空!"
			},
			"idCard":{
				required: "身份证号不能为空!"
					
			},
			"userEmail":{
				required:"邮箱不能为空!",
				email:"邮箱格式不正确!"
			},
			"mobilePhone":{
				required:"手机号不能为空!",
				mobilePhone:"手机号格式不正确!"
			},
			"userTime":{
				required:"请选择时间!"
			}
		},
		errorPlacement: function(error,element) {
			if(element.is(":radio") || element.is(":checkbox") ){
				element.nextAll("span").html(error.text());
			}else{
				element.next().html(error.text());
			}
		},
		success:function(label)	{
			label.html();
		}
	});
});