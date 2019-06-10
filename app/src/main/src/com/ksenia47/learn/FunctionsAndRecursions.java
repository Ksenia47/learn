package com.ksenia47.learn;

public class FunctionsAndRecursions {
    /**
     * Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
     * Выведите все нечетные положительные числа из этой последовательности, сохраняя их порядок.
     */
    public String takeOddNumber(int[] array, int position) {
        if (position < array.length - 1 & array[position] != 0 & array[position] % 2 == 1 & array[position] > 0)
            return array[position] + " " + takeOddNumber(array, ++position);
        else if (position == array.length - 1) {
            if (array[position] % 2 == 1 & array[position] > 0)
                return String.valueOf(array[position]);
            else
                return "";
        } else if (array[position] == 0)
            return "";
        else
            return " " + takeOddNumber(array, ++position);
    }

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
     * или слово NO в противном случае.
     */
    public String isQuotient(int n) {
        if (n < 1)
            return "No";
        else if (n == 1)
            return "Yes";
        else if (n % 2 == 0)
            return isQuotient(n / 2);
        else
            return "No";
    }


    /**
     * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
     * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
     */
    public String fromAToB(int a, int b) {
        if (a == b)
            return String.valueOf(a);
        else if (a > b)
            return a + " " + fromAToB(a - 1, b);
        else
            return a + " " + fromAToB(a + 1, b);
    }

    /**
     * Дано натуральное число n. Выведите все числа от 1 до n.
     */
    public String consistence(int n) {
        if (n == 1)
            return "1";
        else if (n == 0)
            return "0";
        else
            return consistence(n - 1) + " " + n;
    }

    /**
     * Напишите функцию fib(n), которая по данному целому положительному n возвращает n-e число Фибоначчи.
     */
    public int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    /**
     * Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех этих чисел, не используя цикл.
     */
    public int sumNumberArray(int[] array, int position) {
        if (position < array.length - 1 & array[position] != 0)
            return array[position] + sumNumberArray(array, ++position);
        else
            return array[position];
    }

    /**
     * Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
     * если число простое и NO, если число составное.
     * Решение оформите в виде функции IsPrime(n), которая возвращает True для простых чисел
     * и False для составных чисел. Количество операций в программе должно быть пропорционально корню из n.
     */
    public boolean isPrime1(int n) {
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n != i & n % i == 0)
                return false;
        }
        return true;
    }


    /**
     * Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от 1.
     * Решение оформите в виде функции MinDivisor(n). Количество операций в программе должно быть
     * пропорционально корню из n.
     * Указание. Если у числа n нет делителя, меньшего n , то число n — простое и ответом будет само число n.
     */
    public double minDivisor1(int n) {
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return i;
        }
        return n;
    }

    /**
     * Дано действительное положительное число a и целоe число n. Вычислите а в степени n.
     */
    public int power(int a, int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return a;
        else
            return a * power(a, n - 1);
    }

    /**
     * Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию distance(x1, y1, x2, y2),
     * вычисляющую расстояние между точкой (x1. y1) и (x2, y2). Считайте четыре действительных числа
     * и выведите результат работы этой функции.
     */
    public double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    /**
     * Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите функцию min4(a, b, c, d),
     * вычисляющую минимум 4 чисел с помощью функции min. Считайте четыре целых числа и выведите их минимум.
     */


    public int min4(int a, int b, int c, int d) {
        if (min(a, b) <= min(c, d))
            return min(a, b);
        else
            return min(c, d);
    }

    private int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }
}
