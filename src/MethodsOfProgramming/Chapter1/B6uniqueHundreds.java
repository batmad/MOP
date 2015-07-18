package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 13.07.2015.
 * Класс формирует список трехзначных чисел с уникальными цифрами
 */
public class B6uniqueHundreds {
    ArrayList<Integer> numbers;
    public static void main(String[] args) {
        // write your code here
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B6uniqueHundreds uniqueHundreds = new B6uniqueHundreds(numbers);
        ArrayList result = uniqueHundreds.findUniqueHundreds();
        B0print message = new B0print();
        message.print("Уникальный трехзначный: " + result.toString());
    }

    public B6uniqueHundreds(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public ArrayList findUniqueHundreds(){
        ArrayList<Integer> result = new ArrayList<>();
        for (int element: numbers){
            if (element / 100 > 0) {
                int first = element / 100;
                int second = (element - first * 100) / 10;
                int third = (element - first * 100 - second * 10);
                if ((first != second) && (first != third) && (second != third)) {
                    result.add(element);
                }
            }
        }
        return result;
    }
}
