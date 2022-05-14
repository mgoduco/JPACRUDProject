<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Graphics Card Details</title>
</head>
<body>

	<div>
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Release Date</th>
					<th>Price</th>
					<th>GPU Clock</th>
					<th>Memory Clock</th>
					<th>Average FPS</th>
				</tr>
			</thead>
			<tr>
				<td>${gpu.name}</td>
				<td>${gpu.releaseDate}</td>
				<td>$${gpu.price}</td>
				<td>${gpu.gpuClock}MHz</td>
				<td>${gpu.memoryClock}MHz</td>
				<td>${gpu.averageFps}</td>
			</tr>
		</table>
	</div>

</body>
</html>