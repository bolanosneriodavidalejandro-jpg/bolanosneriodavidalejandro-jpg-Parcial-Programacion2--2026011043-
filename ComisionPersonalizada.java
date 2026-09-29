public class ComisionPersonalizada implements EstrategiaComision {
    private final int N = 5; 

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + N) / 100.0;
        return montoVenta * porcentaje;
    }
}