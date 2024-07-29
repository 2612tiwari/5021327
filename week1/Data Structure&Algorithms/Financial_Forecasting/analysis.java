Time Complexity:

Time Complexity: O(n), where 
𝑛
n is the number of periods. Each recursive call reduces the number of periods by 1, leading to 
𝑛
n recursive calls.
Space Complexity: O(n) due to the call stack depth.
Optimizing Recursive Solutions:

To avoid excessive computation and improve efficiency, consider the following techniques:

Memoization: Store previously computed results to avoid redundant calculations. This technique, often used in dynamic programming, can significantly reduce the time complexity of recursive algorithms with overlapping subproblems.

  implementation:
import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    private Map<Integer, Double> memo = new HashMap<>();

    // Method to calculate future value with memoization
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        double valueForPreviousPeriod = calculateFutureValue(presentValue, growthRate, periods - 1);
        double futureValue = valueForPreviousPeriod * (1 + growthRate);
        memo.put(periods, futureValue);
        return futureValue;
    }
}
Iterative Approach: For problems where recursion can be inefficient, converting to an iterative solution can be more practical. For example, using a loop to compute the future value might be more efficient and avoid the overhead of recursive calls.
  
  implementation:
public double calculateFutureValueIterative(double presentValue, double growthRate, int periods) {
    double futureValue = presentValue;
    for (int i = 0; i < periods; i++) {
        futureValue *= (1 + growthRate);
    }
    return futureValue;
}
