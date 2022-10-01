<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h3>Hei. Tast inn informasjon om personen</h3>
	
	<form:form action="lagrePerson" method="post" modelAttribute="person">
		<form:label path="navn">Navn</form:label>
		<form:input path="navn"/>
		<form:errors path="navn"></form:errors><br>
		
		<form:label path="mobil">Mobil</form:label>
		<form:input path="mobil"/>
		<form:errors path="mobil"></form:errors><br>
		
		<form:label path="hoydecm">Høyde i cm</form:label>
		<form:input path="hoydecm" type="number"/>
		<form:errors path="hoydecm"></form:errors><br>
		
		<form:label path="fdato">Fødselsdato</form:label>
		<form:input path="fdato" type="date"/>
		<form:errors path="fdato"></form:errors><br>
		
		<input type="submit" value="Lagre"/>
	</form:form>
	
</body>
</html>