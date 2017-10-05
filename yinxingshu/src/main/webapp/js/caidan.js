var result;
$(function(){
	result = $("#myForm").validate({
		rules:{
			"menuName":{
				required: true //必填项
			}
		},
		messages:{
			"menuName":{
				required: "菜单名称不能为空!"
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