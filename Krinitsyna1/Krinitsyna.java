package Krinitsyna1;

import java.util.Scanner;

public class Krinitsyna1 {

    public static void main() {
        task1();
    }

    static void task1() {
        Item item1 = readItem();
        Item item2 = readItem();

        System.out.print("Максимальная плотность: " + Math.max(item1.getDensity(),item2.getDensity()));
    }

    static  void task2() {
        Item item1 = readItem();
        Item item2 = readItem();
        Item item3 = readItem();

        final double EPS = 1e-9; // точность сравнения дробных чисел

        double d1 = item1.getDensity();
        double d2 = item2.getDensity();
        double d3 = item3.getDensity();

        boolean eq12 = Math.abs(d1 - d2) < EPS;
        boolean eq13 = Math.abs(d1 - d3) < EPS;
        boolean eq23 = Math.abs(d2 - d3) < EPS;

        if (eq12 && eq13) {
            System.out.println("все плотности равны");
        } else if (eq12 || eq13 || eq23) {
            System.out.println("две плотности равны");
        } else {
            System.out.println("плотности разные");
        }

    }

    static void task3() {
        double sumM = 0;
        double sumV = 0;

        for (int i = 1; i <= 5; i++) {
            Item item = readItem();
            sumM += item.mass;
            sumV += item.volume;
        }
        System.out.println("Средняя плотность: " + (sumM / sumV));
    }


    private static Item readItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массу предмета: ");
        double a = scanner.nextDouble();

        System.out.print("Введите объем предмета: ");
        double b = scanner.nextDouble();

        System.out.print("Масса и обьем предмета: " + a + "/" + b + "\n");

        return new Item(a, b);
    }
}
