package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import MethodsOfProgramming.Chapter1.B0print;
import java.util.Arrays;

/**
 * Created by tm on 20.07.2015.
 * Класс возвращает остортированный массив по длине элементов
 */
public class A2sortByLength {
    private int[] numbers;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A2sortByLength sortByLength = new A2sortByLength(numbers);
        sortByLength.sort();
        int[] result = sortByLength.getNumbers();
        B0print message = new B0print();
        message.print("Отсортированный массив: " + Arrays.toString(result));
    }

    public A2sortByLength(int[] numbers){
        this.numbers = numbers;
    }

    public void sort(){
        A1shortLong shortLong = new A1shortLong(numbers);
        int[] counts = shortLong.getCountedNumberOfDigits();
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (counts[j] > counts[j + 1]) {
                    int temp = numbers[j];
                    int tempCount = counts[j];
                    numbers[j] = numbers[j + 1];
                    counts[j] = counts[j + 1];
                    numbers[j + 1] = temp;
                    counts[j + 1] = tempCount;
                }
            }
        }
    }

    public int[] getNumbers(){
        return this.numbers;
    }
}
