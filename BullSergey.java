import java.math.BigDecimal;
import java.math.RoundingMode;

public class BullSergey {
    public static void main() {
        double [][] masInput = new double[5][3]; // значения от пользователя
        // 1-й пункт
        inputData(masInput,2 ); // ввод параметов 2х предметов
        densityData(masInput,2 ); // вычисляем плотность 2х предметов
        IO.println("Максимальная плотность из 2-х объектов: "+ Math.max(masInput[0][2],masInput[1][2]));
        // 2-й пункт
        inputData(masInput,3 ); // ввод параметов 3х предметов
        densityData(masInput,3 ); // вычисляем плотность 3х предметов
        if ((masInput[0][2] == masInput[1][2]) && (masInput[0][2] == masInput[2][2])) {
                IO.println("все плотности равны");
        } else if ((masInput[0][2] == masInput[1][2]) || (masInput[0][2] == masInput[2][2])) {
            IO.println("две плотности равны");
        } else {
            IO.println("плотности разные");
        }
        // 3-й пункт
        inputData(masInput,5 ); // ввод параметов 5х предметов
        densityData(masInput,5 ); // вычисляем плотность 5х предметов
        double sumDensity = 0;
        for (int i = 0; i < 5; i++) {
            sumDensity += masInput[i][2];
        }
        IO.println("Средняя плотность: " + (sumDensity / 5));

    }

    private static void densityData(double[][] masInput, int i) {
        for (int k = 0 ; k < i ; k++) {
            masInput[k][2] = masInput[k][0] / masInput[k][1] ; // вычисляем плотность и сохраняем в 3-й элемент строки.
            BigDecimal bd = new BigDecimal(masInput[k][2]).setScale(6, RoundingMode.HALF_UP);
            masInput[k][2] = bd.doubleValue(); // 0.122042
        }
    }

    private static void inputData(double[][] masInput, int i) {
        for (int k = 0 ; k < i ; k++) {
            IO.println(" Параметры "+(k+1)+"-го предметы");
            masInput[k][0] = Double.parseDouble(IO.readln("Масса : "));
            masInput[k][1] = Double.parseDouble(IO.readln("Объем : "));



        }
    }
}
