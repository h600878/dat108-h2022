<jsp:useBean id="person" scope="request" type="no.hvl.dat108.f12.Person"/>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<div>
    <h3>Kvittering for lagret info om person</h3>
    ${person.navn}${person.mobil} ${person.hoydecm} ${person.fdato} <br>
    ${person}
</div>
</body>
</html>