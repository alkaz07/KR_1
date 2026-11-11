package ru.course.lesson02;
// Запросить у пользователя параметры (массу и объем) ДВУХ Предметов.
// Вывести максимальную плотность этих предметов.
import java.util.Scanner;

public class Kr1part2Deminov {

    public static void main(String[] args) {

        // task001();
        // task002();
        // task003();
    }
    public static void task001() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел массу и объем первого предмета: ");
        int m1 = sc.nextInt(); // Масса первого предмета
        int v1 = sc.nextInt(); // Объем первого предмета
        System.out.print("Введите через пробел массу и объем второго предмета: ");
        int m2 = sc.nextInt(); // Масса второго предмета
        int v2 = sc.nextInt(); // Объем второго предмета
        double d1 = (double) m1 / v1;
        double d2 = (double) m2 / v2;
        double max = Math.max(d1, d2);
        IO.println("Максимальная плотность: " + max);
    }


    public static void task002() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел массу и объем первого предмета: ");
        int m1 = sc.nextInt(); // Масса первого предмета
        int v1 = sc.nextInt(); // Объем первого предмета
        System.out.print("Введите через пробел массу и объем второго предмета: ");
        int m2 = sc.nextInt(); // Масса второго предмета
        int v2 = sc.nextInt(); // Объем второго предмета
        System.out.print("Введите через пробел массу и объем третьего предмета: ");
        int m3 = sc.nextInt(); // Масса третьего предмета
        int v3 = sc.nextInt(); // Объем третьего предмета
        double d1 = (double) m1 / v1; // Плотность первого предмета
        double d2 = (double) m2 / v2;// Плотность второго предмета
        double d3 = (double) m3 / v3;// Плотность третьего предмета
        double max = Math.max(d1, d2); // Определяем максимальную плотность у первых двух предметов
        max = Math.max(max, d3); // Сравниваем макс с третьим предметом
        IO.println((d1 == d2 && d1 == d3)
                ? "все плотности равны"
                : (d1 == d2 || d1 == d3 || d2 == d3)
                ? "две плотности равны"
                : "плотноти разные");
    }

    public static void task003() {
        Scanner sc = new Scanner(System.in);
        int objectsQty = 5;
        int[] objectsWeights = new int[objectsQty];
        int[] objectsVolumes = new int[objectsQty];
        double[] objectsDensities = new double[objectsQty];
        double meanDensity;
        double totalDensity = 0;

        // Ввод данных
        for (int i = 0; i < objectsQty; i++) {
            System.out.print("Введите через пробел массу и объем " + (i+1) + "-го предмета: ");
            objectsWeights[i] = sc.nextInt(); // Масса предмета
            objectsVolumes[i] = sc.nextInt(); // Объем предмета
        }

        // Расчет средней плотности
        for (int i = 0; i < objectsQty; i++) {
            objectsDensities[i] = (double) objectsWeights[i] / objectsVolumes[i];
            totalDensity += objectsDensities[i];
        }
        meanDensity = totalDensity / objectsQty; // Определяем среднюю плотность

        // Вывод результата
        IO.println("Средняя плотность: " + meanDensity);
    }


}
