package MethodsOfProgramming.Chapter2;

import MethodsOfProgramming.Chapter1.B0insertNumbers;
import MethodsOfProgramming.Chapter1.B0print;

/**
 * Created by tm on 20.07.2015.
 * Класс формирующий самое длинное и самое короткое число
 */
public class A1shortLong {
    private int[] numbers;
    private int[] counts;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        int[] numbers = insertNumbers.getNumbersArray();
        A1shortLong shortLong = new A1shortLong(numbers);
        shortLong.countNumberOfDigits();
        int shortest = shortLong.getLongest();
        int longest = shortLong.getShortest();
        B0print message = new B0print();
        message.print("Самое длинное число: " + longest);
        message.print("Самое короткое число: " + shortest);
    }
    public A1shortLong(int[] numbers){
        this.numbers = numbers;
        this.counts = new int[numbers.length];
    }

    public void countNumberOfDigits(){
        for(int i=0; i < numbers.length;i++){
            int number = numbers[i];
            counts[i] = getNumberOfDigits(number);
        }
    }

    public int getShortest() {
        int min = Integer.MAX_VALUE;
        int shortestValue = 1;
        for(int i=0; i < counts.length;i++){
            if(min > counts[i]){
                min = counts[i];
                shortestValue = numbers[i];
            }
        }
        return shortestValue;
    }


    public int getLongest(){
        int max = Integer.MIN_VALUE;
        int longestValue = 1;
        for(int i=0; i < counts.length;i++){
            if( max < counts[i]){
                max = counts[i];
                longestValue = numbers[i];
            }
        }
        return longestValue;
    }

    public int[] getCountedNumberOfDigits(){
        countNumberOfDigits();
        return counts;
    }

    public int getNumberOfDigits(int number){
        int count = 0;
        while(Math.abs(number) > 0){
            count++;
            number = number / 10;
        }
        return count;
    }
}

