package nnamdi.springframework.springmvc.services;

import nnamdi.springframework.springmvc.domain.Product;

import java.util.List;

public interface ProductServices {
    List<Product> listAllProducts();
    Product getProductById(Integer Id);
}
//A product list to display on the webpage.
//A  controller was created, got a product service,
//Wrote an interface for dependency injection.