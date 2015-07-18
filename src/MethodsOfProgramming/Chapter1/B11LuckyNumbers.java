package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 15.07.2015.
 * Класс формирует список счастливых чисел из введенного массива
 */
public class B11LuckyNumbers {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B2MinMax minMax = new B2MinMax(numbers);
        ArrayList<Integer> LuckyNumbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int max = minMax.max();

        ArrayList<Integer> tempArray;


        for(int i = 0; i <= max; i++){
            if(i % 2 != 0) {
                LuckyNumbers.add(i);
            }
        }

        for (int i = 1; i < LuckyNumbers.size(); i++){
            tempArray = new ArrayList<>();
            int count = 0;
            for (int j = 0; j < LuckyNumbers.size(); j++) {
                count++;
                if (count == LuckyNumbers.get(i))
                {
                    count = 0;
                }
                else
                {
                    tempArray.add(LuckyNumbers.get(j));
                }
            }
            LuckyNumbers = tempArray;
        }


        for (int number: numbers){
            if(LuckyNumbers.contains(number)){
                result.add(number);
            }
        }

        System.out.println("Список счастилвых чисел: " + result.toString());
    }
}
