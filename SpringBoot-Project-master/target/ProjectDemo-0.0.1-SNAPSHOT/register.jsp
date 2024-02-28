<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
div
{

font-size: 30px;
color: purple;
}


h1
{

font-size: 40px;
}
</style>
<meta charset="ISO-8859-1">
<title>Register page</title>
</head>

<body>
<div>
<h1>REGISTER PAGE</h1>
<form action="uu">
<table>
<tr>
<td>
<label for="fn">Firstname</label>
<input type="text" id="fn" name="fname"><br></td></tr>
<tr>
<td>
<label for="ln">Lastname</label>
<input type="text" id="ln" name="lname"><br></td>
</tr>
<tr>
<td>
<label for="city">city</label>
<input type="text" id="city" name="city"> <br> </td></tr>
<tr>
<td>
<label for="age" >age</label>
<input type="text"id="age" name="age"><br></td></tr>

<tr>
<td>
<input type="submit" name="submit" />
</td>
</tr>


</table>
</form>
</div>

</body>
</html>