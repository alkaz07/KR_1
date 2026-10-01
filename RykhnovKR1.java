import java.util.Scanner;

// Класс прямоугольник
class Rykhnov_Rectangle {
    private double length;
    private double width;

    Rykhnov_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getLength() { return length; }
    double getWidth()  { return width; }

    double area()      { return length * width; }
    double perimeter() { return 2 * (length + width); }

    @Override
    public String toString() {
        return "Rykhnov_Rectangle{" + length + " x " + width + "}";
    }
}

public class RykhnovKR1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ЗАДАЧА 1");
        task1(sc);

        System.out.println();
        System.out.println("ЗАДАЧА 2");
        task2(sc);

        System.out.println();
        System.out.println("ЗАДАЧА 3");
        task3(sc);

        sc.close();
    }

    //  Задача 1
    static void task1(Scanner sc) {
        System.out.println("Введите параметры ДВУХ прямоугольников.");

        Rykhnov_Rectangle r1 = readRectangle(sc, 1);
        Rykhnov_Rectangle r2 = readRectangle(sc, 2);

        double totalArea = r1.area() + r2.area();

        System.out.println("Площадь 1-го: " + r1.area());
        System.out.println("Площадь 2-го: " + r2.area());
        System.out.println("Сумма площадей: " + totalArea);
    }

    // Задача 2
    static void task2(Scanner sc) {
        System.out.println("Введите параметры ТРЁХ прямоугольников.");

        Rykhnov_Rectangle r1 = readRectangle(sc, 1);
        Rykhnov_Rectangle r2 = readRectangle(sc, 2);
        Rykhnov_Rectangle r3 = readRectangle(sc, 3);

        double p1 = r1.perimeter();
        double p2 = r2.perimeter();
        double p3 = r3.perimeter();

        System.out.println("Периметры: " + p1 + ", " + p2 + ", " + p3);

        boolean eq12 = Math.abs(p1 - p2) < 1e-9;
        boolean eq13 = Math.abs(p1 - p3) < 1e-9;
        boolean eq23 = Math.abs(p2 - p3) < 1e-9;

        if (eq12 && eq13) {
            System.out.println("все периметры равны");
        } else if (eq12 || eq13 || eq23) {
            System.out.println("два периметра равны");
        } else {
            System.out.println("периметры разные");
        }
    }

    // Задача 3
    static void task3(Scanner sc) {
        System.out.println("Введите параметры ПЯТИ прямоугольников.");

        int count = 5;
        Rykhnov_Rectangle[] rects = new Rykhnov_Rectangle[count];
        double sumArea = 0;

        for (int i = 0; i < count; i++) {
            rects[i] = readRectangle(sc, i + 1);
            sumArea += rects[i].area();
            System.out.println("  Площадь: " + rects[i].area());
        }

        double averageArea = sumArea / count;

        System.out.println("Сумма площадей: " + sumArea);
        System.out.println("Средняя площадь: " + averageArea);
    }

    //  читаем прямоугольник
    static Rykhnov_Rectangle readRectangle(Scanner sc, int number) {
        System.out.println("Прямоугольник №" + number);
        System.out.print("  Длина: ");
        double length = sc.nextDouble();
        System.out.print("  Ширина: ");
        double width = sc.nextDouble();
        return new Rykhnov_Rectangle(length, width);
    }
}
