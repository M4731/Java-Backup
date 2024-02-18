package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    private Cat cat;

    //daca folosesc autowired aici, variabila cat poate fi final
    //@Autowired
    public Owner(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    // @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }
}
