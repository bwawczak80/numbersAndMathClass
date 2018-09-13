import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double userChoice;


        double total = 0;

        do {
            System.out.println("Please enter an item or enter \"0\" for your total: ");
            userChoice = userInput.nextDouble();
//            String sUserChoice = Double.toString(userChoice);
//            BigDecimal bdUserChoice = new BigDecimal(sUserChoice);
//            String sTotal = Double.toString(total);
//            BigDecimal bdTotal = new BigDecimal(sTotal);
//            bdTotal = bdTotal.add(bdUserChoice);

            total += userChoice;




        }while
            (userChoice != 0) ;
        double figureTax = calculateTax(total);
        double totalWithTax = grossTotal(total, figureTax);
        double recommendedTip = figureTip(totalWithTax);

        displayResults(total, figureTax, totalWithTax, recommendedTip);

        }

        static double calculateTax(double multiplyTotal){
            return multiplyTotal * .025;

        }

        static double grossTotal(double totalBeforeTax, double tax){
            return totalBeforeTax + tax;

        }
        static double figureTip(double withTax){
            return withTax * .175;
        }
        private static void displayResults(Double total, Double tax, Double gross, Double tip) {
            System.out.println("Net total: " + total);
            System.out.println("Tax: " + tax);
            System.out.println("Gross total: " + gross);
            System.out.println("The recommended tip is: " + tip);

        }

    }













