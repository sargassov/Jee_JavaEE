package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private ProductRepository products;

    public ProductServlet(){
        products = new ProductRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < products.getRepository().length; i++) {
            resp.getWriter().printf("<h1>" + products.getRepository()[i].getTitle() + "\t" +
                    products.getRepository()[i].getCost() + i + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
