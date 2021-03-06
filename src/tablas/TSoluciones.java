/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import DAO.GenericDomainTableModel;
import Modelo.MSoluciones;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Steve
 */
public class TSoluciones {
    List columnIdentifiers = Arrays.asList(new Object[]{"fecha","pagado","recargado","debe","ventas","saldo","ganancias","caja","sugerencia","retiro","factura","gananciaFac"});
    public GenericDomainTableModel<MSoluciones> model = new GenericDomainTableModel<MSoluciones>(columnIdentifiers) {
        
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch(columnIndex) {
                case 0: return Date.class;
                case 1: return Long.class;
                case 2: return Long.class;
                case 3: return Long.class;
                case 4: return Long.class;
                case 5: return Long.class;
                case 6: return Long.class;
                case 7: return Long.class;
                case 8: return Long.class;
                case 9: return Long.class;
                case 10: return Long.class;
                case 11: return Long.class;
            }
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MSoluciones recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: return recarga.getFecha();
                case 1: return recarga.getPagado();
                case 2: return recarga.getRecargado();
                case 3: return recarga.getDebe();
                case 4: return recarga.getVentas();
                case 5: return recarga.getSaldo();
                case 6: return recarga.getGanancias();
                case 7: return recarga.getCaja();
                case 8: return recarga.getSugerencia();
                case 9: return recarga.getRetiro();
                case 10: return recarga.getFactura();
                case 11: return recarga.getGananciaFac();
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            MSoluciones recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: recarga.setFecha((Date)aValue); break;
                case 1: recarga.setPagado((Long)aValue); break;
                case 2: recarga.setRecargado((Long)aValue); break;
                case 3: recarga.setDebe((Long)aValue); break;
                case 4: recarga.setVentas((Long)aValue); break;
                case 5: recarga.setSaldo((Long)aValue); break;
                case 6: recarga.setGanancias((Long)aValue); break;
                case 7: recarga.setCaja((Long)aValue); break;
                case 8: recarga.setSugerencia((Long)aValue); break;
                case 9: recarga.setRetiro((Long)aValue); break;
                case 10: recarga.setFactura((Long) aValue); break;
                case 11: recarga.setGananciaFac((Long) aValue); break;
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
            notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!
        }
    }; // Fin de la implementaci??n concreta. S??, eso es todo!
    public TableModel getModelo(){
        return model;
    }
}
