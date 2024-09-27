package creational.factory_pattern;

public class SchoolStudent extends User {
    public SchoolStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public String getRole() {
        return "School Student";
    }
}