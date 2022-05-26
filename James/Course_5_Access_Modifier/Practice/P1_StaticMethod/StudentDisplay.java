package James.Course_5_Access_Modifier.Practice.P1_StaticMethod;

public class StudentDisplay {

    public static void main(String[] args) {
        Student.studentCollegeChange();

        Student student1 = new Student(1, "Tien");
        student1.studentListDisplay();
        System.out.println("");

        Student student2 = new Student(2, "Ngoc");
        student2.studentListDisplay();
        System.out.println("");

        Student student3 = new Student(3, "Luong");
        student3.studentListDisplay();
    }

}