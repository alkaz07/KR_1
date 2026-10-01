import java.util.Scanner;

public class Belova {
    public  static void main(){
        Scanner sc = new Scanner(System.in);

        // 1. Вычислить сумму площадей ДВУХ прямоугольников
        System.out.println("Введите длину и ширину прямоугольника 1: ");
        double length1 = sc.nextDouble(), width1 = sc.nextDouble();
        System.out.println("Введите длину и ширину прямоугольника 2: ");
        double length2 = sc.nextDouble(),width2 = sc.nextDouble();

        double areaSum = length1 * width1 + length2 * width2;
        System.out.println("Сумма площадей прямоугольников равна " + areaSum);

        // 2. Сравнить периметры ТРЁХ прямоугольников
        System.out.println("Введите длину и ширину трёх прямоугольников по порядку:");
        double[] perimeters = new double[3];
        for (int i = 0; i < 3; i++) {
            double length = sc.nextDouble(), width = sc.nextDouble();
            perimeters[i] = 2 * (length + width);
        }

        if (perimeters[0] == perimeters[1] &&
                perimeters[1] == perimeters[2]) {
            System.out.println("все периметры равны");
        } else if (perimeters[0] == perimeters[1] ||
                perimeters[0] == perimeters[2] ||
                perimeters[1] == perimeters[2]) {
            System.out.println("два периметра равны");
        } else {
            System.out.println("периметры разные");
        }

        // 3. Вычислить среднюю площадь ПЯТИ прямоугольников
        System.out.println("Введите длину и ширину пяти прямоугольников по порядку:");
        double areaSumOf5 = 0;
        for (int i = 0; i < 5; i++) {
            double length = sc.nextDouble(), width = sc.nextDouble();
            areaSumOf5 += length * width;
        }

        double avgArea = areaSumOf5 / 5;
        System.out.println("Средняя площадь всех прямоугольников равна " + avgArea);
    }
}
