public class Student extends Person {

    private int year;
    private int credit = 0;

    public Student(int year) {
        this.year = year;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
