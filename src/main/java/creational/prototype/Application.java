package creational.prototype;

// - https://refactoring.guru/design-patterns/prototype
/**
 * Prototype is a creational design pattern that lets you copy existing objects without
 * making your code dependent on their classes.
 *
 * Problem :
 * 1. some of the object’s fields and getter method may be private and not visible from outside of
 * the object itself.
 * 2. Sometimes you only know the interface that the object follows, but not its concrete class.
 */
public class Application {


    public static void main(String[] args) {
        StudentProtoType studentProtoType = new StudentProtoType(12, "01-01-2000", "Alex");
        // Traditional approach without prototyping
       /* StudentProtoType student = new StudentProtoType();
        student.name = studentProtoType.name;
        student.rollNo = studentProtoType.rollNo;
        student.dob = studentProtoType.dob;*/

        StudentProtoType clonedObj = (StudentProtoType) studentProtoType.clone();
        System.out.println("Cloned Object : " + clonedObj);
    }
}
