package behavioural.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class CourseNotifier {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String course) {
        for (Observer observer : observers) {
            observer.update(course);
        }
    }
}