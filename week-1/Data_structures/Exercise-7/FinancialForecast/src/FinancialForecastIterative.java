import java.util.Scanner;

public class FinancialForecastIterative {

    public static double futureValueIterative(double pv, double r, int n) {
        for (int i = 0; i < n; i++) {
            pv *= (1 + r);
        }
        return pv;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the present value: ");
        double presentValue = + sc.nextDouble();
        System.out.println("Enter the Growth Rate value: ");
        double growthRate = sc.nextDouble();
        System.out.println("Enter the year value: ");
        int years = sc.nextInt();

        double iterativeResult = futureValueIterative(presentValue, growthRate, years);
        System.out.printf("Future Value (Iterative Faster): ₹%.2f%n", iterativeResult);

    }
}
