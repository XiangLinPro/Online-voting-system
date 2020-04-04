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
 *{
            margin: 0;
            padding: 0;
        }
        .menu{
            width: 1000px;
            height: 50px;
            background-color: white;
            margin: 0 auto;
            line-height: 50px;
            display: none;
            box-shadow: 6px 4px 4px rgba(0, 0, 0, 0.64);
            border-radius: 4px;
        }
        .menu .menu_ul{
            text-align: center;

        }
        body{
            background: url("${APP_PATH }/static/img/mybg2.jpg") no-repeat;
            background-size: cover;
        }
        .border{
            width: 270px;
            height: 500px;
            margin: 40px auto;
            position: relative;
        }
        .border .toupiao{
            width: 270px;
            height: 500px;
            position: absolute;
            left: 0;
            bottom: 0;
            background: rgba(0, 0, 0, 0.53);
        }
        .border  .fpeople{
              text-align: center;
              width: 120px;
              height: 160px;
              left: 20px;
              border-radius: 10px;
              box-shadow: 6px 6px 6px black;
              top: 80px;
              position: absolute;
              background-color: white;
          }
        .border  .fpeople2{
            text-align: center;
            width: 120px;
            height: 160px;
            left: 134px;
            border-radius: 10px;
            box-shadow: 6px 6px 6px black;
            top: 310px;
            position: absolute;
            background-color: white;
        }
        .border  .fpeople p{
            width: 100%;
            height: 20px;
            margin-top: 6px;
        }
        .border  .fpeople img{
            margin-top: -40px;
            width: 100px;
            height: 100px;
            border-radius: 50px;
        }
        .border  .fpeople input{
            width: 80px;
            height: 28px;
            line-height: 28px;
            border: none;
            outline: none;
            background-color:#cb8722 ;
            border-radius: 4px;
        }
        .border  .fpeople .name{
            font-size: 18px;
            font-weight: bold;
        }
        .border  .fpeople .number{
            font-size: 14px;
            color: #999999;
        }
        .border .PK{
            width: 120px;
            height:100px;
            position: absolute;
            top: 240px;
            left: 20px;
        }

  </style>
</head>
<body>

<script type="text/javascript">
	
$(function(){
    $(".menu").slideDown(800);
  $("#p1").bind("click",function(){
      if($(this).val()=="我要投票"){
          $(this).val("已投票").css({"background-color":"#824109","color":"white"});
      }else{
          $(this).val("我要投票").css("background-color","");
      }
  });
$("#p2").bind("click",function(){
    if($(this).val()=="我要投票"){
        $(this).val("已投票").css({"background-color":"#824109","color":"white"});
    }else{
        $(this).val("我要投票").css("background-color","");
    }

})
});
</script>

	
<div class="menu">
    <h2 class="menu_ul">
        动漫爱豆PK大赛，选出你Pick的小哥哥
    </h2>
</div>
    <div class="border">
        <div class="toupiao">
        </div>
        <div class="fpeople">
            <img src="${APP_PATH }/static/img/22.jpg">
            <p class="name" id="singerone">李木子</p>
            <p class="number" id="singernumber1"></p>
            <p>
                <input type="button" value="我要投票" id="p1" />
            </p>
        </div>
        <img src="${APP_PATH }/static/img/PK.png" class="PK">
        <div class="fpeople fpeople2">
            <img src="${APP_PATH }/static/img/44.jpg">
            <p class="name" id="sinertwo">幸平创真</p>
            <p class="number" id="singernumber2"></p>
            <p>
                <input type="button" value="我要投票" id="p2"/>
            </p>
        </div>
    </div>
    
   <script type="text/javascript">
   
   		//前台获取选手
  
  	$(function(){
  		$.ajax({
  			url:"${APP_PATH}/singer",
  			type:"GET",
  			success:function(result){
  				
  				alert("成功")
  				//$("#singerone").append(result.extend.singer.employee.empName);
  				//$("#singertwo").append(result.extend.singer.singerid2.emp_name);
  				$("#singernumber1").append(result.extend.singer.singerid1);
  				$("#singernumber2").append(result.extend.singer.singerid2);
  			}
  		});
  	});
  	
  	
  	/* 实现投票功能 */
  	 /* $("#p1").click(function(){
  		
  		var piao1=$("#singernumber1").text();
  		$.ajax({
			 url:"${APP_PATH}/toupiao/"+piao1,
			 type:"PUT",
			 success:function(result){
				 alert("success");
			 }
		 });
  	})  */
  </script>  
    
</body>
</html>