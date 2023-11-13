package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month) {
            case 2:
                System.out.println(_isLeapYear(year) ? "29" : "28");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31");
                break;
            case 4, 6, 9, 11:
                System.out.println("30");
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }

    private boolean _isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 != 0) {
            return false;
        }

        return true;
    }
}
