package creational.builder.builder;

import java.util.Arrays;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = Arrays.asList("Micro Economics", "Business Studies", "Operation Management");
        return this;
    }
}
