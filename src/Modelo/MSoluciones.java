/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class MSoluciones extends MRecargas{
    private long factura;
    private long gananciaFac;
    public MSoluciones(){
        super();
        factura= 0;
        gananciaFac = 0;
    }
    public MSoluciones(List<Long> datos,Date fecha){
        super(datos,fecha);
        factura = datos.get(10);
        gananciaFac = datos.get(11);
    }
    public void calcular(){
        String plataforma = "soluciones";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        Date yesterday = new Date(getFecha().getTime() - (1000 * 60 * 60 * 24));
        MSoluciones anterior = new CSoluciones().Consultar(yesterday);
        setDebe((long) (getPagado()  - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo()-new CLlave().Consultar(getFecha()).getRecargas()-factura);
        setGanancias((long) (gananciaFac + (new CSoluciones().getPorcentaje(plataforma)*getVentas())+anterior.getGanancias()+(new CLlave().getPorcentaje()*new CLlave().Consultar(getFecha()).getRecargas())));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro()+new CLlave().Consultar(getFecha()).getRecargas()+factura);
        setSugerencia((long) (((new CSoluciones().getTope(plataforma)-getSaldo()-getDebe())/(1+new CSoluciones().getPorcentaje(plataforma)))+((new CLlave().getTope()-new CLlave().Consultar(getFecha()).getSaldo())/(1+new CLlave().getPorcentaje()))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CSoluciones().setTope(getFecha(), plataforma, new CSoluciones().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CSoluciones().setTope(getFecha(), plataforma, new CSoluciones().getTope(plataforma)-getRetiro());
        }
    }
    public void calcular(MSoluciones anterior){
        String plataforma = "soluciones";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        setDebe((long) (getPagado()  - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo()-new CLlave().Consultar(getFecha()).getRecargas()-factura);
        setGanancias((long) (gananciaFac + (new CSoluciones().getPorcentaje(plataforma)*getVentas())+anterior.getGanancias()+(new CLlave().getPorcentaje()*new CLlave().Consultar(getFecha()).getRecargas())));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro()+new CLlave().Consultar(getFecha()).getRecargas()+factura);
        setSugerencia((long) (((new CSoluciones().getTope(plataforma)-getSaldo()-getDebe())/(1+new CSoluciones().getPorcentaje(plataforma)))+((new CLlave().getTope()-new CLlave().Consultar(getFecha()).getSaldo())/(1+new CLlave().getPorcentaje()))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CSoluciones().setTope(getFecha(), plataforma, new CSoluciones().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CSoluciones().setTope(getFecha(), plataforma, new CSoluciones().getTope(plataforma)-getRetiro());
        }
    }

    public long getFactura() {
        return factura;
    }

    public void setFactura(long factura) {
        this.factura = factura;
    }

    public long getGananciaFac() {
        return gananciaFac;
    }

    public void setGananciaFac(long gananciaFac) {
        this.gananciaFac = gananciaFac;
    }
}
