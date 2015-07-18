package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 16.07.2015.
 * Класс находит числа равные полусумме из введенного массива
 */
public class B14halfSum {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i < numbers.size()-1; i++){
            if (numbers.size() < 3){
                break;
            }
            if(numbers.get(i) == (numbers.get(i-1) + numbers.get(i+1))/2 ){
                result.add(numbers.get(i));
            }
        }
        B0print message = new B0print();
        message.print("Числа равные полусумме соседних элементов: " + result.toString());
    }
}
