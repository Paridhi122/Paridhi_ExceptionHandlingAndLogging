package LoggerAndExceptionHandling;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class InterestCalculatorApp
{
    public static void main( String[] args ) throws IOException {
        final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(LoggerAndExceptionHandling.org.homeTask.App.class);
        Scanner sc = new Scanner(System.in);
        InterestCalculator calculator = new InterestCalculator();
        double p,r,t,interest,amt;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int choice;
        do{
            Logger.info("\nEnter Principal, Rate and Time period(in years): ");
            p = sc.nextDouble();
            r = sc.nextDouble();
            t = sc.nextDouble();
            Logger.info("\n**** MENU ****\n");
            Logger.info("1. Calculate Simple Interest\n");
            Logger.info("2. Calculate Compound Interest\n");
            Logger.info("3. Exit\n");
            choice = sc.nextInt();
            switch(choice){
                case 1: interest = calculator.simpleInterest(p,r,t);
                        Logger.info("The simple interest on principal Rs. "+ p
                        + " @ "+ r+ "% for "+t
                        +" years is Rs."+df.format(interest));
                        amt = interest + p;
                    Logger.info("\nThe total amount to be paid is Rs."+df.format(amt));
                    break;
                case 2: interest = calculator.compoundInterest(p,r,t);
                        Logger.info("The compound interest on principal Rs. "+ p
                            + " @ "+ r+ "% for "+t
                            +" years is Rs."+df.format(interest));
                        amt = interest+p;
                        Logger.info("\nThe total amount to be paid is Rs."+df.format(amt));
                    break;
                case 3: Logger.info("Program Terminated!!");
                        System.exit(0);
                    break;
                default: Logger.info("Wrong choice!!");
            }
        }while (choice!=3);
    }
}
