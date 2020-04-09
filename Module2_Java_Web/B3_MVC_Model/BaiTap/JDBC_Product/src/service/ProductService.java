package service;

import connect.Connect;
import dao.ProductDAO;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {


    List<Product> productList;
    ProductDAO productDAO;

    public ProductService() throws SQLException {
        productList = new ArrayList<>();
        productDAO = new ProductDAO();
        productList = productDAO.selectDB();
    }


    public List<Product> findAll(){
        return productList;
    }

    public Product findById (int id){
        for (Product product : productList){
            if (product.getId() == id ){
                return product;
            }
        }
        return null;
    }

    public void save(Product product) {
        productList.add(product);
        productDAO.createRecord(product);

    }
    public void update( Product product){
        for (Product product1 : productList){
            if ( product1.getId() == product.getId()){
                productList.remove(product1);
                productList.add(product.getId()-1,product);
                productDAO.updateDB(product);
                return;
            }
        }
    }

    public void delete(Product product){
        for (Product product1 : productList){
            if ( product1.getId() == product.getId()){
                productList.remove(product1);
                productDAO.deleteDB(product);
                return;
            }
        }
    }
}
