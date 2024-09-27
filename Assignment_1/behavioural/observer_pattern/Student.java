package behavioural.observer_pattern;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String course) {
        System.out.println("Hello " + name + ", new course available: " + course);
    }

    public String getName() {
        return name;
    }
}
