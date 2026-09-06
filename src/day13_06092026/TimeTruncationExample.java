package day13_06092026;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeTruncationExample {
   public static void main(String[] args) throws InterruptedException {
       // Login time
       Instant loginTime = Instant.now();
       Thread.sleep(1000); // Simulate delay of 1 second

       // Logout time
       Instant logoutTime = Instant.now();

       System.out.println(loginTime);
       System.out.println(logoutTime);
       
       
       // Truncate both times to minutes
       loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES); // line n1
       logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

       
       System.out.println(loginTime);
       System.out.println(logoutTime);
       
       
       // Compare login and logout time
       if (logoutTime.isAfter(loginTime))
           System.out.println("Logged out at: " + logoutTime);
       else
           System.out.println("Can't logout");
   }
}