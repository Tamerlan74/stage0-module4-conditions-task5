package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1,3,5,7,8,10,12:
                System.out.println(31);
                break;
            default:
                System.out.println("wrong number!");
        }    }
}
