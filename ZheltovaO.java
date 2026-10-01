public class ZheltovaO {

        static void main() {

//        1. Запросить у пользователя параметры (длину и ширину) ДВУХ Прямоугольников. Вывести сумму площадей этих фигур.
            int d1 = Integer.parseInt(IO.readln("Введите длину 1 прямоугольника "));
            int sh1 = Integer.parseInt(IO.readln("Введите ширину 1 прямоугольника "));
            int d2 = Integer.parseInt(IO.readln("Введите длину 2 прямоугольника "));
            int sh2 = Integer.parseInt(IO.readln("Введите ширину 2 прямоугольника "));

            int sum = d1 * sh1 + d2 * sh2;
            IO.println("Сумма площади двух фигур равна: " + sum);


            // 2. Запросить у пользователя параметры (длину и ширину) ТРЕХ Прямоугольников,сравнить их периметры.
            //Если все периметры равны, вывести "все периметры равны"
            //Если любые 2 периметра равны, вывести "два периметра равны"
            //Если все периметры разные вывести "периметры разные"

            int n = 2; // количество прямоугольников

            int[] dlina = new int[n];
            int[] shirina = new int[n];

            for (int i = 0; i < n; i++) {
                dlina[i] = Integer.parseInt(IO.readln("Введите длину " + (i + 1) + " прямоугольника "));
                shirina[i] = Integer.parseInt(IO.readln("Введите ширину " + (i + 1) + " прямоугольника "));
            }

            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += dlina[i] * shirina[i];
            }

            IO.println("Сумма площади двух фигур равна: " + sum2);


            // 3. Запросить у пользователя параметры (длину и ширину) 5 Прямоугольников
            //Вычислить и вывести среднюю площадь.

            int x = 5;
            int[] ploshchad = new int[x];
            int sum3 = 0;

            for (int i = 0; i < x; i++) {
                int d = Integer.parseInt(IO.readln("Введите длину " + (i + 1) + " прямоугольника "));
                int sh = Integer.parseInt(IO.readln("Введите ширину " + (i + 1) + " прямоугольника "));
                ploshchad[i] = d * sh;
                sum3 += ploshchad[i];
            }

            double srednyaya = (double) sum / x;
            IO.println("Средняя площадь равна: " + srednyaya);

        }
    }



