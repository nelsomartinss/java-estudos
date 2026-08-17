package Lessons.MemoryBehavior;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfItems, negativeNumbers = 0;

        System.out.print("\nEnter the number of numbers the matrix will contain: ");
        numberOfItems = sc.nextInt();
        int[][] matrix = new int[numberOfItems][numberOfItems];

        for(int i = 0; i < matrix.length; i++){ // Traversing rows
            for(int j = 0; j < matrix[i].length; j++){ // Traversing columns
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nMain diagonal: ");
        for(int i = 0; i < numberOfItems; i++){
            System.out.print(matrix[i][i] + " ");
        }

        System.out.print("\nNegative numbers: ");
        for (int[] ints : matrix) { // Traversing rows
            for (int anInt : ints) { // Traversing columns
                if (anInt < 0) {
                    negativeNumbers++;
                }
            }
        }
        System.out.print(negativeNumbers + "\n");

        sc.close();
    }
}
