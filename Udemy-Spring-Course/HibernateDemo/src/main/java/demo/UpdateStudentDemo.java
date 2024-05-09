package demo;

import com.matei.hibernatedemoproject.HibernateDemo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                    .addAnnotatedClass(Student.class)
                                                    .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{

            int sudentId = 7;

            //get a new session and start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            //retrieve student based on id
            System.out.println("\nGetting student with id: " + sudentId);
            Student student = session.get(Student.class, sudentId);
            System.out.println("Get complete: "+student);

            //update student
            System.out.println("Updating student");
            student.setFirstName("Scooby");
            student.setLastName("Doo");
            student.setEmail("scooby@yahoo.com");

            //commit the transaction
            session.getTransaction().commit();

            //NEW CODE

            session = factory.getCurrentSession();
            session.beginTransaction();

            //update query
            System.out.println("Update query");
            session.createQuery("update Student s set s.email='will@gmail.com'" +
                                " where s.firstName='Will'")
                    .executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }




    }

}
