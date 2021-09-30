<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- c태그를 쓰기 위해서 import -->
<html>
<head>

<!-- materialize 디자인을 사용하는 CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css" type="text/css"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" type="text/css"/>
<!-- 직접 만든 CSS -->
<link rel="stylesheet" href="resources/css/register.css" type="text/css"/>
	<title>Home</title>
</head>
<body>
<!-- class 명이 요상한 이유는 materialize에 기준으로 화면을 꾸미고 싶어서 정해져있는 class이름을 사용 하는 겁니다. -->
<div id="login-page" class="row">
  <div class="col s12 z-depth-4 card-panel">
    <form class="login-form" action="registerNow" method="post">
    <!-- Register. 글자 아주 큼직하게 나오게 하려고 -->
      <div class="row">
        <div class="input-field col s12 center">
          <h4>Register</h4>
          <p class="center" style="color: red">Join to our community now !</p>
        </div>
      </div>
	<!-- UserName 입력받는 div -->
      <div class="row margin">
        <div class="input-field col s12">
          <!-- <i class="mdi-social-person-outline prefix"></i> -->
          <i class="material-icons prefix">account_circle</i>
          <input id="username" name="username" type="text"/>
          <label for="username">Username</label>
        </div>
      </div>
<!-- Email 입력받는 div -->
      <div class="row margin">
        <div class="input-field col s12">
          <!-- <i class="mdi-social-person-outline prefix"></i> -->
          <i class="material-icons prefix">email</i>
          <input id="email" name="email" type="text" style="cursor: auto;" />
          <label for="email">Email</label>
          <p>
          <button type="button" class="emailCheck">이메일 확인</button>
          </p>
          <p class="result">
          	<span class="msg">이메일을 확인하세요.</span>
          </p>
        </div>
      </div>
<!-- Password 입력받는 div -->
      <div class="row margin">
        <div class="input-field col s12">
          <!-- <i class="mdi-action-lock-outline prefix"></i> -->
          <i class="material-icons prefix">vpn_key</i>
          <input id="password" name="password" type="password" />
          <label for="password">Password</label>
        </div>
      </div>

<!-- 비밀번호 확인 입력받는 div -->
      <div class="row margin">
        <div class="input-field col s12">
          <!-- <i class="mdi-action-lock-outline prefix"></i> -->
          <i class="material-icons prefix">vpn_key</i>
          <input id="password_a" name="cpassword" type="password" />
          <label for="password_a">Password again</label>
        </div>
      </div>

<!-- 회원가입 버튼 로그인으로 이동을 할 수 있는 부분이 있는 div -->
      <div class="row">
        <div class="input-field col s12">
          <button type="submit" class="btn waves-effect waves-light col s12">REGISTER NOW</button>
          
        </div>
        <div class="input-field col s12">
          <p class="margin center medium-small sign-up">Already have an account? <a href="/login">Login</a></p>
        </div>
      </div>


    </form>
  </div>
</div>
</body>
</html>
