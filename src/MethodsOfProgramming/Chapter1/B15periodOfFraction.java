package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 16.07.2015.
 * Класс формирующий период из двух первых положительных чисел в введенном массиве
 */
public class B15periodOfFraction {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        ArrayList<Integer> result = new ArrayList<>();
        int period = 0;
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                count++;
            } else {
                count = 0;
            }
            if (count == 2) {
                double fraction = (double)numbers.get(i - 1) / (double)numbers.get(i);
                period = (int)(fraction * 10) % 10;
                long periods = (long)fraction * 100000000000000000L;
                while(periods > 0){
                    if(period != periods % 10){
                        period = period*10 + (int)periods % 10;
                    }
                    periods = periods / 10;
                }
                result.add(period);
                break;
            }
        }
        B0print message = new B0print();
        message.print("Список периодов дробей: (" + period + ")");
    }
}
