package structural.adapter_pattern;

public class StudentManagerAdapter {
    private ThirdPartyStudentManager thirdPartyManager;

    public StudentManagerAdapter(ThirdPartyStudentManager thirdPartyManager) {
        this.thirdPartyManager = thirdPartyManager;
    }

    public void enrollStudent(String firstName, String lastName) {
        thirdPartyManager.register(firstName + " " + lastName);
    }
}