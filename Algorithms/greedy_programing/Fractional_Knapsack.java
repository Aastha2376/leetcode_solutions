
package leetcode_solutions.Algorithms.greedy_programing;


import java.util.Scanner;

public class Fractional_Knapsack {
    public class SimpleFractionalKnapsack {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Start timing
            long startTime = System.currentTimeMillis();
    
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
    
            // Arrays to track item inclusion and fractions
            double[] itemFractions = new double[n];
            double maxProfit = 0.0;
            System.out.println("Items added:");
    
            for (int i = 0; i < n; i++) {
                if (capacity >= weights[i]) {
                    // Take the whole item
                    maxProfit += profits[i];
                    capacity -= weights[i];
                    itemFractions[i] = 1.0;
                } else {
                    // Take the fraction of the remaining item
                    double fraction = capacity / weights[i];
                    maxProfit += profits[i] * fraction;
                    itemFractions[i] = fraction;
                    capacity = 0; // Knapsack is full
                    break;
                }
            }
    
            // Output the status of all items
            for (int i = 0; i < n; i++) {
                if (itemFractions[i] > 0) {
                    if (itemFractions[i] == 1.0) {
                        System.out.println("Item " + (i + 1) + ": 1 (Weight: " + weights[i] + ")");
                    } else {
                        System.out.println("Item " + (i + 1) + ": " + (int)(itemFractions[i] * weights[i]) + "/" + (int)weights[i] + " (Weight: " + (int)(itemFractions[i] * weights[i]) + ")");
                    }
                } else {
                    // Item is not included in the knapsack
                    System.out.println("Item " + (i + 1) + ": 0 (Weight: " + weights[i] + ")");
                }
            }
    
            // Output the maximum profit
            System.out.println("Maximum profit: " + maxProfit);
    
            // End timing and calculate duration
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.println("Execution time: " + duration + " milliseconds");
        }
    }
     
}


