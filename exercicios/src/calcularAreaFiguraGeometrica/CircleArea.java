package calcularAreaFiguraGeometrica;

import java.util.Scanner;

public class CircleArea {

    static Scanner scanner = new Scanner(System.in);
    static double radius = scanner.nextDouble();

    static double pi = 3.14;

    public static void main(String[] args) {

        System.out.println(circleGetArea());

    }

    public static double circleGetArea() {
        return pi * (radius * radius);
    }
}
