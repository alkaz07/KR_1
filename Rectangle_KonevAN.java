import java.awt.*;
import java.util.Scanner;

public class Rectangle_KonevAN {
    public static void main(String[] args) {
        final int nRectangle = 5;
        double[] square = new double[nRectangle];
        double[] perimeter = new double[nRectangle];
        double totalSquare = 0;
        double totalPerimeter = 0;
        double averageSquare;
        double averagePerimeter;
        int eqSquare = 0;
        int eqPerimeter = 0;

        for (int i = 0; i < nRectangle; i++) {
            System.out.println("прямоугольник № " + (i + 1));
            Rectangle r1 = inputRectangle();
            square[i] = squareCalc(r1);
            perimeter[i] = perimeterCalc(r1);
            System.out.println("Площадь прямоугольника  " + square[i]);
            System.out.println("Периметр прямоугольника: " + perimeter[i]);
            totalSquare += square[i];
            totalPerimeter += perimeter[i];
        }

        averageSquare = totalSquare / nRectangle;
        averagePerimeter = totalPerimeter / nRectangle;
        System.out.println("Средний периметр: " + averagePerimeter);
        System.out.println("Средняя площадь: " + averageSquare);

        for (int i = 0; i < nRectangle; i++) {
            if (averageSquare == square[i]) {
                eqSquare += 1;
            }

            if (averagePerimeter == perimeter[i]) {
                eqPerimeter += 1;
            }
        }
        //System.out.println(eqPerimeter);
        //System.out.println(eqSquare);
            if (eqPerimeter - 1.0 * nRectangle == 0.000) {
                System.out.println("Периметры всех прямоугольников равны");
            } else {
                System.out.println("Периметры всех прямоугольников не равны");
            }

            if (eqSquare - 1.0 * nRectangle == 0.000) {
            System.out.println("Площади всех прямоугольников равны");
        } else {
            System.out.println("Площади всех прямоугольников не равны");
        }
    }


    static Rectangle inputRectangle(){
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();

        while (r.height<=0)
        {
            System.out.println("Введите положительную ширину прямоугольника: ");
            r.height = input.nextInt();
        }

        while (r.width<=0)
        {
            System.out.println("Введите положительную высоту прямоугольника: ");
            r.width = input.nextInt();
        }
return r;

        }

private static int squareCalc(Rectangle r) {
    return (r.height * r.width);
}
private static int perimeterCalc(Rectangle r) {
        return 2*(r.height + r.width);
    }

}


