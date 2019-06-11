package com.ksenia47.learn;

public class Loops {
    /**
     * Вывести массив типа boolean в обратном порядке используя цикл со счётчиком.
     */
    public String getArrayInverce(boolean[] array) {
        String answer = "";
        for (int i = array.length - 1; i >= 0; i--) {
            answer += String.valueOf(array[i] + " ");
        }
        return answer;
    }

    /**
     * Массив типа char выводить символы, пока не встретится пробел.
     */
    public String getArrayToVacuity(char[] symb) {
        String answer = "";
        for (int i = 0; !String.valueOf(symb[i]).equals(" "); i++) {
            answer += String.valueOf(symb[i] + " ");
        }
        return answer;
    }

    /**
     * Даны две переменные: x, n. Вычислить x в степени n.
     */
    public int getPow(int x, int n) {
        int result = x;
        int i = 1;
        do {
            result *= x;
            i++;
        } while (i < n);
        return result;
    }

    /**
     * Дана переменная n. Вывести факториал n.
     */
    public int getFactorial(int n) {
        int y = 1;
        int i = 1;
        while (i <= n) {
            y *= i;
            i++;
        }
        return y;
    }

    /**
     * По данному числу N вывести все целые степени двойки, не превосходящие N, в порядке возрастания.
     */
    public String getAllPowerOfTwo(int n) {
        int x = 2;
        int result = 0;
        String answer = "";
        for (int i = 0; result < n; i++) {
            int b = (int) Math.pow(x, i);
            if (b > n)
                break;
            result = (int) Math.pow(x, i);
            answer += result + " ";
        }
        return answer;
    }

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
     * или слово NO в противном случае.
     */
    public String checkDoesItAccuratePowerOfTwo(int n) {
        String answer = "";
        int x = 2;
        int result = 1;
        for (int i = 0; result < n; i++) {
            result *= x;
        }
        if (result == n)
            answer = "YES";
        else if (result != n)
            answer = "NO";
        return answer;
    }

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     */
    public int getSumElementToArrayBeforeZero(int[] array) {
        int sum = 0;
        for (int i = 0; array[i] != 0; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Последовательность состоит из натуральных чисел и завершается числом 0. Определите, какое количество
     * элементов этой последовательности равны ее наибольшему элементу.
     */
    public int definequantityElementsEqualsMax(int[] array) {
        int max = 0;
        int amount = 0;
        for (int i = 0; array[i] > 0; i++) {
            int test = array[i];
            if (array[max] < array[i]) {
                max = i;
                amount = 1;
            } else if (array[max] == array[i])
                amount++;
        }
        return amount;
    }

    /**
     * По данному числу N определите N-е число Фибоначчи
     */
    public int defineNumberFibonachi(int n) {
        int a = 0;
        int b = 1;
        int fib = 2;
        int i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
        return fib;
    }

    /**
     * Дано натуральное число A. Определите, каким по счету числом Фибоначчи оно является, то есть выведите такое
     * число N, что F(N) = A. Если А не является числом Фибоначчи, выведите число -1
     */
    public String defineWhatIsTheAccountNumberFibonachi(int a) {
        int b = 0;
        int c = 1;
        int fib = 2;
        int i = 2;
        String answer = "";
        while (fib < a) {
            fib = b + c;
            b = c;
            c = fib;
            i++;
        }
        if (a == fib)
            answer = String.valueOf(i);
        else
            answer = String.valueOf(-1);
        return answer;
    }

    /**
     * Процентная ставка по вкладу составляет P процентов годовых, которые прибавляются к сумме
     * вклада через год. Вклад составляет X рублей Y копеек. Определите размер вклада через K лет.
     */
    public String getDepositAmount(double p, int x, int y) {
        double k = 3;
        double sum = x * 100 + y;
        double persent = sum / 100 * p;
        String result = " ";
        for (int i = 1; i <= k; i++)
            result += String.valueOf(sum / 100 + persent * i / 100) + ", ";
        return result;
    }

    /**
     * Определите среднее значение всех элементов последовательности, завершающейся числом 0. {3,5,1,5,2,3,5,0,7,5,4}
     */
    public double getMeanArrayToZero(int[] array) {
        double result = 0;
        double sum = 0;
        int i = 0;
        for (i = 0; array[i] != 0; i++)
            sum += array[i];
        result = sum / i;
        return result;
    }

    /**
     * Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
     */
    public String getElementsWithEvenIndex(int[] array) {
        String answer = " ";
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0)
                answer += String.valueOf(array[i]) + " ";
        }
        return answer;
    }

    /**
     * Вывести все четные элементы массива.
     */
    public String getEvenElements(int[] array) {
        String answer = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                answer += String.valueOf(array[i]) + " ";
            }
        }
        return answer;
    }

    /**
     * Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
     */
    public int findQualityOfPositiveElements(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                answer++;
        }
        return answer;
    }

    /**
     * Дан массив чисел. Выведите все элементы массива, которые больше предыдущего элемента . {1,5,2,4,3}
     */
    public String getNumberMoreThePrevious(int[] array) {
        String answer = " ";
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                answer += String.valueOf(array[i]) + " ";
            }
        }
        return answer;
    }

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
     * Если соседних элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько -
     * выведите первую пару. {-1,2,3,-1,-2}
     */
    public String findTwoAdjacentElementsWithTheSameSign(int[] array) {
        String answer = "";
        int i = 0;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > 0 & array[i + 1] > 0 || array[i] < 0 & array[i + 1] < 0) {
                answer = String.valueOf(array[i] + " " + String.valueOf(array[i + 1]));
                break;
            }
        }
        return answer;
    }

    /**
     * Дан массив. Создать новый массив и наполнить его данным, но в обратном порядке.
     */
    public String createNewArrayInverse(int[] array) {
        int[] newArray = new int[array.length];
        String answer = "";
        String answerOriginal = "";
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
            answer += String.valueOf(newArray[i]) + " ";
            answerOriginal += String.valueOf(array[i]) + " ";
        }
        return answerOriginal + "\n" + answer;
    }

    /**
     * Выведите значение наименьшего из всех положительных элементов в массиве. Известно, что в массиве
     * есть хотя бы один положительный элемент.
     */
    public int getMinPlusElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * Выведите значение наименьшего нечетного элемента списка, а если в списке
     * нет нечетных элементов - выведите число 0.
     */
    public int getMinOddElement(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 & array[i] != 0) {
                if (even == 0)
                    even = array[i];
                else if (array[i] < even)
                    even = array[i];
            }
        }
        return even;
    }

    /**
     * Дан список, упорядоченный по возрастанию элементов в нем. Определите, сколько в нем различных элементов.
     */
    public int getQuantityDifferentElements(int[] array) {
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                result++;
            }
        }
        return result;
    }

    /**
     * Переставьте соседние элементы массива (A[0] c A[1], A[2] c A[3] и т.д.).
     * Если элементов нечетное число, то последний элемент остается на своем месте.
     */
    public String swapNearbyElements(int[] array) {
        String answer = "";
        for (int i = 1; i < array.length; i += 2) {
            int a = array[i];
            array[i] = array[i - 1];
            array[i - 1] = a;
            answer += String.valueOf(array[i - 1]) + " " + array[i] + " ";
        }
        if (array.length % 2 != 0)
            answer += String.valueOf(array[array.length - 1]);
        return answer;
    }

    /**
     * Циклически сдвиньте элементы списка вправо (A[0] переходит на место A[1], A[1] на место A[2], ...,
     * последний элемент переходит на место A[0]).
     */
    public String getRightCyclicShift(int[] array) {
        int[] newArray = new int[array.length];
        String answer = "";
        for (int i = 1; i < array.length; i++) {
            newArray[i] = array[i - 1];
        }
        newArray[0] = array[array.length - 1];
        for (int i = 0; i < newArray.length; i++)
            answer += String.valueOf(newArray[i]) + " ";
        return answer;
    }

    /**
     * Дан массив чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
     * Считается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
     */
    public int countPairsOfEqualElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    result++;
            }
        }
        return result;
    }

    /**
     * Дан массив. Выведите те его элементы, которые встречаются в массиве только один раз.
     * Элементы нужно выводить в том порядке, в котором они встречаются в списке.
     */
    public String getUniqueElements(int[] array) {
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (i < array.length - 1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j])
                        count++;
                }
            }
            if (i > 0) {
                for (int j = i - 1; j > 0; j--) {
                    if (array[i] == array[j])
                        count++;
                }
            }
            if (count == 1)
                answer += String.valueOf(array[i]) + " ";
        }
        return answer;
    }
}
