package com.example.lesson24ht;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(name = "dayServlet", value = "/day-servlet")
public class dayOfWeekServlet extends HttpServlet {
    private int year, day, month;

    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        year = Integer.parseInt(req.getParameter("year"));
        month = Integer.parseInt(req.getParameter("month"));
        day = Integer.parseInt(req.getParameter("day"));

        String input_date= year+","+month+","+day;
        SimpleDateFormat format1=new SimpleDateFormat("yyyy,MM,dd");
        Date dt1= null;
        try {
            dt1 = format1.parse(input_date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(dt1);

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + finalDay + "</h2>");
        out.println("<a href=\"index.jsp\">Назад</a>");
        out.println("</body></html>");
    }
}
