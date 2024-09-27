package creational.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog {
    private static CourseCatalog instance;
    private List<String> courses;

    private CourseCatalog() {
        courses = new ArrayList<>();
    }

    public static synchronized CourseCatalog getInstance() {
        if (instance == null) {
            instance = new CourseCatalog();
        }
        return instance;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }
}