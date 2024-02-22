package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * REQUIRED (default) - creeaza tranzactie daca nu are deja
     * REQUIRES_NEW - creeaza mereu tranzactie
     * MANDATORY - daca folosesti mandatory trebuie neaparat sa ai deja o tranzactie
     * NEVER - daca folosesti never trebuie neaprat sa nu ai o tranzactie
     * SUPPORTS - poti folosi metoda cu sau fara tranzactie
     * NOT_SUPPORTED - metoda se executa mereu fara tranzactie
     * NESTED - creeaza o tranzactie in tranzactia deja existenta
     *
     * a() ---> b()
     */

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

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTenProducts(){
        for(int i=1; i<=10; i++){
            String n = "Product " + i;
            double p = i*0.5 + 5;
            productRepository.addProduct(n, p);

//            if(i==5) {
//                throw new RuntimeException(":)");
//            }
        }
    }
}
