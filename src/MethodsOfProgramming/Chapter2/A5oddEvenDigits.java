package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import java.util.ArrayList;

/**
 * Created by tm on 25.07.2015.
 * Класс возвращает количество цифр только с четными номерами и
 */
public class A5oddEvenDigits {
    int[] numbers;
    A4sameDigits sameDigits;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A5oddEvenDigits oddEvenDigits = new A5oddEvenDigits(numbers);
        ArrayList<Integer> evenNumbers = oddEvenDigits.getEvenNumbers();
        ArrayList<Integer> halfOddEvenNumbers = oddEvenDigits.getOddEvenHalfNumbers();
        int sizeOfEvenNumbers =  evenNumbers.size();
        int sizeOfHalfEvenOddNumbers = halfOddEvenNumbers.size();
        System.out.println("Количество чисел, содержащих только четные цифры = " + sizeOfEvenNumbers + evenNumbers.toString());
        System.out.println("Количество чисел, содержащих половину четных цифры и половину нечетных чисел = " + sizeOfHalfEvenOddNumbers + halfOddEvenNumbers.toString());
    }

    public A5oddEvenDigits(int[] numbers){
        this.numbers = numbers;
        sameDigits = new A4sameDigits(numbers);
    }

    public ArrayList<Integer> getEvenNumbers(){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number: numbers){
            boolean isEven = true;
            ArrayList<Integer> arrayOfDigits = sameDigits.getArrayOfDigits(number);
            for(int digit: arrayOfDigits){
                if(digit % 2 != 0){
                    isEven = false;
                }
            }
            if(isEven){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers(){
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int number: numbers){
            boolean isOdd = true;
            ArrayList<Integer> arrayOfDigits = sameDigits.getArrayOfDigits(number);
            for(int digit: arrayOfDigits){
                if(digit % 2 == 0){
                    isOdd = false;
                }
            }
            if(isOdd){
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public ArrayList<Integer> getOddEvenHalfNumbers(){
        ArrayList<Integer> numbersHalfOddEven = new ArrayList<>();
        for (int number: numbers){
            int oddCount = 0;
            int evenCount = 0;
            ArrayList<Integer> arrayOfDigits = sameDigits.getArrayOfDigits(number);
            for(int digit: arrayOfDigits){
                if(digit % 2 == 0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            if(evenCount == oddCount){
                numbersHalfOddEven.add(number);
            }
        }
        return numbersHalfOddEven;
    }
}
