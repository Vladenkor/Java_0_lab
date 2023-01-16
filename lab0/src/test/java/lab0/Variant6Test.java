package test.java.lab0;

import main.java.lab0.Variant6;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant6Test {

//
//    inputOutputTask(int a, int b, int c)
//

    @Test(dataProvider = "inputProvider")
    public void inputTest(int p1, int p2, int p3, int p4) {
        assertEquals(new Variant6().inputOutputTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][]{
                {2, 4, 2, 16},
                {2, 1, 5, 10}
        };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeInputTest() {
        new Variant6().inputOutputTask(-2, 3, 5);
    }

//
//    integerNumbersTask(int k)
//

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p2) {
        assertEquals(new Variant6().integerNumbersTask(p1), p2);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{
                {23, new int[]{2, 3}},
                {12, new int[]{1, 2}},
                {56, new int[]{5, 6}}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeIntegerTest() {
        new Variant6().integerNumbersTask(5);
    }

//
//    booleanTask(int A, int B, int C)
//

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, int p3, boolean p4) {
        assertEquals(new Variant6().booleanTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{
                {1, 2, 3, true},
                {1, 1, 5, false},
                {5, 5, 5, false}
        };
    }

//
//    ifTask(double a, double b)
//

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3) {
        assertEquals(new Variant6().ifTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{4, 2, 4}, {0, -1, 0}, {-3, 3, 3}};
    }


//
//    switchTask(int i, double length)
//

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, double p2, double p3) {
        assertEquals(new Variant6().switchTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{
                {3, 12.0, 12.0},
                {1, 45.0, 4.5}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void switchNegativeTest() {
        new Variant6().switchTask(-2, 45);
    }

//
//  forTask(double price)
//

    @Test(dataProvider = "forProvider")
    public void forTest(double n, double[] p) {
        assertEquals(new Variant6().forTask(n), p);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{
                {20.0, new double[]{24.0, 28.0, 32.0, 36.0, 40.0}},
                {5.0, new double[]{6.0, 7.0, 8.0, 9.0, 10.0}}};
    }


//
//    whileTask(int n)
//

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b) {
        assertEquals(new Variant6().whileTask(a), b);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{
                {2, 2},
                {3, 3},
                {4, 8},
                {15, 2027025}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeWhileTest() {
        new Variant6().whileTask(-2);
    }


//
//  arrayTask(int N, int A, int B)
//

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n, int a, int b, int[] array) {
        assertEquals(new Variant6().arrayTask(n, a, b), array);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{
                {3, 1, 2, new int[]{1, 2, 3}},
                {5, 3, 5, new int[]{3, 5, 8, 13, 21}}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void arrayNegativeTest() {
        new Variant6().arrayTask(1, 2, 2);
    }


//
//    matrixTask(int[] array, int M, int N, int Q)
//

    @Test(dataProvider = "matrixProvider")
    public void matrixTaskTest(int[] array, int M, int N, int Q, double[][] doubleArray) {
        assertEquals(new Variant6().matrixTask(array, M, N, Q), doubleArray);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void matrixTaskNegativeTest() {
        new Variant6().matrixTask(new int[]{}, -1, 1, 1);
    }

    @DataProvider
    public Object[][] matrixProvider() {

        double[][] output1 = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {4, 8, 12, 16},
                {8, 16, 24, 32},
        };
        double[][] output2 = {
                {0, 5, 1, 2},
                {0, 20, 4, 8},
                {0, 80, 16, 32},
        };

        return new Object[][]{
                {new int[]{1, 2, 3, 4}, 4, 4, 2, output1},
                {new int[]{0, 5, 1, 2}, 3, 4, 4, output2}};
    }
}

