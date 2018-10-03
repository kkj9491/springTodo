<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/common/header.jsp"%>

<section>
	<h1>회원 목록 조회</h1>
	
	<table border = 1>
		<tr>
			<th>회원아이디</th>
			<th>회원성명</th>
			<th>회원이메일</th>
		</tr>
		<c:forEach items="${list }" var="uservo">
		<tr>
			<td><a href="${pageContext.request.contextPath }/update?id=${uservo.id}" >${uservo.id}</a></td>
			<td>${uservo.name}</td>
			<td>${uservo.email}</td>
		</tr>
		</c:forEach>
	</table>

</section>

<%@ include file="/common/footer.jsp"%>

<script>
</script>