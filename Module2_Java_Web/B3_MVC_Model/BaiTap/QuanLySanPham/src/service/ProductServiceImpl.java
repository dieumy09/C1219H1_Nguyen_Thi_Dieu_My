package service;

import model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"Knor",20000,"che bien va an uong ", "Unilever"));
        productMap.put(2, new Product(2,"Dove",300000,"ve sinh va cham soc ca nhan", "Unilever"));
        productMap.put(3, new Product(3,"Lifebouy",250000,"ve sinh va cham soc ca nhan", "Unilever"));
        productMap.put(4, new Product(4,"Closeup",15000,"ve sinh va cham soc ca nhan","Unilever"));
        productMap.put(5, new Product(5,"Comfort",20000,"dung dich giat tay","Unilever"));

    }

    public List<Product> findAll(){
        return new ArrayList<>(productMap.values());
    }

    public void save (Product product){
        productMap.put(product.getId(), product);
    }

    public Product findById(int id){
        return productMap.get(id);
    }

    public void update(int id, Product product){
        productMap.put(product.getId(), product);
    }

    public void remove(int id){
        productMap.remove(id);
    }

    public Product findByName(String name) {
        for (Product product : findAll()) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    public List<Product> searchProducts(String keyword){
        ArrayList<Product> arrayList = new ArrayList<>();
        for (Product product : findAll()) {
            if (product.getName().contains(keyword)) {
                arrayList.add(product);
            }
        }
        return arrayList;
    }
}

