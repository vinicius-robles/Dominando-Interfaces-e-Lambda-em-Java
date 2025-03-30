package calcularAreaFiguraGeometrica;

import java.util.Scanner;
import java.util.Locale;


public class Main {

    private final static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();
            if (option == 1) {
                geometricForm = createSquare();
            } else if (option == 2) {
                geometricForm = createRectangle();
            } else if (option == 3) {
                geometricForm = createCircle();
            } else if (option == 4){
                break;
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println("O resultado do cálculo da área foi de: " + geometricForm.getArea());
        }

    }

    public static GeometricForm createSquare() {
        System.out.println("Informe o tamanho do lado do quadrado:");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    public static GeometricForm createRectangle() {
        System.out.println("Informe a altura do retângulo:");
        double height = scanner.nextDouble();
        System.out.println("Informe a largura do retângulo:");
        double width = scanner.nextDouble();
        return new Rectangle(height, width);
    }

    public static GeometricForm createCircle() {
        System.out.println("Informe o raio do cículo:");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}

