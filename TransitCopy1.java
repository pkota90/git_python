import java.util.ArrayList;

public class TransitCopy1{
    double days;
    double rides;
    double price;
    double[] fares = {2.75, 33.00, 127.00};

    //for persons with disabilities and +65 years
    double[] faresR = {1.35, 16.50, 63.50};
    public TransitCopy1(double noDays, double noRides){
        days = noDays;
        rides = noRides;
    }


    //this method returns the overall price per ride using the 7-day Unlimited option
    public double unlimited7PriceOverall(double days, double rides){
        if((days >0)  && (days<=30)){
            if(days%7 == 0){
                price = ((days/7)*33.00)/rides;
                price = Math.round(price*100)/100d;

            } else {
                double a = Math.floor(days/7) + 1;
                price = (a*33.00)/rides;
                price = Math.round(price*100)/100d;
            }

        } else {
            System.out.println("The fare cannot be calculated!");
        }
        return price;

    }
    //calculates for persons with disabilities and at least 65 years old
    public double unlimited7PriceOverallR(double days, double rides){
        if((days >0)  && (days<=30)){
            if(days%7 == 0){
                price = ((days/7)*16.50)/rides;

            } else {
                double a = Math.floor(days/7) + 1;
                price = (a*16.50)/rides;
            }
            price = Math.round(price*100)/100d;

        } else {
            System.out.println("The fare cannot be calculated!");
        }
        return price;

    }
    // this method calculate the price using the 7-day Unlimited option
    public double unlimited7Price(double days){

        if((days >0)  && (days<=30)){
            if(days%7 == 0){
                price = (days/7)*33.00;
            } else {
                double a = Math.floor(days/7) + 1;
                price = (a*33.00);
            }

        } else {
            System.out.println("The fare cannot be calculated!");
        }

        return price;
    }
    // for persons with disabilities and +65 years
    public double unlimited7PriceR(double days){

        if((days >0)  && (days<=30)){
            if(days%7 == 0){
                price = (days/7)*16.50;
            } else {
                double a = Math.floor(days/7) + 1;
                price = (a*16.50);
            }

        } else {
            System.out.println("The fare cannot be calculated!");
        }

        return price;
    }
    //this method returns the price per ride for each option

    public ArrayList<Double> getRidePrices(double[] fares){
        ArrayList<Double> ridePrices = new ArrayList<>();
        for(double fare:fares){
            if (fare==2.75){
                price = 2.75*rides;
                price = Math.round(price*100)/100d;
                ridePrices.add(price);
            } else if (fare == 33.00){
                price = unlimited7PriceOverall(days,rides);
                price = Math.round(price*100)/100d;
                ridePrices.add(price);
            } else {
                price = 127.00/rides;
                price = Math.round(price*100)/100d;
                ridePrices.add(price);

            }

        }

        return ridePrices;
    }

    //for persons with disabilities and +65 years old
    public ArrayList<Double> getRidePricesR(double[] faresR){
        ArrayList<Double> ridePricesR = new ArrayList<>();
        for(double fareR:faresR){
            if (fareR==1.35){
                price = 1.35*rides;
                price = Math.round(price*100)/100d;
                ridePricesR.add(price);
            } else if (fareR == 16.50){
                price = unlimited7PriceOverallR(days,rides);
                price = Math.round(price*100)/100d;
                ridePricesR.add(price);
            } else {
                price = 63.50/rides;
                price = Math.round(price*100)/100d;
                ridePricesR.add(price);

            }

        }

        return ridePricesR;
    }
    // calculates the best fare
    public String getBestFare(){
        double bestFarePerRide = 0;
        String fareOption = null;
        ArrayList<Double> bf = getRidePrices(fares);
        for(double fare:fares){

            double bf1 = bf.get(0);
            double bf2 = bf.get(1);
            double bf3 = bf.get(2);
            if((bf1 <= bf2) && (bf1 <= bf3)){
                bestFarePerRide = 2.75;
                fareOption = "Pay-per-ride";
            }
            else if ((bf2<bf1) && (bf2<=bf3)){
                bestFarePerRide = bf2;
                fareOption = "7-day Unlimited option";

            } else {
                bestFarePerRide = bf3;
                fareOption = "30-day Unlimited option";

            }

        }
        return "You should get the " + fareOption + " at $" + bestFarePerRide + " per ride";
    }
    //for persons with disabilities and +65 years old
    public String getBestFareR(){
        double bestFarePerRideR = 0;
        String fareOptionR = null;
        ArrayList<Double> bfR = getRidePricesR(faresR);
        for(double fareR:faresR){

            double bfR1 = bfR.get(0);
            double bfR2 = bfR.get(1);
            double bfR3 = bfR.get(2);
            if((bfR1 <= bfR2) && (bfR1 <= bfR3)){
                bestFarePerRideR = 2.75;
                fareOptionR = "Pay-per-ride";
            }
            else if ((bfR2<bfR1) && (bfR2<=bfR3)){
                bestFarePerRideR = bfR2;
                fareOptionR = "7-day Unlimited option";

            } else {
                bestFarePerRideR = bfR3;
                fareOptionR = "30-day Unlimited option";

            }

        }
        return "You should get the " + fareOptionR + " at $" + bestFarePerRideR + " per ride";
    }
    public static void main (String[] args){

        int age = 65;
        boolean disabilities = false;

        if ((age<65)&&(!disabilities)){
            TransitCopy1 tc = new TransitCopy1(6, 14);
            double[] fares = {2.75, 33.00, 127.00};
            System.out.println(tc.unlimited7PriceOverall(6,14));
            System.out.println(tc.unlimited7Price(6));
            System.out.println(tc.getRidePrices(fares));
            System.out.println(tc.getBestFare());}
        else
        {
            TransitCopy1 tcR = new TransitCopy1(6, 14);
            double[] faresR = {1.35, 16.50, 63.50};
            System.out.println(tcR.unlimited7PriceOverallR(6,14));
            System.out.println(tcR.unlimited7PriceR(6));
            System.out.println(tcR.getRidePricesR(faresR));
            System.out.println(tcR.getBestFareR());
        }


    }
}