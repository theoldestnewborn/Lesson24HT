package com.example.lesson24ht;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "helloServlet", value = "/time-servlet")
public class TimeServlet extends HttpServlet {
    private String message, time;

    public void init() {
        message = "current time is:";
        LocalDateTime now = LocalDateTime.now();
        time = now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH-mm"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + message + "</h2>");
        out.println("<h1>" + time + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}