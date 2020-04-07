import Customer.Customer;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> list = new ArrayList<Customer>();
        list.add(new Customer("Nguyen Thi Dieu My", "09/09/1997","Quang Nam","Image/girl3.jpeg"));
        list.add(new Customer("Phan Thi My Tinh", "01/08/1995","Da Nang","Image/girl2.jpg"));
        list.add(new Customer("Nguyen Ha Nguyen","03/02/1998","Da Nang","Image/girl1.png"));
        list.add(new Customer("Nguyen Huu Tho", "12/06/1999","Quang Tri","Image/badboy.jpg"));
        list.add(new Customer("Tran Van Thuan", "01/04/1999", "Da Nang","Image/goodboy.jpg"));


        request.setAttribute("list",list);
//        response.sendRedirect("index.jsp");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//        requestDispatcher.forward(request,response);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
