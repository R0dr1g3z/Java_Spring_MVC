package com.example.spring_mvc.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.spring_mvc.model.CartItem;
import com.example.spring_mvc.model.Product;

@Controller
public class CartController {
    private List<CartItem> cartItems = new ArrayList<>();

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addToCart() {
        cartItems.add(new CartItem(new Product("Banana", 25), 5));
        return "addtocart";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String cart(){
        StringBuilder sb = new StringBuilder();
        for (CartItem c : cartItems){
            sb.append(String.format("Product: %s Price: %s <br>", c.getProduct().getName(), c.getProduct().getPrice()));
        }
        return sb.toString();
    }
}
