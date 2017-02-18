package example6;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o
 *
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * Given p integers, determine the primality of each integer and print whether it is Prime or Not prime on a new line.
 *
 * Note: If possible, try to come up with an O(√n) primality algorithm.
 *
 * Test:
 * 3
 * 12
 * 5
 * 7
 *
 * Result:
 * Not prime
 * Prime
 * Prime
 *
 * Test complexity:
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
public class PrimeChecker {

    public static final String PRIME_MESSAGE = "Prime";
    public static final String NOT_PRIME_MESSAGE = "Not prime";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testsCount = in.nextInt();
        for (int testNumber = 0; testNumber < testsCount; testNumber++) {
            int testValue = in.nextInt();
            boolean isPrime = isPrime(testValue);
            printResult(isPrime);
        }
    }

    private static boolean isPrime(int testValue) {
        if (testValue > 1) {
            double maxValueToCheck = Math.sqrt(testValue);

            for (int i = 2; i <= maxValueToCheck; i++) {
                if (testValue % i == 0) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    private static void printResult(boolean isPrime) {
        System.out.println(isPrime ? PRIME_MESSAGE : NOT_PRIME_MESSAGE);
    }
}