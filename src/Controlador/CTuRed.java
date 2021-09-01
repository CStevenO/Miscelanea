package Controlador;


import Modelo.MTuRed;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CTuRed extends CRecarga<MTuRed>{
    @Override
    public boolean Insertar(MTuRed recarga) {
        return recargas.insertar(recarga);
    }
    @Override
    public boolean Actualizar(MTuRed actRecarga) {
        return recargas.actualizar(actRecarga);
    }
    @Override
    public MTuRed Consultar(Date fecha) {
        return recargas.consultarR(fecha);
    }
    @Override
    public List<MTuRed> ConsultarRango(Date fechaInicial, Date fechaFinal) {
        return recargas.consultarRangoR(fechaInicial, fechaFinal);
    }
    @Override
    public boolean Actualizar(List<MTuRed> todos) {
        for(MTuRed red:todos){
            if(!Actualizar(red)){
                return false;
            }
        }
        return true;
    }
}
