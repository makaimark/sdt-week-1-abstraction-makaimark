package com.codecool.webshop;

import com.codecool.webshop.controller.OrderController;
import com.codecool.webshop.model.Order;
import com.codecool.webshop.service.impl.OrderServiceImpl;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import static spark.Spark.*;

public class Application {

    private OrderController orderController;

    public static void main(String[] args) {

        Application app = new Application();
        app.orderController = new OrderController();

        // TODO #1, introduce error handling
        // create an error page, give back an errorCode and errorMessage
        exception(Exception.class, (e, req, res) -> {
            e.printStackTrace();
            res.status(404);
            res.body("Not found");
        });

        port(8888);

        OrderServiceImpl.getInstance().save(new Order(1));
        OrderServiceImpl.getInstance().save(new Order(2));
        Order o = new Order("customerName", "customerAddress");
        o.setId(3);

        OrderServiceImpl.getInstance().save(o);

        get("/", app.orderController::list, new ThymeleafTemplateEngine());

    }

}
