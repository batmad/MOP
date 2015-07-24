package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import MethodsOfProgramming.Chapter1.B0print;

import java.util.ArrayList;

/**
 * Created by tm on 24.07.2015.
 * Класс возвращает число с минимальным количеством разных цифр
 */
public class A4sameDigits {
    int[] numbers;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A4sameDigits sameDigits = new A4sameDigits(numbers);
        int min = sameDigits.getMinQuantityOfDigits();
        B0print message = new B0print();
        message.print("Число с минимальным количеством разных цифр: " + min);
    }

    public A4sameDigits(int[] numbers){
        this.numbers = numbers;
    }

    public ArrayList<Integer> getArrayOfDigits(int number){
        ArrayList<Integer> arrayOfDigits = new ArrayList<>();
        while (number > 0){
            arrayOfDigits.add(number % 10);
            number = number / 10;
        }
        return arrayOfDigits;
    }

    public int getNumberOfDigits(ArrayList<Integer> arrayList){
        int numberOfUniqueDigits = 0;
        int[] digits = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> counts = new ArrayList<>();
        for (int digit: digits){
            int count = 0;
            for(int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) == digit) {
                    count++;
                }
            }
            counts.add(count);
        }
        for (int count: counts){
            if(count > 1){
                numberOfUniqueDigits++;
            }
        }
        return numberOfUniqueDigits;
    }

    public int getMinQuantityOfDigits(){
        int min = Integer.MAX_VALUE;
        int numberWithMinQuantityOfDigits = 0;
        for(int number: numbers){
            int numberOfDigits = getNumberOfDigits(getArrayOfDigits(number));
            if(min > numberOfDigits){
                numberWithMinQuantityOfDigits = number;
                min = numberOfDigits;
            }
        }
        return numberWithMinQuantityOfDigits;
    }
}
