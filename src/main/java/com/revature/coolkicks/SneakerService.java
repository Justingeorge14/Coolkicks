package com.revature.coolkicks;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

public class SneakerService extends HttpServlet{
    @Override
    // HttpServlet creates the web server for internet functions
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
        //connects all sneaker objects to the server
        int sneaker_id  = req.getContentLength();
        String sneaker_name = req.getParameter("Sneakers: ");
        String sneaker_brand = req.getParameter("Brand: ");
        int sneaker_size  = req.getContentLength();
        int sneaker_price  = req.getContentLength();
        String ip = req.getRemoteAddr();
        //creating http server in java
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("<title>This is a title </title>");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<body>");

        resp.getWriter().println("ID Number: " + sneaker_id);
        resp.getWriter().println("Name: " + sneaker_name);
        resp.getWriter().println("Sneaker Brand: " + sneaker_brand);
        resp.getWriter().println("Size: " + sneaker_size);
        resp.getWriter().println("Price: " + sneaker_price);
        resp.getWriter().println("Your IP Address:" + ip);

        resp.getWriter().println("</body>");
        resp.getWriter().println("<html>");
    }
}
