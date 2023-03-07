<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" items="${list}">
    ${p.id} : ${p.name} : ${p.price}<br>
</c:forEach>

<a href="../shop/staffindex.jsp">インデックスページに戻る</a>

<%@include file="../footer.html" %>