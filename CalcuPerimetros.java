public class CalcuPerimetros {
    public static double circulo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double cuadrado(double lado) {
        return 4 * lado;
    }

    public static double triangulo(double lado) {
        return 3 * lado;
    }

    public static double rectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double pentagono(double lado) {
        return 5*lado;
}
}