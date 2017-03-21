/**
 * Created by Virág on 3/21/2017.
 */
public class CodingHours {
  public static void main(String[] args) {
    int hoursDaily = 6;
    int weeksSemester = 17;
    double workhoursWeekly = 52;
    int hoursSemester = hoursDaily * 5 * weeksSemester;
    double percentHours = hoursDaily * 5 / workhoursWeekly * 100;
    System.out.println("Hours spent with coding in a semester by an attende: " + hoursSemester);
    System.out.println("Percentage of the coding hours in the semester: " + percentHours + "%");
  }
}
