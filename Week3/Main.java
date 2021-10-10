import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Teacher firstTeacher = new Teacher();
        firstTeacher.setName("Mert");
        firstTeacher.setSurname("Omgen");
        Teacher secondTeacher = new Teacher();
        secondTeacher.setName("Mert2");
        secondTeacher.setSurname("Omgen2");
        Teacher thirdTeacher = new Teacher();
        thirdTeacher.setName("Mert3");
        thirdTeacher.setSurname("Omgen3");
        Teacher forthTeacher = new Teacher();
        forthTeacher.setName("Mert4");
        forthTeacher.setSurname("Omgen4");
        Teacher fiftTeacher = new Teacher();
        fiftTeacher.setName("Mert5");
        fiftTeacher.setSurname("Omgen5");

        Teacher[] teachers = new Teacher[] { firstTeacher, secondTeacher, thirdTeacher, forthTeacher, fiftTeacher };

        Course firstCourse = new Course("Turkçe", 5);
        Course secondCourse = new Course("Matematik", 6);
        Course thirdCourse = new Course("Fen", 3);
        Course forthCourse = new Course("Sosyal", 4);
        Course fifthCourse = new Course("Beden", 11);

        Course[] courses = new Course[] { firstCourse, secondCourse, thirdCourse, forthCourse, fifthCourse };

        Student firstStudent = new Student(2021);
        firstStudent.setName("Can");
        firstStudent.setSurname("Şahin");
        Student secondStudent = new Student(2021);
        secondStudent.setName("Cemal");
        secondStudent.setSurname("Şahin");
        Student thirdStudent = new Student(2021);
        thirdStudent.setName("Cemal");
        thirdStudent.setSurname("Şahin");
        Student forthStudent = new Student(2021);
        Student fifthStudent = new Student(2021);
        Student sixthStudent = new Student(2021);
        Student seventhStudent = new Student(2021);
        Student eigthStudent = new Student(2021);
        Student nineStudent = new Student(2021);

        Student[] students = new Student[] { firstStudent, secondStudent, thirdStudent, forthStudent, fifthStudent,
                sixthStudent, seventhStudent, eigthStudent, nineStudent};

        Random random = new Random();

        for (int i = 0; i < teachers.length; i++) {
            while (teachers[i].course.size() < 3) {
                int cRand = random.nextInt(courses.length);
                if (!teachers[i].course.contains(courses[cRand])) {
                    teachers[i].course.add(courses[cRand]);
                    System.out.println(
                            teachers[i].getName() + " " + teachers[i].getSurname() + " => " + courses[cRand].getName());
                }
            }
            System.out.println("******");
        }
        for (int i = 0; i < students.length; i++) {
            while (students[i].getCredit() <= 20) {
                int cRand = random.nextInt(courses.length);

                if (courses[cRand].studentList.size() <= 20) {
                    if (!courses[cRand].studentList.contains(students[i])) {
                        courses[cRand].studentList.add(students[i]);

                        if (students[i].getCredit() + courses[cRand].getCredit() <= 20) {
                            students[i].setCredit(students[i].getCredit() + courses[cRand].getCredit());

                            System.out.println(students[i].getName() + " " + students[i].getSurname() + " => "
                                    + courses[cRand].getName() + " = " + courses[cRand].getCredit());

                            System.out.println("credit => " + students[i].getCredit());
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
