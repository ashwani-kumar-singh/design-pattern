package creational.builder.builder;

import creational.builder.Student;

import java.util.List;

public abstract class StudentBuilder {
    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    List<String> subjects;

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
