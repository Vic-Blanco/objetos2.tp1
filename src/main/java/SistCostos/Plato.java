package SistCostos;

public class Plato {
    private String nombre;
    private int costo;

    public Plato(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;

    }

    int getCosto() {
        return costo;
    }

}
