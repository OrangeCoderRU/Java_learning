package com.company;

public class Main {
    public static void sum_in_cicle(int array [], String cycle_type) {
//      Вывести на экран сумму чисел массива с помощью циклов for, while, do while
        int res = 0;
        int i = 0;
        switch (cycle_type) {
            case ("for"):
                System.out.println("Вы выбрали цикл for");
                for (int a = 0; a < array.length; a++){
                    res += array[a];
                }
                System.out.println(res);
                break;
            case ("while"):
                System.out.println("Вы выбрали цикл while");
                while (i != array.length) {
                    res += array[i];
                    i = i + 1;
                }
                System.out.println(res);
                break;
            case ("do while"):
                System.out.println("Вы выбрали цикл do while");
                i = 0;
                do {
                    res += array[i];
                    i ++;
                } while (i != array.length);
                System.out.println(res);
                break;
            default:
                System.out.println("Неправильный цикл");
                }
    }

    public static void command_line_arg (String[] args){
//        Вывести на экран аргументы командной строки в цикле for
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
    }

    public static void garmonic (int k){
//        Вывести на экран первые 10 чисел гармонического ряда.
        int i = 0;
        float [] array_row;
        array_row = new float[k];

//      для гармонического ряда надо делить единицу на каждое число + 1
//      + 1 потому что массив начинается с 0, а ряд с 1

        while (i != k){
            if (i == 0){
                array_row[i] = 1;
            }
            else {
                array_row[i] = 1 / ((float) i + 1);
            }
            i++;
        }
            System.out.println("Гармонический ряд по k=" + k);
//        количество знаков после запятой меняем цифру в 3f
        for (int a = 0; a < k; a++){
            System.out.printf("%.3f %n", array_row[a]);
        }

//         в виде нормальной дроби в консоли уж не выведешь))

    }

    public static void factorial(int value) {
        long res = 1;
        for (int i = 1; i <= value; i++)
        {
            res *= i;
        }
        System.out.println("Факториал от числа " + value + " равен - " + res);

    }

    public static void main(String[] args) {
//      То что сверху в скобках присвоим переменной(массиву), чтобы передать в свой метод
        String[] cmd_str = args;
//       отправляем аргументы командной строки в метод
        command_line_arg(cmd_str);
//       Чтобы передать аргументы командной строки в IDEA:
//       1. run > edit configurations > program arguments
//       2. вводим любые слова разделенные пробелом
//       3. например - one two three


//        массив для суммы чисел
        int[] num = { 1, 2, 3, 5 };
        sum_in_cicle(num, "for");
        sum_in_cicle(num, "while");
        sum_in_cicle(num, "do while");

//      гармонический ряд задается с помощью k - числа
        garmonic(5);

        factorial(5);

    }
}
