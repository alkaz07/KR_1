package weekone.daythree.tasktwo;

//2. Запросить у пользователя параметры (длину и ширину) ТРЕХ Прямоугольников,сравнить их периметры.
//Если все периметры равны, вывести "все периметры равны"
//Если любые 2 периметра равны, вывести "два периметра равны"
//Если все периметры разные вывести "периметры разные"

public class SergeevTaskTwoRunner {
    static void main() {
        Rectangle[] rectangles = getArrayRectangle(2);

        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i] == null){
                System.out.println("Массив пустой! Повторите попытку");
            }
        }

        double areaRecOne = rectangleArea(rectangles);
        double areaRecTwo = rectangleArea(rectangles[1]);
        System.out.println("Сумма площадей ДВУХ прямоугольников = " +
                sumAreaTwoRectangle(areaRecOne, areaRecTwo));
    }

    public static Rectangle[] getArrayRectangle(int num) {
        Rectangle[] rectangles = new Rectangle[num];

        if (num == 0) {
            System.out.println("Число прямоугольников должно быть БОЛЬШЕ 0!");
            return null;
        }

        for (int i = 0; i < num; i++) {
            rectangles[i] = addRectangle();
        }

        return rectangles;
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

    public static double rectangleArea(Rectangle[] rectangle) {
        double area = rectangle[0].getLength() * rectangle[0].getWidth();
        System.out.println("Площадь прямоугольника = " + area);
        return area;
    }

    public static double rectanglePerimeter(Rectangle[] rectangle) {
        int coef = 2;
        double perimeter = coef * (rectangle[0].getLength() + rectangle[0].getWidth());
        System.out.println("Периметр прямоугольника = " + perimeter);
        return perimeter;
    }

    public static double sumAreaTwoRectangle(Rectangle[] rectangles) {
        return areaRecOne + areaRecOne;
    }

    public static double matchingRectanglePerimeter(Rectangle rectangle) {
        return 0;
    }

    public static double averageRectangleArea(Rectangle[] rectangle) {
        return 0;
    }
}

class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;

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

    public double getArea(double length, double width) {
        return length * width;
    }

    public double getPerimetr(double length, double width) {
        int coef = 2;
        return (coef * (length + width));
    }
}