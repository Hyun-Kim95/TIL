<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <style>
    body{
      text-align: center;
    }
    ul{
      font-size: 30px;
      list-style-type: none;
      clear: both;
    }
    li{
      padding: 20px 20px 20px 20px;
      display: inline-block;
    }
    #btn button{
      font-size: 60px;
    }
  </style>
</head>
<body>
  <h1>< 가위 바위 보 ></h1>
  <ul>
    <li>USER</li>
    <li>VS</li>
    <li>COM</li>
  </ul>
  <ul>
    <li><div id="user"></div><br><div id="win"></div></li>
    <li></li>
    <li><div id="com"></div><br><div id="lose"></div></li>
  </ul>
  <ul id="btn">
    <li><button>주먹</button></li>
    <li><button>가위</button></li>
    <li><button>보</button></li>
  </ul>
  <script type="text/javascript">
    $document.addEventListener('DOMContentLoaded', ()=>{
      let us = ""
      let co = 0
      let wi = ""
      let lo = ""
      const div1 = document.querySelector('#user')
      const div2 = document.querySelector('#com')

      const div3 = document.querySelector('#win')
      const div4 = document.querySelector('#lose')

      const button = document.querySelectorAll('button')

      button.forEach(element => {
        element.addEventListener('click', ()=>{
          us = element.textContent
          co = Math.floor(Math.random()*3)
          if(co === 0){
            co = "주먹"
          }else if(co === 1){
            co = "가위"
          }else{
            co = "보"
          }
          div1.innerText = `${us}`
          div2.innerText = `${co}`
          if(us === co){
            wi = "비김"
            lo = "비김"
          }else if(us === "주먹" && co === "가위"
                || us === "가위" && co === "보"
                || us === "보" && co === "주먹"){
            wi = "승"
            lo = "패"
          }else{
            wi = "패"
            lo = "승"
          }
          div3.innerText = `${wi}`
          div4.innerText = `${lo}`
          console.log(wi)
        })
      })
    })
  </script>
</body>
</html>