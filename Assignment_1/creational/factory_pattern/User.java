package creational.factory_pattern;

public abstract class User {
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getRole();
}