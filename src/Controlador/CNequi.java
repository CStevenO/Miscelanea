package Controlador;

import DAO.InterDAO;
import DAO.modelDAO;
import Modelo.MNequi;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CNequi {
    private InterDAO nequi;
    public CNequi(){
        nequi = new modelDAO();
    }
    public boolean Insertar(MNequi intNequi){
        return nequi.insertar(intNequi);
    }
    public boolean Actualizar(MNequi actNequi){
        return nequi.actualizar(actNequi);
    }
    public boolean Eliminar(Date fecha){
        return nequi.eliminar(fecha, "nequi");
    }
    public MNequi Consultar(Date fecha){
        return nequi.consultarN(fecha);
    }
    public List<MNequi> ConsultarRango(Date fechaInicial,Date fechaFinal){
        return nequi.consultarRangoN(fechaInicial, fechaFinal);
    }
    public List<String> Columnas(){
        return nequi.columnas("nequi");
    }
    public List<Long> total(Date fechaInicial,Date fechaFinal){
        return nequi.total(fechaInicial, fechaFinal, "nequi");
    }
    public long getTope(){
        return nequi.getTope("nequi");
    }
    public float getPorcentaje(){
        return nequi.getPorcentaje("nequi");
    }
    public boolean setTope(Date fecha,long tope){
        return nequi.setTope(fecha, "nequi", tope);
    }
    public boolean setPorcentaje(Date fecha,float porcentaje){
        return nequi.setPorcentaje(fecha, "nequi", porcentaje);
    }
    public long mes(){
        return nequi.consultarMovimiento();
    }
    public boolean Actualizar(List<MNequi> todos) {
        if(todos!=null){
            for(MNequi red:todos){
                if(!Actualizar(red)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
