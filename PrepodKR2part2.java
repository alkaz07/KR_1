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
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите длину и ширину 1 прямоугольника");
        int width1 = scan.nextInt();
        int height1 = scan.nextInt();

        System.out.println("Введите длину и ширину 2 прямоугольника");
        int width2 = scan.nextInt();
        int height2 = scan.nextInt();
        
        int area1 = width1*height1;
        int area2 = width2*height2;
        int sumArea = area1+area2;
        System.out.println("sumArea = " + sumArea);
    }
    
    private static void task3() {
    }

    private static void task2() {
    }
}
