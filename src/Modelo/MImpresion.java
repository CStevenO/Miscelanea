package Modelo;

/**
 *
 * @author Steve
 */
public class MImpresion {
    private int cantidad;
    private long precio;
    private String tipo;
    public MImpresion(){
        cantidad = 0;
        precio = 0;
        tipo = null;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public long getPrecio() {
        return precio;
    }
    public void setPrecio(long precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
