public class Gasto extends Dinero{
    private static int counter = 1; // Inicializa el contador en 1

    public Gasto(double gasto, String descripcion){
        this.dinero=gasto;
        this.descripcion=descripcion;
        this.id =counter++; // Asigna un ID único y luego incrementa el contador
    }


    public String toString() {
        return "ID: "+getId() + "| Gasto: " + descripcion + "| cantidad: " + dinero +"$ARS";
    }

}