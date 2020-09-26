package controller;

import model.Customer;
import service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String email = req.getParameter("email");

        String page;

        Customer existCustomer = CustomerService.getInstance().findCustomer(id);

        if(existCustomer == null) {
            Customer newCustomer = new Customer(
                    id,
                    password,
                    name,
                    gender,
                    email
            );
            CustomerService.getInstance().addCustomer(newCustomer);

            page ="/view/registerSuccess.jsp";
            req.setAttribute("customer", newCustomer);

            RequestDispatcher dispatcher = req.getRequestDispatcher(page);
            dispatcher.forward(req, resp);
        }
    }
}
