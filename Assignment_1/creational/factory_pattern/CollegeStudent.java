package creational.factory_pattern;

public class CollegeStudent extends User {
    public CollegeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public String getRole() {
        return "College Student";
    }
}