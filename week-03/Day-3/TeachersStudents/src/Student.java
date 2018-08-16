// Student
    //learn()
    //question(teacher) -> calls the teachers answer method
//Teacher
    //teach(student) -> calls the students learn method
    //answer()

public class Student {

    public void learn() {
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }

}
