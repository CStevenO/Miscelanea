package Modelo;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class MRecargas {
    private Date fecha;
    private long pagado;
    private long recargado;
    private long debe;
    private long ventas;
    private long saldo;
    private long ganancias;
    private long caja;
    private long sugerencia;
    private long retiro;
    public MRecargas(List<Long> datos,Date fecha){
        this.fecha = fecha;
        pagado = datos.get(1);
        recargado = datos.get(2);
        debe = datos.get(3);
        ventas = datos.get(4);
        saldo = datos.get(5);
        ganancias = datos.get(6);
        caja = datos.get(7);
        sugerencia = datos.get(8);
        retiro = datos.get(9);
    }
    public MRecargas(){
        fecha = null;
        pagado=0;
        recargado=0;
        debe=0;
        ventas=0;
        saldo=0;
        ganancias=0;
        caja=0;
        sugerencia=0;
        retiro=0;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public long getPagado() {
        return pagado;
    }
    public void setPagado(long pagado) {
        this.pagado = pagado;
    }
    public long getRecargado() {
        return recargado;
    }
    public void setRecargado(long recargado) {
        this.recargado = recargado;
    }
    public long getDebe() {
        return debe;
    }
    public void setDebe(long debe) {
        this.debe = debe;
    }
    public long getVentas() {
        return ventas;
    }
    public void setVentas(long ventas) {
        this.ventas = ventas;
    }
    public long getSaldo() {
        return saldo;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public long getGanancias() {
        return ganancias;
    }
    public void setGanancias(long ganancias) {
        this.ganancias = ganancias;
    }
    public long getCaja() {
        return caja;
    }
    public void setCaja(long caja) {
        this.caja = caja;
    }
    public long getSugerencia() {
        return sugerencia;
    }
    public void setSugerencia(long sugerencia) {
        this.sugerencia = sugerencia;
    }
    public long getRetiro() {
        return retiro;
    }
    public void setRetiro(long retiro) {
        this.retiro = retiro;
    }
}
