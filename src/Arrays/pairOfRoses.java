package Arrays;

import java.util.*;

public class pairOfRoses {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int numRoses = scanner.nextInt();
            int rosePrices[] = new int[numRoses];

            for (int i = 0; i < numRoses; ) {
                rosePrices[i++] = scanner.nextInt();
            }

            Arrays.sort(rosePrices);

            int targetPrice = scanner.nextInt();
            int minimumPriceDifference = Integer.MAX_VALUE;

            for (int i = 0; i < numRoses - 1; i++) {
                for (int j = i + 1; j < numRoses; j++) {
                    if (rosePrices[i] + rosePrices[j] == targetPrice) {
                        minimumPriceDifference = Math.min(minimumPriceDifference, j - i);
                    }
                }
            }

            for (int i = 0; i < numRoses - 1; i++) {
                for (int j = i + 1; j < numRoses; j++) {
                    if (rosePrices[i] + rosePrices[j] == targetPrice && j - i == minimumPriceDifference) {
                        System.out.println("Deepak should buy roses whose prices are " + rosePrices[i] + " and " + rosePrices[j] + ".");
                    }
                }
            }
        }
    }
}
