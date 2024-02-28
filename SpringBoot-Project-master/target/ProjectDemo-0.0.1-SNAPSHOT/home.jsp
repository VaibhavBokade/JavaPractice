<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body
{
background-color: orange;

}
 h3
 {
  color : blue;
  font-family: cursive;
 } 
 p
 {
  color: green;
  font-size: 40px;
  font-family: cursive; 
 }
 
 
 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

<p>Your Details</p>


<h3>Username: ${user.fname} ${user.lname} </br></h3>
<h3>City: ${user.city }</br></h3>
<h3>
Age: ${user.age }</h3>


</div>

</body>
</html>