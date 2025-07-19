public class Grade extends Student {
    private double marks;

    public Grade(int id, String name, String course, double marks) {
        super(id, name, course);
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    public void displayGrade() {
        super.displayInfo();
        System.out.println("Marks: " + marks + ", Grade: " + getGrade());
    }
}

