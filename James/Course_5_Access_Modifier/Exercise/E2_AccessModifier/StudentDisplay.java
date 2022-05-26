package James.Course_5_Access_Modifier.Exercise.E2_AccessModifier;

public class StudentDisplay {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Ngoc");
        student.setStudentClasses("CO322G1");
        student.studentListDisplay();
    }

}