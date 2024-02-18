package main;

import config.ProjectConfig;
import demo.Person;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductRepository productRepository = c.getBean(ProductRepository.class);

            Product p = new Product();
            p.setName("Beer");
            p.setPrice(10);

            Product pp = new Product();
            pp.setName("Coke");
            pp.setPrice(9);

            //productRepository.addProduct(pp);
            //productRepository.addProduct(p);

            List<Product> products = productRepository.getProducts();
            products.forEach(System.out::println);

            // -------------------------

            Person person = c.getBean(Person.class);
            person.sayHello("Radu");
        }
    }
}
