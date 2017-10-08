var result;
$(function(){
	result = $("#myForm").validate({
		rules:{
			"deptCode":{
				required: true, //必填项
			},
			"deptShortName":{
				required:true
			},
			"deptIntro":{
				maxlength:100
			},
			"deptName":{
				required:true,
			},
			"deptAddress":{
				required: true //必填项
			}
		},
		messages:{
			"deptCode":{
				required: "部门编码不能为空!",
			},
			"deptShortName":{
				required:"部门简称不能为空!"
			},
			"deptIntro":{
				maxlength:"请输入0-100个字!",
			},
			"deptName":{
				required:"部门全称不能为空!",
			},
			"deptAddress":{
				required: "地址不能为空!"
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