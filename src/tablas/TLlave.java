package tablas;

import DAO.GenericDomainTableModel;
import Modelo.MTuLlave;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Steve
 */
public class TLlave {
    List columnIdentifiers = Arrays.asList(new Object[]{"fecha","recargas","ventas","saldo","caja"});
    public GenericDomainTableModel<MTuLlave> model = new GenericDomainTableModel<MTuLlave>(columnIdentifiers) {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch(columnIndex) {
                case 0: return Date.class;
                case 1: return Long.class;
                case 2: return Long.class;
                case 3: return Long.class;
                case 4: return Long.class;
            }
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MTuLlave recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: return recarga.getFecha();
                case 1: return recarga.getRecargas();
                case 2: return recarga.getVentas();
                case 3: return recarga.getSaldo();
                case 4: return recarga.getCaja();
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            MTuLlave recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: recarga.setFecha((Date)aValue); break;
                case 1: recarga.setRecargas((Long)aValue); break;
                case 2: recarga.setVentas((Long)aValue); break;
                case 3: recarga.setSaldo((Long)aValue); break;
                case 4: recarga.setCaja((Long)aValue); break;
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
            notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!
        }
    }; // Fin de la implementación concreta. Sí, eso es todo!
    public TableModel getModelo(){
        return model;
    }
}
