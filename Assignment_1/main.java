import java.util.Scanner;
import behavioural.strategy_pattern.*;
import behavioural.observer_pattern.*;
import creational.factory_pattern.*;
import creational.singleton_pattern.*;
import structural.adapter_pattern.*;
import structural.decorator_pattern.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Singleton Pattern - CourseCatalog
        CourseCatalog catalog = CourseCatalog.getInstance();
        catalog.addCourse("Math");
        catalog.addCourse("Science");

        // User Creation - Factory Pattern
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter user type (school/college): ");
        String userType = scanner.nextLine();
        User user = UserFactory.createUser(userType, name, age);

        // Fee Calculation - Strategy Pattern
        FeeContext feeContext = new FeeContext();
        if ("school".equalsIgnoreCase(userType)) {
            feeContext.setStrategy(new SchoolStudentFeeStrategy());
        } else if ("college".equalsIgnoreCase(userType)) {
            feeContext.setStrategy(new CollegeStudentFeeStrategy());
        }

        double baseFee = 1000;
        double fee = feeContext.executeStrategy(baseFee);
        System.out.println("Course Fee for " + user.getRole() + ": " + fee);

        // Observer Pattern - Notification
        CourseNotifier notifier = new CourseNotifier();
        notifier.addObserver(new Student(name));
        notifier.notifyAllObservers("Physics");

        // Adapter Pattern - Third-party Student Management
        StudentManagerAdapter adapter = new StudentManagerAdapter(new ThirdPartyStudentManager());
        adapter.enrollStudent(name, "Lastname");

        // Decorator Pattern - Student Achievements
        StudentProfile profile = new BasicProfile(name);
        profile = new SportsAchievement(profile);
        profile = new AcademicAchievement(profile);
        System.out.println(profile.getProfile());

        scanner.close();
    }
}