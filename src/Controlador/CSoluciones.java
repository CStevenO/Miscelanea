/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MSoluciones;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CSoluciones extends CRecarga<MSoluciones>{
    @Override
    public boolean Insertar(MSoluciones recarga) {
        return recargas.insertar(recarga);
    }
    @Override
    public boolean Actualizar(MSoluciones actRecarga) {
        return recargas.actualizar(actRecarga);
    }
    @Override
    public MSoluciones Consultar(Date fecha) {
        return recargas.consultarS(fecha);
    }
    @Override
    public List<MSoluciones> ConsultarRango(Date fechaInicial, Date fechaFinal) {
        return recargas.consultarRangoS(fechaInicial, fechaFinal);
    }

    @Override
    public boolean Actualizar(List<MSoluciones> todos) {
        if(todos!=null){
            for(MSoluciones red:todos){
                if(!Actualizar(red)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
