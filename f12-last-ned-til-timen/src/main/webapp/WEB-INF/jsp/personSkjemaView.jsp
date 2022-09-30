<!-- Bruker tagbibliotek og prefikser dem med form: -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tast inn informasjon</title>
</head>
<body>
<div>
    <h3>Hei. Tast inn informasjon om personen</h3>

    <!-- Bruker egendefinert form tag fra tagbiblioteket, slik at innholdet blir lagret i et Person objekt -->
    <%--@elvariable id="person" type="no.hvl.dat108.f12.Person"--%>
    <form:form action="lagrePerson" method="post" modelAttribute="person">

        <form:label path="navn">Navn</form:label>
        <form:input path="navn" required="true"/>
        <form:errors path="navn"/>
        <br><br>
        <form:label path="mobil">Mobil</form:label>
        <form:input path="mobil" type="number" required="true"/>
        <form:errors path="mobil"/>
        <br><br>
        <form:label path="hoydecm">Høyde i centimeter</form:label>
        <form:input path="hoydecm" type="number"/>
        <form:errors path="hoydecm"/>
        <br><br>
        <form:label path="fdato">Fødselsdato</form:label>
        <form:input path="fdato" type="date"/>
        <form:errors path="fdato"/>
        <br><br>
        <input type="submit" value="Lagre">
    </form:form>
</div>
</body>
</html>