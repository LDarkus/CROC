package com.company;

/**
 * Javadoc.
 *
 * @author evstratov
 */

public class Main {
    /*
        Программа выводи на экран числа от 1 до 100.
        Вместо чисел кратных 3 выводится: "Fizz"
        Вместо чисел кратных 5 выводится: "Buzz"
        Вместо чисел кратных и 3 и 5 выводится: "FizzBuzz"
     */
    public static void main(String[] args) {
        //Цикл от 1 до 100, для вывода чисел на экран
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
