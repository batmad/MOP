package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 14.07.2015.
 * Класс находит НОК и НОД из массива введенных чисел
 */
public class B7NOKandNOD {
    ArrayList<Integer> numbers = new ArrayList<>();


    public static void main(String[] args) {
        // write your code here
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B5bubbleSort sortedNumbers = new B5bubbleSort(numbers);
        numbers = sortedNumbers.bubbleSort();
        B7NOKandNOD nn = new B7NOKandNOD(numbers);
        int nod = nn.nod();
        int nok = nn.nok();
        B0print message = new B0print();
        message.print("Наибольший общий делитель: " + nod);
        message.print("Наименьшее общее кратное: " + nok);
    }

    public B7NOKandNOD(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public int nod(){
        ArrayList<Integer> nodList = new ArrayList<>();
        //т.к. ArrayList numbers сортирован, первый элемент является самым наименьшим
        //Сформируем nodList - список делителей для наименьшего числа
        for(int i = 1; i <= numbers.get(0) ; i++){
            if (numbers.get(0) % i == 0) {
                nodList.add(i);
            }
        }
        //Каждый элемент введенного массива пробуем разделить без остатка на каждый элемент nodList
        //Если не получается, тогда обнуляем значение nodList до 1
        for (int element: numbers){
            for (int i = 0; i < nodList.size(); i++) {
                if (element % nodList.get(i) != 0) {
                    nodList.set(i,1);
                }
            }
        }
        //Находим наибольший общий делитель в nodList
        int nod = Integer.MIN_VALUE;
        for (int element: nodList){
            if (element > nod){
                nod = element;
            }
        }
        return nod;
    }

    public int nok(){
        ArrayList<Integer> nokList = new ArrayList<>();
        ArrayList<Integer> etalon = new ArrayList<>();
        ArrayList<Integer> tempList;
        int lastElement = numbers.get(numbers.size()-1);
        int nok = 1;
        //т.к. ArrayList numbers сортирован, последний элемент является самым наибольшим
        //Сформируем etalon - список всех множителей для наибольшего числа
        for(int i = 2; i <= lastElement; ){
            if(lastElement % i == 0){
                etalon.add(i);
                lastElement = lastElement / i;
            }
            else{
                i++;
            }
        }
        //Для каждого элемента введенного массива сформируем список множителей
        //Для этого воспользуемся временным списком tempList - копия etalon
        //Если множителя нет в etalon, тогда добавляем его в nokList
        //иначе множитель приравниваем к 1 в tempList
        for (int i=0; i < numbers.size()-1; i++){
            int num = numbers.get(i);
            tempList = new ArrayList<>(etalon);
            for(int j = 2; j <= num; ){
                if (num % j == 0) {
                    num = num / j;
                    if(!tempList.contains(j)){
                        nokList.add(j);
                    }
                    else{
                        tempList.set(tempList.indexOf(j), 1);
                    }
                }
                else{
                    j++;
                }
            }
        }
        //Перемножаем все множители в etalon'e и в nokList'e
        for (int num: etalon){
            nok = num * nok;
        }
        for (int num: nokList){
            nok = num *nok;
        }
        return nok;
    }

}
