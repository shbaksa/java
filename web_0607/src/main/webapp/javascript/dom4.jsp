<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script>
   function change()
   {
	   document.getElementsByName("hobby")[0].size=5;
	   document.getElementsByName("hobby")[2].style.background="yellow";
   }
 </script>
</head>
<body> <!-- dom4.jsp -->
   <!-- 태그의 name요소에 접근할때 (폼태그) -->
   <input type="button" onclick="change()" value="함수호출">
   <form>
     1. <input type="text" name="hobby"> <p>
     2. <input type="text" name="hobby"> <p>
     3. <input type="text" name="hobby"> <p>
     4. <input type="text" name="hobby"> <p>
   </form>
</body>
</html>