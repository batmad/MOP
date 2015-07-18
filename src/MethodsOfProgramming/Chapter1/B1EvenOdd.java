package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;
/**
 * Created by tm on 15.07.2015.
 * Класс формирующий список четных и нечетных чисел
 * Выводит список четных и нечетных чисел
 */

public class B1EvenOdd {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        for(int num: numbers){
            if(num % 2 == 0){
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        System.out.println("Четные числа: " + even.toString());
        System.out.println("Нечетные числа: " + odd.toString());
    }
}

