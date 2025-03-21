package SistCostos;

public class Bebida {
    private String nombre;
    private int costo;

    public Bebida(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    int getCosto() {
        return costo;
    }

}
