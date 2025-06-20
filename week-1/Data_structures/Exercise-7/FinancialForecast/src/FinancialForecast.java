import java.util.Scanner;

public class FinancialForecast {

    public static double futureValue(double pv, double r, int n) {
        if (n == 0) return pv;
        return futureValue(pv, r, n - 1) * (1 + r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the present value: ");
        double presentValue = + sc.nextDouble();
        System.out.println("Enter the Growth Rate value: ");
        double growthRate = sc.nextDouble();
        System.out.println("Enter the year value: ");
        int years = sc.nextInt();

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f%n", years, result);
    }
}
