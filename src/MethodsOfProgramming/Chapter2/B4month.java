package MethodsOfProgramming.Chapter2;

/**
 * Created by tm on 02.08.2015.
 * Класс формирует название месяца по введеному числу
 */
public class B4month {
    String[] monthNames;
    public static void main(String[] args) throws Exception{
        System.out.print("Введите число от 1 до 12: ");
        B2matrix matrix = new B2matrix();
        int numberOfMonth = matrix.inputNumber();
        B4month month = new B4month();
        String monthName = month.getMonth(numberOfMonth);
        System.out.println(monthName);
    }
    public B4month(){
        this.monthNames = new String[]{"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    }

    public String getMonth(int number) throws Exception{
        if (number < 1 || number > 12){
            throw new Exception("Введенное число выходит за пределы допустимых значений");
        }
        return monthNames[number-1];
    }
}
