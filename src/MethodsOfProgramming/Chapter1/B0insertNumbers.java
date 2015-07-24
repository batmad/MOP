package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tm on 15.07.2015.
 * Класс формирующий входящий массив данных
 * @return arraylist of integer numbers inputed by user.
 */
public class B0insertNumbers {
    private ArrayList<Integer> numbers;

    public B0insertNumbers(){
        System.out.print("Введите числа, для выхода используйте q:");
        numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            numbers.add(num);
        }
    }

    public ArrayList<Integer> getNumbers(){
        return numbers;
    }

    public int[] getNumbersArray(){
        int[] numbersArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            numbersArray[i] = numbers.get(i);
        }
        return numbersArray;
    }
}