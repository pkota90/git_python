public class TransitCalculator {
    int noDays;
    int noRides;
    String[] fareModes = new String[]{"payRide", "weeklyRide", "monthlyRide"};
    double[] fareCosts = new double[]{2.75, 33.00, 127.00};

    public TransitCalculator(int tDays, int tRides) {
        noDays = tDays;
        noRides = tRides;
    }

    public double unlimited7Price(){

        return 0;
    }
    public static void main(String[] args) {

    }
}
