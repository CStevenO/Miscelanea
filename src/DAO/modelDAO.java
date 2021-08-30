package DAO;

import Modelo.MNequi;
import Modelo.MRecargas;
import Modelo.MTuLlave;
import java.util.List;
import DataBase.DataConnection;
import Modelo.MImpresion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DecimalFormat;

/**
 *
 * @author Steve
 */
public class modelDAO extends DataConnection implements InterDAO{
    @Override
    public boolean insertar(MRecargas intRecarga, String plataforma) {
        if(!(intRecarga==null || plataforma.isEmpty())){
            try {
                conectar();
                String tx = "insert into "+ plataforma +" (fecha,pagado,recargado,debe,ventas,saldo,ganancias,caja,sugerencia,retiro) values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setDate(1, intRecarga.getFecha());
                sentencia.setLong(2, intRecarga.getPagado());
                sentencia.setLong(3, intRecarga.getRecargado());
                sentencia.setLong(4, intRecarga.getDebe());
                sentencia.setLong(5, intRecarga.getVentas());
                sentencia.setLong(6, intRecarga.getSaldo());
                sentencia.setLong(7, intRecarga.getGanancias());
                sentencia.setLong(8, intRecarga.getCaja());
                sentencia.setLong(9, intRecarga.getSugerencia());
                sentencia.setLong(10, intRecarga.getRetiro());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean insertar(MNequi intNequi) {
        if(intNequi!=null){
            try {
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("insert into nequi "
                    + "(fecha,recargas,retiros,ganancias,caja,saldo,ingreso,egreso) "
                    + "values(?,?,?,?,?,?,?,?)");
                sentencia.setDate(1, intNequi.getFecha());
                sentencia.setLong(2, intNequi.getRecargas());
                sentencia.setLong(3, intNequi.getRetiros());
                sentencia.setLong(4, intNequi.getGanancias());
                sentencia.setLong(5, intNequi.getCaja());
                sentencia.setLong(6, intNequi.getSaldo());
                sentencia.setLong(7, intNequi.getIngreso());
                sentencia.setLong(8, intNequi.getEgreso());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean insertar(MTuLlave intLlave) {
        if(intLlave!=null){
            try {
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("insert into llave "
                    + "(fecha,recargas,ventas,saldo,caja) "
                    + "values(?,?,?,?,?)");
                sentencia.setDate(1, intLlave.getFecha());
                sentencia.setLong(2, intLlave.getRecargas());
                sentencia.setLong(3, intLlave.getVentas());
                sentencia.setLong(4, intLlave.getSaldo());
                sentencia.setLong(5, intLlave.getCaja());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean actualizar(MRecargas actRecarga, String plataforma) {
        if(!(actRecarga==null || plataforma.isEmpty())){
            try {
                conectar();
                String tx = "update "+ plataforma +" set "
                        + "pagado=?,recargado=?,debe=?,ventas=?,saldo=?,ganancias=?,caja=?,sugerencia=?,retiro=? "
                        + "where fecha=?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setLong(1, actRecarga.getPagado());
                sentencia.setLong(2, actRecarga.getRecargado());
                sentencia.setLong(3, actRecarga.getDebe());
                sentencia.setLong(4, actRecarga.getVentas());
                sentencia.setLong(5, actRecarga.getSaldo());
                sentencia.setLong(6, actRecarga.getGanancias());
                sentencia.setLong(7, actRecarga.getCaja());
                sentencia.setLong(8, actRecarga.getSugerencia());
                sentencia.setLong(9, actRecarga.getRetiro());
                sentencia.setDate(10, actRecarga.getFecha());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean actualizar(MNequi actNequi) {
        if(actNequi!=null){
            try {
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("update nequi set "
                        + "recargas=?,retiros=?,ganancias=?,caja=?,saldo=?,ingreso=?,egreso=? "
                        + "where fecha=?");
                sentencia.setLong(1, actNequi.getRecargas());
                sentencia.setLong(2, actNequi.getRetiros());
                sentencia.setLong(3, actNequi.getGanancias());
                sentencia.setLong(4, actNequi.getCaja());
                sentencia.setLong(5, actNequi.getSaldo());
                sentencia.setLong(6, actNequi.getIngreso());
                sentencia.setLong(7, actNequi.getEgreso());
                sentencia.setDate(8, actNequi.getFecha());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean actualizar(MTuLlave actLlave) {
        if(actLlave!=null){
            try {
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("update llave set "
                        + "recargas=?,ventas=?,saldo=?,caja=? "
                        + "where fecha=?");
                sentencia.setLong(1, actLlave.getRecargas());
                sentencia.setLong(2, actLlave.getVentas());
                sentencia.setLong(3, actLlave.getSaldo());
                sentencia.setLong(4, actLlave.getCaja());
                sentencia.setDate(5, actLlave.getFecha());
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean eliminar(Date fecha, String servicio) {
        if(!(fecha==null || servicio.isEmpty())){
            try {
                conectar();
                String tx = "delete from "+ servicio +" where fecha=?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setDate(1, fecha);
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public MRecargas consultar(Date fecha, String plataforma) {
        if(!(fecha==null || plataforma.isEmpty())){
            try {
                MRecargas recarga = new MRecargas();
                conectar();
                String tx = "select * from "+ plataforma +" where fecha=?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setDate(1, fecha);
                ResultSet datos = sentencia.executeQuery();
                if(datos.next()){
                    recarga.setFecha(datos.getDate("fecha"));
                    recarga.setPagado(datos.getLong("pagado"));
                    recarga.setRecargado(datos.getLong("recargado"));
                    recarga.setDebe(datos.getLong("debe"));
                    recarga.setVentas(datos.getLong("ventas"));
                    recarga.setSaldo(datos.getLong("saldo"));
                    recarga.setGanancias(datos.getLong("ganancias"));
                    recarga.setCaja(datos.getLong("caja"));
                    recarga.setSugerencia(datos.getLong("sugerencia"));
                    recarga.setRetiro(datos.getLong("retiro"));
                }
                desconectar();
                return recarga;

            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }
    @Override
    public MNequi consultarN(Date fecha) {
        if(fecha!=null){
            try {
                MNequi nequi = new MNequi();
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("select * from nequi where fecha=?");
                sentencia.setDate(1, fecha);
                ResultSet datos = sentencia.executeQuery();
                if(datos.next()){
                    nequi.setFecha(datos.getDate("fecha"));
                    nequi.setRecargas(datos.getLong("recargas"));
                    nequi.setRetiros(datos.getLong("retiros"));
                    nequi.setGanancias(datos.getLong("ganancias"));
                    nequi.setCaja(datos.getLong("caja"));
                    nequi.setSaldo(datos.getLong("saldo"));
                    nequi.setIngreso(datos.getLong("ingreso"));
                    nequi.setEgreso(datos.getLong("egreso"));
                }
                desconectar();
                return nequi;

            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }
    @Override
    public MTuLlave consultarT(Date fecha) {
        if(fecha!=null){
            try {
                MTuLlave llave = new MTuLlave();
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("select * from llave where fecha=?");
                sentencia.setDate(1, fecha);
                ResultSet datos = sentencia.executeQuery();
                if(datos.next()){
                    llave.setFecha(datos.getDate("fecha"));
                    llave.setRecargas(datos.getLong("recargas"));
                    llave.setVentas(datos.getLong("ventas"));
                    llave.setSaldo(datos.getLong("saldo"));
                    llave.setCaja(datos.getLong("caja"));
                }
                desconectar();
                return llave;

            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }
    @Override
    public List<MRecargas> consultarRango(Date fechaInicial, Date fechaFinal, String plataforma) {
        if(!(fechaInicial==null || fechaFinal==null || plataforma.isEmpty())){
            try {
                List<MRecargas> recargas = new ArrayList<>();
                conectar();
                String tx = "select * from "+ plataforma +" where fecha between ? and ?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setDate(1, fechaInicial);
                sentencia.setDate(2, fechaFinal);
                ResultSet datos = sentencia.executeQuery();
                while(datos.next()){
                    MRecargas recarga = new MRecargas();
                    recarga.setFecha(datos.getDate("fecha"));
                    recarga.setPagado(datos.getLong("pagado"));
                    recarga.setRecargado(datos.getLong("recargado"));
                    recarga.setDebe(datos.getLong("debe"));
                    recarga.setVentas(datos.getLong("ventas"));
                    recarga.setSaldo(datos.getLong("saldo"));
                    recarga.setGanancias(datos.getLong("ganancias"));
                    recarga.setCaja(datos.getLong("caja"));
                    recarga.setSugerencia(datos.getLong("sugerencia"));
                    recarga.setRetiro(datos.getLong("retiro"));
                    recargas.add(recarga);
                }
                desconectar();
                return recargas;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }
    @Override
    public List<MNequi> consultarRangoN(Date fechaInicial, Date fechaFinal) {
        if(!(fechaInicial==null || fechaFinal==null)){
            try {
                List<MNequi> nequis = new ArrayList<>();
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("select * from nequi where fecha between ? and ?");
                sentencia.setDate(1, fechaInicial);
                sentencia.setDate(2, fechaFinal);
                ResultSet datos = sentencia.executeQuery();
                while(datos.next()){
                    MNequi nequi = new MNequi();
                    nequi.setFecha(datos.getDate("fecha"));
                    nequi.setRecargas(datos.getLong("recargas"));
                    nequi.setRetiros(datos.getLong("retiros"));
                    nequi.setGanancias(datos.getLong("ganancias"));
                    nequi.setCaja(datos.getLong("caja"));
                    nequi.setSaldo(datos.getLong("saldo"));
                    nequi.setIngreso(datos.getLong("ingreso"));
                    nequi.setEgreso(datos.getLong("egreso"));
                    nequis.add(nequi);
                }
                desconectar();
                return nequis;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }
    @Override
    public List<MTuLlave> consultarRangoT(Date fechaInicial, Date fechaFinal) {
        if(!(fechaInicial==null || fechaFinal==null)){
            try {
                List<MTuLlave> llaves = new ArrayList<>();
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("select * from llave where fecha between ? and ?");
                sentencia.setDate(1, fechaInicial);
                sentencia.setDate(2, fechaFinal);
                ResultSet datos = sentencia.executeQuery();
                while(datos.next()){
                    MTuLlave llave = new MTuLlave();
                    llave.setFecha(datos.getDate("fecha"));
                    llave.setRecargas(datos.getLong("recargas"));
                    llave.setVentas(datos.getLong("ventas"));
                    llave.setSaldo(datos.getLong("saldo"));
                    llave.setCaja(datos.getLong("caja"));
                    llaves.add(llave);
                }
                desconectar();
                return llaves;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }

    @Override
    public ArrayList<Long> total(Date fechaInicial, Date fechaFinal, String plataforma) {
        if(!(fechaInicial==null || fechaFinal==null || plataforma.isEmpty())){
            try {
                ArrayList<Long> totals = new ArrayList<>();
                ArrayList<String> columnas = columnas(plataforma);
                conectar();
                String tx = "select ";
                int i = 0;
                while(i<columnas.size()){
                    if(i==columnas.size()-1){
                        tx = tx + "sum("+ columnas.get(i) +") ";
                    }
                    else{
                        tx = tx + "sum("+ columnas.get(i) +"), ";
                    }
                    i++;
                }
                tx = tx + "from "+plataforma + " where fecha between ? and ?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setDate(1, fechaInicial);
                sentencia.setDate(2, fechaFinal);
                ResultSet datos = sentencia.executeQuery();
                i=0;
                if(datos.next()){
                    while(i<columnas.size()){
                        totals.add(datos.getLong("sum("+ columnas.get(i) +")"));
                        i++;
                    }
                }
                desconectar();
                return totals;
            } catch (Exception e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }

    @Override
    public ArrayList<String> columnas(String plataforma) {
        if(!plataforma.isEmpty()){
            try {
                conectar();
                PreparedStatement sentencia = conexion.prepareStatement("select Column_name from Information_schema.columns where Table_name like ?");
                sentencia.setString(1, plataforma);
                ResultSet datos = sentencia.executeQuery();
                ArrayList<String> columnas = new ArrayList<>();
                while(datos.next()){
                    columnas.add(datos.getString("COLUMN_NAME"));
                }
                desconectar();
                return columnas;
            } catch (Exception e) {
                System.out.println("Error: "+e);
                return null;
            }
        }
        else{
            return null;
        }
    }

    @Override
    public long getTope(String plataforma) {
        if(!(plataforma.isEmpty())){
            try {
                conectar();
                long top=-1;
                String tx = "select ("+ plataforma +") from topes order by fecha desc limit 1";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                ResultSet datos = sentencia.executeQuery();
                if(datos.next()){
                    top = datos.getLong(plataforma);
                }
                desconectar();
                return top;
            } catch (Exception e) {
                System.out.println("Error: "+e);
                return -1;
            }
        }
        else{
            return 0;
        }
    }

    @Override
    public float getPorcentaje(String plataforma) {
        if(!(plataforma.isEmpty())){
            try {
                conectar();
                float top=-1;
                String tx = "select ("+ plataforma +") from porcentajes order by fecha desc limit 1";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                ResultSet datos = sentencia.executeQuery();
                if(datos.next()){
                    top = datos.getFloat(plataforma);
                }
                desconectar();
                return top;
            } catch (Exception e) {
                System.out.println("Error: "+e);
                return -1;
            }
        }
        else{
            return 0;
        }
    }
    @Override
    public boolean setTope(Date fecha, String plataforma,long tope) {
        if(!(fecha==null || tope==0L)){
            try {
                conectar();
                String tx = "update topes set "
                        + plataforma + "=? "
                        + "where fecha=?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setLong(1, tope);
                sentencia.setDate(2, fecha);
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }
    @Override
    public boolean setPorcentaje(Date fecha, String plataforma,float porcentaje) {
        if(!(fecha==null || plataforma.isEmpty() || porcentaje == 0.0f)){
            try {
                conectar();
                String tx = "update porcentaje set "
                        + plataforma + "=? "
                        + "where fecha=?";
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                sentencia.setFloat(1, Float.parseFloat(new DecimalFormat("#.###").format(porcentaje)));
                sentencia.setDate(2, fecha);
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (SQLException e) {
                System.out.println("Error: "+e);
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public long consultarMovimiento() {
        try {
            conectar();
            float top=-1;
            String tx = "select sum(retiros) from nequi where YEAR(fecha) = YEAR(CURRENT_DATE()) AND MONTH(fecha) = MONTH(CURRENT_DATE())";
            PreparedStatement sentencia = conexion.prepareStatement(tx);
            ResultSet datos = sentencia.executeQuery();
            if(datos.next()){
                top = datos.getLong("sum(retiros)");
            }
            desconectar();
            return (long) top;
        } catch (Exception e) {
            System.out.println("Error: "+e);
            return -1;
        }
    }
    @Override
    public boolean insertar(List<MImpresion> impresiones) {
        if(impresiones!=null){
            try {
                conectar();
                String tx = "insert into impresiones (fecha,";
                String fin = "values(NOW(),";
                int i = 0;
                while(i<impresiones.size()){
                    if(i==impresiones.size()-1){
                        if(impresiones.get(i).getTipo().equals("SN")){
                            tx = tx + impresiones.get(i).getTipo()+") ";
                        }
                        else{
                            tx = tx + impresiones.get(i).getTipo() + impresiones.get(i).getPrecio()+") ";
                        }
                        fin = fin + "?)";
                        tx = tx + fin;
                    }
                    else{
                        if(impresiones.get(i).getTipo().equals("SN")){
                            tx = tx + impresiones.get(i).getTipo()+",";
                        }
                        else{
                            tx = tx + impresiones.get(i).getTipo() + impresiones.get(i).getPrecio()+",";
                        }
                        fin = fin + "?,";
                    }
                    i++;
                }
                PreparedStatement sentencia = conexion.prepareStatement(tx);
                i = 0;
                while(i<impresiones.size()){
                    if(impresiones.get(i).getTipo().equals("SN")){
                        sentencia.setLong(i+1, impresiones.get(i).getCantidad()*impresiones.get(i).getPrecio());
                    }
                    else{
                        sentencia.setInt(i+1, impresiones.get(i).getCantidad());
                    }
                    i++;
                }
                sentencia.executeUpdate();
                desconectar();
                return true;
            } catch (Exception e) {
                System.out.println("Error: "+e);
                return false;
            }
        }   
        else{
            return false;
        } 
    }

    @Override
    public boolean comprobar() {
        try {
            boolean con = conectar();
            boolean sin = desconectar();
            return con&&sin;
        } catch (Exception e) {
            return false;
        }
    }
}
