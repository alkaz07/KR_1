package weekone.daythree.taskone;

// 1. Запросить у пользователя параметры (длину и ширину) ДВУХ Прямоугольников.
// Вывести сумму площадей этих фигур.
public class SergeevTaskOneRunner {
    static void main() {
        Rectangle recOne = addRectangle();
        Rectangle recTwo = addRectangle();

        if (recOne == null || recTwo == null) {
            System.out.println("Прямоугольник нужно создать корректно!");
            return;
        }

        double areaRecOne = rectangleArea(recOne);
        double areaRecTwo = rectangleArea(recTwo);
        System.out.println("Сумма площадей ДВУХ прямоугольников = " + sumAreaTwoRectangle(recOne, recTwo ));
    }

    public static Rectangle addRectangle() {
        System.out.println("ВВедите длину и ширину прямоугольника/ов: ");

        double length = Double.parseDouble(IO.readln("Длина: "));
        double width = Double.parseDouble(IO.readln("Ширина: "));

        if (length <= 0 || width <= 0) {
            System.out.println("!Числа должны быть больше 0!");
            return null;
        } else {
            return new Rectangle(length, width);
        }
    }

    public static double rectangleArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public static double sumAreaTwoRectangle(Rectangle recOne, Rectangle recTwo) {
        return rectangleArea(recOne) + rectangleArea(recTwo);
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}