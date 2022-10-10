<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- Standardbibliotek med for eksempel foreach --%>
<!DOCTYPE html>
<html lang="nb">
    <head>
        <title>WebShop</title>
        <link rel="stylesheet" href="css/simple.css">
    </head>

    <body>
        <p>Du er innlogget som ${username}<br>
           Totalt i handlekurv: kr ${cart.total}</p>
        <table>
            <tr>
                <th>Vare</th>
                <th>Pris</th>
                <th>Antall</th>
                <th>Beløp</th>
            </tr>
            <%-- En løkke som looper igjennom alle elementene i cart.items--%>
            <c:forEach var="item" items="${cart.items}">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.price}</td>
                    <td>${item.quantity}</td>
                    <td>${item.price * item.quantity}</td>
                </tr>
            </c:forEach>
        </table>
        <br>

        <form action="webshop" method="post">
            <fieldset>
                <legend>Handle</legend>
                <input type="checkbox" name="vare" value="bukse" />Bukse<br />
                <input type="checkbox" name="vare" value="genser" />Genser<br />
                <p><input type="submit" value="Legg i handlekurv" /></p>
            </fieldset>
        </form>

        <form action="logout" method="post">
            <fieldset>
                <p><input type="submit" value="Logg ut" /></p>
            </fieldset>
        </form>
    </body>

</html>