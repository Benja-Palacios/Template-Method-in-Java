//Subclase concreta para la marca Honda
public class MantenimientoHonda extends MantenimientoMoto{

    public MantenimientoHonda(String modelo) {
        super(modelo);
    }
    @Override
    protected void cambiarAceite() {
        System.out.println("4. Cambiar aceite según el procedimiento de Honda para el modelo " + getModelo() + ".");
        System.out.println("   a. Drenar el aceite viejo.\n");
        System.out.println("   b. Cambiar el filtro de aceite.\n");
        System.out.println("   c. Llenar con nuevo aceite recomendado por Honda.\n");
        System.out.println("   d. Verificar el nivel de aceite.\n");
    }
}
