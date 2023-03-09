<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
let msg='${msg}';
let url='<c:url value="${url}"></c:url>';
alert(msg);
location.href=url;
</script>