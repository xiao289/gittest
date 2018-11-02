<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
   function test1(){
	   //1.获得文本框的值
	   var  name=document.getElementById("username").value;
	   //2.创建XMLHttpRequest对象
	   if(window.XMLHttpRequest){//true时表示新浏览器
           xt=new XMLHttpRequest();
       }else{
           xt=new ActiveXObject("Microsoft.XMLHTTP");
       }
	   //3.打开连接
	 //  xt.open("get","testname?uname="+name,true);
	   xt.open("post","testname",true);
	   xt.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	   //4.发送请求,send(发送的数据)
	   //xt.send(null);
	   xt.send("uname="+name);
	   //5.指定回调函数(当服务器返回信息给页面时，调取的函数)
	   xt.onreadystatechange=abc;
   }
   function abc(){
	  // alert("响应信息");
	  if(xt.readyState==4&&xt.status==200){
		 var str= xt.responseText;
		 document.getElementById("aa").innerHTML=str;
	  }
	  
   }
   
   
</script>
</head>
<body>
   <h1>注册</h1>
   uname：<input type="text" onblur="test1()" name="uname" id="username">
    <span id="aa"></span>
    <br>
    password：<input type="text"  name="upass" >
   
</body>
</html>