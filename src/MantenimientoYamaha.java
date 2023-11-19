public class MantenimientoYamaha extends MantenimientoMoto{
    public MantenimientoYamaha(String modelo) {
        super(modelo);
    }
    @Override
    protected void cambiarAceite() {
        System.out.println("4. Cambiar aceite según el procedimiento de Yamaha para el modelo " + getModelo() + ".");
        System.out.println("   a. Vaciar el aceite usado cuidadosamente.\n");
        System.out.println("   b. Sustituir el cartucho del filtro de aceite.\n");
        System.out.println("   c. Utilizar aceite de motor sintético Yamaha de grado recomendado.\n");
        System.out.println("   d. Verificar y ajustar el nivel de aceite.\n");
    }
}
