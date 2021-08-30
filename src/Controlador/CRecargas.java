package Controlador;

import DAO.InterDAO;
import DAO.modelDAO;
import Modelo.MRecargas;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CRecargas {
    private InterDAO recargas;
    public CRecargas(){
        recargas = new modelDAO();
    }
    public boolean Insertar(MRecargas recarga, String plataforma){
        return recargas.insertar(recarga, plataforma);
    }
    public boolean Actualizar(MRecargas actRecarga,String plataforma){
        return recargas.actualizar(actRecarga, plataforma);
    }
    public boolean Eliminar(Date fecha, String servicio){
        return recargas.eliminar(fecha, servicio);
    }
    public MRecargas Consultar(Date fecha,String plataforma){
        return recargas.consultar(fecha, plataforma);
    }
    public List<MRecargas> ConsultarRango(Date fechaInicial,Date fechaFinal,String plataforma){
        return recargas.consultarRango(fechaInicial, fechaFinal, plataforma);
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
}
