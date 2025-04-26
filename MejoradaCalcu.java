import java.util.Scanner;
import java.util.ArrayList;

public class MejoradaCalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            try {
                int figura, calculo;
                double total = 0;

                System.out.println("Selecciona la figura para calcular su area o perimetro:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Potencia");
                System.out.println("7. Salir");
                figura = scanner.nextInt();

                if (figura == 7) {
                    continuar = false;
                    break;
                }

                if (figura != 6) {
                    System.out.println("Elige que deseas calcular:");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    calculo = scanner.nextInt();
                } else {
                    calculo = 3;
                }

                switch (figura) {
                    case 1:
                        System.out.println("Introduce el radio: (USA COMA COMO SEPARADOR DECIMAL)");
                        double radio = scanner.nextDouble();
                        total = (calculo == 1) ? CalcuAreas.circulo(radio) : CalcuPerimetros.circulo(radio);
                        break;

                    case 2:
                        System.out.println("Introduce el tamaño del lado: (USA COMA COMO SEPARADOR DECIMAL)");
                        double lado = scanner.nextDouble();
                        total = (calculo == 1) ? CalcuAreas.cuadrado(lado) : CalcuPerimetros.cuadrado(lado);
                        break;

                    case 3:
                        System.out.println("Introduce la base: (USA COMA COMO SEPARADOR DECIMAL)");
                        double base = scanner.nextDouble();
                        System.out.println("Introduce la altura: (USA COMA COMO SEPARADOR DECIMAL)");
                        double altura = scanner.nextDouble();
                        total = (calculo == 1) ? CalcuAreas.triangulo(base, altura) : CalcuPerimetros.triangulo(base);
                        break;

                    case 4:
                        System.out.println("Introduce la base: (USA COMA COMO SEPARADOR DECIMAL)");
                        double baseR = scanner.nextDouble();
                        System.out.println("Introduce la altura: (USA COMA COMO SEPARADOR DECIMAL)");
                        double alturaRec = scanner.nextDouble();
                        total = (calculo == 1) ? CalcuAreas.rectangulo(baseR, alturaRec) : CalcuPerimetros.rectangulo(baseR, alturaRec);
                        break;

                    case 5:
                        System.out.println("Introduce el tamaño del lado:");
                        double ladoPen = scanner.nextDouble();
                        System.out.println("Introduce el radio interno:");
                        double radioPen = scanner.nextDouble();
                        total = (calculo == 1) ? CalcuAreas.pentagono(ladoPen, radioPen) : CalcuPerimetros.pentagono(ladoPen);
                        break;

                    case 6:
                        System.out.println("Introduce la base:");
                        double basePot = scanner.nextDouble();
                        System.out.println("Introduce el exponente:");
                        int exponente = scanner.nextInt();
                        total = CalcuPotencias.calcular(basePot, exponente);
                        break;

                    default:
                        System.out.println("Opcion no valida, intenta de nuevo");
                        continue;
                }

                resultados.add(total);
                System.out.println("El resultado es: " + total);
                System.out.println("Quieres hacer otro calculo (si/no) Si escoges que no, se mostraran los resultados anteriores:");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("no")) {
                    continuar = false;
                }

            } catch (Exception e) {
                System.out.println("Error, por favor introduce un valor valido.");
                scanner.nextLine();
            }
        }

        System.out.println("Resultados anteriores:");
        for (Double resultado : resultados) {
            System.out.println(resultado);
        }
        scanner.close();
    }
}