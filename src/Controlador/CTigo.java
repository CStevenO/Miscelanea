/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MTigo;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CTigo extends CRecarga<MTigo>{
    @Override
    public boolean Insertar(MTigo recarga) {
        return recargas.insertar(recarga);
    }
    @Override
    public boolean Actualizar(MTigo actRecarga) {
        return recargas.actualizar(actRecarga);
    }
    @Override
    public MTigo Consultar(Date fecha) {
        return recargas.consultarTi(fecha);
    }
    @Override
    public List<MTigo> ConsultarRango(Date fechaInicial, Date fechaFinal) {
        return recargas.consultarRangoTi(fechaInicial, fechaFinal);
    }
}
