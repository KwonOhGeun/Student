public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args) {
        Student studentKwon = new Student();
        studentKwon.studentName = "권오근";

        System.out.println(studentKwon.studentName);
        System.out.println(studentKwon.getStudentName());
    }
}
