package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1,"Knor",20000,"che bien va an uong ", "Unilever"));
        products.add(new Product(2,"Dove",300000,"ve sinh va cham soc ca nhan", "Unilever"));
        products.add(new Product(3,"Lifebouy",250000,"ve sinh va cham soc ca nhan", "Unilever"));
        products.add(new Product(4,"Closeup",15000,"ve sinh va cham soc ca nhan","Unilever"));
        products.add( new Product(5,"Comfort",20000,"dung dich giat tay","Unilever"));

    }

    public List<Product> findAll(){
        return products;
    }

    public void save(Product product){
        products.add(product);
    }

    public Product findById(int id){
        for (Product product: products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public void update(Product product){
        int id = -1;
        for(Product product1 : products){
            if (product1.getId() == product.getId()){
                id = products.indexOf(product1);
            }
        }
        if ( id != -1){
            products.set(id, product);
        }
    }

    public void remove(int id){
        products.removeIf(p -> p.getId() == id);
    }

}
