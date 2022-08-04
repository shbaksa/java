<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function() {
		$("#view1").click(function() {

			$("#aa").show("slow");	// "slow", "fast" , 시간(1/1000)초
		});
		$("#hide1").click(function() {

			$("#aa").hide("fast");
		});
		$("#view2").click(function() {

			$("img").show(1000);
		});
		$("#hide2").click(function() {

			$("img").hide(3000);
		});
	});
</script>
</head>
<body>
	<!-- show.hide.jsp	=> show(), hide() -->
	<input type="button" id="view1" value="글자보이기">
	<input type="button" id="hide1" value="글자숨기기">
	<div id="aa">
		<h2>안녕하세요</h2>
	</div>
	<hr>
	<input type="button" id="view2" value="그림보이기">
	<input type="button" id="hide2" value="그림숨기기"><p>
	<img src="1.jpg" width="200">

</body>
</html>