<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<h1><%= "Hello User!" %>
</h1>
<br/>
<form action="/time-servlet">
<button ><img src="images/clock.jpg" alt="Часы"
             style="vertical-align: middle"> Узнать время</button></p>
</form>
<br/>
<form action="/day.jsp">
    <button><img src="images/calendar.jpg" alt="Календарь"
                  style="vertical-align: middle">Узнать день недели или года</button></p>
</form>
</body>
</html>