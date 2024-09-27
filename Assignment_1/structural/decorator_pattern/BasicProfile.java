package structural.decorator_pattern;

public class BasicProfile implements StudentProfile {
    private String name;

    public BasicProfile(String name) {
        this.name = name;
    }

    @Override
    public String getProfile() {
        return "Profile: " + name;
    }
}
