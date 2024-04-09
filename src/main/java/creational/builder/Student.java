package creational.builder;

import creational.builder.builder.StudentBuilder;

import java.util.List;

public class Student {
    private final int rollNo;
    private final int age;
    private final String name;
    private final String fatherName;
    private final String motherName;
    List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNo = builder.getRollNo();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.subjects = builder.getSubjects();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

}
