package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(rollbackFor = Exception.class)
    public void addOneProduct(String name, double price) {
        productRepository.addProduct(name, price);

        //da rollback
//        throw new RuntimeException(":(");

        //nu da rollback pentru ca e prinsa exceptia
//        try{
//            throw new RuntimeException(":(");
//        } catch (RuntimeException e){
//            e.printStackTrace();
//        }
    }
}
