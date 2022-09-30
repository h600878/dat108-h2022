<jsp:useBean id="person" scope="request" type="no.hvl.dat108.f12.Person"/>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kvittering</title>
</head>
<body>
<div>
    <h3>Kvittering for lagret info om person</h3>
    <p>Navn: ${person.navn}</p>
    <p>Telefonnummer: ${person.mobil}</p>
    <p>Høyde: ${person.hoydecm}</p>
    <p>Fødselsdato: ${person.fdato}</p>
</div>
</body>
</html>