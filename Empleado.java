public abstract class Empleado {
    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    // Método para cambio dinámico del patrón Strategy
    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    // Método abstracto que van a implementar las subclases
    public abstract void mostrarDetalle();
}