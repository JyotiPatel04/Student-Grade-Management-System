public class Student {
    private String name;
    private String rollNo;
    private double marks;

    public Student(String name, String rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getRollNo() { return rollNo; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return rollNo + "," + name + "," + marks;
    }
}

