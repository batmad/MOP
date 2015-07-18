package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 15.07.2015.
 * Класс формирует список введенных чисел по частоте появления в массиве введенных данных
 */
public class B10sortingByFrequency {
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        ArrayList<Integer> tempElement = new ArrayList<>();
        ArrayList<Integer> tempCount = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        while(!numbers.isEmpty()){
            int count = 0;
            int element = numbers.get(0);
            for (int elementSame: numbers){
                if (element == elementSame){
                    count++;
                }
            }
            tempCount.add(count);
            tempElement.add(element);
            while (numbers.contains(element)) {
                numbers.remove(numbers.indexOf(element));
            }
        }
        for(int i = 0; i < tempCount.size(); i++){
            for(int j =0; j < tempCount.size() - i - 1; j++){
                if (tempCount.get(j) < tempCount.get(j+1)) {
                    int temp = tempCount.get(j);
                    tempCount.set(j,   tempCount.get(j+1));
                    tempCount.set(j+1, temp);
                    int temp2 = tempElement.get(j);
                    tempElement.set(j,   tempElement.get(j+1));
                    tempElement.set(j+1, temp2);
                }
            }
        }

        for (int i = 0; i < tempCount.size(); i++){
            for(int j = 0; j < tempCount.get(i); j++) {
                result.add(tempElement.get(i));
            }
        }
        B0print message = new B0print();
        message.print("Количество встречающихся элементов: " + result.toString());
    }

}
