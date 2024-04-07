package creational.builder;

import creational.builder.builder.EngineeringStudentBuilder;
import creational.builder.builder.MBAStudentBuilder;
import creational.builder.builder.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student buildStudent(){
        if(studentBuilder instanceof MBAStudentBuilder)
            return studentBuilder.setAge(21).setRollNo(12).setName("AK").setSubjects().build();
        else if(studentBuilder instanceof EngineeringStudentBuilder)
            return studentBuilder.setAge(22).setRollNo(13).setName("RS").setSubjects().build();
        else
            return null;
    }
}
