package Controlador;

import DAO.InterDAO;
import DAO.modelDAO;
import Modelo.MTuLlave;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CLlave {
    private InterDAO llave;
    public CLlave(){
        llave = new modelDAO();
    }
    public boolean Insertar(MTuLlave intLlave){
        return llave.insertar(intLlave);
    }
    public boolean Actualizar(MTuLlave actLlave){
        return llave.actualizar(actLlave);
    }
    public boolean Eliminar(Date fecha){
        return llave.eliminar(fecha, "llave");
    }
    public MTuLlave Consultar(Date fecha){
        return llave.consultarT(fecha);
    }
    public List<MTuLlave> ConsultarRango(Date fechaInicial,Date fechaFinal){
        return llave.consultarRangoT(fechaInicial, fechaFinal);
    }
    public List<String> Columnas(){
        return llave.columnas("llave");
    }
    public List<Long> total(Date fechaInicial,Date fechaFinal){
        return llave.total(fechaInicial, fechaFinal, "llave");
    }
    public long getTope(){
        return llave.getTope("llave");
    }
    public float getPorcentaje(){
        return llave.getPorcentaje("llave");
    }
    public boolean setTope(Date fecha,long tope){
        return llave.setTope(fecha, "llave", tope);
    }
    public boolean setPorcentaje(Date fecha,float porcentaje){
        return llave.setPorcentaje(fecha, "llave", porcentaje);
    }
}
