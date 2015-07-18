package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 13.07.2015.
 * Класс, который находит число в ArrayList, которое делится и на 5 и на 7
 */
public class B4del5and7 {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();

        for (Integer element: numbers){
            if ((element % 5 == 0) && (element % 7 == 0) ){
                result.add(element);
            }
        }


        System.out.println("Числа, которые делятся на 5 и 7: " + result.toString());
    }
}
