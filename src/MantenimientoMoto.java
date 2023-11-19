//Clase base abstracta con el patrón Template Method
public abstract class MantenimientoMoto {
    private String modelo; //modelo de la moto
    //Constructor que recibe el modelo
    public MantenimientoMoto(String modelo){
        this.modelo = modelo;
    }
    //Metodo platilla con las tareas comunes
    public final void realizarMantenimiento(){
        verificarFrenos();
        inspeccionarLuces();
        revisarPresionNeumaticos();
        cambiarAceite();
    }
    //Metodos comunes a todas las motos
    private void verificarFrenos(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. Verificar Frenos.");
    }
    private void inspeccionarLuces(){
        System.out.println("2. Inspeccionar Luces.");
    }
    private void revisarPresionNeumaticos(){
        System.out.println("3. Revisar Preción de Neumaticos");
    }
    //Metodo abstracto que se implementara en las subclases
    protected abstract void cambiarAceite();

    //Obtener el modelo de la moto
    protected String getModelo(){
        return modelo;
    }

}
