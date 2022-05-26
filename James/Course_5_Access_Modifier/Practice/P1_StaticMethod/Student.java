package James.Course_5_Access_Modifier.Practice.P1_StaticMethod;

public class Student {

    private final int studentNo;
    private final String studentName;
    private static String studentCollege = "FPT";

    public Student(int no, String name) {
        studentNo = no;
        studentName = name;
    }

    public static void studentCollegeChange() {
        studentCollege = "CodeGym";
    }

    public void studentListDisplay() {
        System.out.println("■ Student No." + studentNo + "\n■ Student name: " + studentName + "\n■ Student college: " + studentCollege);
    }

}