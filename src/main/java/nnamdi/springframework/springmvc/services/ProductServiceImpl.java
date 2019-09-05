package nnamdi.springframework.springmvc.services;

import nnamdi.springframework.springmvc.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements ProductServices {
    private Map<Integer, Product> products;

    public ProductServiceImpl(){
        loadProducts();
    }
    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    public void loadProducts() {
        products = new HashMap<>();
        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("https://example.com/product1");
        products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product2");
        product2.setPrice(new BigDecimal("13.99"));
        product2.setImageUrl("https://example.com/product2");
        products.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product3");
        product3.setPrice(new BigDecimal("12.99"));
        product3.setImageUrl("https://example.com/product3");
        products.put(3, product3);


        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product4");
        product4.setPrice(new BigDecimal("15.99"));
        product4.setImageUrl("https://example.com/product4");
        products.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product5");
        product5.setPrice(new BigDecimal("16.99"));
        product5.setImageUrl("https://example.com/product5");
        products.put(5, product5);

    }
}
