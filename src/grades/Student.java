package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // The Student constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Returns the student's name
    public String getName() {
        return name;
    }

    // Adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Returns list of student's grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum = sum + grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student student = new Student("James");
        student.grades.add(90);
        student.grades.add(84);
        student.grades.add(73);
        student.grades.add(96);

        System.out.println("\n" + "\tStudent Name: " + student.getName());
        System.out.println("\t" + student.getName() + "'s" + " grades: " + student.getGrades());
        System.out.println("\t" + student.getName() + "'s" + " average: " + student.getGradeAverage());
    }
}
