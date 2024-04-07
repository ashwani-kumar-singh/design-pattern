package creational.builder;

import creational.builder.builder.StudentBuilder;

import java.util.List;

public class Student {
    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
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
