package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;

import java.util.ArrayList;

/**
 * Created by tm on 25.07.2015.
 */
public class A7differentDigits {
    private int[] numbers;
    private A4sameDigits sameDigits;

    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A7differentDigits differentDigits = new A7differentDigits(numbers);
        int numberWithDifferentDigits = differentDigits.getNumberWithDifferentDigits();
        differentDigits.print(numberWithDifferentDigits);
    }

    public A7differentDigits(int[] numbers){
        this.numbers = numbers;
        this.sameDigits = new A4sameDigits(numbers);
    }

    public int getNumberWithDifferentDigits(){
        for(int number: numbers){
            ArrayList<Integer> arrayOfDigits = sameDigits.getArrayOfDigits(number);
            int[] digits = {0,1,2,3,4,5,6,7,8,9};
            boolean isDifferent = true;
            for(int digit: digits) {
                int count = 0;
                for (int i = 0; i < arrayOfDigits.size(); i++) {
                    if (arrayOfDigits.get(i) == digit){
                        count++;
                    }
                    if(count > 1){
                        isDifferent = false;
                        break;
                    }
                }
            }

            if(isDifferent){
                return number;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void print(int number){
        if(number == Integer.MIN_VALUE){
            System.out.println("В веденных числах нет числа с разными цифрами");
        }
        else{
            System.out.println("Число с разными цифрами = " + number);
        }
    }
}
