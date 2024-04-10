package creational.builder;


import creational.builder.builder.EngineeringStudentBuilder;
import creational.builder.builder.MBAStudentBuilder;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you
 * to produce different types and representations of an object using the same construction code.
 *
 * @link: <a href="https://www.geeksforgeeks.org/builder-design-pattern/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MBAStudentBuilder());
        System.out.println(director.buildStudent());

        director = new Director(new EngineeringStudentBuilder());
        System.out.println(director.buildStudent());

    }
}
