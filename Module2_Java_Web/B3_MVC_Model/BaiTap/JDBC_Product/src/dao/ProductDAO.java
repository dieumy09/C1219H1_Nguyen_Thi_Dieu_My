package dao;

import connect.Connect;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    List<Product> productList;

    public ProductDAO() {
        productList = new ArrayList<>();
    }

    public  List<Product> selectDB() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {

            ResultSet rs = null;
            String query = "select * from product";
            conn = new Connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"), rs.getNString("description"), rs.getString("producer"));
                productList.add(product);
            }
        return productList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            conn.close();
            ps.close();
        }
    }

    public void createRecord(Product product){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String query = "insert into product values(?, ?, ?, ?, ?)";
            conn = new Connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, product.getId());
            ps.setString(2,product.getName());
            ps.setInt(3,product.getPrice());
            ps.setString(4,product.getDescription());
            ps.setString(5,product.getProducer());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateDB(Product product){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String query = "update product set name = '" + product.getName()+
                    "', price = " + product.getPrice() +
                    " , description = '" + product.getDescription() +
                    "', producer = ' " + product.getProducer() + "' where id = " + product.getId();
            conn = new Connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteDB(Product product){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String query = "delete from product where id =" + product.getId();
            conn = new Connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
