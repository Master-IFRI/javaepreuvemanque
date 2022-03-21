<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Clients List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h3>Liste des Clients</h3>
    <a style="float: right" class="mb-2 btn btn-primary btn-sm" href="/clients/new">
        New client
    </a>
    <table class="table table-stripped">
        <thead class="table-info">
        <tr>
            <th>ID</th>
            <th>Raison Sociale</th>
            <th>Ifu</th>
            <th>Adresse</th>
            <td>Actions</td>
        </tr>
        </thead>
        <tbody>
        <c:if test="${fn:length(clients)> 0}">

            <c:forEach items="${clients}" var="client">
                <tr>
                    <td>${client.id}</td>
                    <td>${client.raisonSociale}</td>
                    <td>${client.ifu}</td>
                    <td>${client.adresse}</td>
                    <td>
                        <a class="btn btn-primary btn-sm" href="/clients/${client.id}">
                            Voir livraisons
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${fn:length(clients) <=0}">
            <tr>
                <td>No Clients</td>
                <td></td>
                <td></td>
            </tr>
        </c:if>

        </tbody>
    </table>
    <div>
    </div>
</div>
</body>

</html>