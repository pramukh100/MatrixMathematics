package pages;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class MatrixPage {
    private WebDriver driver;
    int row, column;
    int matrixFirst[][];
    int matrixSecond[][];
    int matrixSum[][];
    int matrixSubtraction[][];
    int matrixMultiplication[][];

    public MatrixPage(WebDriver driver) {
        this.driver = driver;
    }

    public void defineRawAndColumnOfMatrix(String rowNumber, String columnNumber) {
        row = Integer.parseInt(rowNumber);
        column = Integer.parseInt(columnNumber);
        matrixFirst = new int[row][column];
        matrixSecond = new int[row][column];
        matrixSum = new int[row][column];
        matrixSubtraction = new int[row][column];
        matrixMultiplication = new int[row][column];
    }

    public void creatingTwoMatrices() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixFirst[i][j] = MatrixPage.randomNumber(1, 11);
                matrixSecond[i][j] = MatrixPage.randomNumber(1, 11);
            }
        }
    }

    public void printMatrix() {
        System.out.println("The first Matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixFirst[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The second Matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixSecond[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addTwoMatrices() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixSum[i][j] = matrixFirst[i][j] + matrixSecond[i][j];
            }
        }
    }

    public void subtractTwoMatrices() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixSubtraction[i][j] = matrixFirst[i][j] - matrixSecond[i][j];
            }
        }
    }

    public void multiplyTwoMatrices() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixMultiplication[i][j] = matrixFirst[i][j] * matrixSecond[i][j];
            }
        }
    }

    public void resultMatrix(String mathTask) {
        switch (mathTask) {
            case "Addition":
                System.out.println("Sum of matrix first and second matrix");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(matrixSum[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case "Subtraction":
                System.out.println("Subtraction of matrix first and second matrix");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(matrixSubtraction[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case "Multiplication":
                System.out.println("Multiplication of matrix first and second matrix");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(matrixMultiplication[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static int randomNumber(int min, int max) {
        return (new Random()).nextInt(max - min + 1) + min;
    }
}
