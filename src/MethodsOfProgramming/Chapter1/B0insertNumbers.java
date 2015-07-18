package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tm on 15.07.2015.
 * Класс формирующий входящий массив данных
 * @return arraylist of integer numbers inputed by user.
 */
public class B0insertNumbers {

    public ArrayList<Integer> getNumbers(){
        System.out.print("Введите числа, для выхода используйте q:");
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            numbers.add(num);
        }
        return numbers;
    }
}