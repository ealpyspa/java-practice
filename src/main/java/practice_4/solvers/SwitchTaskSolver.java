package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        //проверка метода, возвращающего день недели по числу
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(15));

        // проверка метода по описанию сезона
        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.AUTUMN));
    }

    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }

        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно.";
            case SPRING -> description = "Весна - все цветет.";
            case SUMMER -> description = "Лето - время ехать на море.";
            case AUTUMN -> description = "Осень - листья желтеют.";
        }

        return description;
    }
}
