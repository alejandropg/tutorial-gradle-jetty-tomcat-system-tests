package com.autentia.tutorial.gradle.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write(
            "<html>" +
            "    <head><title>Tutorial Gradle Web</title></head>"+
            "    <body><p>Hola mundo!</p></body>" +
            "</html>");
    }
}
