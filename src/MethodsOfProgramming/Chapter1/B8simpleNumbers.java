package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;


/**
 * Created by tm on 14.07.2015.
 * Класс, находит список всех простых чисел в введенном массиве
 */
public class B8simpleNumbers {
    public static void main(String[] args) {
        // write your code here
        boolean isSimple;
        ArrayList<Integer> result = new ArrayList<>();
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        //Ищем кратность каждого элемента из введенного массива данных
        //если есть числа кратные, кроме себя и 1, тогда приравниваем
        //isSimple = false, иначе добавляем в список простых чисел
        for (int element: numbers){
            isSimple = (element == 1) ? false : true;
            for (int i = 2; i < element; i++){
                if(element % i == 0){
                    isSimple = false;
                }
            }
            if(isSimple){
                result.add(element);
            }
        }
        B0print message = new B0print();
        message.print("Простые числа: " + result.toString());
    }
}
