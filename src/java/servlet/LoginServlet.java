/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.AccountHandler;

/**
 *
 * @author 789648
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("logout") != null) {
            request.getSession().invalidate();
            request.setAttribute("error", "Logged Out");
        }
        if (request.getSession().getAttribute("user") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        } else {
            response.sendRedirect("home");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { // So, after alot of testing I can't get this working
        String uname = request.getParameter("uname").trim(); // I'm not sure HOW request.getParameter()is fucking with the inputs
        String pword = request.getParameter("pword").trim(); // but I can tell you with certainty that it's fucking with the inputs
        String attempt = new AccountHandler().login(uname,pword); // because if the values are hard coded this works just fine
        //String attempt = new AccountHandler().login("abe","password");
        if (attempt != "Invalid Username or Password") {
            request.getSession().setAttribute("user", attempt);
            response.sendRedirect("home");
        } else {
            request.setAttribute("error", attempt); // I did alot of testing here, and the strings have the correct values
            //request.setAttribute("error", uname+" "+pword); // Go ahead and try if you want
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }
    } // so unfortunately I'm giving up here, If I wasn't doing this past the deadline at 1:00am I'd have asked you but oh well
    @Override
    public String getServletInfo() {
        return "Suffering";
    }

}// I think the worst part is that: other than that issue this lab was easy
