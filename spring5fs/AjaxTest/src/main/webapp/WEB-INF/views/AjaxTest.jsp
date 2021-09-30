<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<style>
#layer1 {
	width: 100%;
	height : 80%;
}

#layer2 {
	width: 100%;
	height: 20%;
	display: flex;
}
.button {
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 0 auto;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}

</style>
    <head>
        <title>Ajax Test</title>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>
        <script type="text/javascript">
        function buttonClick(id)
        {
        	 var objParams = {
                     key         : id      
             };
    		 $.ajax({
                 url            :    "check",
                 dataType    :    "json",
                 contentType :    "application/x-www-form-urlencoded; charset=UTF-8",
                 type         :    "post",
                 async        :     false, //동기: false, 비동기: ture
                 data        :    objParams,
                 success     :    function(retVal){

                	$("#layer1").empty();
                	var img = '';
                    if(retVal.value === "1")
                    {
                    	img = '<img src="resources/강아지.jpg"  width="parent" height="parent" >'
                    }
                    if(retVal.value === "2")
                    {
                    	img = '<img src="resources/고양이.jpg"  width="parent" height="parent" >'
                    }
                    if(retVal.value === "3")
                    {
                    	img = '<img src="resources/사자.png"  width="parent" height="400px" >'
                    }
                    if(retVal.value === "4")
                    {
                    	img = '<img src="resources/용.jpg"  width="parent" height="parent" >'
                    }
                    if(retVal.value === "5")
                    {
                    	img = '<img src="resources/호랑이.jpg"  width="parent" height="400px" >'
                    }
                    $('#layer1').append(img);
                     
                 },
                 error        :    function(request, status, error){
                     console.log("AJAX_ERROR");
                 }
             });
        }
        </script>
</head>
<body>
<div id="layer1">
</div>
<div id="layer2">
   <button class="button button2" id="1" onclick="buttonClick(this.id)">1</button>
   <button class="button button2" id="2" onclick="buttonClick(this.id)">2</button>
   <button class="button button2" id="3" onclick="buttonClick(this.id)">3</button>
   <button class="button button2" id="4" onclick="buttonClick(this.id)">4</button>
   <button class="button button2" id="5" onclick="buttonClick(this.id)">5</button>
</div>
</body>
</html>