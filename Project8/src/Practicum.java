import java.util.ArrayList;

// Главный класс для запуска программы
public class Practicum {

    public static void main(String[] args) {

        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        // Создаем лес с зайцами
        Forest forest = new Forest(hares);

        // Сезон лето
        System.out.println("В лесу лето!");
        Forest.setSeason("лето");  // смена времени года на лето
        System.out.println("Список зайцев:");
        forest.printHares();

        // Сезон зима
        System.out.println("В лесу зима!");
        Forest.setSeason("зима"); // смена времени года на зиму
        System.out.println("Список зайцев:");
        forest.printHares();
    }
}
