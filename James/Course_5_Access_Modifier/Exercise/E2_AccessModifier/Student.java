package James.Course_5_Access_Modifier.Exercise.E2_AccessModifier;

public class Student {

    private String studentName = "Elon Musk";
    private String studentClasses = "SpaceX";

    public Student() {
    }

    public final void setStudentName(String name) {
        studentName = name;
    }

    public final void setStudentClasses(String classes) {
        studentClasses = classes;
    }

    public void studentListDisplay() {
        System.out.println("■ Student name: " + studentName + "\n■ Student class: " + studentClasses);
    }

}