public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println(" My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("from" + " " + previousOrganization + " who skipped" + " " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }


}
