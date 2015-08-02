package MethodsOfProgramming.Chapter2;

import java.util.Scanner;

/**
 * Created by tm on 01.08.2015.
 * Класс формирующий матрицу от 1 до k
 */
public class B2matrix {
    public static void main(String[] args) {
        System.out.print("Введите размерность матрицы - от 1 до: ");
        B2matrix matrix = new B2matrix();
        matrix.makeMatrix();
    }

    public int inputNumber(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public void makeMatrix(){
        int matrixLength = inputNumber();
        for (int i = 1; i <= matrixLength; i++){
            for (int j = 1; j <= matrixLength; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
