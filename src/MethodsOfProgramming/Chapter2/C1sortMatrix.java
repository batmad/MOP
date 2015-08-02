package MethodsOfProgramming.Chapter2;

import java.util.Random;

/**
 * Created by tm on 02.08.2015.
 * Класс, сортирующий матрицу в порядке возрастания значений к-го столбца
 */
public class C1sortMatrix {
    private int[][] sortedMatrix;
    private int size;
    public static void main(String[] args) {
        B2matrix matrix = new B2matrix();
        System.out.println("Введите размерность матрицы: ");
        int matrixSize = matrix.inputNumber();
        C1sortMatrix sortMatrix = new C1sortMatrix(matrixSize);
        sortMatrix.createRandMatrix();
        sortMatrix.print();
        sortMatrix.sort();
        sortMatrix.print();
    }
    public C1sortMatrix(int size){
        sortedMatrix = new int[size][size];
        this.size = size;
    }

    public void createRandMatrix(){
        Random rand = new Random();
        for (int i=0; i < size; i++){
            for (int j=0; j < size; j++){
                int number = rand.nextInt(size*2)-size;
                sortedMatrix[i][j] = number;
            }
        }
    }

    public void sort(){
        for (int i = 0; i < size * size - 1; i++) {
            for (int j = i; j < size * size; j++) {
                if (sortedMatrix[i / size][i % size] > sortedMatrix[j / size][j % size]) {
                    int temp = sortedMatrix[i / size][i % size];
                    sortedMatrix[i / size][i % size] = sortedMatrix[j / size][j % size];
                    sortedMatrix[j / size][j % size] = temp;
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
