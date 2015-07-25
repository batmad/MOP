package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import MethodsOfProgramming.Chapter1.B13palindrom;

import java.util.ArrayList;

/**
 * Created by tm on 25.07.2015.
 */
public class A8palindrom {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B13palindrom palindrom = new B13palindrom(numbers);
        ArrayList<Integer> result = palindrom.getPalindrom();
        System.out.print("Числа палиндромы: " + result.toString());
    }
}
