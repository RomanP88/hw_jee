package com.geekbrains.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", urlPatterns = "/productServ")

public class ProductServ extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Список продуктов:" + "</h1>");
        long[] id = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arr = {"Sweet", "Apple", "Chocolate", "Cigarettes", "Meat", "Cheese", "Ice cream", "Wine", "Chicken", "Milk"};
        int[] a = {70, 100, 50, 120, 250, 110, 50, 400, 180, 48};
        for (int i = 0; i < 10; i++) {
            out.println("<h1>" + (new ProductApp(id[i], arr[i], a[i])).toString() + "</h1>");
        }
        out.println("</body></html>");
        out.close();

    }

}
