package Controlador;

import DAO.InterDAO;
import DAO.modelDAO;
import Modelo.MImpresion;
import java.util.List;

/**
 *
 * @author Steve
 */
public class CImpresion {
    private InterDAO impresion;
    public CImpresion(){
        impresion = new modelDAO();
    }
    public boolean insertar(List<MImpresion> impresiones){
        return impresion.insertar(impresiones);
    }
}
