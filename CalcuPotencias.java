public class CalcuPotencias {
    public static double calcular(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcular(base, exponente - 1);
 }
}
}