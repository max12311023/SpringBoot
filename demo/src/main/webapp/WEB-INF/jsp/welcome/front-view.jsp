<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%// request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<title>我是展示層 (view) front-view.jsp</title>
</head>
<body>
<b> 
          這是前端的: /welcome/front-view.jsp
</b>
<hr>
	   【sendRedirect from Spring4 MVC】 \${param.ename}: ${param.ename} (無值)
	
<br>
	   【sendRedirect from Spring4 MVC】 \${requestScope.greetingKey} = ${requestScope.greetingKey} (無值)
	 
<br>
	   【sendRedirect from Spring4 MVC】 \${param.greetingKey}: ${param.greetingKey}

</body>
</html>



