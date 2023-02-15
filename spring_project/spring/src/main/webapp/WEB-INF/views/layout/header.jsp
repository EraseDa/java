<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="<c:url value='/'></c:url>">
    <img src="https://www.w3schools.com/bootstrap4/bird.jpg" alt="logo" style="width:40px;">
  </a>
  
  <ul class="navbar-nav">
  	<c:if test="${user==null}">
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/signup'></c:url>">회원가입</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/login'></c:url>">로그인</a>
    </li>
    </c:if>
    <c:if test="${user !=null }">
    	<li class="nav-item">
      	<a class="nav-link" href="<c:url value='/logout'></c:url>"> 로그아웃 </a>
    	</li>
    </c:if>
  	<li class="nav-item">
      	<a class="nav-link" href="<c:url value='/board/list'></c:url>"> 게시글 </a>
    	</li>
  </ul>
</nav>