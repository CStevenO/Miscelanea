/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CTigo;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Steve
 */
public class MTigo extends MRecargas{
    private long gananciasSim;
    public MTigo(){
        super();
        gananciasSim = 0;
    }
    public MTigo(List<Long> datos,Date fecha){
        super(datos,fecha);
        gananciasSim = datos.get(10);
    }
    public void calcular(){
        String plataforma = "tigo";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        Date yesterday = new Date(getFecha().getTime() - (1000 * 60 * 60 * 24));
        MTigo anterior = new CTigo().Consultar(yesterday);
        setDebe((long) (getPagado() + (new CTigo().getPorcentaje(plataforma)*getPagado()) - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo()+getGananciasSim());
        setGanancias((long) (new CTigo().getPorcentaje(plataforma)*getRecargado()));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro());
        setSugerencia((long) ((new CTigo().getTope(plataforma)-getSaldo()-getDebe())/(1+new CTigo().getPorcentaje(plataforma))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CTigo().setTope(getFecha(), plataforma, new CTigo().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CTigo().setTope(getFecha(), plataforma, new CTigo().getTope(plataforma)-getRetiro());
        }
    }
    public void calcular(MTigo anterior){
        String plataforma = "tigo";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        setDebe((long) (getPagado() + (new CTigo().getPorcentaje(plataforma)*getPagado()) - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo()+getGananciasSim());
        setGanancias((long) (new CTigo().getPorcentaje(plataforma)*getRecargado()));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro());
        setSugerencia((long) ((new CTigo().getTope(plataforma)-getSaldo()-getDebe())/(1+new CTigo().getPorcentaje(plataforma))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CTigo().setTope(getFecha(), plataforma, new CTigo().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CTigo().setTope(getFecha(), plataforma, new CTigo().getTope(plataforma)-getRetiro());
        }
    }

    public long getGananciasSim() {
        return gananciasSim;
    }

    public void setGananciasSim(long gananciasSim) {
        this.gananciasSim = gananciasSim;
    }
}
