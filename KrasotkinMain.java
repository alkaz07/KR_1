import java.util.Scanner;

public class KrasotkinMain {
    void main(){
        Rectangle r1 = new Rectangle(),
                r2 = new Rectangle();
        r1.length = inputValue("Введите длину первого прямоугольника");
        r1.width = inputValue("Введите ширину первого прямоугольника");
        r2.length = inputValue("Введите длину второго прямоугольника");
        r2.width = inputValue("Введите ширину второго прямоугольника");

        int sumArea = r1.areaRect() + r2.areaRect() ;

        Rectangle []rect = new Rectangle[3];
        // второе задание
        for (int i = 0; i < 3; i++) {
            rect[i]= new Rectangle();
            rect[i].length = inputValue("Введите длину " + i +" прямоугольника");
            rect[i].width = inputValue("Введите ширину "+ i + " прямоугольника");
        }
        // Если все периметры равны, вывести "все периметры равны"
        if ((rect[0].perimetrRect() == rect[1].perimetrRect()) && (rect[1].perimetrRect() ==rect[2].perimetrRect()))
            IO.println("все периметры равны");
        // Если любые 2 периметра равны, вывести "два периметра равны"
        else if ((rect[0].perimetrRect() == rect[1].perimetrRect())
                    || (rect[0].perimetrRect() ==rect[2].perimetrRect())
                    || (rect[1].perimetrRect() == rect[2].perimetrRect())
                )
            IO.println("два периметра равны");
        //Если все периметры разные вывести "периметры разные"
        else if ((rect[0].perimetrRect() != rect[1].perimetrRect())
                && (rect[0].perimetrRect() !=rect[2].perimetrRect())
                && (rect[1].perimetrRect() !=rect[2].perimetrRect())
        )
            IO.println("периметры разные");

        Rectangle []rectFive = new Rectangle[5];
        // второе задание
        for (int i = 0; i < 5; i++) {
            rect[i]= new Rectangle();
            rectFive[i].length = inputValue("Введите длину " + i +" прямоугольника");
            rectFive[i].width = inputValue("Введите ширину "+ i + " прямоугольника");
        }
        int areaR = 0;      // площадь прямоугольников
        for (int i = 0; i < 5; i++) {
            areaR += rectFive[i].areaRect();
        }
        IO.println("Средняя площадь 5 прямоугольников: " + (areaR/5));

    }
    static int inputValue(String text) {
        Scanner sc = new Scanner(System.in);
        IO.println(text);
        return sc.nextInt();
    }
    private static class Rectangle{
        int length, width;

        int areaRect() {
            return length * width;
        }
        int perimetrRect(){
            return 2* (length + width);
        }
    }

}
