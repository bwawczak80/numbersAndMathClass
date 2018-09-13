import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double userChoice;


        double total = 0;


        do {
            System.out.println("Please enter an item or enter \"0\" for your total: ");
            userChoice = userInput.nextFloat();

            total += userChoice;


        }while
            (userChoice != 0) ;
        double figureTax = calculateTax(total);
        double totalWithTax = grossTotal(total, figureTax);
        double recommendedTip = figureTip(totalWithTax);

        displayResults(total, figureTax, totalWithTax, recommendedTip);

        }

        private static double calculateTax(double multiplyTotal){
            return  multiplyTotal * .025;

        }

        private static double grossTotal(double totalBeforeTax, double tax){
            return totalBeforeTax + tax;

        }
        private static double figureTip(double withTax){
            return withTax * .175;
        }
        private static void displayResults(double total, double tax, double gross, double tip) {
            NumberFormat numFormat = NumberFormat.getNumberInstance();
            numFormat.setGroupingUsed(true);
            numFormat.setMaximumFractionDigits(2);
            numFormat.setMinimumFractionDigits(2);
            String totalOut;
            String totalTax;
            String totalGross;
            String recommendTip;
            totalTax = numFormat.format(tax);
            totalOut = numFormat.format(total);
            totalGross = numFormat.format(gross);
            recommendTip = numFormat.format(tip);
            System.out.println("Net total: $" + totalOut);
            System.out.println("Tax: $" + totalTax);
            System.out.println("Gross total: $" + totalGross);
            System.out.println("The recommended tip is: $"+ recommendTip);

        }

    }