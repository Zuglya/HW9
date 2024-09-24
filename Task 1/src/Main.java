import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        if(b != 0) {
            System.out.println("Частное a/b= " + (a / b));
        } else {
            System.out.println("Делить на ноль нельзя");
            return;
        }
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Разность a-b= " + (a - b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("Произведение a*b= " + (a * b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println("Сумма a+b= " + (a + b));
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Введите число:");
        return new Scanner(System.in).nextDouble();
    }
}
