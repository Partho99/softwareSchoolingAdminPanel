<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>






<script>
$(document).ready(function(){
  $("button").click(function(){
    $.get("DashBoardController", function(data, status){
      //alert("Data: " + data + "\nStatus: " + status);
      
      
      var a = JSON.parse(data);
//      for (x in data) {
//       // txt += "<tr><td>" + x.name + "</td></tr>";
//         $("#test1").text(name.student);
//      }

      console.log(a);
      
      
      var car = {type:"Fiat", model:"500", color:"white"};
      
      
      console.log(car);
      console.log(car.type);
     $("#test1").text(a.lastname);
      
    });
  });
});
</script>
</head>
<body>

<button>Send an HTTP GET request to a page and get the result back</button>

<span id="test1">  </span>

</body>
</html>