package demo;

import com.matei.hibernatedemoproject.HibernateDemo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                    .addAnnotatedClass(Student.class)
                                                    .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save java object
            //create student object
            System.out.println("Creating new student object...");
            Student tempStudent = new Student("Daffy", "Duck", "daffy@gmail.com");

            //start a transaction
            session.beginTransaction();

            //save the student object
            System.out.println("Saving the student...");
            System.out.println(tempStudent);
            session.persist(tempStudent);

            //commit transaction
            session.getTransaction().commit();

            //NEW CODE

            //find out te student's id : primary key
            System.out.println("Saved student. Generated id: " + tempStudent.getId());

            //get a new session and start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            //retrieve student based on id
            System.out.println("\nGetting student with id: " + tempStudent.getId());
            Student student = session.get(Student.class, tempStudent.getId());
            System.out.println("Get complete: "+student);

            //commit the transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }




    }

}
