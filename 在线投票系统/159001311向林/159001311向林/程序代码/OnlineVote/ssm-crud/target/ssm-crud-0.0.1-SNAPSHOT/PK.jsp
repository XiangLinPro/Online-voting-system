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
        #foods{

            position: absolute;
            top: 150px;
            right: 100px;
            z-index: 2;
        }

        .zhu1{
            width: 50px;
            height: 500px;
            background: gray;
            margin:10px auto;
            float: left;
            padding: 20px 30px 20px 20px
        }

        #play1{
            position: absolute;
            top: 600px;
            left: 150px;
            width: 180px;
            height: 80px;
            color:blue;
            font-size:30px;
        }
        #play2{
            position: absolute;
            top: 600px;
            right: 250px;
            width: 180px;
            height: 80px;
            color:blue;
            font-size:30px;
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
        .food{
            margin:10px auto;
            float: left;
            padding: 20px 30px 20px 20px}
        .food img{ border-radius:50%}
    </style>
    
      <script type="text/javascript" src="js/jquery-3.2.0.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#menu").animate({top:"0px"},1000);
            $("#zi").animate({right:"300px"},1000)
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
    欢迎来到重庆国际演唱会
</div>
<div id="foods">
    <div class="food">
        <img src="${APP_PATH }/static/img/222.jpg" />
    </div>

    <div class="zhu1">

  </div>
    <div class="food">
        <img src="${APP_PATH }/static/img/PK.png" />
    </div>

    <div class="zhu1">

    </div>

    <div class="food">
        <img src="${APP_PATH }/static/img/444.jpg" />
    </div>

</div>
<div id="play1">
</div>
<div id="play2">
</div>

<script type="text/javascript">
  	$(function(){
  		$.ajax({
  			url:"${APP_PATH}/singer",
  			type:"GET",
  			success:function(result){
  				alert("成功")
  				//$("#singerone").append(result.extend.singer.employee.empName);
  				//$("#singertwo").append(result.extend.singer.singerid2.emp_name);
  				$("#play1").append(result.extend.singer.singerid1+"号");
  				$("#play2").append(result.extend.singer.singerid2+"号");
  			}
  		});
  	});
  	
  
  </script>  


	
    
</body>
</html>