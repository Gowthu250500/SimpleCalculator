<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>

<h1>Basic Calculator</h1>
<hr>
<form action="calc" method="post">
<table>
<tr>
	<td>First Number: </td>
	<td><input type="number" name="tbFn" required="required"/></td>
</tr> 
<tr>
	<td>Second Number: </td>
	<td><input type="number" name="tbSn" required="required"/></td>
</tr>
</table> 
<br>
	<button type="submit" class="btn btn-success" name="btnAdd">ADD</button>
	<button type="submit" class="btn btn-warning" name="btnSub">SUB</button>
	<button type="submit" class="btn btn-primary" name="btnMul">MUL</button>
	<button type="submit" class="btn btn-danger" name="btnDiv">DIV</button>
	
</form>
</body>
</html>