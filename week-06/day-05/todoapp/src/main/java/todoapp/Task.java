package todoapp;

public class Task {
  private String status;
  private String task;

  Task(String status, String task) {
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