import java.util.Scanner;

public class Main {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipAmount=meal_cost* tip_percent/100;
        double taxAmount=meal_cost*tax_percent/100;
        double totalAmount=meal_cost+tipAmount+taxAmount;
        //totalAmount=(int)totalAmount;
        //totalAmount=Math.round (totalAmount);
        System.out.println(Math.round(totalAmount));
        //System.out.println(totalAmount);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Meal Price:");
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //System.out.println("Tip Percent:");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //System.out.println("Tax Percent");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
