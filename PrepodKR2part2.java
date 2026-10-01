import java.util.Scanner;

public class PrepodKR2part2 {
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
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        Rectangle rect1 = inputRectangle(1);
        Rectangle rect2 = inputRectangle(2);
        int sumArea = rect1.area() + rect2.area();
        System.out.println("sumArea = " + sumArea);
    }

    private static void task2() {
        Rectangle r1 = inputRectangle(1);
        Rectangle r2 = inputRectangle(2);
        Rectangle r3 = inputRectangle(3);

        if (r1.perimeter() == r2.perimeter() && r1.perimeter() == r3.perimeter()) {
            System.out.println("все периметры равны");
        }
        else if(r1.perimeter() == r2.perimeter() || r1.perimeter() == r3.perimeter() || r2.perimeter()==r3.perimeter()){
            System.out.println("два периметра равны");
        }
        else
            System.out.println("периметры разные");
    }

    private static void task3() {
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = inputRectangle(i);
        }
        
        double summArea = 0;
        for (int i = 0; i < rectangles.length; i++) {
            summArea += rectangles[i].area();
        }
        double avgArea = summArea / rectangles.length;

        System.out.println("avgArea = " + avgArea);
    }

    public static Rectangle inputRectangle(int n) {
        Scanner scan = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        System.out.println("Введите длину и ширину " + n + " прямоугольника");
        rect1.width = scan.nextInt();
        rect1.height = scan.nextInt();
        return rect1;
    }

}

class Rectangle {
    int width, height;
    int area() {        return width * height;    }
    int perimeter() {  return 2* (width+height);  }
}