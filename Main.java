public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Juan Perez", 2000.0, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}