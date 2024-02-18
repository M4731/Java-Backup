package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "repositories, demo, beans")
public class ProjectConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

//    @Bean
//    public Cat cat() {
//        Cat c = new Cat();
//        c.setName("Tom");
//        return c;
//    }
//
//    @Bean
//    public Owner owner(Cat cat) {
//        Owner o = new Owner();
//        o.setCat(cat);  //pisica din context
//        return o;
//    }

    // == cu stereotype annotations -- daca pui @Component la clase si cauti in pachete cu component scan

}
