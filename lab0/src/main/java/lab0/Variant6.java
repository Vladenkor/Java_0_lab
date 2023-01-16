package main.java.lab0;

import java.math.BigDecimal;

public class Variant6 {

    /**
     * @param a is length
     * @param b is length
     * @param c is length
     * @return volume
     */
    public int inputOutputTask(int a, int b, int c) {
        assert a > 0 : "a should be greater than zero";
        assert b > 0 : "b should be greater than zero";
        assert c > 0 : "c should be greater than zero";

        int volume = a * b * c;
        int sq = 2 * (a * b + b * c + a * c);

        System.out.println("Volume = " + volume + "\nSquare = " + sq);
        return volume;
    }

    /**
     * @param k is a two-digit number
     * @return array with both numbers
     */
    public int[] integerNumbersTask(int k) {
        if (k / 100 != 0 || k / 10 == 0) throw new IllegalArgumentException("Number should be two-digit");

        int[] array = new int[2];
        array[0] = k / 10;
        array[1] = k % 10;
        return array;
    }

    /**
     * @param A
     * @param B
     * @param C
     * @return true, if number is possitive
     */
    public boolean booleanTask(int A, int B, int C) {
        if (A < B && B < C) return true;
        return false;
    }


    /**
     * @param a
     * @param b
     * @return greater number
     */
    public double ifTask(double a, double b) {
        if (a > b) return a;
        else return b;
    }

    /**
     * @param i
     * @param length
     * @return length in meters
     */
    public double switchTask(int i, double length) {
        return switch (i) {
            case 1 -> length * 0.1;
            case 2 -> length * 1000;
            case 3 -> length;
            case 4 -> length * 0.001;
            case 5 -> length * 0.01;
            default -> throw new IllegalArgumentException("There is no such option in the menu!");
        };
    }


    /**
     * @param price is price for 1 kg (double number)
     * @return an array of prices for 1.2, 1.4, ..., 2 kg
     */
    public double[] forTask(double price) {
        double[] array = new double[5];
        BigDecimal a = BigDecimal.valueOf(1.2);
        for (int i = 0; i < 5; i++) {
            array[i] = price * a.doubleValue();
            a = BigDecimal.valueOf(0.2).add(a);
        }
        return array;
    }

    /**
     * @param n
     * @return double factorial
     */
    public double whileTask(int n) {
        if (n <= 0) throw new IllegalArgumentException("Number should be greater than zero.");

        int res = 1, i = n;
        while (i >= 0) {
            if (i == 0 || i == 1) return res;
            else res *= i;
            i = i - 2;
        }

        return res;
    }

    /**
     * @param N
     * @param A
     * @param B
     * @return resArr; an array, the first element of which is A,
     * the second is B, and each subsequent element is equal to
     * the sum of all previous ones.
     */
    public int[] arrayTask(int N, int A, int B) {
        if (N <= 2) {
            throw new IllegalArgumentException("Argument should be bigger than 2");
        }

        int[] resArray = new int[N];
        resArray[0] = A;
        resArray[1] = B;
        for (int i = 2; i < N; i++) {
            resArray[i] = resArray[i - 1] + resArray[i - 2];
        }
        return resArray;
    }

    /**
     * @param array
     * @param M
     * @param N
     * @param Q
     * @return matrix from array where in which the first line is the same
     * as the original set of numbers, and the elements of each next line
     * are equal to the corresponding element of the previous line,
     * multiplied by Q
     */
    public double[][] matrixTask(int[] array, int M, int N, int Q) {
        if (M < 0 || N < 0) throw new IllegalArgumentException("M and N should be positive!");

        double[][] arr = new double[M][N];
        for (int i = 0; i < N; i++) arr[0][i] = array[i];

        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = arr[i - 1][j] * Q;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}
