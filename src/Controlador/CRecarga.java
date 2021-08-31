/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.InterDAO;
import DAO.modelDAO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 * @param <T>
 */
public abstract class CRecarga<T> {
    InterDAO recargas;
    public CRecarga(){
        recargas = new modelDAO();
    }
    public boolean Eliminar(Date fecha, String servicio){
        return recargas.eliminar(fecha, servicio);
    }
    public List<String> Columnas(String plataforma){
        return recargas.columnas(plataforma);
    }
    public List<Long> total(Date fechaInicial,Date fechaFinal,String plataforma){
        return recargas.total(fechaInicial, fechaFinal, plataforma);
    }
    public long getTope(String plataforma){
        return recargas.getTope(plataforma);
    }
    public float getPorcentaje(String plataforma){
        return recargas.getPorcentaje(plataforma);
    }
    public boolean setTope(Date fecha,String plataforma,long tope){
        return recargas.setTope(fecha, plataforma, tope);
    }
    public boolean setPorcentaje(Date fecha,String plataforma,float porcentaje){
        return recargas.setPorcentaje(fecha, plataforma, porcentaje);
    }
    public abstract boolean Insertar(T recarga);
    public abstract boolean Actualizar(T actRecarga);
    public abstract T Consultar(Date fecha);
    public abstract List<T> ConsultarRango(Date fechaInicial,Date fechaFinal);
}
