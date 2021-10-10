import java.util.ArrayList;

public class Course {
    private String name;
    private int credit;
    private int studentCount;

    public Course(String name, int credit) {
        this.credit = credit;
        this.name = name;
        this.studentCount = 20;
        studentList = new ArrayList<>();
    }

    ArrayList<Student> studentList;

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public int getStudentCount() {
        return studentCount;
    }

}
