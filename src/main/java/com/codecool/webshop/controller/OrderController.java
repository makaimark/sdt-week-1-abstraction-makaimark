package com.codecool.webshop.controller;

import com.codecool.webshop.model.Order;
import com.codecool.webshop.service.OrderService;
import com.codecool.webshop.service.impl.OrderServiceImpl;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

    public ModelAndView list(Request request, Response response){
        OrderService orderService = OrderServiceImpl.getInstance();

        Map<String, List<Order>> params = new HashMap<>();
        // TODO fix this error
        params.put("orders", orderService.list());
        return new ModelAndView(params, "order/index");

    }

}
