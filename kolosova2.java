import java.util.Scanner;

public class kolosova2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите m 1го предмета (кг): ");
        double mass1 = scanner.nextDouble();

        System.out.println("Введите V 1го предмета(м³): ");
        double volume1 = scanner.nextDouble();

        System.out.println("Введите m 2го предмета(кг): ");
        double mass2 = scanner.nextDouble();

        System.out.println("Введите v 2го предмета(м3): ");
        double volume2 = scanner.nextDouble();

        
        if (volume1 <= 0) {
            System.out.println("Ошибка: v первого предмета должен быть больше нуля.");
        } else if (volume2 <= 0) {
            System.out.println("Ошибка: v второго предмета должен быть больше нуля.");
        } else {
            double density1 = mass1 / volume1;
            double density2 = mass2 / volume2;


            double maxDensity = Math.max(density1, density2);
            System.out.println("Максимальная плотность: " + maxDensity);
        }

        scanner.close();
    }
}
