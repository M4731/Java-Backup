package demo;

import com.matei.hibernatedemoproject.HibernateDemo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save java object
            //create 3 student objects
            System.out.println("Creating 3 student objects...");
            Student student1 = new Student("John", "Doe", "john@gmail.com");
            Student student2 = new Student("Mary", "Public", "mary@gmail.com");
            Student student3 = new Student("Bonita", "Applebum", "bonita@gmail.com");

            //start a transaction
            session.beginTransaction();

            //save the student object
            System.out.println("Saving the students...");
            session.persist(student1);
            session.persist(student2);
            session.persist(student3);

            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }

    }



}
