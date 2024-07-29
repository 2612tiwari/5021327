public class FinancialForecasting {

    // Method to calculate future value recursively
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: calculate future value for periods - 1
        double valueForPreviousPeriod = calculateFutureValue(presentValue, growthRate, periods - 1);
        // Apply growth rate
        return valueForPreviousPeriod * (1 + growthRate);
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05;   // 5% growth rate
        int periods = 10;           // Number of periods (years)

        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: $" + futureValue);
    }
}
