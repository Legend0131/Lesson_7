package com.company;
import java.util.Scanner;

import static java.lang.Math.atan;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    System.out.println("Введите точность:");
        double e = in.nextDouble();

    System.out.println("Введите значение x: ");
        double x = in.nextDouble();

        //double tmp2 = 1;
        double tmp; // tmp - предыдущий член в ряду Тейлора
        double res = 1;
        double xn = 1;
        double fact = 1;
        int i = 0;

        do {
            tmp = res; // Сохранение предыдущего члена из ряда Тейлора
            xn *= x; // Вычисление числителя n-ого члена из ряда Тейлора
            i++; // cчетчик для знаменателя
            fact *= i; // факториал знаменателя n-ого члена из ряда Тейлора
            //tmp2 = xn / fact;
            res += xn / fact; // n-ый лен из ряда Тейлора
        } while (Math.abs(res - tmp) > e);

        // System.out.println("coll = " + i);
        System.out.println("Сумма членов ряда Тейлора = " + res);
    return;
        //Тестирование работоспособности программы: Точность указываем - 0,00001;
        // значение x - 1, в ответе должны увидеть приблизительно число e - 2,7
    }
}
