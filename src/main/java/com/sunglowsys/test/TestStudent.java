package com.sunglowsys.test;

import com.sunglowsys.config.ApplicationConfiguration;
import com.sunglowsys.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext (ApplicationConfiguration.class);
        Student student = (Student) context.getBean (Student.class);
        System.out.println ();
        student.setFirstName ("adityakashyap");

        System.out.println ("Student Name:"+student.getFirstName ());
        System.out.println ();
    }
}
