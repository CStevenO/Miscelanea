package Modelo;

import Controlador.CNequi;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author Steve
 */
public class MNequi {
    private Date fecha;
    private long recargas;
    private long retiros;
    private long ganancias;
    private long caja;
    private long saldo;
    private long ingreso;
    private long egreso;
    public MNequi(List<Long> datos,Date fecha){
        this.fecha = fecha;
        recargas = datos.get(1);
        retiros = datos.get(2);
        ganancias = datos.get(3);
        caja = datos.get(4);
        saldo = datos.get(5);
        ingreso = datos.get(6);
        egreso = datos.get(7);
    }
    public MNequi(){
        fecha = null;
        recargas=0;
        retiros=0;
        ganancias=0;
        caja=0;
        saldo=0;
        ingreso=0;
        egreso=0;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public long getRecargas() {
        return recargas;
    }
    public void setRecargas(long recargas) {
        this.recargas = recargas;
    }
    public long getRetiros() {
        return retiros;
    }
    public void setRetiros(long retiros) {
        this.retiros = retiros;
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
    public long getSaldo() {
        return saldo;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public long getIngreso() {
        return ingreso;
    }
    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }
    public long getEgreso() {
        return egreso;
    }
    public void setEgreso(long egreso) {
        this.egreso = egreso;
    }
    public void calcular(){
        if(fecha==null){
            fecha = new Date(Calendar.getInstance().getTime().getTime());
        }
        Date yesterday = new Date(fecha.getTime() - (1000 * 60 * 60 * 24));
        MNequi anterior = new CNequi().Consultar(yesterday);
        saldo = recargas - retiros + anterior.getSaldo();
        caja = anterior.getCaja()+retiros-recargas+ingreso-egreso;
        if(ingreso>0){
            new CNequi().setTope(fecha, new CNequi().getTope()+ingreso);
        }
        if(egreso>0){
            new CNequi().setTope(fecha, new CNequi().getTope()-egreso);
        }
    }
    public void calcular(MNequi anterior){
        if(fecha==null){
            fecha = new Date(Calendar.getInstance().getTime().getTime());
        }
        saldo = recargas - retiros + anterior.getSaldo();
        caja = anterior.getCaja()+retiros-recargas+ingreso-egreso;
        if(ingreso>0){
            new CNequi().setTope(fecha, new CNequi().getTope()+ingreso);
        }
        if(egreso>0){
            new CNequi().setTope(fecha, new CNequi().getTope()-egreso);
        }
    }
}
