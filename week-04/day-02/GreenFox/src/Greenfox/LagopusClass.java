package Greenfox;

import java.util.ArrayList;

public class LagopusClass {
  public String className;
  public ArrayList students;
  public ArrayList mentors;

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

}
