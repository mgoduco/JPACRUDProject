<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>

	<form action="updateGpu.do" method="POST">
		<input type="text" hidden="true" name="id" value="${gpu.id }">
		<label for="name">Name of graphics card:</label> 
		<input type="text" name=name placeholder="${gpu.name}"> <br> 
		
		<label for="releaseDate">Release date:</label>
		<input type="date" id="start" name="releaseDate" value="${gpu.releaseDate}"
       		   	min="2000-01-00" placeholder="2022-12-31"> <br>
		 
		<label for=memory>Memory:</label>
		<input type="text" name=memory placeholder="${gpu.memory}"> <br>
		 
		<label for="gpuClock">GPU Clock (MHz) :</label>
		<input type="number" name=gpuClock placeholder="${gpu.gpuClock}"> <br>
		 
		<label for="memoryClock">Memory Clock (MHz) :</label>
		<input type="number" name=memoryClock placeholder="${gpu.memoryClock}"> <br>
		 
		<label for="price">Price ($) :</label>
		<input type="number" name=price placeholder="${gpu.price}"> <br>
		 
		<label for="averageFps">Average FPS (1080p) :</label>
		<input type="number" name=averageFps placeholder="${gpu.averageFps}"> <br>

		<input type="submit" placeholder="Create New GPU">
	</form><br>
	<a href="index.do">Home</a>
</body>
</html>