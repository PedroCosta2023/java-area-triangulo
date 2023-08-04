import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double aX, bX, cX, aY, bY, cY;

        Triangulo trianguloX, trianguloY;

        trianguloX = new Triangulo();
        trianguloY = new Triangulo();


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os os lados do triangulo x:");
        trianguloX.sideA = sc.nextDouble();
        trianguloX.sideB = sc.nextDouble();
        trianguloX.sideC = sc.nextDouble();

        System.out.println("Digite os os lados do triangulo y:");
        trianguloY.sideA = sc.nextDouble();
        trianguloY.sideB = sc.nextDouble();
        trianguloY.sideC = sc.nextDouble();

        double areaY = trianguloY.calcularArea();
        double areaX = trianguloX.calcularArea();

        System.out.printf("Tringulo x area: %.4f%n", areaX);
        System.out.printf("Tringulo y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O tringulo x tem area maior que y");
        } else {
            System.out.println("O tringulo y tem area maior que x");
        }

    }
}