<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Simple Interest Calculation</h2>
<form action="calculate" method="post">
	<label for="payamount">Enter the Principal AmountPrincipal Amount</label>
	<input id="payamount" name="payamount" type="number"/>
	<br/><br/>
	<label for="noyear">Enter the No. of Year</label>
	<input id="noyear" name="noyear" type="number"/>
	<br/><br/>
	<label for="interest">Enter the Rate of Interest</label>
	<input id="interest" name="interest" type="number"/>
	<br/><br/>
	<button type="submit" style="width: 200px; height: 40px; background-color: lightgreen; border-radius: 20px">Calculate</button>
</form>
</body>
</html>