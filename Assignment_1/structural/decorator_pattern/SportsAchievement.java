package structural.decorator_pattern;

public class SportsAchievement extends AchievementDecorator {
    public SportsAchievement(StudentProfile studentProfile) {
        super(studentProfile);
    }

    @Override
    public String getProfile() {
        return studentProfile.getProfile() + ", Achievement: Sports Champion";
    }
}