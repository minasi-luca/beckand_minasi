package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Home", value = "/Home")
public class home extends HttpServlet {
    private String messaggio;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        System.out.println("User Agent:" + request.getHeader("User-Agent"));
        System.out.println("User Agent:" + request.getHeader("Accept-Encoding"));
        System.out.println("User Agent:" + request.getHeader("Connection"));
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Benvenuto</h1>");
        out.println("</body></html>");


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST);
    }

    public void destroy() {
    }
}