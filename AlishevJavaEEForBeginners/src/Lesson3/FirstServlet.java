package Lesson3;

import Lesson8.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            // response для анонимного пользователя
            // авторизация
            // регистрация
            // session.getAttribute("current_user", ID);
        } else {
            // response для авторизованого пользователя
        }

//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

//        Integer count = (Integer) session.getAttribute("cart");
//
//        if (count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        } else {
//            session.setAttribute("count", count + 1);
//        }

//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

//        PrintWriter pw = response.getWriter();

//        pw.println("<html>");
//        pw.println("<h1> Your count is: " + count + " </h1>");
//        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
//        pw.println("</html>");

//        response.sendRedirect("https://www.google.com");

//        response.sendRedirect("/testJsp.jsp");

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request, response);
    }
}