public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 20, "male", "BME");

        Student student2 = (Student) student1.clone();

        System.out.println(student2.getName() + " " + student2.getAge() + " " + student2.getGender() + " " + ((Student) student2).getPreviousOrganization());

    }
}
