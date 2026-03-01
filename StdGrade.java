class Student {
    private String name;
    private int marks;

    public void setData(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else return "C";
    }
}

class GraduateStudent extends Student {
    @Override
    public String calculateGrade() {
        int marks = getMarks() + 5; // bonus
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else return "C";
    }
}

public class StdGrade {
    public static void main(String[] args) {
        GraduateStudent s = new GraduateStudent();
        s.setData("Alex", 80);
        System.out.println(s.calculateGrade());
    }
}