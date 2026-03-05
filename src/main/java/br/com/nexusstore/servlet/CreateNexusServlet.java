package br.com.nexusstore.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create-nexus")
public class CreateNexusServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nexusName = request.getParameter("nexus-name");

        String jsonAparelho = "{ \"nexusName\": \"" + nexusName + "\" }";

        response.setContentType("application/json");

        PrintWriter out = response.getWriter();
        out.print(jsonAparelho);
        out.flush();

    }
}