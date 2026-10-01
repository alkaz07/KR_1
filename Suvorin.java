import java.util.Scanner;

public class Suvorin {
    public static class Rectangle {
        float x = 0;
        float y = 0;
    }

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
    }

    private static void task1(Scanner scanner) {
        float sum = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Получение данных прямоугольника №" + i);
            Rectangle rectangle = getRectangle(scanner);
            sum += (rectangle.x * rectangle.y);
        }

        System.out.println("Сумма площадей прямоугольников: " + sum);
    }

    private static void task2(Scanner scanner) {
        float[] perimeter = new float[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("Получение данных прямоугольника №" + i);
            Rectangle rectangle = getRectangle(scanner);
            perimeter[i - 1] += (2 * (rectangle.x + rectangle.y));
        }

        if (perimeter[0] == perimeter[1] && perimeter[1] == perimeter[2]) {
            System.out.println("Все периметры равны");
        } else  if (perimeter[0] == perimeter[1] || perimeter[1] == perimeter[2] || perimeter[0] == perimeter[2]) {
            System.out.println("Два периметра равны");
        } else {
            System.out.println("Все периметры разные");
        }
    }

    private static void task3(Scanner scanner) {
        float[] area = new float[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Получение данных прямоугольника №" + i);
            Rectangle rectangle = getRectangle(scanner);
            area[i - 1] += (rectangle.x * rectangle.y);
        }

        float areaSum = 0;
        for (int i = 1; i <= 5; i++) {
            areaSum += area[i - 1];
        }

        System.out.println("Средняя площадь прямоугольников: " + (areaSum / 5));
    }

    private static Rectangle getRectangle(Scanner scanner) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Введите длину прямоугольника:");
        rectangle.x = getFloat(scanner);
        System.out.println("Введите ширину прямоугольника:");
        rectangle.y = getFloat(scanner);

        return rectangle;
    }

    private static float getFloat(Scanner scanner) {  // Не дает ввести НЕ число
        float nextFloat = 0;
        if (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.println("Сторона прямоугольника должна быть числом!");
            return getFloat(scanner);
        }

        nextFloat = scanner.nextFloat();

        if (!validateFloat(nextFloat)) {
            return getFloat(scanner);
        }

        return nextFloat;
    }

    static boolean validateFloat(float x) {  // Не дает ввести неположительное число
        if (x <= 0) {
            System.out.println("Сторона прямоугольника должна быть положительной!");
            return false;
        } else {
            return true;
        }
    }
}
