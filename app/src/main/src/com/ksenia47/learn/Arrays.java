package com.ksenia47.learn;

public class Arrays {
    /**
     * Создать массив символов из строки. Размер массива должен автоматически рассчитываться.
     * Вывести первый и последний элементы массива.
     */
    public String getFirstAndLastSymbolsToArrayFromString(String text) {
        char[] symb = text.toCharArray();
        return "Первый символ: " + symb[0] + "\n" + "Последний символ: " + symb[symb.length - 1];
    }

    /**
     * Вывести одну цифру из середины целочисленного массива, если длинна массива не чётная,
     * иначе вывести 2 числа из середины.
     */
    public String getCentralNumber(int[] symb) {
        String answer = "";
        if (symb.length != 0 & symb.length % 2 == 0) {
            int middle = symb.length / 2;
            answer = String.valueOf(symb[middle - 1] + ", " + symb[middle]);
        } else if (symb.length != 0)
            answer = String.valueOf(symb[(symb.length - 1) / 2]);
        return answer;
    }

    /**
     * Найдите индексы первого вхождения максимального элемента двумерного массива.
     */
    public String getFirstEntryMaxElement(int[][] array) {
        String answer = "";
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    answer = String.valueOf("Позиция максимального элемента: " + i + " строка, " + j + " столбец.");
                }
            }
        }
        return answer;
    }

    /**
     * Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n элементов,
     * заполнив его символами "." (каждый элемент массива является строкой из одного символа).
     * Затем заполните символами "*" среднюю строку массива, средний столбец массива,
     * главную диагональ и побочную диагональ. В результате "*" в массиве должны образовывать изображение звездочки.
     * Выведите полученный массив на экран, разделяя элементы массива пробелами.
     */
    public String getArrayToStar(int n) {
        String[][] array = new String[n][n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - 1 - j || i == n / 2 || j == n / 2)
                    array[i][j] = "* ";
                else
                    array[i][j] = ". ";
                answer += array[i][j];
            }
            answer += "\n";
        }
        return answer;
    }

    /**
     * Дано число n, не превышающее 100. Создайте массив размером n×n и заполните его по следующему правилу.
     * На главной диагонали должны быть записаны числа 0. На двух диагоналях, прилегающих к главной,
     * числа 1. На следующих двух диагоналях числа 2, и т.д. Выведите полученный массив на экран,
     * разделяя элементы массива пробелами.
     */
    public String getArrayWithMainDiagonal(int n) {
        int array[][] = new int[n][n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    array[i][j] = 0;
                else
                    array[i][j] = Math.abs(i - j);
                answer += String.valueOf(array[i][j] + " ");
            }
            answer += "\n";
        }
        return answer;
    }

    /**
     * Дан двумерный массив и два числа: i и j. Поменяйте в массиве столбцы с номерами i и j.
     */
    public String swapColumnToArray(int i, int j) {
        String answer = "";
        int array[][] = {{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}};
        for (int a = 0; a < array.length; a++) {
            int c = array[a][j];
            array[a][j] = array[a][i];
            array[a][i] = c;
            for (int b = 0; b < array[a].length; b++)
                answer += String.valueOf(array[a][b] + " ");
            answer += "\n";
        }
        return answer;
    }

    /**
     * Дано число n, не превосходящее 10, и массив размером n × n. Проверьте, является ли этот массив
     * симметричным относительно главной диагонали. Выведите слово “YES”, если массив симметричный,
     * и слово “NO” в противном случае.
     */
    public String checkSymmetryAtArray(int[][] array) {
        String answer = "YES";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i != j && array[i][j] != array[j][i])
                    answer = "NO";
            }
        }
        return answer;
    }

    /**
     * В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В двумерном массиве хранится
     * информация о проданных билетах, число 1 означает, что билет на данное место уже продан,
     * число 0 означает, что место свободно. Поступил запрос на продажу k билетов на соседние места в одном ряду.
     * Определите, можно ли выполнить такой запрос.
     */
    public int findRowNumber(int[][] array, int k) {
        int rowNumber = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isFreePlaces = false;
            int freePlaces = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    isFreePlaces = true;
                    freePlaces++;
                } else {
                    isFreePlaces = false;
                    freePlaces = 0;
                }

                if (isFreePlaces & freePlaces >= k) {
                    rowNumber = i + 1;
                    break;
                }
            }
            if (rowNumber > 0)
                break;
        }
        return rowNumber;
    }

    /**
     * Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по часовой стрелке,
     * записав результат в новый массив размером m×n.
     */
    public String reverse(int n, int m, int[][] array) {
        int[][] newArray = new int[m][n];
        String answer = "";
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[array.length - 1 - j][i];
                answer += String.valueOf(newArray[i][j] + " ");
            }
            answer += "\n";
        }
        return answer;
    }

    /**
     * Преобразование массива в строку
     */
    public String arrayToString(int[][] array) {
        String arrayAsString = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int cel = array[i][j];
                String value = String.valueOf(cel + " ");
                if (cel < 10)
                    arrayAsString += " " + value;
                else
                    arrayAsString += value;
            }
            arrayAsString += "\n";
        }
        return arrayAsString;
    }

    /**
     * По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “змейкой”,
     * как показано в примере.
     */
    public String fillSnakeArray(int n, int m) {
        int[][] array = new int[n][m];
        String answer = "";
        int currentValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    currentValue++;
                    array[i][j] = currentValue;
                }
            } else if (i % 2 == 1) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    currentValue++;
                    array[i][j] = currentValue;
                }
            }
        }
        answer = arrayToString(array);
        return answer;
    }

    /**
     * Даны числа n и m. Заполните массив размером n × m в шахматном порядке: клетки одного цвета
     * заполнены нулями, а другого цвета - заполнены числами натурального ряда сверху вниз, слева направо.
     * В левом верхнем углу записано число 1.
     */
    public String fillArrayToChess(int n, int m) {
        int[][] array = new int[n][m];
        String answer = "";
        int chessOrder = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 | i % 2 == 0) {
                    if (j == 0 | j % 2 == 0) {
                        chessOrder++;
                        array[i][j] = chessOrder;
                    } else if (j % 2 == 1)
                        array[i][j] = 0;
                } else if (i % 2 == 1) {
                    if (j == 0 & j % 2 == 0)
                        array[i][j] = 0;
                    else if (j % 2 == 1) {
                        chessOrder++;
                        array[i][j] = chessOrder;
                    }
                }
            }
        }
        answer = arrayToString(array);
        return answer;
    }

    /**
     * По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m по спирали,
     * выходящей из левого верхнего угла и закрученной по часовой стрелке, как показано в примере.
     */
    public String fillArrayToSpiral(int n, int m) {
        int[][] array = new int[n][m];
        int i = 0;
        int k = 0;
        int spiral = 0;
        String answer;
        while (i < n * m) {
            k++;
            for (int j = k - 1; j < m - k + 1; j++) {
                spiral++;
                i++;
                if (spiral > n * m)
                    break;
                array[k - 1][j] = spiral;
            }
            for (int j = k; j < n - k + 1; j++) {
                spiral++;
                i++;
                if (spiral > n * m)
                    break;
                array[j][m - k] = spiral;
            }
            for (int j = m - k - 1; j >= k - 1; j--) {
                spiral++;
                i++;
                if (spiral > n * m)
                    break;
                array[n - k][j] = spiral;
            }
            for (int j = n - k - 1; j >= k; j--) {
                spiral++;
                i++;
                if (spiral > n * m)
                    break;
                array[j][k - 1] = spiral;
            }
        }
        answer = arrayToString(array);
        return answer;
    }

    /**
     * По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “диагоналями”.
     */
    public int[][] fillArrayDiagonals(int n, int m) {
        int[][] array = new int[n][m];
        int value = 0;
        int i;
        int j;
        for (int k = 0; k < m; k++) {
            i = 0;
            j = k;
            while (j >= 0 & i < array.length) {
                value++;
                array[i][j] = value;
                j--;
                i++;
            }
        }
        for (int k = 1; k < n; k++) {
            i = k;
            j = m - 1;
            while (i < n) {
                value++;
                array[i][j] = value;
                j--;
                i++;
            }
        }
        return array;
    }
}
