package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex014 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfRows, numberOfColumns, chosenNumber;

        System.out.print("\nEnter the number of rows you want in the matrix: ");
        numberOfRows = sc.nextInt();
        System.out.print("Enter the number of columns you want in the matrix: ");
        numberOfColumns = sc.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        System.out.println("\nEnter the elements of the matrix: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDisplay the matrix: ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter one of the numbers belonging to the matrix: ");
        chosenNumber = sc.nextInt();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == chosenNumber){
                    System.out.println("\nPosition: " + i + " | " + j);
                    if(j > 0){
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if(j < matrix[i].length - 1){
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i < matrix[i].length - 1){
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
