package main;

import config.ProjectConfig;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductRepository productRepository = c.getBean(ProductRepository.class);

            Product p = new Product();
            p.setName("Beer");
            p.setPrice(10);

            productRepository.addProduct(p);
        }
    }
}
