public class Triangulo {
    public double sideA;
    public double sideB;
    public double sideC;

    public double calcularArea() {
        double area = (sideA + sideB + sideC) /2;
        return Math.sqrt(area * (area - sideA) * (area - sideB) * (area - sideC));
    }

}
