package Modelo;

import Controlador.CLlave;
import Controlador.CSoluciones;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Steve
 */
public class MTuLlave {
    private Date fecha;
    private long recargas;
    private long ventas;
    private long saldo;
    private long caja;
    public MTuLlave(List<Long> datos,Date fecha){
        this.fecha = fecha;
        recargas = datos.get(1);
        ventas = datos.get(2);
        saldo = datos.get(3);
        caja = datos.get(4);
    }
    public MTuLlave(){
        fecha = null;
        recargas=0;
        ventas=0;
        saldo=0;
        caja=0;
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
    public long getCaja() {
        return caja;
    }
    public void setCaja(long caja) {
        this.caja = caja;
    }
    public void calcular(){
        if(fecha == null){
            fecha = new Date(Calendar.getInstance().getTime().getTime());
        }
        Date yesterday = new Date(fecha.getTime() - (1000 * 60 * 60 * 24));
        MTuLlave anterior = new CLlave().Consultar(yesterday);
        saldo = anterior.getSaldo()+recargas-ventas;
        caja = anterior.getCaja()+ventas-recargas;
    }
    public void calcular(MTuLlave anterior){
        if(anterior!=null){
            if(fecha == null){
                fecha = new Date(Calendar.getInstance().getTime().getTime());
            }
            saldo = anterior.getSaldo()+recargas-ventas;
            caja = anterior.getCaja()+ventas-recargas;
        }
    }
    public boolean recargar(Date fecha,long recarga){
        if(fecha==null){
            return false;
        }
        else{
            MTuLlave llave = new CLlave().Consultar(fecha);
            MSoluciones solu = new CSoluciones().Consultar(fecha);
            if(recarga<0){
                new CLlave().setTope(fecha, new CLlave().getTope()-recarga);
                llave.setCaja(llave.getCaja()+llave.getRecargas());
                boolean reca = new CLlave().Actualizar(llave);
                return reca;
            }
            else if(recarga <= solu.getSaldo()){
                solu.setSaldo(solu.getSaldo()-recarga);
                solu.setGanancias((long) (solu.getGanancias()+recarga*new CLlave().getPorcentaje()));
                llave.setRecargas(llave.getRecargas()+recarga);
                llave.setSaldo(llave.getRecargas()+llave.getSaldo());
                if(llave.getCaja()-llave.getRecargas()>=0){
                    llave.setCaja(llave.getCaja()-llave.getRecargas());
                }
                else{
                    llave.setCaja(0);
                    new CLlave().setTope(fecha, new CLlave().getTope()-llave.getCaja()+llave.getRecargas());
                }
                solu.setCaja(solu.getCaja()+recarga);
                boolean reca = new CLlave().Actualizar(llave);
                boolean reca2 = new CSoluciones().Actualizar(solu);
                reca = reca && reca2;
                return reca;
            }
            else{
                return false;
            }
        }
    }
}
