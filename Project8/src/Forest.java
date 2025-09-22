import java.util.ArrayList;

// Класс Forest - представляет лес со временем года и списком зайцев
public class Forest {

    private ArrayList<MountainHare> hares;

    // Время года общее для всех лесов и скрытое для внешнего мира
    private static String season;

    // Конструктор инициализирует список зайцев
    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    // Статический метод для смены времени года
    public static void setSeason(String newSeason) {
        season = newSeason;
        if ("зима".equalsIgnoreCase(season)) {
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    // Метод для печати списка зайцев
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
