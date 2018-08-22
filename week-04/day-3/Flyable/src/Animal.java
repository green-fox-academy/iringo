abstract public class Animal {

    private String name;
    private int age;
    private String gender;
    private String color;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String breed();

}