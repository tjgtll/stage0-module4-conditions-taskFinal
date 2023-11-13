package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        switch (divider) {
            case 0:
                System.out.println("division by zero");
                break;

            default:
                switch (dividend - (dividend / divider * divider)) {
                    case 0:
                        System.out.println("can be divided completely");
                        break;
                    default:
                        System.out.println("cannot be divided completely");
                        break;
                }
                break;
        }
    }
}
