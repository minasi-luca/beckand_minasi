package com.example.backend4f;

import java.io.*;
import java.nio.file.FileStore;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Errore", value = "/Errore")
public class errore extends HttpServlet {
    private String messaggio;
    private FileStore session;

    public void init() {
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int Attributo = (int) session.getAttribute("messaggio");
        System.out.println(messaggio);
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + Attributo + "</h1></body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int Attributo = (int) session.getAttribute("messaggio");
        System.out.println(messaggio);
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + Attributo + "</h1></body></html>");

    }
    public void destroy() {
    }
}