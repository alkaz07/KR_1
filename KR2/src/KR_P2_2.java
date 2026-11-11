import java.util.Arrays;
import java.util.Scanner;

public class KR_P2_2 {
    public static void main (String[] arg) {
        double [] massivMass= new double[3];
        double [] massivVlt = new double [3];
        double [] massivP = new double [3];
        int i;
        for (i=0; i<3; i++) {
                massivMass[i]=inputMass(i);
                massivVlt[i]=inputVlt(i);
                massivP[i]=massivMass[i]/massivVlt[i];
              }
        System.out.println("Данные по массе");
        System.out.println(Arrays.toString(massivMass));
        System.out.println("Данные по объему");
        System.out.println(Arrays.toString(massivVlt));
        System.out.println("Данные по плотности");
        System.out.println(Arrays.toString(massivP));
        if ((massivP[0] == massivP[1]) && (massivP[0]==massivP[2])) {
            System.out.println("Плотности равны"); } else {
        if ((massivP[0] == massivP[1]) || (massivP[0]==massivP[2]) || (massivP[1]==massivP[2])) {
            System.out.println("Две Плотности равны"); } else {
            System.out.println("Все плотности разные");}
        }

    }

    private static double inputVlt(int i) {
        System.out.println("Введите объем:"+i);
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        return n;
    }

    private static double inputMass(int i) {
        System.out.println("Введите массу:"+i);
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        return n;
    }
}
