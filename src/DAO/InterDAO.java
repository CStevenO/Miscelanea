package DAO;

import Modelo.MImpresion;
import Modelo.MNequi;
import Modelo.MRecargas;
import Modelo.MTuLlave;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steve
 */
public interface InterDAO {
    public boolean insertar(MRecargas intRecarga,String plataforma);
    public boolean insertar(MNequi intNequi);
    public boolean insertar(MTuLlave intLlave);
    public boolean actualizar(MRecargas actRecarga,String plataforma);
    public boolean actualizar(MNequi actNequi);
    public boolean actualizar(MTuLlave actLlave);
    public boolean eliminar(Date fecha, String servicio);
    public MRecargas consultar(Date fecha,String plataforma);
    public MNequi consultarN(Date fecha);
    public MTuLlave consultarT(Date fecha);
    public List<MRecargas> consultarRango(Date fechaInicial,Date fechaFinal,String plataforma);
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
