package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer>customerList = new ArrayList<>();
        customerList.add(new Customer("TUE","30-02-1998","HA TINH", "image/tuedi.jpg"));
        customerList.add(new Customer("SON","30-02-1992","THANH HOA", "image/leson.jpg"));
        customerList.add(new Customer("NAM","30-02-1991","HA DONG", "image/anhnam.png"));
        customerList.add(new Customer("DAT","30-02-1996","HO TAY CHICH DAO", "image/anhdat.png"));
        request.setAttribute("customers", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
