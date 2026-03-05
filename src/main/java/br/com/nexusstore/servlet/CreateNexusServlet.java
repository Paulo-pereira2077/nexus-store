package br.com.nexusstore.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-nexus")
public class CreateNexusServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nexusName = request.getParameter("nexus-name");

        System.out.println(nexusName);

        request.getRequestDispatcher("index.html").forward(request, response);

    }
}