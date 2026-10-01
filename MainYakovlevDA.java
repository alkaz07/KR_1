import java.util.Scanner;

public class MainYakovlevDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ЗАДАЧА 1: Сумма площадей двух прямоугольников

        System.out.println("=== ЗАДАЧА 1: ДВА ПРЯМОУГОЛЬНИКА ===");

        System.out.print("Прямоугольник 1 (длина и ширина через пробел): ");
        double l1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();

        System.out.print("Прямоугольник 2 (длина и ширина через пробел): ");
        double l2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();

        double area1 = l1 * w1;
        double area2 = l2 * w2;
        double sumOfAreas = area1 + area2;

        System.out.println("Сумма площадей фигур: "+sumOfAreas);


        // ЗАДАЧА 2: Сравнение периметров трех прямоугольников

        System.out.println("=== ЗАДАЧА 2: ТРИ ПРЯМОУГОЛЬНИКА ===");

        System.out.print("Прямоугольник 1 (длина и ширина): ");
        double len1 = scanner.nextDouble();
        double wid1 = scanner.nextDouble();
        double p1 = 2 * (len1 + wid1);

        System.out.print("Прямоугольник 2 (длина и ширина): ");
        double len2 = scanner.nextDouble();
        double wid2 = scanner.nextDouble();
        double p2 = 2 * (len2 + wid2);

        System.out.print("Прямоугольник 3 (длина и ширина): ");
        double len3 = scanner.nextDouble();
        double wid3 = scanner.nextDouble();
        double p3 = 2 * (len3 + wid3);

        // Сравнения периметров
        if (p1 == p2 && p2 == p3) {
            System.out.println("все периметры равны");
        } else if (p1 == p2 || p1 == p3 || p2 == p3) {
            System.out.println("два периметры равны");
        } else {
            System.out.println("периметры разные");
        }
        System.out.println();


        // ЗАДАЧА 3: Средняя площадь пяти прямоугольников

        System.out.println("=== ЗАДАЧА 3: ПЯТЬ ПРЯМОУГОЛЬНИКА ===");
        double sumArea = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Прямоугольник " + i + " (длина и ширина): ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();

            sumArea += (length * width);
        }

        double averageArea = sumArea / 5;
        System.out.println("Средняя площадь пяти фигур: "+averageArea);

    }
}
