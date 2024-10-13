package Task2;

import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student chooseCandidateRandomly() {
        Random rand = new Random();
        int idx = rand.nextInt(getStudents().length);
        return getStudents()[idx];
    }

    public void chooseCandidatesForInterview() {
        for (int i = 0; i < getStudents().length; i++) {
            if (getStudents()[i].getGrade() >= getMinGrade()) {
                System.out.println("Candidate " + getStudents()[i].getName() + " got a phone interview at " + getName());
            } else {
                System.out.println("Candidate " + getStudents()[i].getName() + " got rejected from " + getName());
            }
        }
    }

}
