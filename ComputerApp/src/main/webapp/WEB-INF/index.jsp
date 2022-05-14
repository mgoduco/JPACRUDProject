<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Computer Site</title>
<%-- <jsp:include page="bootstrapHead.jsp"/>
 --%></head>
<body>

	<main class="container-fluid">
	<a href="createGpuPage.do">Add A Graphics Card</a> <br><br>
	<form action="getGpu.do" method="GET">
		Graphics Card ID: <input class="form-control" type="text" name="gpuId" /> 
		<input class="btn btn-primary" type="submit" value="Show Graphics Card" />
	</form><br>
	<form action="updateGpuPage.do" method="GET">
		Graphics Card ID: <input class="form-control" type="text" name="id" /> 
		<input class="btn btn-primary" type="submit" value="Update Graphics Card by ID" />
	</form>
	
<table>
<thead>
	<!-- <table class="table table-striped table-hover">
		<thead class="table-dark"> -->
			<tr>
				<th>ID</th>
				<th>Name</th>
 				<th>Release Date</th>
 			</tr>
		</thead>
		<tbody>
			<c:forEach var="gpu" items="${gpu}">
				<tr>
					<td>${gpu.id}</td>
					<td><a href="getGpu.do?gpuId=${gpu.id}">${gpu.name}</a></td>
					<td>${gpu.releaseDate}</td> 
				</tr>
			</c:forEach>

		</tbody>
	</table>

	</main>

<%-- <jsp:include page="bootstrapFoot.jsp"/>
 --%></body>
</html>