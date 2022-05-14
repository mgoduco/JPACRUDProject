<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="createGpu.do" method="POST">
		
		<%-- <input type="text" hidden="false" name="id" value="${gpu.id }"> --%>
		<label for="name">Name of graphics card:</label> 
		<input type="text" name=name value="GeForce RTX 2080"> <br> 
		
		<!-- <label for="releaseDate">Release date:</label>
		<input type="text" name=releaseDate Value="2018-09-20"> -->
		
		<label for="releaseDate">Release date:</label>
		<input type="date" id="start" name="releaseDate" value="2018-07-22"
       		   	min="2000-01-00" max="2022-12-31"> <br>
		 
		<label for=memory>Memory:</label>
		<input type="text" name=memory Value="11 GB"> <br>
		 
		<label for="gpuClock">GPU Clock (MHz) :</label>
		<input type="number" name=gpuClock Value=1350> <br>
		 
		<label for="memoryClock">Memory Clock (MHz) :</label>
		<input type="number" name=memoryClock Value=1750> <br>
		 
		<label for="price">Price ($) :</label>
		<input type="number" name=price Value=850> <br>
		 
		<label for="averageFps">Average FPS (1080p) :</label>
		<input type="number" name=averageFps Value=160> <br>

		<input type="submit" value="Create New GPU">
	</form>
	<a href="index.do">Home</a>
</body>
</html>