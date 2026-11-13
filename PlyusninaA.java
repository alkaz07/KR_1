import java.util.Arrays;
import java.util.Scanner;

public class PlyusninaA {
    static void main(String[] args) {

        //task1();
        //task2();
        task3();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введите массу предмета №" + "1" + ": ");
        double m1 = scanner.nextDouble();
        IO.println("Введите объем предмета №" + "1" + ": ");
        double v1 = scanner.nextDouble();
        IO.println("Введите массу предмета №" + "2" + ": ");
        double m2 = scanner.nextDouble();
        IO.println("Введите объем предмета №" + "2" + ": ");
        double v2 = scanner.nextDouble();
        double density1 = m1 / v1;
        double density2 = m2 / v2;
        double densityMax = Math.max(density1, density2); // Определение максимальной величины с помощью встроенной функции для 2 параметров
        IO.println("Максимальная плотность: " + densityMax);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введите массу предмета №" + "1" + ": ");
        double m1 = scanner.nextDouble();
        IO.println("Введите объем предмета №" + "1" + ": ");
        double v1 = scanner.nextDouble();
        IO.println("Введите массу предмета №" + "2" + ": ");
        double m2 = scanner.nextDouble();
        IO.println("Введите объем предмета №" + "2" + ": ");
        double v2 = scanner.nextDouble();
        IO.println("Введите массу предмета №" + "3" + ": ");
        double m3 = scanner.nextDouble();
        IO.println("Введите объем предмета №" + "3" + ": ");
        double v3 = scanner.nextDouble();
        double density1 = m1 / v1;
        double density2 = m2 / v2;
        double density3 = m3 / v3;
        //double densityMax = Math.max(density1, Math.max(density2, density3)); // Определение максимальной величины с помощью встроенной функции для 2 параметров
        if ((density1 == density2) && (density1 == density3))
            IO.println("Все предметы равны по плотности");
        else if ((density1 == density2) || (density1 == density3) || (density2 == density3)) {
            IO.println("Два предмета равны по плотности");
        } else
            IO.println("Все плотности разные");
    }

    // -----------------------------------------------------------------------------------------------------
    static class Item {
        private static final double EPS = 0.0000001;

        private double mass, volume;

        public Item(double mass, double volume) {
            this.mass = mass;
            this.volume = volume;
            if (volume < 0)
                throw new RuntimeException("Объем не может быть отрицательным");
        }

        public double getMass() {
            return mass;
        }

        public double getVolume() {
            return volume;
        }

        public double getDensity() {
            return mass / volume;
        }

        public boolean equalsByDensity(Item other) {
            return Math.abs(this.getDensity() - other.getDensity()) <= EPS;
        }
    }

    public static void task3() {
        //Ввести параметры 5 предметов
        Item[] items = new Item[5];
        for (int i = 0; i < items.length; i++) {
            items[i] = readItem("№ " + i);
        }
        System.out.println("items = " + Arrays.toString(items));
        //Вычислить среднюю плотность
        //1 вариант
        double totalM = 0;
        double totalV = 0;
        for (Item item : items) {
            totalM += item.getMass();
            totalV += item.getVolume();
        }
        double avgDens = totalM / totalV;

        System.out.println("avgDens = " + avgDens);
    }

    public static Item readItem(String itemTitle) {
        IO.println("Введите параметры объекта " + itemTitle);
        double m = Double.parseDouble(IO.readln("масса: "));
        double v = Double.parseDouble(IO.readln("объем: "));
        return new Item(m, v);
    }
}