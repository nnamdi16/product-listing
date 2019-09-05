package nnamdi.springframework.springmvc.controllers;

import nnamdi.springframework.springmvc.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PrivateKey;

@Controller
public class ProductController {
    private ProductServices productServices;

    @Autowired
    public void setProductServices(ProductServices productServices) {
        this.productServices = productServices;
    }

    @RequestMapping("/products")
    public String listProduct(Model model) {
        model.addAttribute("products", productServices.listAllProducts());
        return "products";
    }
    @RequestMapping("/products/{id}")
    public String getProduct(@PathVariable Integer id,Model model) {
        model.addAttribute("product", productServices.getProductById(id));
        return "product";
    }
}
