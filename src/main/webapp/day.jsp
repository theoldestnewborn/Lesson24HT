
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>day-of-week</title>
</head>
<body>
<form action="/day-servlet">
   YEAR <input type="text" name="year" value="2000"> <br/>
   MONTH <input type="text" name="month" value="03"> <br/>
   DAY <input type="text" name="day" value="10"> <br/>
    <input type="submit" value="Узнать день недели">
</form>

<form action="/day-of-year-servlet">
    YEAR <input type="text" name="year" value="2000"> <br/>
    MONTH <input type="text" name="month" value="03"> <br/>
    DAY <input type="text" name="day" value="10"> <br/>
    <input type="submit" value="Узнать день года">
</form>
</body>
</html>
