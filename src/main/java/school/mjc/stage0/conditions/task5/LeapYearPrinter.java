package school.mjc.stage0.conditions.task5;

import java.time.LocalDate;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(LocalDate.of(year, 1,1).isLeapYear()?"leap":"not leap");
    }
}
