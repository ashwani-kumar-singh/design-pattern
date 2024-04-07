package creational.builder.builder;

import java.util.Arrays;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = Arrays.asList("DSA", "OS", "Computer Architecture");
        return this;
    }
}
