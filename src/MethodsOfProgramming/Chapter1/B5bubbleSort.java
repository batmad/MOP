package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 13.07.2015.
 * Класс, сортирующий элементы в ArrayList методом пузырька
 * @return absBubbleSort возвращает сортированные элементы по модулю
 * @return bubbleSort возвращает просто сортированные элементы
 */
public class B5bubbleSort {
    ArrayList<Integer> numbers;

    public static void main(String[] args) {
        // write your code here
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B5bubbleSort abs = new B5bubbleSort(numbers);
        abs.absBubbleSort();
        abs.print();
    }

    public B5bubbleSort(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public ArrayList<Integer> absBubbleSort (){
        int temp;
        for (int i=1; i < numbers.size(); i++) {
            for (int j = 1; j <= numbers.size() - i; j++) {
                if (Math.abs(numbers.get(j - 1)) > Math.abs(numbers.get(j))) {
                    temp = numbers.get(j);
                    numbers.set(j,numbers.get(j-1));
                    numbers.set(j-1,temp);
                }
            }
        }
        return numbers;
    }

    public ArrayList<Integer> bubbleSort (){
        int temp;
        for (int i=1; i < numbers.size(); i++) {
            for (int j = 1; j <= numbers.size() - i; j++) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    temp = numbers.get(j);
                    numbers.set(j,numbers.get(j-1));
                    numbers.set(j-1,temp);
                }
            }
        }
        return numbers;
    }

    public void print() {
        System.out.println("Отсортированные элементы: " + numbers.toString());
    }
}
