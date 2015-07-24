package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import java.util.ArrayList;

/**
 * Created by tm on 21.07.2015.
 * Класс формирующий короткие и длинные числа, относительно среднего элемента
 */
public class A3shortLongByMedium {
    int[] numbers;
    A1shortLong shortLong;

    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A2sortByLength sortByLength = new A2sortByLength(numbers);
        sortByLength.sort();
        int[] sortedNumbers = sortByLength.getNumbers();
        A3shortLongByMedium shortLongByMedium = new A3shortLongByMedium(sortedNumbers);
        shortLongByMedium.printHigher();
        shortLongByMedium.printLower();
    }

    public A3shortLongByMedium(int[] numbers){
        this.numbers = numbers;
        this.shortLong = new A1shortLong(numbers);
    }

    public int getMedium(){
        int maxNumberOfDigits = shortLong.getNumberOfDigits(numbers[numbers.length-1]);
        int minNumberOfDigits = shortLong.getNumberOfDigits(numbers[0]);
        int medium = (maxNumberOfDigits + minNumberOfDigits) / 2;
        return medium;
    }

    public ArrayList<Integer> getLowerFromMedium(){
        ArrayList<Integer> lowerNumbers = new ArrayList<>();
        int medium = getMedium();
        int[] counts = shortLong.getCountedNumberOfDigits();
        for(int i = 0; counts[i] < medium; i++){
            lowerNumbers.add(numbers[i]);
        }
        return lowerNumbers;
    }

    public ArrayList<Integer> getLengthOfLowerFromMedium(){
        ArrayList<Integer> lowerNumberCounts = new ArrayList<>();
        int medium = getMedium();
        int[] counts = shortLong.getCountedNumberOfDigits();
        for(int i = 0; counts[i] < medium; i++){
            lowerNumberCounts.add(counts[i]);
        }
        return lowerNumberCounts;
    }

    public ArrayList<Integer> getHigherFromMedium(){
        ArrayList<Integer> higherNumbers = new ArrayList<>();
        int medium = getMedium();
        int[] counts = shortLong.getCountedNumberOfDigits();
        for (int i = counts.length-1; counts[i] > medium; i--){
            higherNumbers.add(numbers[i]);
        }
        return higherNumbers;
    }

    public ArrayList<Integer> getLengthOfHigherFromMedium(){
        ArrayList<Integer> higherNumberCounts = new ArrayList<>();
        int medium = getMedium();
        int[] counts = shortLong.getCountedNumberOfDigits();
        for (int i = counts.length-1; counts[i] > medium; i--){
            higherNumberCounts.add(counts[i]);
        }
        return higherNumberCounts;
    }

    public void printLower(){
        ArrayList<Integer> lowers = getLowerFromMedium();
        ArrayList<Integer> length = getLengthOfLowerFromMedium();
        System.out.println("Числа, длина которых меньше среднего:");
        for (int i = 0; i < lowers.size(); i++) {
            System.out.println("Число = " + lowers.get(i) + ", длина = " + length.get(i));
        }
    }

    public void printHigher(){
        ArrayList<Integer> higher = getHigherFromMedium();
        ArrayList<Integer> length = getLengthOfHigherFromMedium();
        System.out.println("Числа, длина которых ,больше среднего:");
        for (int i = 0; i < higher.size(); i++) {
            System.out.println("Число = " + higher.get(i) + ", длина = " + length.get(i));
        }
    }
}
