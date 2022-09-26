<jsp:useBean id="p" scope="request" type="no.hvl.dat108.f11.Person"/>
<%@ page contentType="text/html;charset=UTF-8" %>
<%-- Linjen over må alltid være med som første linje i filen --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kvittering</title>
</head>

<body>
<%-- ${p} i linjen under er et uttrykk som henter attributten
 "p" fra modellen (den vi la til med model.addAttribute()) --%>
<p>Du er nå registrert med følgende info: ${p}</p>

</body>
</html>
