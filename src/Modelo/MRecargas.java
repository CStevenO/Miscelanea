package Modelo;

import Controlador.CLlave;
import Controlador.CRecargas;
import java.sql.Date;
import java.util.Calendar;
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
    public void calcular(String plataforma){
        if(!plataforma.isEmpty()){
            if(fecha==null){
                fecha = new Date(Calendar.getInstance().getTime().getTime());
            }
            Date yesterday = new Date(fecha.getTime() - (1000 * 60 * 60 * 24));
            MRecargas anterior = new CRecargas().Consultar(yesterday,plataforma);
            switch(plataforma){
                case "soluciones":
                    debe = (long) (pagado  - recargado + anterior.getDebe());
                    saldo = recargado - ventas + anterior.getSaldo()-new CLlave().Consultar(fecha).getRecargas();
                    ganancias = (long) ((new CRecargas().getPorcentaje(plataforma)*ventas)+anterior.getGanancias()+(new CLlave().getPorcentaje()*new CLlave().Consultar(fecha).getRecargas()));
                    caja = ventas-pagado+anterior.getCaja()-retiro+new CLlave().Consultar(fecha).getRecargas();
                    sugerencia = (long) (((new CRecargas().getTope(plataforma)-saldo-debe)/(1+new CRecargas().getPorcentaje(plataforma)))+((new CLlave().getTope()-new CLlave().Consultar(fecha).getSaldo())/(1+new CLlave().getPorcentaje())));
                break;
                default:
                    debe = (long) (pagado + (new CRecargas().getPorcentaje(plataforma)*pagado) - recargado + anterior.getDebe());
                    saldo = recargado - ventas + anterior.getSaldo();
                    ganancias = (long) (new CRecargas().getPorcentaje(plataforma)*recargado);
                    caja = ventas-pagado+anterior.getCaja()-retiro;
                    sugerencia = (long) ((new CRecargas().getTope(plataforma)-saldo-debe)/(1+new CRecargas().getPorcentaje(plataforma)));
            }
            System.out.println(1+new CRecargas().getPorcentaje(plataforma));
            if(retiro>caja-sugerencia && retiro!=0){
                new CRecargas().setTope(fecha, plataforma, new CRecargas().getTope(plataforma)+caja-sugerencia-retiro);
            }
            else if(retiro<0){
                new CRecargas().setTope(fecha, plataforma, new CRecargas().getTope(plataforma)-retiro);
            }
        }
    }
    public void calcular(String plataforma,MRecargas anterior){
        if(!plataforma.isEmpty()){
            if(fecha==null){
                fecha = new Date(Calendar.getInstance().getTime().getTime());
            }
            switch(plataforma){
                case "soluciones":
                    debe = (long) (pagado  - recargado + anterior.getDebe());
                    saldo = recargado - ventas + anterior.getSaldo()-new CLlave().Consultar(fecha).getRecargas();
                    ganancias = (long) ((new CRecargas().getPorcentaje(plataforma)*ventas)+anterior.getGanancias()+(new CLlave().getPorcentaje()*new CLlave().Consultar(fecha).getRecargas()));
                    caja = ventas-pagado+anterior.getCaja()-retiro+new CLlave().Consultar(fecha).getRecargas();
                    sugerencia = (long) (((new CRecargas().getTope(plataforma)-saldo-debe)/(1+new CRecargas().getPorcentaje(plataforma)))+((new CLlave().getTope()-new CLlave().Consultar(fecha).getSaldo())/(1+new CLlave().getPorcentaje())));
                break;
                default:
                    debe = (long) (pagado + (new CRecargas().getPorcentaje(plataforma)*pagado) - recargado + anterior.getDebe());
                    saldo = recargado - ventas + anterior.getSaldo();
                    ganancias = (long) (new CRecargas().getPorcentaje(plataforma)*recargado);
                    caja = ventas-pagado+anterior.getCaja()-retiro;
                    sugerencia = (long) ((new CRecargas().getTope(plataforma)-saldo-debe)/(1+new CRecargas().getPorcentaje(plataforma)));
            }
            System.out.println(1+new CRecargas().getPorcentaje(plataforma));
            if(retiro>caja-sugerencia && retiro!=0){
                new CRecargas().setTope(fecha, plataforma, new CRecargas().getTope(plataforma)+caja-sugerencia-retiro);
            }
            else if(retiro<0){
                new CRecargas().setTope(fecha, plataforma, new CRecargas().getTope(plataforma)-retiro);
            }
        }
    }
}
