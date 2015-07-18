package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 13.07.2015.
 * Класс находит число в ArrayList, которое делится на 3 или 9
 */
public class B3del3and9 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        for (Integer element: numbers){
            if ((element % 3 == 0) || (element % 9 == 0) ){
                result.add(element);
            }
        }


        System.out.println("Числа, которые делятся на 3 и 9: " + result.toString());
    }
}
