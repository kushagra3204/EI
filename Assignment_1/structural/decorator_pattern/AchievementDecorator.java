package structural.decorator_pattern;

public abstract class AchievementDecorator implements StudentProfile {
    protected StudentProfile studentProfile;

    public AchievementDecorator(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public abstract String getProfile();
}