/**
 * Created by Virág on 3/21/2017.
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secondsNow = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
    System.out.println("Remaining seconds from a day: " + ((24 * 60 * 60) - secondsNow) + " sec");
  }
}