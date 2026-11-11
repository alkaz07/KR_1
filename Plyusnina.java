import java.util.Scanner;

public class Plyusnina {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Введите массу предмета №"+"1"+": ");
        double m1 = scanner.nextDouble();
        IO.println("Введите объем предмета №"+"1"+": ");
        double v1 = scanner.nextDouble();

        IO.println("Введите массу предмета №"+"2"+": ");
        double m2 = scanner.nextDouble();
        IO.println("Введите объем предмета №"+"2"+": ");
        double v2 = scanner.nextDouble();

        double p1= m1 /v1; //плотность
        double p2= m2/v2; //плотность

        if (p1>p2)
            IO.println("Максимальная плотность: " + p1);
            else {
                if (p2>p1)
                    IO.println("Максимальная плотность: " + p2);
            }
    }
}

