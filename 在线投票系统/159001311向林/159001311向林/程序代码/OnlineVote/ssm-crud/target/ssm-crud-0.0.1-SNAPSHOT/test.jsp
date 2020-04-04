<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选手列表</title>
<%
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!--web路径
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题
以/开始的相对路径，找资源，以服务器的路径为基准（http://localhost:3306）;需加上项目名
		http://localhost/ssm-crud 

 -->
 <script type="text/javascript" src="${APP_PATH }/static/js/jquery-3.2.0.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style type="text/css">
			 <style type="text/css">
        body{
            margin: 0 0 0 0;
            background-size: cover;
            color:#000000; text-align:center
        }
        a{color:#000000;text-decoration:none}



        #backgroundImg{
            width: 100%;
            height: 850px;
            margin: 0 auto;
            text-align: center;
            z-index: -2;
        }


        #zi{
            width: 1000px;
            height: 50px;
            position: absolute;
            top: 60px;
            right: 1800px;
            font-size: 50px;
            color: gray;
            text-align: center;
        }
        #zi2{
            width: 1000px;
            height: 50px;
            position: absolute;
            top: 350px;
            left: 1800px;
            font-size: 150px;
            font-family: 微软雅黑;
            color: darkgray;
            text-align: center;
        }

    </style>
     <script type="text/javascript">
        $(function(){
            $("#menu").animate({top:"0px"},1000);
            $("#zi").animate({right:"300px"},1000)
            $("#zi2").animate({left:"250px"},1000)
        })

        var curIndex = 0;
        var timeInterval = 2000;
        var arr = new Array();
        arr[0] = "${APP_PATH }/static/img/22.jpg";
        arr[1] = "${APP_PATH }/static/img/44.jpg";
        arr[2] = "${APP_PATH }/static/img/55.png";
        arr[3] = "${APP_PATH }/static/img/66.jpg";
        setInterval(changeImg,timeInterval);
        function changeImg() {
            var obj = document.getElementById("imge");
            if (curIndex == arr.length-1) {
                curIndex = 0;
            } else {
                curIndex += 1;
            }
            obj.src = arr[curIndex];
        }

    </script>
</head>
<body>
<div id="backgroundImg">
    <img id = "imge" src = "${APP_PATH }/static/img/22.jpg" >
</div>
<div id="zi">
    <b>2018</b>重庆巡回国际演唱会<br/>
    <b>2018</b> Chongqing tour international concert
    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#empAddModal">
  来录入你的信息和我们一起玩耍吧
</button>
</div>
<div id="zi2">
    比赛现场
</div>
<!-- Button trigger modal -->

<!-- Modal -->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document" >
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">选手添加</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">Name</label>
		    <div class="col-sm-10">
		      <input type="text" name="empName" class="form-control" id="empName_add_input" placeholder="Name">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">email</label>
		    <div  >
                        <input type="file" name="FileUpload" id="FileUpload">
                        <a class="layui-btn layui-btn-mini" id="btn_uploadimg">上传图片</a>
                    </div>
		  </div>
		 <div class="form-group">
		    <label class="col-sm-2 control-label">gender</label>
		    <div class="col-sm-10">
		      <label class="radio-inline">
				  <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男
				</label>
				<label class="radio-inline">
				  <input type="radio" name="gender" id="gender2_add_input" value="F"> 女
				</label>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">爱好</label>
		    <div class="col-sm-4">
		    <!-- 部门提交部门id即可 -->
		      <select class="form-control" name="dId" id="dept_add_select">
				 
				</select>
		    </div>
		  </div>
		  
		</form>    
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
      </div>
    </div>
  </div>
  </div>
<script type="text/javascript">
	
//清空表单及内容
function reset_form(ele) {
	$(ele)[0].reset();
	//清空表单样式
	$(ele).find("*").removeClass("has-error has-success");
	$(ele).find(".help-block").text("");
}
getDepts("#empAddModal select");
//查出所有的部门信息并显示在下拉列表中
function getDepts(ele) {
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/depts",
		type:"GET",
		success:function(result){
			//console.log(result);
			//显示部门信息在下拉列表中
			//$("#dept_add_select").append("")
			$.each(result.extend.depts,function(){
				var optionEle=$("<option></option>").append(this.deptName).attr("value",this.deptId);
				optionEle.appendTo(ele);
			});
		}
	});
}

//校验表单数据 
function validatw_add_form() {
	//1.拿到要校验的数据，使用正则表达式
	var empName=$("#empName_add_input").val();
	var regName=/(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/; 
     if(!regName.test(empName)){
    	 //alert("用户名可以是2-5位中文或者6-16位英文和数子的组合");
    	 show_validate_msg("#empName_add_input","error","用户名可以是2-5位中文或者6-16位英文和数子的组合");
    	 /* $("#empName_add_input").parent().addClass("has-error");
    	 $("#empName_add_input").next("span").text("用户名可以是2-5位中文或者6-16位英文和数子的组合"); */
    	 return false;
     }else{
    	 show_validate_msg("#empName_add_input","success","");
    	 /* $("#empName_add_input").parent().addClass("has-success");
    	 $("#empName_add_input").next("span").text(""); */
     };
    //2、校验邮箱
    var email=$("#email_add_input").val();
    var regEmail=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if(!regEmail.test(email)){
    	//alert("邮箱格式不正确");
    	//应该清空这个元素之前的样式
    	show_validate_msg("#email_add_input","error","邮箱格式不正确");
    	/* $("#email_add_input").parent().addClass("has-error");
    	$("#email_add_input").next("span").text("邮箱格式不正确"); */
    	return false;
    }else{
    	show_validate_msg("#email_add_input","success","");
    	/*  $("#email_add_input").parent().addClass("has-success");
    	 $("#email_add_input").next("span").text(""); */
    };
    return true;
}

//显示校验结果的提示信息
function show_validate_msg(ele,status,msg) {
	//清除发当前元素的校验状态
	$(ele).parent().removeClass("has-success has-error");
	$(ele).next("span").text("");
	if("success"==status){
		$(ele).parent().addClass("has-success");
		$(ele).next("span").text(msg);
		
	}else if("error"==status){
		$(ele).parent().addClass("has-error");
		$(ele).next("span").text(msg);
	}
	
}
//校验用户名是否可用
$("#empName_add_input").change(function(){
	var empName=this.value;
	//发送ajax请求校验用户名是否可用
	$.ajax({
		url:"${APP_PATH}/checkuser",
		data:"empName="+empName,
		type:"POST",
		success:function(result){
			if(result.code==100){
				show_validate_msg("#empName_add_input","success","用户名可用");
				$("#emp_save_btn").attr("ajax-va","success");
			}else{
				show_validate_msg("#empName_add_input","error",result.extend.va_msg);
				$("#emp_save_btn").attr("ajax-va","error");
			}
		}
	});
});


//点击保存，保存选手
$("#emp_save_btn").click(function(){
	//1.模态框中填写的表单数据提交给服务器进行保存
	//1.先对要提交给服务器的数据进行校验
	 if(!validatw_add_form()){
		return false;
	}; 
	//1.判断之前的ajax用户名是否校验成功，如果成功
	if($(this).attr("ajax-va")=="error"){
		return false;
	}
	//2.发送ajax请求保存选手
	
	  $.ajax({
		url:"${APP_PATH}/emp",
		type:"POST",
		data:$("#empAddModal form").serialize(),
		success:function(result){
			//alert(result.msg);
			if(result.code==100){
				alert(result.msg);
			}else{
				//显示失败信息
				//console.log(result);
				//有那个字段的错误信息就显示哪个字段的
				if(undefined!=result.extend.errorFields.email){
					//显示邮箱错误信息
					show_validate_msg("#email_add_input","error",result.extend.errorFields.email);
					
				}if(undefined!=result.extend.errorFields.empName){
					//显示员工名字错的信息
					show_validate_msg("#empName_add_input","error",result.extend.errorFields.empName);
				}
			}
		}
	}); 
});



$(function () {
    $("#btn_uploadimg").click(function () {
        var fileObj = document.getElementById("FileUpload").files[0]; // js 获取文件对象
        if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
            alert("请选择图片");
            return;
        }
        var formFile = new FormData();
        formFile.append("action", "UploadVMKImagePath");  
        formFile.append("file", fileObj); //加入文件对象

        //第一种  XMLHttpRequest 对象
        //var xhr = new XMLHttpRequest();
        //xhr.open("post", "/Admin/Ajax/VMKHandler.ashx", true);
        //xhr.onload = function () {
        //    alert("上传完成!");
        //};
        //xhr.send(formFile);

        //第二种 ajax 提交

        var data = formFile;
        $.ajax({
            url: "/Admin/Ajax/VMKHandler.ashx",
            data: data,
            type: "Post",
            dataType: "json",
            cache: false,//上传文件无需缓存
            processData: false,//用于对data参数进行序列化处理 这里必须false
            contentType: false, //必须
            success: function (result) {
                alert("上传完成!");
            },
        })
    })
})




</script>
</body>
</html>