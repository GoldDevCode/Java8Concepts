package com.java8.refresher.JavaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Test Functional Interfaces like Predicate, Cosumer,Function,Supplier in Java 8");
        
        List<Student> listStudents = populateStudentData();
        
        //Predicate test : list students with mathematics as subject
        
        Predicate<Student> mathematicsPredicate = (Student s) -> s.getSpecialization().equalsIgnoreCase("Mathematics");
        System.out.println("=========================== Printing out Student List With Mathematics subject ==========================");
        for(Student s : listStudents) {
        	if(mathematicsPredicate.test(s)) {
        		System.out.println(s);
        	}
        }
        
        //Consumer interface accept(T t) method
        
        Consumer<Student> studentConsumer = (Student s) -> System.out.println(s.getName() +" : "+ s.getPercentage());
        System.out.println("=========================== Printing out Student Name with Percentage ==========================");		
        for(Student s : listStudents) {
        	studentConsumer.accept(s);
        }
        
        //Function interface
        
        Function<Student,String> studentFunction = (Student s ) -> s.getName();
        System.out.println("=============================================Printing out list of Students Name =========================================");
        for(Student s : listStudents) {
        	System.out.println(studentFunction.apply(s));
        }
        
       //Supplier functional interface
        
        Supplier<Student> studentSupplier = () -> new Student(111111, "Mahesh", 94.6, "History");
        
        listStudents.add(studentSupplier.get());
        System.out.println("======================================Printing student list after new addition in the list ============================================");
        System.out.println(listStudents);
        
    }
    
    public static List<Student> populateStudentData(){
    	
        List<Student> listOfStudents = new ArrayList<Student>();
        
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
                 
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
                 
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
                 
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
                 
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
                 
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
                 
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
                 
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
                 
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
                 
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
        
        return listOfStudents;
    	
    }
    
    
    
}
