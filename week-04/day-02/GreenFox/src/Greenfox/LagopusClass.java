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
    students.add(mentor);
  }

  LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

}
