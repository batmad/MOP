package MethodsOfProgramming.Chapter2;

import java.util.Scanner;

/**
 * Created by tm on 01.08.2015.
 * Класс определяющий принадлежность к интервалам
 */
public class B1interval {
    private int n;
    private int m;
    private int k;
    public static void main(String[] args) {
        B1interval interval = new B1interval();
        String text = interval.getInterval();
        System.out.print(text);
    }
    public B1interval(){
        this.n = insertNumber("n");
        this.m = insertNumber("m");
        this.k = insertNumber("k");
    }

    public int insertNumber(String text){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число " + text + ": ");
        int number = in.nextInt();
        return number;
    }

    public String getInterval(){
        String text = "";
        if(k > n && k <= m){
            text = text + "k принадлежит (n;m]";
        }
        else if(k >= n && k < m){
            text = text + "\nk принадлежит [n;m)";
        }
        else if(k > n && k < m){
            text = text + "\nk принадлежит (n;m)";
        }
        else if(k >= n && k <= m){
            text = text + "\nk принадлежит [n;m]";
        }
        else {
            text = "k не принадлежит к интервалу между n и m";
        }
        return text;
    }
}
