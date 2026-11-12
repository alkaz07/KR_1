import java.util.Arrays;

public class Salimova2 {
    public static void main(String[] args) {
        // firstTask();
        //  secondTask();
            thirdTask();
    }

    private static void firstTask() {
        for (int i = 1; i < 3; i++) {
            double m = Double.parseDouble(IO.readln("Введите массу " + i + "-го предмета: "));
            double v = Double.parseDouble(IO.readln("Введите объем " + i + "-го предмета: "));
            IO.println("Плотность " + i + "-го предмета: " + (m / v));
        }
    }

    private static void secondTask() {
        double m1 = Double.parseDouble(IO.readln("Введите массу первого предмета: "));
        double v1 = Double.parseDouble(IO.readln("Введите объем первого предмета: "));
        double m2 = Double.parseDouble(IO.readln("Введите массу второго предмета: "));
        double v2 = Double.parseDouble(IO.readln("Введите объем второго предмета: "));
        double m3 = Double.parseDouble(IO.readln("Введите массу третьего предмета: "));
        double v3 = Double.parseDouble(IO.readln("Введите объем третьего предмета: "));

        if (m1 / v1 == m2 / v2 && m1 / v1 == m3 / v3) {
            IO.println("все плотности равны");
        } else if (m1 / v1 == m2 / v2 || m1 / v1 == m3 / v3 || m2 / v2 == m3 / v3) {
            IO.println("два плотности равны");
        } else {
            IO.println("плотности разные");
        }

    }

    private static void thirdTask() {
        double[] density = new double[5];
        double sum =0;
        for (int i = 0; i < 5; i++) {
            double m = Double.parseDouble(IO.readln("Введите массу " + (i+1) + "-го предмета: "));
            double v = Double.parseDouble(IO.readln("Введите объем " + (i+1) + "-го предмета: "));
            density[i] = m/v;
            sum += density[i];
        }
        System.out.printf("Средняя плотность равна: %.2f", sum/5);

    }
}
