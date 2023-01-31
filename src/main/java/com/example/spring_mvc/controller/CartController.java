package com.example.spring_mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.spring_mvc.model.CartItem;
import com.example.spring_mvc.model.Product;
import com.example.spring_mvc.model.ProductDao;

@Controller
public class CartController {
    private List<CartItem> cartItems = new ArrayList<>();
    @Autowired
    private ProductDao productDao;

    @RequestMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addToCart(@PathVariable int id, @PathVariable int quantity) {
        Product product = productDao.getList().get(id);
        for (int i = 0; i < cartItems.size() + 1; i++) {
            if (i == cartItems.size()) {
                cartItems.add(new CartItem(product, quantity));
                return "Add new product to cart";
            } else if (cartItems.get(i).getProduct() == product) {
                cartItems.get(i).setQuantity(cartItems.get(i).getQuantity() + quantity);
                return "Add to cart";
            }
        }
        return "Something gone wrong";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String cart() {
        StringBuilder sb = new StringBuilder();
        int value = 0;
        for (CartItem c : cartItems) {
            sb.append(String.format("Product: %s Quantity: %s <br>", c.getProduct().getName(), c.getQuantity()));
            value += c.getProduct().getPrice() * c.getQuantity();
        }
        sb.append(String.format("Cart value: %s$", value));
        return sb.toString();
    }
}
