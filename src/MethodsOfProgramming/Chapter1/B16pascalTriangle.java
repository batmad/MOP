package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 16.07.2015.
 * Класс выводящий треугольник Паскаля из первого положительного элемента введенного массива
 */
public class B16pascalTriangle {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        int indexOfPositive = 0;
        while(numbers.get(indexOfPositive) < 0){
            indexOfPositive++;
        }
        int sizeOfTriangle = numbers.get(indexOfPositive);
        int[][] pascal = new int[sizeOfTriangle][sizeOfTriangle];
        for(int i=0; i < pascal.length; i++){
            for(int j=0; j <= i; j++) {
                if (i == 0 || i == 1 || j == 0 || j == i){
                    pascal[i][j] = 1;
                }
                else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
                }
            }
        }
        for(int i=0; i < pascal.length; i++){
            for (int j=0; j < pascal[i].length; j++){
                if (pascal[i][j] != 0){
                    if(j == 0){
                        for (int k =0; k <= (pascal.length-i)/2; k++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
