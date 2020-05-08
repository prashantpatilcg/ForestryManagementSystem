<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-content w3-section" style="max-width:500px">
  <p>The w3-animate-fading class animates an element in and out (takes about 10 seconds).</p>

  <img class="mySlides w3-animate-fading" src="https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg" style="width:100%">
  <img class="mySlides w3-animate-fading" src="https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg" style="width:100%">
  <img class="mySlides w3-animate-fading" src="https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg" style="width:100%">
  <img class="mySlides w3-animate-fading" src="https://cdn.pixabay.com/photo/2017/08/16/16/10/stopwatch-2648253_960_720.jpg" style="width:100%">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 9000);    
}
</script>

</body>
</html>
