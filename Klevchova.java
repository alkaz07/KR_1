import java.util.Scanner;
public class Klevchova {

    public static void main(String[] args) {

        Rectangle rect0 = inputRectangle();
        Rectangle rect1 = inputRectangle();
        double res = rect0.calkArea() + rect1.calkArea();
        System.out.println("Cумма площадей этих фигур  " + res);

        Rectangle rect2 = inputRectangle();
        Rectangle rect3 = inputRectangle();
        Rectangle rect4 = inputRectangle();

        double p2 = rect2.calkPerimetr();
        double p3 = rect3.calkPerimetr();
        double p4 = rect4.calkPerimetr();
        if (p2 == p3 && p3 == p4) {
            System.out.println("все периметры  равны");

        } else if (p2 == p3 || p3 == p4 || p2 == p4) {
            System.out.println("два периметра равны");

        } else
            System.out.println("периметры разные");

        Rectangle rect5 = inputRectangle();
        Rectangle rect6 = inputRectangle();
        Rectangle rect7 = inputRectangle();
        Rectangle rect8 = inputRectangle();
        Rectangle rect9 = inputRectangle();
        double s = (rect5.calkArea() + rect6.calkArea() + rect7.calkArea() + rect8.calkArea() + rect9.calkArea()) / 5;
        System.out.println("средняя площадь " + s);
    }




    static Rectangle inputRectangle(){

        System.out.println("введите положительные длину и ширину");
        Scanner scanner = new Scanner(System.in);
        double a, b;
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }

        Rectangle r = new Rectangle(a, b);
        return r;
    }


    static class Rectangle {
        double length, width;

        public Rectangle(double length, double width) { // // Вставить обработку исключений на 0 и отрицательные числа
            if (length > 0 && width > 0) {
                this.length = length;
                this.width = width;
            } else {
                System.out.println("Отрицательные длины сторон не допустимы!");
            }
        }


        public double calkPerimetr() {
            return 2 * (length + width);
        }

        public double calkArea() {
            return (length * width);
        }

        }
    }