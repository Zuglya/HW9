import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        isEven();
    }

    private static void isEven() {
        if(inputInt() % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static int inputInt() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
