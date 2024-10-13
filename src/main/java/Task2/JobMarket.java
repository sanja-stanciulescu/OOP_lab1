package Task2;

import java.util.Random;

public class JobMarket {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        Internship[] internships = new Internship[4];
        String[] names = {"Gigel", "Dorel", "Marcel", "Ionel"};
        String[] companies = {"Google", "Amazon", "Facebook", "Microsoft"};
        Random rand = new Random();
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].setName(names[i]);
            students[i].setGrade(rand.nextDouble(10));
        }

        for(int i = 0; i < internships.length; i++){
            internships[i] = new Internship();
            internships[i].setName(companies[i]);
            internships[i].setMinGrade(rand.nextDouble(10));
            internships[i].setStudents(students);
            internships[i].chooseCandidatesForInterview();
        }

        Student student1 = new Student();
        student1.setName("Ana");
        student1.setGrade(9.12);

        Student student2 = new Student();
        student2.setName("Ana");
        student2.setGrade(9.12);

        System.out.println(student1.equals(student2));
    }
}
