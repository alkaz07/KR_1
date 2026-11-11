import java.util.Scanner;

class GeometricObject {
    double volume;
    double mass;

    public  GeometricObject(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

    double getPlotnost() {
        return  this.mass / this.volume;
    }
}

public class KR_1_part2_Smirnov {

    void main() {
        this.task1();
//        this.task2();
//        this.task3();
    }

    void task1() {
        GeometricObject geo1 = this.scanVolumeAndMass();
        GeometricObject geo2 = this.scanVolumeAndMass();
        double plotnost1 = geo1.getPlotnost();
        double plotnost2 = geo2.getPlotnost();
        double maxPlotnost = Math.max(plotnost1, plotnost2);
        System.out.println("max plotnost " + maxPlotnost);
    }

    void task2() {
        GeometricObject geo1 = this.scanVolumeAndMass();
        GeometricObject geo2 = this.scanVolumeAndMass();
        GeometricObject geo3 = this.scanVolumeAndMass();

        double plotnost1 = geo1.getPlotnost();
        double plotnost2 = geo2.getPlotnost();
        double plotnost3 = geo3.getPlotnost();

        if (plotnost1 == plotnost2 && plotnost1 == plotnost3) {
            System.out.println("все плотности равны");
        } else if (plotnost1 == plotnost2 || plotnost1 == plotnost3 || plotnost2 == plotnost3) {
            System.out.println("двe плотности равны");
        } else {
            System.out.println("плотности разные");
        }
    }

    void task3() {
        GeometricObject geo1 = this.scanVolumeAndMass();
        GeometricObject geo2 = this.scanVolumeAndMass();
        GeometricObject geo3 = this.scanVolumeAndMass();
        GeometricObject geo4 = this.scanVolumeAndMass();
        GeometricObject geo5 = this.scanVolumeAndMass();

        GeometricObject geoTotal = new GeometricObject(
                geo1.mass + geo2.mass + geo3.mass + geo4.mass + geo5.mass,
                geo1.volume + geo2.volume + geo3.volume + geo4.volume + geo5.volume
        );

        System.out.println("avg plotnost " + geoTotal.getPlotnost());
    }

    GeometricObject scanVolumeAndMass() {
        Scanner scanner = new Scanner(System.in);
        double mass = scanner.nextDouble();
        double volume = scanner.nextDouble();
        return new GeometricObject(mass, volume);
    }
}
