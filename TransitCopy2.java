import java.util.ArrayList;
import java.util.Scanner;
public class TransitCopy2{
    ArrayList<Double> mainFares= new ArrayList<Double>();
    // fare chart:
    public TransitCopy2(){
        ArrayList<Double> fares= new ArrayList<Double>();
        fares.add(0,2.75);
        fares.add(1,33.0);
        fares.add(2,127.0);
        mainFares=fares;
    }
    //Fare chart display
    public void fareChart(){
        System.out.println("Single-ride fare (in USD): "+ mainFares.get(0));
        System.out.println("week pass fare (in USD): "+ mainFares.get(1));
        System.out.println("Month pass fare (in USD): "+ mainFares.get(2));
    }

    public void possibleOption(int posRides, int posDays){
        //Obvious option
        if(posDays==7){
            System.out.println("7 day pass may be a good option");
        }
        else if(posDays==30){
            System.out.println("Monthly pass may be a good option");
        }
        //Daily singles
        int single=posRides*posDays;
        double costOfSingle=single*mainFares.get(0);
        System.out.println("You will need "+single+" no. of singles. This will cost you "+costOfSingle+" USD.");
        //other weekly options
        if(posDays%7!=0&&posDays!=30){
            int weeks=posDays/7;
            int extra=(posDays%7)*posRides;
            double costOfWeeks1=(weeks*mainFares.get(1))+mainFares.get(1);
            double costOfWeeks2=(weeks*mainFares.get(1))+(extra*mainFares.get(0));
            if(costOfWeeks1<costOfWeeks2){
                System.out.println("Or You will need "+(weeks+1)+" no. of weekly passes. This will cost you "+costOfWeeks1+" USD.");
            }
            else {
                System.out.println("Or You will need " + weeks + " no. of weekly passes and " + extra + " no. of singles. This will cost you " + costOfWeeks2 + " USD.");
            }
        }else if (posDays%7==0&&posDays!=30){
            int weeks=(posDays/7);
            double costOfWeeks=weeks*mainFares.get(1);
            System.out.println("Or You will need "+weeks+" no. of weekly passes. This will cost you "+costOfWeeks+" USD.");
        }else if (posDays==30){
            int months=(posDays/30);
            double costOfMonths=months*mainFares.get(2);
            System.out.println("Or You will need "+months+" no. of monthly passes. This will cost you "+costOfMonths+" USD.");
        }

    }
    public static void main(String[] args){
        //Greeting & Show rate card
        TransitCopy2 getFare=new TransitCopy2();
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your Username: ");
        String userName=input.nextLine();
        System.out.println("Hello "+userName+". Welcome!");
        System.out.print(userName+" would like to see fare-chart? (Press Yes/No) :");
        String willToKnowFares=input.next();
        if(willToKnowFares.equals("yes")||willToKnowFares.equals("YES")||willToKnowFares.equals("Yes")) {
            getFare.fareChart();
        }
        //Taking user input
        System.out.print("Ok.\n"+userName+" Please enter no days : ");
        int days=input.nextInt();
        System.out.print("Please enter no rides you may take each day: ");
        int rides=input.nextInt();
        //Now show possible options
        getFare.possibleOption(rides,days);
    }
}