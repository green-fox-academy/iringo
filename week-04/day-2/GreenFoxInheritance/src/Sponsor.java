public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("who represents " + " " + company + " " + " and hired" + " " + hiredStudents + " " + " students so far. ");
    }

    public void hire() {
        this.hiredStudents += 1;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

}
