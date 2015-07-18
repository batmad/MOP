package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 16.07.2015.
 * Класс формирует список ряда Фибоначчи из введенного массива
 */
public class B12fibonachi {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B2MinMax minMax = new B2MinMax(numbers);
        ArrayList<Integer> fibonachiNumbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int max = minMax.max();
        fibonachiNumbers.add(1);
        fibonachiNumbers.add(1);
        while (fibonachiNumbers.get(fibonachiNumbers.size()-1) < max) {
            fibonachiNumbers.add(fibonachiNumbers.get(fibonachiNumbers.size()-1) + fibonachiNumbers.get(fibonachiNumbers.size()-2));
        }
        for (int input: numbers){
            if(fibonachiNumbers.contains(input)){
                result.add(input);
            }
        }
        B0print message = new B0print();
        message.print("Числа фибоначчи: " + result.toString());
    }
}
