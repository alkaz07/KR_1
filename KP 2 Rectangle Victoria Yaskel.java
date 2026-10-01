package Practice5;
//1. Запросить у пользователя параметры (длину и ширину) ДВУХ Прямоугольников. Вывести сумму площадей этих фигур.
//2. Запросить у пользователя параметры (длину и ширину) ТРЕХ Прямоугольников,сравнить их периметры.
//Если все периметры равны, вывести "все периметры равны"
//Если любые 2 периметра равны, вывести "два периметра равны"
//Если все периметры разные вывести "периметры разные"
//3. Запросить у пользователя параметры (длину и ширину) 5 Прямоугольников
//Вычислить и вывести среднюю площадь.
public class Rectangle {

    private double length, width;

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

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public static Rectangle inputRectangle() {
        while (true) {
            double length = Double.parseDouble(IO.readln("Введите длину: "));
            double width = Double.parseDouble(IO.readln("Введите ширину: "));
            if (length > 0 && width > 0) {
                return new Rectangle(length, width);
            } else
                System.out.println("Отрицательные числа вводить нельзя");
        }
    }

    public double areaRectangle(){
        double area = length * width;
        return area;
    }

    public double perimeterRectangle(){
        double perimeter = 2*(length + width);
        return perimeter;
    }

    public static String comparePerimeters(Rectangle r1, Rectangle r2, Rectangle r3) {
        double p1 = r1.perimeterRectangle();
        double p2 = r2.perimeterRectangle();
        double p3 = r3.perimeterRectangle();

        if (p1 == p2 && p2 == p3) {
            return "Все периметры равны";
        } else if (p1 == p2 || p2 == p3 || p1 == p3) {
            return "Два периметра равны";
        } else {
            return "Периметры разные";
        }
    }

    public static double averageArea(Rectangle a1, Rectangle a2, Rectangle a3, Rectangle a4, Rectangle a5){
        double sum = a1.areaRectangle() + a2.areaRectangle() + a3.areaRectangle() + a4.areaRectangle() + a5.areaRectangle();
        return sum / 5;
    }

    public static void main(String[] args) {

        //1.Запросить у пользователя параметры (длину и ширину) ДВУХ Прямоугольников. Вывести сумму площадей этих фигур
        Rectangle r1 = inputRectangle();
        Rectangle r2 = inputRectangle();
        System.out.println("Прямоугольник 1 длина: " + r1.length + " ширина: " + r1.width);
        System.out.println("Прямоугольник 2 длина: " + r2.length + " ширина: " + r2.width);

        System.out.println("Площадь прямоугольника 1: " + r1.areaRectangle());
        System.out.println("Площадь прямоугольника 2: " + r2.areaRectangle());

        //2. Запросить у пользователя параметры (длину и ширину) ТРЕХ Прямоугольников,сравнить их периметры.
        //Если все периметры равны, вывести "все периметры равны"
        //Если любые 2 периметра равны, вывести "два периметра равны"
        //Если все периметры разные вывести "периметры разные"
        Rectangle r3 = inputRectangle();
        System.out.println("Прямоугольник 3 длина: " + r3.length + " ширина: " + r3.width);

        System.out.println("Периметр 1: " + r1.perimeterRectangle());
        System.out.println("Периметр 2: " + r2.perimeterRectangle());
        System.out.println("Периметр 3: " + r3.perimeterRectangle());
        System.out.println(comparePerimeters(r1, r2, r3));

        //3. Запросить у пользователя параметры (длину и ширину) 5 Прямоугольников
        //Вычислить и вывести среднюю площадь.
        Rectangle r4 = inputRectangle();
        Rectangle r5 = inputRectangle();

        System.out.println("Прямоугольник 4 длина: " + r4.length + " ширина: " + r4.width);
        System.out.println("Прямоугольник 5 длина: " + r5.length + " ширина: " + r5.width);
        System.out.println("Средняя площадь прямоугольников: " + averageArea(r1, r2, r3, r4, r5));

    }
}