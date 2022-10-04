<%-- Kommenterte disse ut da nettsiden får error 500 hvis en av de er null --%>
<%--<jsp:useBean id="RFAvare" scope="request" type="java.lang.String" />--%>
<%--<jsp:useBean id="RAvare" scope="session" type="java.lang.String" />--%>
<%--<jsp:useBean id="SAvare" scope="session" type="java.lang.String" />--%>
<%--<jsp:useBean id="MAvare" scope="request" type="java.lang.String" />--%>
<%@page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Kvittering</title>
    </head>
    <body>
        <!-- param.parameter kan brukes for å hente data fra parameterene i URL-en -->
        <p>Fra request-parameteren : Bestilling av <b>${param.vare}</b> er mottatt</p>
        <p>Fra Model Attribute : Bestilling av <b>${MAvare}</b> er mottatt</p>
        <p>Fra Session Attribute : Bestilling av <b>${SAvare}</b> er mottatt</p>
        <!-- Virker ikke, vi må gjøre som linjen under -->
        <p>Fra Redirect Attribute : Bestilling av <b>${RAvare}</b> er mottatt</p>
        <!-- RedirectAttributes hentes ut med param.navn -->
        <p>Fra Redirect Attr. -> param. : Bestilling av <b>${param.RAvare}</b> er mottatt</p>
        <p>Fra Redirect Flash Attribute : Bestilling av <b>${RFAvare}</b> er mottatt</p>
    </body>
</html>