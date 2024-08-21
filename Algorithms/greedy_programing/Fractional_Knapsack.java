
package leetcode_solutions.Algorithms.greedy_programing;


import java.util.Scanner;

public class Fractional_Knapsack {
    public class SimpleFractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        // Arrays to store weights, profits, and ratios
        double[] weights = new double[n];
        double[] profits = new double[n];
        double[] ratios = new double[n];

        // Input weight and profit for each item
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and profit for item " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            profits[i] = sc.nextDouble();
            ratios[i] = profits[i] / weights[i];
        }

        // Input maximum capacity of the knapsack
        System.out.print("Enter the maximum capacity of the knapsack: ");
        double capacity = sc.nextDouble();

        // Sort items based on profit-to-weight ratio using bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ratios[j] < ratios[j + 1]) {
                    // all swapped because repective ratios have respective weights and profits
                    // Swap weights
                    double temp = weights[j];
                    weights[j] = weights[j + 1];
                    weights[j + 1] = temp;

                    // Swap profits
                    temp = profits[j];
                    profits[j] = profits[j + 1];
                    profits[j + 1] = temp;

                    // Swap ratios
                    temp = ratios[j];
                    ratios[j] = ratios[j + 1];
                    ratios[j + 1] = temp;
                }
            }
        }

        // Calculate maximum profit and track the items added
        double maxProfit = 0.0;
        System.out.println("Items added:");

        for (int i = 0; i < n; i++) {
            if (capacity >= weights[i]) {
                // Take the whole item
                maxProfit += profits[i];
                capacity -= weights[i];
                System.out.println("Item " + (i + 1) + ": 1 (Weight: " + weights[i] + ")");
            } else {
                // Take the fraction of the remaining item
                double fraction = capacity / weights[i];
                maxProfit += profits[i] * fraction;
                System.out.println("Item " + (i + 1) + ": " + (int)capacity + "/" + (int)weights[i] + " (Weight: " + capacity + ")");
                break;
            }
        }

        // Output the maximum profit
        System.out.println("Maximum profit: " + maxProfit);
    }
}

}
