package todoapp;

public class Task {
  private int id;
  private String status;
  private String task;

  Task(int id, String status, String task) {
    this.id = id;
    this.status = status;
    this.task = task;
  }

  public String getStatus() {
    return status;
  }

  public String getTask() {
    return task;
  }


}