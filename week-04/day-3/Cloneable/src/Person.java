public class Person {

    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void introduce() {
        System.out.print("Hi, I'm " + name + " " + age + " year old" + " " + gender + " ");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}