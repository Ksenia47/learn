package com.ksenia47.learn;

public class StringTasks {

    /**
     * Вывести строки и их длину.
     */
    public String getStringWithLength(String text, String secondText) {
        String allText = text + ". " + "Длина текста: " + text.length() + ".\n" +
                secondText + ". Длина текста: " + secondText.length() + ".";
        return allText;
    }

    /**
     * Вывести строку в верхнем регистре, вывести первоначальный вариант.
     */
    public String toUpperPlusOriginal(String text) {
        String capitalized = text.toLowerCase() + "\n" + text;
        return capitalized;
    }

    /**
     * Убрать пробелы в начале и конце строки. Вывести результат.
     */
    public String deletePause(String text) {
        String trim = text.trim();
        return trim;
    }

    /**
     * Найти индекс слова бяка в строке. Вывевсти строку и индекс.
     */
    public String getIndexOfWord(String text) {
        String secondText = "Индекс слова \"бяка\": ";
        int index = text.indexOf("бяка");
        return text + "\n" + secondText + index;
    }

    /**
     * Обрезать первое и последнее слова в строке.
     */
    public String substringFirstAndLastWords(String text) {
        String result = text.substring(text.indexOf(" "), text.lastIndexOf(" "));
        return result;
    }

    /**
     * Вырезать слово бяка из строки. Вывевсти обе строки.
     */
    public String exscindWordFromString(String text) {
        String replace = text.replace("бяка", "");
        return text + "\n" + replace;
    }

    /**
     * Заменить в строке все вхождения слова «бяка» на «вырезано цензурой».
     */
    public String replaceWord(String text) {
        String replace = text.replace("бяка", "'вырезано цензурой'");
        return replace;
    }
}
