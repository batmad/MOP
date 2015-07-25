package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;

import java.util.ArrayList;

/**
 * Created by tm on 25.07.2015.
 */
public class A6growDigits {
    private int[] numbers;
    private A4sameDigits sameDigits;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A6growDigits growDigits = new A6growDigits(numbers);
        int growerNumber = growDigits.getGrowerNumber();
        growDigits.print(growerNumber);
    }
    public A6growDigits(int[] numbers){
        this.numbers = numbers;
        sameDigits = new A4sameDigits(numbers);
    }

    public int getGrowerNumber(){
        for(int number: numbers){
            boolean isGrowing = true;
            ArrayList<Integer> arrayOfDigits = sameDigits.getArrayOfDigits(number);
            int prev = Integer.MAX_VALUE;
            for(int digit: arrayOfDigits){
                if(prev <= digit){
                    isGrowing = false;
                }
                prev = digit;
            }
            if(isGrowing){
                return number;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void print(int number){
        if(number == Integer.MIN_VALUE){
            System.out.println("В веденных числах нет числа с возрастающими цифрами");
        }
        else{
            System.out.println("Число с возрастающими цифрами = " + number);
        }
    }
}
