package MethodsOfProgramming.Chapter2;

import java.util.Scanner;

/**
 * Created by tm on 01.08.2015.
 * Класс возвращающий корни квадратного уравнения. Параметры уравнения передавать
 с командной строкой.
 */
public class B3sqrt {
    private String formula;
    private String[] elements;
    private int a;
    private int b;
    private int c;
    public static void main(String[] args) throws Exception{
        B3sqrt sqrt = new B3sqrt();
        double[] answers = sqrt.getAnswer();
        System.out.println("1 корень уравнения равен: " + answers[0]);
        System.out.println("2 корень уравнения равен: " + answers[1]);
    }
    public B3sqrt(){
        System.out.println("Для выхода используйте q.");
        System.out.println("Введите уравнение c тремя элементами");
        System.out.println("и двумя унарными операторами (- или +): ");
        System.out.println("Например x2-10x+96. Введите: ");
        this.formula = inputFormula();
        this.elements = getElements();
    }

    public String inputFormula(){
        Scanner in = new Scanner(System.in);
        String formula = "";
        while(in.hasNext()  ){
            String text = in.next();
            if(text.equals("q") || text.equals("exit") || text.equals("quit")){
                break;
            }
            formula = formula + text;
        }
        return formula;
    }

    public String[] getElements(){
        String elements[] = new String[3];
        int count = 0;
        int prev = 0;
        try {
            for (int i = 1; i < formula.length(); i++) {
                Character ch = formula.charAt(i);
                if (ch == '-') {
                    elements[count] = formula.substring(prev, i);
                    count++;
                    prev = i;
                } else if (ch == '+') {
                    elements[count] = formula.substring(prev, i);
                    count++;
                    prev = i + 1;
                } else if (i == formula.length() - 1) {
                    elements[count] = formula.substring(prev, i + 1);
                }
            }
        }
        catch (Exception e){
            System.err.println("Больше элементов чем ожидалось." + e);
        }
        return elements;
    }

    public boolean isSquaredX(String text){
        boolean letterFound = false;
        boolean digitAfterXFound = false;
        String digitAfterX = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                letterFound = true;
            }
            if(Character.isDigit(ch) && letterFound){
                digitAfterXFound = true;
                digitAfterX = digitAfterX + ch;
            }
        }
        return digitAfterXFound;
    }

    public int getDigitOfSquaredX(String text){
        boolean digitFound = false;
        String digit = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                break;
            }
            if(Character.isDigit(ch) || ch == '-'){
                digitFound = true;
                digit = digit + ch;
            }
        }
        if(digitFound){
            return Integer.parseInt(digit);
        }
        else {
            return 1;
        }
    }

    public boolean isX(String text){
        boolean xFound = false;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                xFound = true;
            }
            if(Character.isDigit(ch) && xFound){
                xFound = false;
            }
        }
        return xFound;
    }

    public int getDigitOfX(String text){
        boolean digitFound = false;
        String digit = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                break;
            }
            if(Character.isDigit(ch) || ch == '-'){
                digitFound = true;
                digit = digit + ch;
            }
        }
        if(digitFound){
            return Integer.parseInt(digit);
        }
        else {
            return 1;
        }
    }

    public int getDiscriminant(){
        int disciminant;
        for(String element: elements){
            if(isSquaredX(element)){
                a = getDigitOfSquaredX(element);
            }
            else if(isX(element)){
                b = getDigitOfX(element);
            }
            else{
                c = Integer.parseInt(element);
            }
        }
        disciminant = b*b - 4*a*c;
        return disciminant;
    }

    public double[] getAnswer() throws Exception{
        double[] answers = new double[2];

        int D = getDiscriminant();
        if(D<0){
            throw new Exception("Дискриминант меньше нуля");
        }
        answers[0] = (-b + Math.sqrt(D))/ (2*a);
        answers[1] = (-b - Math.sqrt(D))/ (2*a);
        return answers;
    }
}
