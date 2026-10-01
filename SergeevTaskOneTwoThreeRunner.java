package weekone.daythree.taskOneTwoThree;

//1. Запросить у пользователя параметры (длину и ширину) ДВУХ Прямоугольников. Вывести сумму площадей этих фигур.
//
//2. Запросить у пользователя параметры (длину и ширину) ТРЕХ Прямоугольников,сравнить их периметры.
//Если все периметры равны, вывести "все периметры равны"
//Если любые 2 периметра равны, вывести "два периметра равны"
//Если все периметры разные вывести "периметры разные"
//
//
//3. Запросить у пользователя параметры (длину и ширину) 5 Прямоугольников
//Вычислить и вывести среднюю площадь.

public class SergeevTaskOneTwoThreeRunner {
    static void main() {
        Rectangle[] twoRectangles = getArrayRectangles(2);
        System.out.println("Сумма площадей прямоугольников = " + sumAreaRectangles(twoRectangles));

        Rectangle[] threeRectangles = getArrayRectangles(3);
        matchingRectanglesThreePerimeter(threeRectangles);

        Rectangle[] fiveRectangles = getArrayRectangles(5);
        System.out.println("Среднее значение площади = " + averageRectanglesArea(fiveRectangles));

    }

    public static Rectangle[] getArrayRectangles(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Число прямоугольников должно быть БОЛЬШЕ 0!");
        }

        Rectangle[] rectangles = new Rectangle[num];

        for (int i = 0; i < num; i++) {
            rectangles[i] = addRectangle();
        }

        return rectangles;
    }

    public static Rectangle addRectangle() {
        System.out.println("ВВедите длину и ширину прямоугольника: ");
        double length = Double.parseDouble(IO.readln("Длина: "));
        double width = Double.parseDouble(IO.readln("Ширина: "));

        return new Rectangle(length, width);
    }

    public static double sumAreaRectangles(Rectangle[] rectangles) {
        double sum = 0;

        for (int i = 0; i < rectangles.length; i++) {
            sum = sum + rectangles[i].getArea();
        }

        return sum;
    }

    public static void matchingRectanglesThreePerimeter(Rectangle[] rectangles) {
        double[] perimetrs = new double[rectangles.length];

        for (int i = 0; i < rectangles.length; i++) {
            perimetrs[i] = rectangles[i].getPerimeter();
        }

        System.out.println("Периметры: " + perimetrs[0] + ", " + perimetrs[1] + ", " + perimetrs[2]);

        if (perimetrs[0] == perimetrs[1] && perimetrs[1] == perimetrs[2]) {
            System.out.println("все периметры равны");
        } else if (perimetrs[0] != perimetrs[1] &&
                perimetrs[1] != perimetrs[2] &&
                perimetrs[2] != perimetrs[3]) {
            System.out.println("периметры разные");
        } else {
            System.out.println("два периметра равны");
        }
    }

    public static double averageRectanglesArea(Rectangle[] rectangles) {
        double areas = 0;

        for (int i = 0; i < rectangles.length; i++) {
            areas = areas + rectangles[i].getArea();
        }

        return areas / rectangles.length;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Стороны должны быть больше 0!");
        }

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

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        final int coef = 2;
        return (coef * (length + width));
    }
}