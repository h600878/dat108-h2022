<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<div>
    <h3>Hei. Tast inn informasjon om personen</h3>

    <%--@elvariable id="person" type="no.hvl.dat108.f12.Person"--%>
    <form:form action="lagrePerson" method="post" modelAttribute="person">
        <form:label path="navn">Navn</form:label>
        <form:input path="navn"/>
        <form:errors path="navn"/><br>

        <form:label path="mobil">Mobil</form:label>
        <form:input path="mobil"/>
        <form:errors path="mobil"/><br>

        <form:label path="hoydecm">Høyde i cm</form:label>
        <form:input path="hoydecm" type="number"/>
        <form:errors path="hoydecm"/><br>

        <form:label path="fdato">Fødselsdato</form:label>
        <form:input path="fdato" type="date"/>
        <form:errors path="fdato"/><br>

        <input type="submit" value="Lagre"/>
    </form:form>
</div>
</body>
</html>