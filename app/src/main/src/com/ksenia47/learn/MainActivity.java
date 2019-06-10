package com.example.grinder.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.result_text);
        textView.setTextSize(48);


/*        String text = "Ксюша любит SUP";
        String secondText = "Обожает клеить неопрен";
        String allText = text + ". " + "Длина текста: " + text.length() + ".\n" +
                secondText + ". Длина текста: " + secondText.length() + ".";
        textView.setText(allText);
*/
/*        String text = "ТИХО СКАЗАЛ";
        String capitalized = text.toLowerCase() + "\n" + text;
        textView.setText(capitalized);
*/

/*        String text = "                        Неопрен бяка рвётся сам         ";
        String trim = text.trim();
        textView.setText(trim);
*/

/*        String text = "Неопрен бяка рвётся сам. \\n";
        String secondText = "Индекс слова \"бяка\": ";
        int index = text.indexOf("бяка");
        textView.setText(text + "\n" + secondText + index);
*/

 /*       String text = "бякаа Лето закончилось. бякаа";
       String name = text.substring(text.indexOf(" "), text.lastIndexOf(" "));
        textView.setText(name);
*/

 /*       String text = "Неопрен бяка рвётся сам";
        String replace = text.replace("бяка", "");
        textView.setText(text + "\n" + replace);
*/


 /*       String text = "Вчера было холодно, бяка. Потому мы остались дома, бяка. А так хотелось купаться, но вода уже бяка.";
        String replace = text.replace("бяка", "'вырезано цензурой'");
        textView.setText(replace);
*/

/*        String substr = "бякаkjkl;l";
        String text = "rdcrdrctfcrtdfc " + substr + " рвётся сам"; // "Неопрен бяка рвётся сам"
        int index = text.indexOf(substr);
        int lengh = substr.length();
        int all = index + lengh;
        String sub = text.substring(0, index);
        String textSub = text.substring(all);
        textView.setText(sub + textSub);
*/

  /*     String manSpeech = "sHello";
        String answer;
        boolean isSpeaking = manSpeech.length() != 0;

        if (manSpeech.toLowerCase().equals("hello")) {
            answer = "hello";
        } else {
            answer = "bye";
        }
        textView.setText(answer);

*/

 /*       Character[] characters = {'н','е','о','п','р','е','н'};


        String text = " неопрен бяка  ".trim();
        char letter = text.toCharArray()[0];
        char[] symbolArray = text.toCharArray();
        char lastSymbol = symbolArray [symbolArray.length -1];
        String answer = "";

        if (!Character.isUpperCase(letter))
            answer = String.valueOf(letter).toUpperCase() + text.substring(1);
        else
            answer = text;
        if (!String.valueOf(lastSymbol).equals( "."))
            answer += ".";
        textView.setText(answer);
*/
  /*    String text = " неопрен бяка  ".trim();
        char letter = text.toCharArray()[0];
        char[] symbolArray = text.toCharArray();
        char lastSymbol = symbolArray [symbolArray.length -1];
        String answer = text;

        if (!Character.isUpperCase(letter))
            answer = String.valueOf(letter).toUpperCase() + text.substring(1);
        if (!String.valueOf(lastSymbol).equals( "."))
            answer += ".";
        textView.setText(answer);
  */

 /*       Integer a = 9;
        String answer = "В переменной integer хранится ";
        if (a == 2)
             answer += "два";
        else if (a == 3)
            answer += "три";
        else if (a == 4)
            answer += "четыре";
        else
            answer += "фиг знает что там...";
        textView.setText(answer);
*/



/*
        String bucket = "Количество яблок в корзине: 7".trim();
        String number = bucket.substring(bucket.lastIndexOf(" ")).trim();
        int appleCount = Integer.parseInt(number);
        String answer = ". ";
        if (appleCount == 1)
            answer += "Яблоко одно";
        else if (appleCount < 3)
            answer += "Мало яблок";
        else  if (appleCount >= 3)
            answer += "Яблок хватит всем";
        textView.setText(bucket + answer);
*/

/*        String bucket = "Количество яблок в корзине: 6  ";
        Pattern pat = Pattern.compile("\\d+");
        Matcher matcher = pat.matcher(bucket);
        matcher.find();
        String number = bucket.substring(matcher.start(), matcher.end());
        int appleCount = Integer.parseInt(number);
        String answer = ". ";
        if (appleCount == 1)
            answer += "Яблоко одно";
        else if (appleCount < 3)
            answer += "Мало яблок";
        else  if (appleCount >= 3)
            answer += "Яблок хватит всем";
        textView.setText(bucket + answer);
*/



   /*     int a = 8;
        int b = 2;
        String answer = "";
        if (a > b)
            answer = String.valueOf(a);
        else if (a < b)
            answer = String.valueOf(b);
        else if (a == b)
            answer = "Числа равны";
        textView.setText(answer);
*/


  /*      String bucket = "В корзине есть морква".toLowerCase();
        Boolean isFirstFruit = Pattern.compile("яблоки").matcher(bucket).find();
        Boolean isSecondFruit = Pattern.compile("груши").matcher(bucket).find();
        Boolean isThirdFruit = Pattern.compile("апельсины").matcher(bucket).find();
        Boolean isFirstPart = Pattern.compile("специи").matcher(bucket).find();
        Boolean isSecondPart = Pattern.compile("овощи").matcher(bucket).find();
        Boolean isThirdPart = Pattern.compile("мясо").matcher(bucket).find();
        String answer = "";
        if (isFirstPart&isSecondPart&isThirdPart)
            answer = "Суповой набор.";
        if (isFirstFruit||isSecondFruit||isThirdFruit)
            answer = "Фрукты.";
        if ((isFirstFruit||isSecondFruit||isThirdFruit)&(isFirstPart||isSecondPart||isThirdPart))
            answer = "Был голоден, хватал все подряд.";
        if (!isFirstFruit||!isSecondFruit||!isThirdFruit||!isFirstPart||!isSecondPart||!isThirdPart)
            answer = "В корзине нет ничего, что нам нужно.";
        textView.setText(answer);
*/

   /*     String month = "май".toLowerCase().trim();
        int result;
        String answer = "";
        switch(month) {
            case "январь":
                result = 1;
                break;
            case "февраль":
                result = 2;
                break;
            case "март":
                result = 3;
                break;
            case "апрель":
                result = 4;
                break;
            case  "май":
                result = 5;
                break;
            case "июнь":
                result = 6;
                break;
            case  "июль":
                result = 7;
                break;
            case  "август":
                result = 8;
                break;
            case "сентябрь":
                result = 9;
                break;
            case "октябрь":
                result = 10;
                break;
            case  "ноябрь":
                result = 11;
                break;
            case "декабрь":
                result = 12;
                break;
            default:
                result = -1;
                break;
        }
        if (result>-1)
            answer = String.valueOf(result);
        else  if (result==-1)
            answer = "Ошибка";
        textView.setText(answer);
*/


  /*      int month = 7;
        int result;
        switch(month) {
            case 2:
                result = 28:
                break;
            case 4: case 6: case 9: case  11:
                result = 30;
                break;
            default:
                result = 31;
                break;
        }
        textView.setText(String.valueOf(result));
*/
 /*       int[] array = {3,4,566,3};
        int[] array2 = new int[5];

        array2[0] = 22;
        array2[1] = 4;

        int firstValue = array[2];

        textView.setText(String.valueOf(firstValue));
*/

  /*      String lang = "fr";
        String result = "";
        switch (lang) {
            case "ru":
                result = "Понедельник, вторник, среда, четверг, пятница, суббота, воскресенье";
                break;
            case "en":
                result = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
                break;
            case "fr":
                result = "Lundi, Mardi, Mercredi, Jeudi, Vendredi, Samedi, Dimanche";
                break;
        }
        textView.setText(result);
*/

  /*      String text = "Вася любит корюшку";
        char [] symb = text.toCharArray();
        textView.setText("Первый символ: " + symb [0] + "\n" + "Последний символ: " + symb [symb.length - 1]);
*/

/*
        int [] symb = {4,7,9,4,3};
        String answer = "";
        if (symb.length != 0 & symb.length % 2 == 0){
            int middle = symb.length/2;
            answer = String.valueOf(symb[middle-1] + ", " + symb[middle]);
        }
        else if (symb.length != 0)
            answer = String.valueOf(symb[(symb.length-1)/2]);
        textView.setText(answer);
*/

   /*     int [] symb = {4,7,9,4,3,7,9,4,3,4};
        String answer = "";
        for (int i = 0; i<symb.length; i+=2){
            answer += String.valueOf(symb[i] + " ");
        }

        int i = 0;
        answer = "";
        while (i < 4){
            answer+= String.valueOf(i + ", ");
            i++;
        }

        int j = 4;
        answer = "";
        do{
            answer+= String.valueOf(j + ", ");
            j--;
        }while (j > 6);


        textView.setText(answer);
*/

/*        boolean [] array = {true,false,false,true,false,true,false};
        String answer = "";
        for (int i = array.length-1; i>=0; i--) {
            answer += String.valueOf(array[i] + " ");
        }
        textView.setText(answer);
*/

 /*       char [] symb = {'1','9','d','0','a',' ','0','g'};
        String answer = "";
        for (int i = 0; !String.valueOf(symb[i]).equals(" "); i++) {
            answer += String.valueOf(symb[i] + " ");
        }
            textView.setText(answer);
*/


/*        char [] symb = {'1','9','d','0','a',' ','0','g'};
        String answer = "";
        int i = 0;
        while (!String.valueOf(symb[i]).equals(" ")) {
            answer += String.valueOf(symb[i] + " ");
            i++;
        }
        textView.setText(answer);
*/

/*        char [] symb = {'1','9','d','0','a',' ','0','g'};
        String answer = "";
        int i = 0;
        do {
            answer += String.valueOf(symb[i] + " ");
            i++;
        } while (!String.valueOf(symb[i]).equals(" "));
        textView.setText(answer);
*/

 /*       int y = 1;
        int n = 4;
        for (int i = 1; i <= n; i++){
            y *= i;
        }
        textView.setText(String.valueOf(y));
*/

/*        int y = 1;
        int n = 5;
        int i = 1;
        while (i <= n) {
            y *= i;
            i++;
        }
        textView.setText(String.valueOf(y));
*/

 /*       int y = 1;
        int n = 4;
        int i = 1;
        do {
            y *= i;
            i++;
        } while (i <= n);
        textView.setText(String.valueOf(y));
*/

/*
        int x = 2;
        int n = 11;
        textView.setText(String.valueOf(Math.pow(x, n)));
*/

/*        int x = 2;
        int n = 12;
        int result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        textView.setText(String.valueOf(result));
  */
 /*       int x = 2;
        int n = 13;
        int result = x;
        int i = 1;
        while (i < n) {
            result *= x;
            i++;
        }
        textView.setText(String.valueOf(result));
*/
/*
        int x = 2;
        int n = 14;
        int result = x;
        int i = 1;
        do {
            result *= x;
            i++;
        } while (i < n);
        textView.setText(String.valueOf(result));
*/

        /*int N = 52;
        int x = 2;
        int result = 0;
        String answer = "";
        for (int i=0; result<N; i++) {
            int b = (int)Math.pow(x, i);
            if (b > N)
                break;
            result = (int)Math.pow(x, i);
            answer += result + " ";
        }
        textView.setText(answer);
*/

/*
        int N = 65;
        int x = 2;
        int result = 0;
        int i = 0;
        String answer = "";
        while (result<N) {
            int b = (int)Math.pow (x, i);
            if (b > N) break;
            result = (int)Math.pow(x, i);
            answer += result + " ";
            i++;
        }
        textView.setText(answer);
*/

/*
        Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
*/


/*
        String answer = "";
        int N = 9;
        int x = 2;
        int result = 1;
        for (int i = 0; result < N; i++) {
            result *= x;
        }
        if (result == N)
            answer = "YES";
        else if (result != N)
            answer = "NO";
        textView.setText(answer);
*/

/*
        String answer = "";
        int n = 33;
        int x = 2;
        int result = 1;
        int i = 0;
        while (result < n) {
            result *= x;
            i++;
        }
        if (result == n)
            answer = "YES";
        else if (result != n)
            answer = "NO";
        textView.setText(answer);
*/

/*
        int N = 33;
        String answer = "";
        if ((N > 0) && ((N & (N - 1)) == 0))
            answer = "YES";
        else
            answer = "NO";
        textView.setText(answer);
*/


        /* Определите сумму всех элементов последовательности, завершающейся числом 0. Массив {3,2,3,5,0,7,5,4}*/

/*
        int array [] = {3,2,3,5,0,7,5,4};
        int sum = 0;
        for (int i = 0; array[i] != 0; i++) {
            sum += array [i];
        }
        textView.setText(String.valueOf(sum));
*/


/*
        Последовательность состоит из натуральных чисел и завершается числом 0. Определите, какое количество
        элементов этой последовательности, равны ее наибольшему элементу. {3,5,1,5,2,3,5,0,7,5,4}
*/

/*
        int array[] = {3, 3, 5, 1, 5, 2, 3, 5, 0, 7, 5, 4};
        int max = 0;
        int amount = 0;
        for (int i = 0; array[i] > 0; i++) {
            int test = array [i];
            if (array[max] < array[i]) {
                max = i;
                amount = 1;
            } else  if (array [max] == array [i])
                amount++;
        }
        textView.setText(String.valueOf(amount));
*/

/*
        int array[] = {3, 3, 5, 1, 5, 2, 3, 5, 5, 0, 7, 5, 4};
        int max = 0;
        int amount = 0;
        int i = 0;
        while (array [i] > 0) {
            if (array[max] < array[i]) {
                max = i;
                amount = 1;
            } else  if (array [max] == array [i])
                amount++;
            i++;
        }
        textView.setText(String.valueOf(amount));
*/

/*
        По данному числу N определите N-е число Фибоначчи
*/


/*
        int n = 8;
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
        textView.setText(String.valueOf(fib));
*/

/*
        Дано натуральное число A. Определите, каким по счету числом Фибоначчи оно является, то есть выведите такое
        число N, что F(N) = A. Если А не является числом Фибоначчи, выведите число -1
*/


/*
        int a = 22;
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
        textView.setText(answer);
*/

/*
        Процентная ставка по вкладу составляет P процентов годовых, которые прибавляются к сумме
        вклада через год. Вклад составляет X рублей Y копеек. Определите размер вклада через K лет.
*/

/*
        double p = 12;
        int x = 1000;
        int y = 50;
        double k = 3;
        double sum = x*100 + y;
        double persent = sum/100*p;
        String result = " ";
        for (int i = 1; i<=k; i++)
            result += String.valueOf(sum/100 + persent*i/100) + ", ";
        textView.setText(String.valueOf(result));
*/

/*
        Определите среднее значение всех элементов последовательности, завершающейся числом 0. {3,5,1,5,2,3,5,0,7,5,4}
*/

/*
        int [] array = {2,4,0,7,5,4};
        double result = 0;
        double sum = 0;
        int i = 0;
        for (i = 0; array [i] != 0; i++)
            sum += array [i];
        result = sum/i;

        textView.setText(String.valueOf(result));
*/


/*
        int [] array = {2,4,0,7,5,4};
        double result = 0;
        double sum = 0;
        int i = 0;
        while (array [i] != 0) {
            sum += array [i];
            i++;
        }
        result = sum/i;
        textView.setText(String.valueOf(result));
*/


/*
        Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
*/

 /*       int [] array = {3,5,1,5,2,3,5,0,7,5,4};
        String answer = " ";
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0)
                answer += String.valueOf(array[i]) + " ";
        }
        textView.setText(answer);
      */
/*
        Вывести все четные элементы массива.
*/

 /*       int [] array = {3,5,1,5,2,3,5,0,7,5,4};
        String answer = " ";
        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 == 0) {
                answer += String.valueOf(array [i]) + " ";
            }
        }
        textView.setText(answer);
*/
/*
        Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
*/

 /*       int [] array = {1,-2,3,-4,5};
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] > 0)
                answer ++;
        }
        textView.setText(String.valueOf(answer));
*/

/*
        int [] array = {1,-2,3,-4,5};
        int answer = 0;
        int i = 0;
        while (i < array.length) {
            if (array [i] > 0)
                answer++;
            i++;
        }
        textView.setText(String.valueOf(answer));
*/


/*
        Дан массив чисел. Выведите все элементы массива, которые больше предыдущего элемента . {1,5,2,4,3}
*/
 /*       int [] array = {1,5,2,4,3};
        String answer = " ";
        for (int i = 1; i < array.length; i++) {
            if (array [i] > array [i-1]) {
                answer += String.valueOf(array [i]) + " ";
            }
        }
        textView.setText(answer);
*/
        /*Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
        Если соседних элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько -
                выведите первую пару. {-1,2,3,-1,-2}*/

/*
        int [] array = {-1,2,3,-1,-2};
        String answer = "";
        int i = 0;
        for (i = 0; i < array.length-1; i++) {
            if (array [i] > 0 & array [i+1] > 0 || array [i] < 0 & array [i+1] < 0) {
                answer = String.valueOf(array [i] + " " + String.valueOf(array[i+1]));
                break;
            }
        }
        textView.setText(answer);
*/

/*
        Дан массив. Создать новый массив и наполнить его данным, но в обратном порядке.
*/
/*

        int [] array = {-1,2,3,-1,-2};
        int [] newArray = new int [array.length];
        String answer = "";
        String answerOriginal = "";
        for (int i = 0; i < array.length; i++) {
            newArray [i] = array [array.length -1 -i];
            answer += String.valueOf(newArray [i]) + " ";
            answerOriginal += String.valueOf(array [i]) + " ";
        }
        textView.setText(answerOriginal + "\n" + answer);
*/

/*
        Выведите значение наименьшего из всех положительных элементов в массиве. Известно, что в массиве
        есть хотя бы один положительный элемент. {5,-4,3,-2,1}
*/

/*
        int [] array = {2,-4,-2,5,1};
        int min = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > 0 && array [i] < min)
                min = array [i];
        }
        textView.setText(String.valueOf(min));
*/

        /*Выведите значение наименьшего нечетного элемента списка, а если в списке
        нет нечетных элементов - выведите число 0 {0,1,2,3,4} -> 1 {2,4,6,8,10} -> 0
        */

/*
        int [] array = {2,4,6,2};
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 == 1 & array [i] != 0) {
                if (even == 0)
                    even = array[i];
                else if (array[i] < even)
                    even = array[i];
            }
        }
        textView.setText(String.valueOf(even));
*/


  /*      Дан список, упорядоченный по возрастанию элементов в нем. Определите, сколько в нем различных элементов.
        {1,2,2,3,3,3} -> 3
*/
/*
        int [] array = {1,2,2,3,3,3};
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (array [i] != array [i-1]) {
                result ++;
            }
        }
        textView.setText(String.valueOf(result));
*/

 /*       Переставьте соседние элементы массива (A[0] c A[1], A[2] c A[3] и т.д.).
        Если элементов нечетное число, то последний элемент остается на своем месте.  {1,-2,3,-4,5},  {1,-2,3,-4,5,7}
*/

/*
        int [] array = {1,-2,3,-4,5,7,9};
        String answer = "";
        for (int i = 1; i < array.length; i+=2) {
            int a = array[i];
            array[i] = array[i - 1];
            array[i - 1] = a;
            answer += String.valueOf(array[i - 1]) + " " + array[i] + " ";
        }
        if (array.length % 2 != 0)
            answer += String.valueOf(array[array.length - 1]);
        textView.setText(answer);
*/

/*
        Циклически сдвиньте элементы списка вправо (A[0] переходит на место A[1], A[1] на место A[2], ...,
        последний элемент переходит на место A[0]). {1,-2,3,-4,5}
*/

/*
        int [] array = {1,-2,3,-4,5};
        int [] newArray = new int [array.length];
        String answer = "";
        for (int i = 1; i < array.length; i++) {
            newArray [i] = array [i-1];
        }
        newArray [0] = array [array.length-1];
        for (int i = 0; i < newArray.length; i++)
            answer += String.valueOf(newArray [i]) + " ";
        textView.setText(answer);
*/





 /*       Дан массив чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
        Считается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
        {1,2,3,2,3} -> 2
*/

/*
        int [] array = {1,2,3,2,3};
        int result = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array [i] == array [j])
                    result++;
            }
        }
        textView.setText(String.valueOf(result));
*/

 /*       Дан массив. Выведите те его элементы, которые встречаются в массиве только один раз.
        Элементы нужно выводить в том порядке, в котором они встречаются в списке. {4,3,5,2,5,1,3,5} -> 4 2 1 
*/


 /*       int [] array = {9,4,3,5,2,5,1,3,5,0,7};
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (i < array.length-1) {
                for (int j = i+1; j < array.length; j++) {
                    if (array [i] == array [j])
                        count++;
                }
            }
            if (i > 0) {
                for (int j = i-1; j > 0; j--) {
                    if (array [i] == array [j])
                        count++;
                }
            }
            if (count == 1)
                answer += String.valueOf(array [i]) + " ";
        }
        textView.setText(answer);
*/


/*
        Найдите индексы первого вхождения максимального элемента двумерного массива.
*/

/*
        int [][] array = {{5,4,3,5},
                          {2,9,1,3},
                          {5,0,9,10}};
        String answer = "";
        int max = array [0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    answer = String.valueOf("Позиция максимального элемента: " + i + " строка, " + j + " столбец.");
                }
            }
        }
        textView.setText(answer);
*/

/*
        Дано нечетное число n, не превосходящее 15. Создайте двумерный массив из n×n элементов,
        заполнив его символами "." (каждый элемент массива является строкой из одного символа).
        Затем заполните символами "*" среднюю строку массива, средний столбец массива,
        главную диагональ и побочную диагональ. В результате "*" в массиве должны образовывать изображение звездочки.
        Выведите полученный массив на экран, разделяя элементы массива пробелами.  (Пример для 5)
*/

/*
        int n = 5;
        String [][] array = new String[n][n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - 1 - j || i == n/2 || j == n/2)
                    array [i][j] = "* ";
                else
                    array [i][j] = ". ";
                answer += array [i][j];
            }
            answer += "\n";
        }
        textView.setText(answer);
*/

/*
        Дано число n, не превышающее 100. Создайте массив размером n×n и заполните его по следующему правилу.
                На главной диагонали должны быть записаны числа 0. На двух диагоналях, прилегающих к главной,
        числа 1. На следующих двух диагоналях числа 2, и т.д. Выведите полученный массив на экран,
                разделяя элементы массива пробелами. (Пример для 5)
*/

 /*       int n = 9;
        int array [][] = new int [n][n];
        String answer = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    array [i][j] = 0;
                else
                    array [i][j] = Math.abs (i-j);
                answer += String.valueOf(array [i][j] + " ");
            }
            answer += "\n";
        }
        textView.setText(answer);
*/
        /*       Дан двумерный массив и два числа: i и j. Поменяйте в массиве столбцы с номерами i и j.
         */

/*
        int i = 1;
        int j = 3;
        String answer = "";
        int array [][] = {{11,12,13,14},
                          {21,22,23,24},
                          {31,32,33,34}};
        for (int a = 0; a < array.length; a++) {
            int c = array[a][j];
            array[a][j] = array[a][i];
            array[a][i] = c;
            for (int b = 0; b < array[a].length; b++)
                answer += String.valueOf(array[a][b] + " ");
            answer += "\n";
        }
        textView.setText(answer);
*/

/*
            Дано число n, не превосходящее 10, и массив размером n × n. Проверьте, является ли этот массив
            симметричным относительно главной диагонали. Выведите слово “YES”, если массив симметричный,
            и слово “NO” в противном случае.
    */
/*        int n = 3;
        int array [][] = {{0,1,2},
                {1,2,7},
                {2,3,4}};
        String result = myFunction(array);
        textView.setText(result);
        */

/*
        В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В двумерном массиве хранится
        информация о проданных билетах, число 1 означает, что билет на данное место уже продан,
        число 0 означает, что место свободно. Поступил запрос на продажу k билетов на соседние места в одном ряду.
        Определите, можно ли выполнить такой запрос.
*/

/*
        int n = 7;
        int m = 10;
        int k = 1;
        int answer = 0;
        int [][] array = {{1,1,1,1,1,1,1,1,0,1},
                          {1,1,1,1,1,1,1,1,0,0},
                          {1,1,1,1,1,1,0,0,1,1},
                          {1,1,1,1,1,1,1,1,1,1},
                          {1,1,1,1,0,0,0,1,1,1},
                          {1,1,1,1,1,1,1,1,1,1},
                          {1,1,1,1,1,1,1,1,1,1}};
        for (int i = 0; i < n; i++) {
            int result = 1;
            for (int j = 0; j < m-1; j++) {
                if ((k != 1 && array [i][j] == 0) && array [i][j] == array [i][j+1]) {
                    result ++;
                }
                else if ((k != 1 && result < k) && array [i][j+1] == 1)
                    result = 1;
            }
            if (k != 1 && result >= k) {
                answer = i + 1;
                break;
            }
            int resultOne = 0;
            for (int j = 0; j < m; j++) {
                if (k == 1 && array[i][j] == 0)
                    resultOne++;
            }
            if (resultOne >= k) {
                answer = i + 1;
                break;
            }
        }
        textView.setText(String.valueOf(answer));
*/

 /*       int n = 7;
        int m = 10;
        int k = 4;
        int rowNumber = 0;
        int [][] array = {{1,1,1,1,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,1,0,0},
                {1,1,1,1,1,1,0,0,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,0,0,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1}};
        for (int i = 0; i < n; i++) {
            boolean isFreePlaces = false;
            int freePlaces = 0;
            for (int j = 0; j < m; j++) {
                if (array [i][j] == 0) {
                    isFreePlaces = true;
                    freePlaces++;
                }
                else {
                    isFreePlaces = false;
                    freePlaces = 0;
                }

                if (isFreePlaces & freePlaces >= k) {
                    rowNumber = i+1;
                    break;
                }
            }
            if (rowNumber > 0)
                break;
        }
        textView.setText(String.valueOf(rowNumber));
*/

 /*       int k = 2;
        int [][] array = {{1,1,1,1,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,1,0,0},
                {1,1,1,1,1,1,0,0,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,0,0,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1}};
        int rowNumber = findRowNumber(array, k);
        textView.setText(String.valueOf(rowNumber));
*/

 /*
        Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по часовой стрелке,
        записав результат в новый массив размером m×n.
*/

/*
        int n = 3;
        int m = 4;
        int [][] array = {{11,12,13,14},
                         {21,22,23,24},
                         {31,32,33,34}};
        int [][] newArray = new int [m][n];
        String answer = "";
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray [i].length; j++) {
                newArray [i][j] = array [array.length-1-j][i];
                answer += String.valueOf(newArray [i][j] + " ");
            }
            answer += "\n";
        }
        textView.setText(answer);
*/

/*
        int n = 3;
        int m = 4;
        int [][] array = {{11,12,13,14},
                {21,22,23,24},
                {31,32,33,34}};
        String answer = reverse(n, m, array);
        textView.setText(answer);
*/

/*
        По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “змейкой”,
        как показано в примере.
*/

/*
        int n = 3;
        int m = 5;
        String answer = fillSnakeArray(n, m);
        textView.setText(answer);
*/

/*
        Даны числа n и m. Заполните массив размером n × m в шахматном порядке: клетки одного цвета
        заполнены нулями, а другого цвета - заполнены числами натурального ряда сверху вниз, слева направо.
                В левом верхнем углу записано число 1.
*/

/*
        int n = 3;
        int m = 5;
        String answer = "";
        int chessOrder = 0;
        int [][] array = new int [n][m];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 | i%2 == 0) {
                for (int j = 0; j < array [i].length; j++) {
                    if (j == 0 | j%2 == 0) {
                        chessOrder ++;
                        array [i][j] = chessOrder;
                    }
                    else  if (j%2 == 1)
                        array [i][j] = 0;
                }
            }
            if (i%2 == 1) {
                for (int j = 0; j < array [i].length; j++) {
                   if (j == 0 & j%2 == 0)
                       array [i][j] = 0;
                   else  if (j%2 == 1) {
                       chessOrder ++;
                       array [i][j] = chessOrder;
                   }
                }
            }
        }
        answer = arrayToString(array);
        textView.setText(answer);
*/
/*
        int n = 3;
        int m = 5;
        String answer = arrayToChess(n, m);
        textView.setText(answer);
*/

/*       По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “диагоналями”.
   */

/*
        int n = 3;
        int m = 7;
        String answer = arrayToString(fillArrayDiagonals (n, m));
        textView.setText(answer);
*/


/*
        По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m по спирали,
                выходящей из левого верхнего угла и закрученной по часовой стрелке.
*/
/*
        int n = 3;
        int m = 3;
        String answer = arrayToSpiral(n, m);
        textView.setText(answer);
*/

/*
        Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите функцию min4(a, b, c, d),
        вычисляющую минимум 4 чисел с помощью функции min. Считайте четыре целых числа и выведите их минимум.
*/
 /*       int answer = min4(3, 8, 9, 4);
        textView.setText(String.valueOf(answer));
*/
/*
        Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию distance(x1, y1, x2, y2),
        вычисляющую расстояние между точкой (x1. y1) и (x2, y2). Считайте четыре действительных числа
        и выведите результат работы этой функции.
*/
 /*       double answer = distance(2, 6, 4, 7);
        textView.setText(String.valueOf(answer));
*/
/*        Дано действительное положительное число a и целоe число n. Вычислите а в степени n.*/
/*
        int involute = power(2,3);
        textView.setText(String.valueOf(involute));
*/

 /*       Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от 1.
        Решение оформите в виде функции MinDivisor(n). Количество операций в программе должно быть
        пропорционально корню из n.
        Указание. Если у числа n нет делителя, меньшего n , то число n — простое и ответом будет само число n.
*/
 /*       double divisor = minDivisor1(7);
        textView.setText(String.valueOf(divisor));
*/
/*
        Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
                если число простое и NO, если число составное.
        Решение оформите в виде функции IsPrime(n), которая возвращает True для простых чисел
        и False для составных чисел. Количество операций в программе должно быть пропорционально корню из n.
*/
 /*       boolean result = isPrime1(2);
        String answer = "";
        if (result == true)
            answer = "Yes";
        if (result == false)
            answer = "No";
        textView.setText(answer);
*/
/*        Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех этих чисел, не используя цикл.*/
 /*       int [] array = {1,3,5,6,0,9};
        int sum = sumNumberArray(array, 0);
        textView.setText(String.valueOf(sum));
*/
/*        Напишите функцию fib(n), которая по данному целому положительному n возвращает n-e число Фибоначчи.*/
/*
        int numberN = fib(9);
        textView.setText(String.valueOf(numberN));
*/

/*        Дано натуральное число n. Выведите все числа от 1 до n.*/
 /*       String answer = consistence(6);
        textView.setText(answer);
*/
/*
        Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
                в порядке возрастания, если A < B, или в порядке убывания в противном случае.
*/
/*
        String answer = fromAToB(2, 6);
        textView.setText(answer);
*/

/*
        Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
        или слово NO в противном случае.
*/
/*
        String answer = isQuotient(12);
        textView.setText(answer);
*/

 /*       Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
        Выведите все нечетные положительные числа из этой последовательности, сохраняя их порядок.
*/
 /*       int [] array = {1,-2,-5,6,7,-3,0,9};
        String odd = takeOddNumber(array, 0);
        textView.setText(odd);
*/

 /*       Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от 1.
        Решение оформите в виде функции MinDivisor(n). Количество операций в программе должно быть
        пропорционально корню из n.
        Указание. Если у числа n нет делителя, меньшего n , то число n — простое и ответом будет само число n.
                */
/*
        int divisor = minDivisor(7);
        textView.setText(String.valueOf(divisor));
*/

/*
        Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
                если число простое и NO, если число составное.
        Решение оформите в виде функции IsPrime(n), которая возвращает True для простых чисел
        и False для составных чисел. Количество операций в программе должно быть пропорционально корню из n.
*/
  /*      boolean result = isPrime(9);
        String answer;
        if (result)
            answer = "Yes";
        else
            answer = "No";
        textView.setText(answer);
*/
        /*  Найти наибольший общий делитель.*/
/*
        int answer = getMaxOverallDivisor(18,12);
        textView.setText(String.valueOf(answer));
*/

        /*Дано слово из строчных латинских букв. Проверить, является ли оно палиндромом.*/
    /*    boolean answer = isWordPalindrome("aknnka");
        textView.setText(String.valueOf(answer));
*/
/*
        Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их
        пробелами или новыми строками.
*/
/*
        String answer = getNumeralFromNumber(508);
        textView.setText(answer);
*/

 /*       Дано натуральное число N. Вычислите сумму его цифр.*/
 /*       int answer = getSumNumeral(1841);
        textView.setText(String.valueOf(answer));
*/
    }

   /* Дано натуральное число N. Вычислите сумму его цифр.*/
    int getSumNumeral (int n) {
        if (n < 10)
            return n;
        else
            return n%10 + getSumNumeral(n/10);
    }

/*    Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их
    пробелами или новыми строками.
 */
    String getNumeralFromNumber (int n) {
        if (n < 10)
            return String.valueOf(n);
        else
            return n%10 + " " + getNumeralFromNumber(n/10);
    }


    /*Дано слово из строчных латинских букв. Проверить, является ли оно палиндромом.*/
    boolean isWordPalindrome (String word) {
        if (word.length() == 1)
            return true;
        else {
            if (word.substring(0,1).equals(word.substring(word.length()-1, word.length()))) {
                return word.length() == 2 || isWordPalindrome(word.substring(1, word.length()-1));
            }
            else
                return false;
        }
    }

  /*  Найти наибольший общий делитель.*/
    int getMaxOverallDivisor (int a, int b) {
        if (a == 0 | b == 0)
            return a + b;
        if (a > b) {
            if (a%b == 0)
                return b;
            else
                return getMaxOverallDivisor(b, a%b);
        }
        else {
            if (b%a == 0)
                return a;
            else
                return getMaxOverallDivisor(a, b%a);
        }
    }
    /* Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
   если число простое и NO, если число составное.
   Решение оформите в виде функции IsPrime(n), которая возвращает True для простых чисел
   и False для составных чисел. Количество операций в программе должно быть пропорционально корню из n.
*/
    boolean isPrime (int n) {
        return  isPrime (n, 2);
    }

    boolean isPrime (int n, int divisor) {
        if (n == divisor)
            return true;
        else if (n%divisor == 0)
            return false;
        else
            return isPrime(n, ++divisor);
    }

    /*       Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от 1.
        Решение оформите в виде функции MinDivisor(n). Количество операций в программе должно быть
        пропорционально корню из n.
        Указание. Если у числа n нет делителя, меньшего n , то число n — простое и ответом будет само число n.
*/
    int minDivisor (int n) {
        return minDivisor(n, 2);
    }

    int minDivisor (int n, int divisor) {
        if (n == divisor)
            return n;
        else if (n%divisor == 0)
            return divisor;
        else
            return minDivisor(n, ++divisor);
    }
/*
    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    Выведите все нечетные положительные числа из этой последовательности, сохраняя их порядок.
*/
    String takeOddNumber (int [] array, int position) {
        if (position < array.length-1 & array [position] != 0 & array [position]%2 == 1 & array [position] > 0)
            return array [position] + " " + takeOddNumber(array, ++position);
        else if (position == array.length-1) {
            if (array [position]%2 == 1 & array [position] > 0)
                return String.valueOf(array [position]);
            else
                return "";
        }
        else if (array [position] == 0)
            return "";
        else
            return " " + takeOddNumber(array, ++position);
    }

    /*
    Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
    или слово NO в противном случае.
*/
    String isQuotient (int n) {
        if (n < 1)
            return "No";
        else if (n == 1)
            return "Yes";
        else if (n%2 == 0)
            return isQuotient(n/2);
        else
            return "No";
    }


    /*
    Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
    в порядке возрастания, если A < B, или в порядке убывания в противном случае.
*/
    String fromAToB (int a, int b) {
        if (a == b)
            return String.valueOf(a);
        else if (a > b)
            return a + " " + fromAToB(a-1, b);
        else
            return a + " " + fromAToB(a+1, b);
    }

            /*    Дано натуральное число n. Выведите все числа от 1 до n.*/
    String consistence (int n) {
        if (n == 1)
            return "1";
        else if (n == 0)
            return "0";
        else
            return consistence(n-1) + " " + n;
    }

    /*    Напишите функцию fib(n), которая по данному целому положительному n возвращает n-e число Фибоначчи.*/
    int fib (int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

/*
    Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех этих чисел, не используя цикл.
*/
    int sumNumberArray (int [] array, int position) {
        if (position < array.length-1 & array [position] != 0)
            return array[position] + sumNumberArray(array, ++position);
        else
            return array [position];
    }

   /* Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
    если число простое и NO, если число составное.
    Решение оформите в виде функции IsPrime(n), которая возвращает True для простых чисел
    и False для составных чисел. Количество операций в программе должно быть пропорционально корню из n.
*/
    boolean isPrime1 (int n) {
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n != i & n%i == 0)
                return false;
        }
        return true;
    }


    /*       Дано натуральное число n > 1. Выведите его наименьший делитель, отличный от 1.
        Решение оформите в виде функции MinDivisor(n). Количество операций в программе должно быть
        пропорционально корню из n.
        Указание. Если у числа n нет делителя, меньшего n , то число n — простое и ответом будет само число n.
*/
    double minDivisor1 (int n) {
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0)
                return i;
        }
        return n;
    }

    /*        Дано действительное положительное число a и целоe число n. Вычислите а в степени n.*/
    int power (int a, int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return a;
        else
            return a * power(a, n-1);
    }

    /*
            Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию distance(x1, y1, x2, y2),
            вычисляющую расстояние между точкой (x1. y1) и (x2, y2). Считайте четыре действительных числа
            и выведите результат работы этой функции.
    */
    double distance (int x1, int x2, int y1, int y2) {
        return Math.sqrt(((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1)));
    }


/*
    Напишите функцию min(a, b), вычисляющую минимум двух чисел. Затем напишите функцию min4(a, b, c, d),
    вычисляющую минимум 4 чисел с помощью функции min. Считайте четыре целых числа и выведите их минимум.
*/
    int min (int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }

    int min4 (int a, int b, int c, int d) {
        if (min (a, b) <= min (c, d))
            return min(a, b);
        else
            return min(c, d);
    }


    /*
            Дано число n, не превосходящее 10, и массив размером n × n. Проверьте, является ли этот массив
            симметричным относительно главной диагонали. Выведите слово “YES”, если массив симметричный,
            и слово “NO” в противном случае.
    */
    String myFunction(int[][] array) {
        String answer = "YES";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i != j && array[i][j] != array[j][i])
                    answer = "NO";
            }
        }
        return answer;
    }

    /*
        В кинотеатре n рядов по m мест в каждом (n и m не превосходят 20). В двумерном массиве хранится
        информация о проданных билетах, число 1 означает, что билет на данное место уже продан,
        число 0 означает, что место свободно. Поступил запрос на продажу k билетов на соседние места в одном ряду.
        Определите, можно ли выполнить такой запрос.
*/
    int findRowNumber(int[][] array, int k) {
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


    /*
        Дан прямоугольный массив размером n×m. Поверните его на 90 градусов по часовой стрелке,
        записав результат в новый массив размером m×n.
*/

    String reverse(int n, int m, int[][] array) {
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

    /*   Преобразование массива в строку*/

    String arrayToString(int[][] array) {
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

/*
        По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “змейкой”,
        как показано в примере.
*/

    String fillSnakeArray(int n, int m) {
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

/*
        Даны числа n и m. Заполните массив размером n × m в шахматном порядке: клетки одного цвета
        заполнены нулями, а другого цвета - заполнены числами натурального ряда сверху вниз, слева направо.
                В левом верхнем углу записано число 1.
*/
    String arrayToChess(int n, int m) {
        int[][] array = new int[n][m];
        String answer = "";
        int chessOrder = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 | i % 2 == 0) {
                    if (j == 0 | j % 2 == 0) {
                        chessOrder++;
                        array[i][j] = chessOrder;
                    }
                    else if (j % 2 == 1)
                        array[i][j] = 0;
                }
                else if (i % 2 == 1) {
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


/*
    По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m по спирали, выходящей из левого верхнего угла и закрученной по часовой стрелке, как показано в примере.
*/
    String arrayToSpiral (int n, int m) {
        int [][] array = new int [n][m];
        int i = 0;
        int k = 0;
        int spiral = 0;
        String answer;
        while (i < n*m) {
            k++;
            for (int j = k - 1; j < m - k + 1; j++) {
                spiral++;
                i++;
                if (spiral > n*m)
                    break;
                array[k - 1][j] = spiral;
            }
            for (int j = k; j < n - k + 1; j++) {
                spiral++;
                i++;
                if (spiral > n*m)
                    break;
                array[j][m - k] = spiral;
            }
            for (int j = m - k - 1; j >= k - 1; j--) {
                spiral++;
                i++;
                if (spiral > n*m)
                    break;
                array[n - k][j] = spiral;
            }
            for (int j = n - k - 1; j >= k; j--) {
                spiral++;
                i++;
                if (spiral > n*m)
                    break;
                array[j][k - 1] = spiral;
            }
        }
        answer = arrayToString(array);
        return answer;
    }

    /*       По данным числам n и m заполните двумерный массив размером n×m числами от 1 до n×m “диагоналями”.
     */
    int[][] fillArrayDiagonals(int n, int m) {
        int [][] array = new int [n][m];
        int value = 0;
        int i;
        int j;
        for (int k = 0; k < m; k++) {
            i = 0;
            j = k;
            while (j >= 0 & i < array.length) {
                value++;
                array [i][j] = value;
                j--;
                i++;
            }
        }
        for (int k = 1; k < n; k++) {
            i = k;
            j = m-1;
            while (i < n) {
                value++;
                array [i][j] = value;
                j--;
                i++;
            }
        }
        return array;
    }

    int recursionDemo(int num){
        num--;
        if (num>0)
            recursionDemo(num);
        return num;
    }
}

