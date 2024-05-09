package demo;

import com.matei.hibernatedemoproject.HibernateDemo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                    .addAnnotatedClass(Student.class)
                                                    .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try{

            //start a transaction
            session.beginTransaction();

            //query students
            List<Student> students = session.createQuery("from Student").getResultList();

            //display the students
            displayStudents(students);

            //query students: last name='Doe'
            students = session.createQuery("from Student s where s.lastName='Doe'").getResultList();

            //display the students
            System.out.println("\nStudents who have last name of Doe");
            displayStudents(students);

            //query students: last name='Doe' or first name = 'Daffy'
            students = session.createQuery("from Student s where"
                                        + " s.lastName='Doe' OR s.firstName='Daffy'").getResultList();

            //display the students
            System.out.println("\nStudents who have last name of Doe OR first name Daffy");
            displayStudents(students);

            //query students where email LIKE '%gmail.com'");
            students = session.createQuery("from Student s where"
                    + " s.email LIKE '%gmail.com'").getResultList();

            //display the students
            System.out.println("\nStudents who's email end with 'gmail.com'");
            displayStudents(students);


            students = session.createQuery("from Student s where"
                    + " s.lastName='Doe'").getResultList();
            //students = session.createQuery("from Student s where s.firstName='Will'").getResultList();
            System.out.println("\nStudents who's first name is Will");
            displayStudents(students);
            //session.createQuery("update Student s set s.email='will@gmail.com' where s.firstName='Will'");

            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }




    }

    private static void displayStudents(List<Student> students) {
        for (Student s: students){
            System.out.println(s);
        }
    }

}
