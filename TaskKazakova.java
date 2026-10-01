import java.util.Scanner;

public class TaskKazakova {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //task1(scanner);

        //task2(scanner);

        task3(scanner);

    }

    static void task1(Scanner scanner) {
        System.out.println("Введите длину и ширину первого прямоугольника: ");
            int length1 = scanner.nextInt();
            int width1 = scanner.nextInt();

        System.out.println("Введите длину и ширину второго прямоугольника: ");
            int length2 = scanner.nextInt();
            int width2 = scanner.nextInt();

        int area1 = length1 * width1;
        int area2 = length2 * width2;

        System.out.println("Сумма площадей этих фигур: " + (area1 + area2));
    }

    static void task2(Scanner scanner) {
// хотела сделать черещ цикл, но возникли сложности - не поняла как сравнивать при этом параметры
        System.out.println("Введите длину и ширину первого прямоугольника: ");
            int length1 = scanner.nextInt();
            int width1 = scanner.nextInt();

        System.out.println("Введите длину и ширину второго прямоугольника: ");
            int length2 = scanner.nextInt();
            int width2 = scanner.nextInt();

        System.out.println("Введите длину и ширину третьего прямоугольника: ");
            int length3 = scanner.nextInt();
            int width3 = scanner.nextInt();

        int perim1 = 2*length1 + 2*width1;
        int perim2 = 2*length2 + 2*width2;
        int perim3 = 2*length3 + 2*width3;

        if (perim1 == perim2 && perim2 == perim3) {
            System.out.println("все периметры равны");
        } else if (perim1 == perim2 || perim2 == perim3 || perim1 == perim3) {
            System.out.println("два периметра равны");
        } else {
            System.out.println("периметры разные");
        }
    }

    static void task3(Scanner scanner) {

        int length;
        int width;
        int area;
        int totalArea = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите длину и ширину прямоугольника: ");
            length = scanner.nextInt();
            width = scanner.nextInt();
            area = length * width;
            totalArea += area;
        }

        double avgArea = (double) totalArea/5;

        System.out.println(avgArea);
        }
}

