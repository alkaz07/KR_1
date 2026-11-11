import java.util.Arrays;
import java.util.Scanner;

class Body {
    private double volume;
    private double mass;

    public Body(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

    public static Body scanBody() {
        Scanner scanner = new Scanner(System.in);
        double mass = scanner.nextDouble();
        double volume = scanner.nextDouble();
        return new Body(mass, volume);
    }

    double getDensity() {
        return  this.mass / this.volume;
    }

    boolean isEqualDensity(Body other) {
        return Math.abs(this.getDensity() - other.getDensity()) <= 1E-9;
    }

    public static  double getAverageDensity(Body[] bodies) {
        double volumes = Arrays.stream(bodies).map(body-> body.volume).reduce(0.0, Double::sum);
        double totalMass = Arrays.stream(bodies).map(body -> body.mass).reduce(0.0, Double::sum);
        return totalMass / volumes;
    }
}

public class KR_1_2_Smirnov {

    void main() {
        this.task1();
//        this.task2();
//        this.task3();
    }

    void task1() {
        Body geo1 = Body.scanBody();
        Body geo2 = Body.scanBody();

        double maxDensity = Math.max(geo1.getDensity(), geo2.getDensity());
        System.out.println("max plotnost " + maxDensity);
    }

    void task2() {
        Body geo1 = Body.scanBody();
        Body geo2 = Body.scanBody();
        Body geo3 = Body.scanBody();

        if (geo1.isEqualDensity(geo2) && geo1.isEqualDensity(geo3)) {
            System.out.println("все плотности равны");
        } else if (geo1.isEqualDensity(geo2) || geo1.isEqualDensity(geo3) || geo2.isEqualDensity(geo3)) {
            System.out.println("двe плотности равны");
        } else {
            System.out.println("плотности разные");
        }
    }

    void task3() {
        Body[] bodies = new Body[5];
        for (int i = 0; i < 5; i++) {
            bodies[i] = Body.scanBody();
        }

        System.out.println("avg density " + Body.getAverageDensity(bodies));
    }
}
