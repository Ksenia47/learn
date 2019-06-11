public class Switch {
    /**
     * Дано название месяца прописью, вывести его порядковый номер. Если в названии месяца есть ошибка,
     * то вывести "Ошибка". Регистр букв и наличие пробелов в начале или конце не должны влиять на работу программы.
     */
    public String getNumbetOfMonth(String month) {
        month = "".toLowerCase().trim();
        int result;
        String answer = "";
        switch (month) {
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
            case "май":
                result = 5;
                break;
            case "июнь":
                result = 6;
                break;
            case "июль":
                result = 7;
                break;
            case "август":
                result = 8;
                break;
            case "сентябрь":
                result = 9;
                break;
            case "октябрь":
                result = 10;
                break;
            case "ноябрь":
                result = 11;
                break;
            case "декабрь":
                result = 12;
                break;
            default:
                result = -1;
                break;
        }
        if (result > -1)
            answer = String.valueOf(result);
        else if (result == -1)
            answer = "Ошибка";
        return answer;
    }

    /**
     * По номеру месяца определить количество дней в месяце.
     */
    public int getQuantityDaysOfMonth(int numberMonth) {
        int result;
        switch (numberMonth) {
            case 2:
                result = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            default:
                result = 31;
                break;
        }
        return result;
    }

    /**
     * Переменная содержит код языка. МОгут быть три варианта: "en", "ru", "fr".
     * Вывести дни недели через запятую на заданном языке в зависимости от кода языка.
     */
    public String getDayOfTheWeekOnDifferentLanguages(String lang) {
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
        return result;
    }
}
