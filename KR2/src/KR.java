import java.util.Scanner;

public class KR {
    public static void main (String[] arg) {
        float mass1, mass2, vlm1, vlm2;
        System.out.println("Введите массу1:");
        Scanner scanner1 = new Scanner(System.in);
        mass1 = scanner1.nextInt();
        System.out.println("Введите массу2:");
        Scanner scanner2 = new Scanner(System.in);
        mass2 = scanner2.nextInt();
        System.out.println("Введите объем1:");
        Scanner scanner3 = new Scanner(System.in);
        vlm1 = scanner3.nextInt();
        System.out.println("Введите объем2:");
        Scanner scanner4 = new Scanner(System.in);
        vlm2 = scanner4.nextInt();
        float p1, p2;
        if ((p1=mass1/vlm1) > (p2=mass2/vlm2)) {
            System.out.println("максимальная плотность p1="+p1);
        } else {
            if ((p1=mass1/vlm1) > (p2=mass2/vlm2)) {
                System.out.println("плотности p1 и p2 однинаковые");
            } else {System.out.println("максимальная плотность p2="+p2);}
        }

    }
}
