package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String[] args) throws SQLException {
        ProductService productService = new ProductService();

        List<Product> productList = productService.findAll();

        for (Product product: productList) {
            System.out.println(product.getName());
        }
    }
}
