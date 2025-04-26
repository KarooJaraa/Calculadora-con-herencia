public class CalcuAreas {
    public static double circulo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double cuadrado(double lado) {
        return lado * lado;
    }

    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double rectangulo(double base, double altura) {
        return base * altura;
    }

    public static double pentagono(double lado, double apotema) {
        return (5 * lado * apotema)/2;
}
}