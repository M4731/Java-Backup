package demo;

import com.matei.hibernatedemoproject.HibernateDemo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                    .addAnnotatedClass(Student.class)
                                                    .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{

            int studentId = 7;

            //get a new session and start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            //retrieve student based on id
            System.out.println("\nGetting student with id: " + studentId);
            Student student = session.get(Student.class, studentId);
            System.out.println("Get complete: "+student);

            //delete student
            //session.remove(student);

            //delete querry
            System.out.println("Deleting student id=6");
            session.createQuery("delete from Student where id=6")
                    .executeUpdate();

            //commit the transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }




    }

}
