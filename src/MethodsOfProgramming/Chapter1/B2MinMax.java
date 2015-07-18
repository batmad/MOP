package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;


/**
 * Created by tm on 12.07.2015.
 * Класс находящий максимальный или минимальный элемент в ArrayList
 * @return min or max element in arrayList
 */
public class B2MinMax {
    ArrayList<Integer> numbers;
    public static void main(String[] args) {
        // write your code here

        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B2MinMax minMax = new B2MinMax(numbers);
        int max = minMax.max();
        int min = minMax.min();

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }

    public B2MinMax(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public int min(){
        int min = Integer.MAX_VALUE;
        for (Integer element: numbers) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (Integer element : numbers) {
            if (element > max){
                max = element;
            }
        }
        return max;
    }
}
