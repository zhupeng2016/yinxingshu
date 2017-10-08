var result;
$(function(){
	result = $("#myForm").validate({
		rules:{
			"roleName":{
				required: true, //必填项
			},
			"menuIds":{
				required:true
			},
			"roleIntro":{
				required:true,
			},
			"roleRemark":{
				maxlength:100
			}
		},
		messages:{
			"roleName":{
				required: "职位名称不能为空!",
			},
			"menuIds":{
				required:"请选择权限!"
			},
			"roleIntro":{
				required:"描述不能为空!",
			},
			"roleRemark":{
				maxlength:"请输入0-100个字!",
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