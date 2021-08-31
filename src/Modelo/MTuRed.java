/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CTuRed;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Steve
 */
public class MTuRed extends MRecargas{
    public MTuRed(){
        super();
    }
    public MTuRed(List<Long> datos,Date fecha){
        super(datos,fecha);
    }
    public void calcular(){
        String plataforma = "tuRed";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        Date yesterday = new Date(getFecha().getTime() - (1000 * 60 * 60 * 24));
        MTuRed anterior = new CTuRed().Consultar(yesterday);
        setDebe((long) (getPagado() + (new CTuRed().getPorcentaje(plataforma)*getPagado()) - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo());
        setGanancias((long) (new CTuRed().getPorcentaje(plataforma)*getRecargado()));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro());
        setSugerencia((long) ((new CTuRed().getTope(plataforma)-getSaldo()-getDebe())/(1+new CTuRed().getPorcentaje(plataforma))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CTuRed().setTope(getFecha(), plataforma, new CTuRed().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CTuRed().setTope(getFecha(), plataforma, new CTuRed().getTope(plataforma)-getRetiro());
        }
    }
    public void calcular(MTuRed anterior){
        String plataforma = "tuRed";
        if(getFecha()==null){
            setFecha(new Date(Calendar.getInstance().getTime().getTime()));
        }
        setDebe((long) (getPagado() + (new CTuRed().getPorcentaje(plataforma)*getPagado()) - getRecargado() + anterior.getDebe()));
        setSaldo(getRecargado() - getVentas() + anterior.getSaldo());
        setGanancias((long) (new CTuRed().getPorcentaje(plataforma)*getRecargado()));
        setCaja(getVentas()-getPagado()+anterior.getCaja()-getRetiro());
        setSugerencia((long) ((new CTuRed().getTope(plataforma)-getSaldo()-getDebe())/(1+new CTuRed().getPorcentaje(plataforma))));
        if(getRetiro()>getCaja()-getSugerencia() && getRetiro()!=0){
            new CTuRed().setTope(getFecha(), plataforma, new CTuRed().getTope(plataforma)+getCaja()-getSugerencia()-getRetiro());
        }
        else if(getRetiro()<0){
            new CTuRed().setTope(getFecha(), plataforma, new CTuRed().getTope(plataforma)-getRetiro());
        }
    }
}
