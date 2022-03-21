<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Livraisons List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h3>Liste des Livraisons du Client</h3>
    <table class="table table-stripped">
        <thead class="table-info">
        <tr>
            <th>ID</th>
            <th>Article</th>
            <th>Statut</th>

        </tr>
        </thead>
        <tbody>
        <c:if test="${fn:length(livraisons)> 0}">
            <c:forEach items="${livraisons}" var="livraison">
                <tr>
                    <td>${livraison.id}</td>
                    <td>${livraison.article}</td>
                    <td>${livraison.statut}</td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${fn:length(livraisons) <=0}">
            <tr>
                <td>No Livraisons</td>
                <td></td>
                <td></td>
            </tr>
        </c:if>
        </tbody>
    </table>
</div>
<div>

</div>
</body>

</html>