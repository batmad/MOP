package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;


/**
 * Created by tm on 14.07.2015.
 * Класс сортирует элементы по возрастанию и убыванию
 */
public class B9sorted {
    ArrayList<Integer> numbers;

    public static void main(String[] args) {

        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B9sorted sorted = new B9sorted(numbers);
        ArrayList<Integer> resultIncrease = sorted.getIncreaseSort();
        ArrayList<Integer> resultDecrease = sorted.getDecreaseSort();
        B0print message = new B0print();
        message.print("Сортировка по возрастанию: " + resultIncrease.toString());
        message.print("Сортировка по убыванию: " + resultDecrease.toString());
    }

    public B9sorted(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public ArrayList<Integer> getIncreaseSort(){
        ArrayList<Integer> resultIncrease = new ArrayList<>(numbers);
        for(int i = 0; i < resultIncrease.size(); i++){
            for(int j =0; j < resultIncrease.size() - i - 1; j++){
                if (resultIncrease.get(j) > resultIncrease.get(j+1)) {
                    int temp = resultIncrease.get(j);
                    resultIncrease.set(j,   resultIncrease.get(j+1));
                    resultIncrease.set(j+1, temp);
                }
            }
        }
        return resultIncrease;
    }

    public ArrayList<Integer> getDecreaseSort(){
        ArrayList<Integer> resultDecrease = new ArrayList<>(numbers);
        for(int i = 0; i < resultDecrease.size(); i++){
            for(int j =0; j < resultDecrease.size() - i - 1; j++){
                if (resultDecrease.get(j) < resultDecrease.get(j+1)) {
                    int temp = resultDecrease.get(j);
                    resultDecrease.set(j,   resultDecrease.get(j+1));
                    resultDecrease.set(j+1, temp);
                }
            }
        }
        return resultDecrease;
    }
}
