package DAO;

import Modelo.MImpresion;
import Modelo.MNequi;
import Modelo.MSoluciones;
import Modelo.MTigo;
import Modelo.MTuLlave;
import Modelo.MTuRed;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steve
 */
public interface InterDAO {
    public boolean insertar(MTuRed intRecarga);
    public boolean insertar(MTigo intRecarga);
    public boolean insertar(MSoluciones intRecarga);
    public boolean insertar(MNequi intNequi);
    public boolean insertar(MTuLlave intLlave);
    public boolean actualizar(MTuRed actRecarga);
    public boolean actualizar(MTigo actRecarga);
    public boolean actualizar(MSoluciones actRecarga);
    public boolean actualizar(MNequi actNequi);
    public boolean actualizar(MTuLlave actLlave);
    public boolean eliminar(Date fecha, String servicio);
    public MTuRed consultarR(Date fecha);
    public MTigo consultarTi(Date fecha);
    public MSoluciones consultarS(Date fecha);
    public MNequi consultarN(Date fecha);
    public MTuLlave consultarT(Date fecha);
    public List<MTuRed> consultarRangoR(Date fechaInicial,Date fechaFinal);
    public List<MTigo> consultarRangoTi(Date fechaInicial,Date fechaFinal);
    public List<MSoluciones> consultarRangoS(Date fechaInicial,Date fechaFinal);
    public List<MNequi> consultarRangoN(Date fechaInicial,Date fechaFinal);
    public List<MTuLlave> consultarRangoT(Date fechaInicial,Date fechaFinal);
    public ArrayList<Long> total(Date fechaInicial,Date fechaFinal,String plataforma);
    public ArrayList<String> columnas(String plataforma);
    public long getTope(String plataforma);
    public float getPorcentaje(String plataforma);
    public boolean setTope(Date fecha,String plataforma, long tope);
    public boolean setPorcentaje(Date fecha,String plataforma,float porcentaje);
    public long consultarMovimiento();
    public boolean insertar(List<MImpresion> impresiones);
    public boolean comprobar();
}
