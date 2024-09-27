package creational.factory_pattern;

public class UserFactory {
    public static User createUser(String userType, String name, int age) {
        if ("school".equalsIgnoreCase(userType)) {
            return new SchoolStudent(name, age);
        } else if ("college".equalsIgnoreCase(userType)) {
            return new CollegeStudent(name, age);
        } else {
            throw new IllegalArgumentException("Invalid user type");
        }
    }
}