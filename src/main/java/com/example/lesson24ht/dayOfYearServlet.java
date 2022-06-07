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
import java.util.Calendar;
import java.util.Date;


@WebServlet(name = "dayOfYearServlet", value = "/day-of-year-servlet")
public class dayOfYearServlet extends HttpServlet {
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


        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        try {
            cal.setTime(sdf.parse(year + "," +month + "," +day + ","));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        int finalDay = cal.get(Calendar.DAY_OF_YEAR);

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + finalDay + "</h2>");
        out.println("<a href=\"index.jsp\">Назад</a>");
        out.println("</body></html>");
    }
}