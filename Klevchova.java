import java.util.Scanner;
public class Klevchova {

        static void main() {

            Rectangle rect0 = inputRectangle();
            Rectangle rect1 =inputRectangle();

            //System.out.println("Периметр rect0 равен  " + rect0.calkPerimetr());
            //System.out.println("Периметр rect1 равен  " + rect1.calkPerimetr());
           double res = rect0.calkArea() + rect1.calkArea();
            System.out.println("Cумму площадей этих фигур  " + res);
            Rectangle rect2 = inputRectangle();
            Rectangle rect3 =inputRectangle();
            Rectangle rect4 = inputRectangle();

            double p2 = rect2.calkPerimetr();
            double p3 = rect3.calkPerimetr();
            double p4 = rect4.calkPerimetr();
            if (p2 == p3 && p3 == p4) {
                System.out.println("все периметры  равны");

            }else if (p2 == p3 || p3 == p4 || p2 ==p4) {
                System.out.println("два периметра равны");

            }
            System.out.println("периметры разные");
        }

    static Rectangle inputRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите положительные длину и ширину");

        double a, b;
        do {
            System.out.println("ошибка ввода");
            a = scanner.nextDouble(); // Вставить обработку исключений на 0 и отрицательные числа
            b = scanner.nextDouble();

        } while (a<=0 || b<=0 );

        Rectangle r = new Rectangle(a, b);
        return r;
    }


    static class Rectangle {
    double length, width;

    public Rectangle(double length, double width) { // // Вставить обработку исключений на 0 и отрицательные числа
        if (length>0 && width>0){
            this.length = length;
            this.width = width;
        }
        else {
            System.out.println("Отрицательные длины сторон не допустимы!");
        }
    }


    public double calkPerimetr(){
        return 2*(length+width);
    }

    public double calkArea() {
        return (length * width);
    }

