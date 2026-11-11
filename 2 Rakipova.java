2. Rakipova

1.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Данные первого предмета
        System.out.println("Введите массу первого предмета");
        double m1 = scanner.nextDouble();
        System.out.println("Введите объем первого предмета");
        double v1 = scanner.nextDouble();
        double p1 = m1 / v1; // Плотность первого

        // Данные второго предмета
        System.out.println("Введите массу второго предмета");
        double m2 = scanner.nextDouble();
        System.out.println("Введите объем второго предмета");
        double v2 = scanner.nextDouble();
        double p2 = m2 / v2; // Плотность второго

        // Расчёт максимальной плотности
        if (p1 > p2) {
            System.out.println("Максимальная плотность" + p1);
        } else {
            System.out.println("Максимальная плотность" + p2);
        }
    }



2.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1-й предмет
        System.out.println("Введите массу и объем первого предмета");
        double m1 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double p1 = m1 / v1;

        // 2-й предмет
        System.out.println("Введите массу и объем второго предмета");
        double m2 = scanner.nextDouble();
        double v2 = scanner.nextDouble();
        double p2 = m2 / v2;

        // 3-й предмет
        System.out.println("Введите массу и объем третьего предмета");
        double m3 = scanner.nextDouble();
        double v3 = scanner.nextDouble();
        double p3 = m3 / v3;

        // Сравнение плотности
        if (p1 == p2 && p2 == p3) {
            System.out.println("все плотности равны");
        } else if (p1 == p2 || p1 == p3 || p2 == p3) {
            System.out.println("два плотности равны");
        } else {
            System.out.println("плотности разные");
        }
    }
}


3.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // первый предмет
        System.out.println("Введите массу и объем первого предмета");
        double p1 = scanner.nextDouble() / scanner.nextDouble();

        // второй предмет
        System.out.println("Введите массу и объем второго предмета");
        double p2 = scanner.nextDouble() / scanner.nextDouble();

        // третий предмет
        System.out.println("Введите массу и объем третьего предмета");
        double p3 = scanner.nextDouble() / scanner.nextDouble();

        // четвертый предмет
        System.out.println("Введите массу и объем четвертого предмета");
        double p4 = scanner.nextDouble() / scanner.nextDouble();

        // пятый предмет
        System.out.println("Введите массу и объем пятого предмета");
        double p5 = scanner.nextDouble() / scanner.nextDouble();

        // Расчет средней плотности
        double average = (p1 + p2 + p3 + p4 + p5) / 5;
        System.out.println("Средняя плотность: " + average);
    }
}

