package tablas;

import DAO.GenericDomainTableModel;
import Modelo.MNequi;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Steve
 */
public class TNequi {
    List columnIdentifiers = Arrays.asList(new Object[]{"fecha","recargas","retiros","ganancias","caja","saldo","ingreso","egreso"});
    public GenericDomainTableModel<MNequi> model = new GenericDomainTableModel<MNequi>(columnIdentifiers) {
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
            }
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MNequi recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: return recarga.getFecha();
                case 1: return recarga.getRecargas();
                case 2: return recarga.getRetiros();
                case 3: return recarga.getGanancias();
                case 4: return recarga.getCaja();
                case 5: return recarga.getSaldo();
                case 6: return recarga.getIngreso();
                case 7: return recarga.getEgreso();
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            MNequi recarga = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: recarga.setFecha((Date)aValue); break;
                case 1: recarga.setRecargas((Long)aValue); break;
                case 2: recarga.setRetiros((Long)aValue); break;
                case 3: recarga.setGanancias((Long)aValue); break;
                case 4: recarga.setCaja((Long)aValue); break;
                case 5: recarga.setSaldo((Long)aValue); break;
                case 6: recarga.setIngreso((Long)aValue); break;
                case 7: recarga.setEgreso((Long)aValue); break;
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
            notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!
        }
    }; // Fin de la implementación concreta. Sí, eso es todo!
    public TableModel getModelo(){
        return model;
    }
}
