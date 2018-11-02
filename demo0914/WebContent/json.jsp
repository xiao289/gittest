<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
      var  str={"name":"张三","sex":"女","age":18};
      var  str1={"name":"张三1","sex":"女","age":38};
      var  str2={"name":"张三2","sex":"女","age":28};
      alert("姓名:"+str.name);
      alert("性别:"+str.sex);
      alert("年龄:"+str.age);
      var users=[str,str1,str2];
      for (var i = 0; i < users.length; i++) {
		  alert(users[i].name+","+users[i].age);
	  }
</script>
</head>
<body>

</body>
</html>