<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>게시판 관리</h1>
<table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>타입</th>
        <th>게시판명</th>
        <th>읽기 권한</th>
        <th>쓰기 권한</th>
        <th>비고</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${list}" var="bt">
      <tr>
      	<form action="<c:url value=''></c:url>" method="post">
	        <td>${bt.bt_num }<input type="hidden" value="1"></td>
	        <td>
	        <div class="form-group">
			  <select class="form-control" name="">
			    <option>일반</option>
			    <option>이미지</option>
			  </select>
			</div>
			</td>
	        <td>
	        	<div class="form-group">
	  			<input type="text" class="form-control" name="" value="${bt.bt_name }">
				</div>
			</td>
	        <td>
		        <div class="form-group">
				  <select class="form-control" name="">
				    <option value="0">비회원이상</option>
				    <option value="1">회원이상</option>
				    <option value="9" selected>관리자이상</option>
				  </select>
				</div>
			</td>
	        <td>
	        	<div class="form-group">
				  <select class="form-control" name="">
				    <option value="1">회원이상</option>
				    <option value="9">관리자이상</option>
				  </select>
				</div>
	        </td>
	        <td>
	        	<button class="btn btn-outline-warning">수정</button>
	        	<button class="btn btn-outline-danger">삭제</button>
	        </td>
		</form>	        
      </tr>
     </c:forEach> 
    </tbody>
    <tfoot>
    <tr>
      	<form action="<c:url value=''></c:url>" method="post">
	        <td></td>
	        <td>
	        <div class="form-group">
			  <select class="form-control" name="">
			    <option>일반</option>
			    <option>이미지</option>
			  </select>
			</div>
			</td>
	        <td>
	        	<div class="form-group">
	  			<input type="text" class="form-control" name="" value="">
				</div>
			</td>
	        <td>
		        <div class="form-group">
				  <select class="form-control" name="">
				    <option value="0">비회원이상</option>
				    <option value="1">회원이상</option>
				    <option value="9">관리자이상</option>
				  </select>
				</div>
			</td>
	        <td>
	        	<div class="form-group">
				  <select class="form-control" name="">
				    <option value="1">회원이상</option>
				    <option value="9">관리자이상</option>
				  </select>
				</div>
	        </td>
	        <td>
	        	<button class="btn btn-outline-success">등록</button>
	        </td>
		</form>	        
      </tr>
      </tfoot>
  </table>
