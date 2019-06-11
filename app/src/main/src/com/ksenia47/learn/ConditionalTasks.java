package com.ksenia47.learn;

import java.util.regex.Pattern;

public class ConditionalTasks {
    /**
     * Написать программу, которая делает заглавной первую букву предложения(Если это необходимо),
     * ставит точку в конце предложения.
     */
    public String formatAsSentence(String text) {
        text = text.trim();
        char letter = text.toCharArray()[0];
        char[] symbolArray = text.toCharArray();
        char lastSymbol = symbolArray[symbolArray.length - 1];
        String answer = text;

        if (!Character.isUpperCase(letter))
            answer = String.valueOf(letter).toUpperCase() + text.substring(1);
        if (!String.valueOf(lastSymbol).equals("."))
            answer += ".";
        return answer;
    }

    /**
     * В переменной integer хранится число 2 или 3 или 4. Вывести сообщение "В переменной integer хранится "
     * и число прописью.
     */
    public String numeralCursive(Integer a) {
        String answer = "В переменной integer хранится ";
        if (a == 2)
            answer += "два";
        else if (a == 3)
            answer += "три";
        else if (a == 4)
            answer += "четыре";
        else
            answer += "другое число";
        return answer;
    }

    /**
     * В корзине несколько яблок. Если одно яблоко то вывести "Яблоко одно" Если яблок меньше трёх, то "Мало яблок",
     * если яблок 3 или больше, то "Яблок хватит всем"
     */
    public String numberAppleInBucket(String bucket, String number, int appleCount) {
        bucket = "Количество яблок в корзине: 7".trim();
        number = bucket.substring(bucket.lastIndexOf(" ")).trim();
        appleCount = Integer.parseInt(number);
        String answer = ". ";
        if (appleCount == 1)
            answer += "Яблоко одно";
        else if (appleCount < 3)
            answer += "Мало яблок";
        else if (appleCount >= 3)
            answer += "Яблок хватит всем";
        return bucket + answer;
    }

    /**
     * Сравнить 2 числа, Вывести большее. Если они равны то вывести "Числа равны"
     */
    public String compareNumbers(int a, int b) {
        a = 8;
        b = 2;
        String answer = "";
        if (a > b)
            answer = String.valueOf(a);
        else if (a < b)
            answer = String.valueOf(b);
        else if (a == b)
            answer = "Числа равны";
        return answer;
    }

    /**
     * Если в строке, описывающей коризну, есть "яблоки", "груши" или "апельсины", то вывести "Фрукты".
     * Если в строке, описывающей корзину, есть одновременно слова "специи", "овощи" и "мясо",
     * тогда вывести "Суповой набор"
     */
    String liningBucket(Boolean isFirstFruit, Boolean isSecondFruit, Boolean isThirdFruit, Boolean isFirstPart, Boolean isSecondPart, Boolean isThirdPart) {
        String bucket = "В корзине есть морква".toLowerCase();
        isFirstFruit = Pattern.compile("яблоки").matcher(bucket).find();
        isSecondFruit = Pattern.compile("груши").matcher(bucket).find();
        isThirdFruit = Pattern.compile("апельсины").matcher(bucket).find();
        isFirstPart = Pattern.compile("специи").matcher(bucket).find();
        isSecondPart = Pattern.compile("овощи").matcher(bucket).find();
        isThirdPart = Pattern.compile("мясо").matcher(bucket).find();
        String answer = "";
        if (isFirstPart & isSecondPart & isThirdPart)
            answer = "Суповой набор.";
        if (isFirstFruit || isSecondFruit || isThirdFruit)
            answer = "Фрукты.";
        if ((isFirstFruit || isSecondFruit || isThirdFruit) & (isFirstPart || isSecondPart || isThirdPart))
            answer = "Был голоден, хватал все подряд.";
        if (!isFirstFruit || !isSecondFruit || !isThirdFruit || !isFirstPart || !isSecondPart || !isThirdPart)
            answer = "В корзине нет ничего, что нам нужно.";
        return answer;
    }

}
