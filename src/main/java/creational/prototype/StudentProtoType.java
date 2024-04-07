package creational.prototype;

public class StudentProtoType implements ProtoType {

    int rollNo;
    private String dob;
    String name;

    public StudentProtoType() {
    }

    public StudentProtoType(int rollNo, String dob, String name) {
        this.rollNo = rollNo;
        this.dob = dob;
        this.name = name;
    }

    @Override
    public ProtoType clone() {
        return new StudentProtoType(rollNo, dob, name);
    }

    @Override
    public String toString() {
        return "StudentProtoType{" +
                "rollNo=" + rollNo +
                ", dob='" + dob + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
