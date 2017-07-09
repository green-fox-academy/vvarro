package reservation;

import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;

public class Reservation implements Reservationy {
  private String bookingNumber;
  private String dayOfWeek;

  public Reservation(){
    generateBookingNumber();
    genereateDayOfWeek();
  }

  private void genereateDayOfWeek() {
    String[] dayList = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random random = new Random();
    int randomDay = random.nextInt(dayList.length);
    this.dayOfWeek = dayList[randomDay];
  }

  private void generateBookingNumber() {
    String bookingNr = RandomStringUtils.randomAlphanumeric(8);
    this.bookingNumber = bookingNr.toUpperCase();
  }

  @Override
  public String getDowBooking() {
    return dayOfWeek;
  }

  @Override
  public String getCodeBooking() {
    return bookingNumber;
  }

  @Override
  public String toString() {
    String formatForPrint = "Booking# %s for %s";
    return String.format(formatForPrint, getCodeBooking(), getDowBooking());
  }
}
