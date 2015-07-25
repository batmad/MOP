package MethodsOfProgramming.Chapter1;

import java.util.ArrayList;

/**
 * Created by tm on 16.07.2015.
 * Класс находитчисла палиндромы - зеркальные числа из введенного массива
 */
public class B13palindrom {
    private ArrayList<Integer> numbers;
    public static void main(String[] args) {
        B0insertNumbers insertNumbers = new B0insertNumbers();
        ArrayList<Integer> numbers = insertNumbers.getNumbers();
        B13palindrom palindrom = new B13palindrom(numbers);
        ArrayList<Integer> result = palindrom.getPalindrom();
        B0print message = new B0print();
        message.print(" Список цифр: " + result.toString());
    }
    public B13palindrom(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public ArrayList<Integer> getPalindrom(){
        ArrayList<Integer> result = new ArrayList<>();
        int inputCopy;
        boolean isPalindrom;
        for(int input: numbers){
            inputCopy = input;
            ArrayList<Integer> digits = new ArrayList<>();
            while (inputCopy / 10 > 0) {
                digits.add(inputCopy % 10);
                inputCopy = inputCopy / 10;
            }
            digits.add(inputCopy % 10);
            isPalindrom = true;
            for (int i =0; i < digits.size()/2; i++){
                if(digits.get(i) != digits.get(digits.size()-i-1)){
                    isPalindrom = false;
                }
            }
            if(isPalindrom){
                result.add(input);
            }
        }
        return  result;
    }
}
