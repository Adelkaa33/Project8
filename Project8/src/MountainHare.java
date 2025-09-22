import java.util.ArrayList;

// Класс MountainHare - представляет зайца-беляка
public class MountainHare {

    private int age;
    private double weight;
    private int jumpLength;

    // Цвет шерсти для всех зайцев общий и зависит от времени года
    private static String color;

    // Конструктор
    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    // Статический метод для установки цвета у всех зайцев
    public static void setColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
