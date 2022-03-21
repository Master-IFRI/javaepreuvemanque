<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Add Client</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h3>Enregistrement d'un Client</h3>
    <form:form method="post" action="/clients/save" modelAttribute="client">
        <div class="form-group">
            <form:label path="raisonSociale">Raison Sociale</form:label>
            <form:input class="form-control" type="text" path="raisonSociale"/>
        </div>
        <div class="form-group">
            <form:label path="ifu">Ifu</form:label>
            <form:input class="form-control" path="ifu"/>
        </div>
        <div class="form-group">
            <form:label path="adresse">Addresse</form:label>
            <form:input class="form-control" path="adresse"/>
        </div>
        <form:button class="btn btn-primary">Sauvegarder</form:button>
    </form:form>
</div>


</body>

</html>