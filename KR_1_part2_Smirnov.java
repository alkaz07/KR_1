import java.util.Scanner;

class Body {
    double volume;
    double mass;

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
        Body geo1 = Body.scanBody();
        Body geo2 = Body.scanBody();
        Body geo3 = Body.scanBody();
        Body geo4 = Body.scanBody();
        Body geo5 = Body.scanBody();

        Body geoTotal = new Body(
                geo1.mass + geo2.mass + geo3.mass + geo4.mass + geo5.mass,
                geo1.volume + geo2.volume + geo3.volume + geo4.volume + geo5.volume
        );

        System.out.println("avg plotnost " + geoTotal.getDensity());
    }
}
