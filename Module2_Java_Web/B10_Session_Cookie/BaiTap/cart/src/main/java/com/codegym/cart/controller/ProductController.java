package com.codegym.cart.controller;

import com.codegym.cart.model.Cart;
import com.codegym.cart.model.Product;
import com.codegym.cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ModelAttribute("cart")
    public Cart setUpUserForm() {
        return new Cart();
    }

    @GetMapping("/")
    public ModelAndView showProductList(){
        return new ModelAndView("list","products",productService.findAll());
    }
    @GetMapping("/view-product/{id}")
    public ModelAndView viewProduct(@PathVariable("id") Long id){
        return new ModelAndView("view","product",productService.findById(id));
    }
    @PostMapping("/view-product/{id}")
    public ModelAndView addViewProduct(@PathVariable("id") Long id,@ModelAttribute("cart") Cart cart){
        Product product=productService.findById(id);
        ModelAndView modelAndView=new ModelAndView("view");
        modelAndView.addObject("product",product);
        if (product==null){
            modelAndView.addObject("message","Error");
        }else{
            cart.addToCart(product);
            modelAndView.addObject("message","Add "+product.getProductName()+" to cart successfully\nAmount: "+cart.getAmount(product));
        }
        return modelAndView;
    }
    @GetMapping("/cart")
    public ModelAndView goToCart(@ModelAttribute("cart") Cart cart){
        return new ModelAndView("cart","list",cart.getCart());
    }
    @GetMapping("/cart/{id}")
    public ModelAndView removeProduct(@ModelAttribute("cart") Cart cart,@PathVariable("id") Long id){
        cart.removeProduct(productService.findById(id));
        return new ModelAndView("redirect:/cart");
    }
}
