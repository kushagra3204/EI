package structural.decorator_pattern;

public class AcademicAchievement extends AchievementDecorator {
    public AcademicAchievement(StudentProfile studentProfile) {
        super(studentProfile);
    }

    @Override
    public String getProfile() {
        return studentProfile.getProfile() + ", Achievement: Academic Excellence";
    }
}