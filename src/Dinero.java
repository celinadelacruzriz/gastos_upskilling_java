public abstract class Dinero {
    //Atributos
    protected double dinero;
    protected String descripcion;
    protected int id;



    //Getters y setters
    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero=dinero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public int getId() {
        return id;
    }
}
