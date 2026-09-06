package day13_06092026;

import java.time.*;

public class TimeZoneExample {
   public static void main(String[] args) {
       ZoneId zoneID = ZoneId.of("America/Chicago");

       ZonedDateTime zdt = ZonedDateTime.of(
           LocalDate.of(2021, 11, 7),
           LocalTime.of(1, 30),
           zoneID
       );

       ZonedDateTime anHourLater = zdt.plusHours(1);
       anHourLater = anHourLater.plusHours(1);
       System.out.println(zdt.getHour());
       System.out.println(anHourLater.getHour());
       System.out.println(zdt.getHour() == anHourLater.getHour());
       System.out.println(zdt.getOffset().equals(anHourLater.getOffset()));
       
       System.out.println(zdt.getOffset());
       System.out.println(anHourLater.getOffset());
   }
}