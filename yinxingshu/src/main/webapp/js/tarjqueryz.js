$(function() {
	$("#bt").click(function() {
		var is = confirm("确认提交么?");
		if (is) {
			$("#myForm").submit();
		}
	});
});

var result;
$(function(){
	result = $("#myForm").validate({
		rules :{
			"tarName":{
				required :true,
			},
			"tarTeacher":{
				required:true,
			},
			"tarStartTime" :{
			    required : true,
			},
			"tarEddTime" :{
			    required : true,
			},
			"tarResouce" :{
				required : true,
				rangelength:[1,50]
			},
			"tarEmployee" :{
				required : true,
			}
		},
		messages : {
			"tarName" : {
				required : "培训名称不能为空!"
			},
			"tarTeacher" : {
				required : "培训教师不能为空！",
			},
			"tarStartTime" :{
				required :"开始时间不能为空！",
			},
			"tarEddTime" :{
				required :"结束时间不能为空！",
			},
			"tarResouce" :{
				required :"请输入!",
				rangelength : "请输入{0}到{1}个文字!"
			},
			"tarEmployee" :{
				required : "培训人员不能为空！",
			}
		},
		errorPlacement : function(error, element) { // 指定错误信息位置
			element.nextAll("span").html(error.text());
		},
		success : function(label) {
			label.html();
		}
	});
});