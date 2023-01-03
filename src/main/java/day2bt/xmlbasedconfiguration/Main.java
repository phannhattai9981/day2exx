package day2bt.xmlbasedconfiguration;

import day2.Pojo.AcountService;
import day2bt.Pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bt2/beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.paintingCicle("Tài", 2.0);
        student.paintingSquare("Tài", 25.6);
        student.paintingRectangular("Tài", 30.1);

    }
}
