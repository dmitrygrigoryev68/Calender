import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 01, 01);
        int leap = 0;
        if (Year.isLeap(date.getYear())) leap = 1;
        int j = 0;
        for (int i = 0; i < 365 + leap; i++) {
            if (date.plusDays(i).format(DateTimeFormatter.ofPattern("dd")).equals("01")) {
                j = j + 1;
                System.out.println("\n\n" + Month.of(j));
            }
            if (i % 7 == 0) System.out.println("\n");
            System.out.print(date.plusDays(i).format(DateTimeFormatter.ofPattern("EE-dd  ")));
        }
    }
}
