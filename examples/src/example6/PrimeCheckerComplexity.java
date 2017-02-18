package example6;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o
 *
 * Test:
 * 3
 * 1000000007
 * 100000003
 * 1000003
 *
 * Result:
 * Prime
 * Not prime
 * Prime
 *
 */
public class PrimeCheckerComplexity {

    public static final String PRIME_MESSAGE = "Prime";
    public static final String NOT_PRIME_MESSAGE = "Not prime";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testsCount = in.nextInt();
        for (int testNumber = 0; testNumber < testsCount; testNumber++) {
            int testValue = in.nextInt();
            boolean isPrimeGood = isPrimeGood(testValue);
            printResult(isPrimeGood);
            boolean isPrimeBad = isPrimeBad(testValue);
            printResult(isPrimeBad);
        }
    }

    private static boolean isPrimeGood(int testValue) {
        if (testValue > 1) {
            double maxValueToCheck = Math.sqrt(testValue);

            int checksCount = 0;
            for (int i = 2; i <= maxValueToCheck; i++) {
                checksCount++;

                if (testValue % i == 0) {
                    System.out.println("Good checks count: " + checksCount);
                    return false;
                }
            }

            System.out.println("Good checks count: " + checksCount);

            return true;
        }

        return false;
    }

    private static boolean isPrimeBad(int testValue) {
        if (testValue > 1) {

            int checksCount = 0;
            for (int i = 2; i < testValue; i++) {
                checksCount++;

                if (testValue % i == 0) {
                    System.out.println("Bad checks count: " + checksCount);
                    return false;
                }
            }

            System.out.println("Bad checks count: " + checksCount);

            return true;
        }

        return false;
    }

    private static void printResult(boolean isPrime) {
        System.out.println(isPrime ? PRIME_MESSAGE : NOT_PRIME_MESSAGE);
    }
}