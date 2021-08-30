/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import DAO.GenericDomainTableModel;
import Modelo.MImpresion;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Steve
 */
public class TImpresiones {
    List columnIdentifiers = Arrays.asList(new Object[]{"Tipo","Precio","Cantidad"});
    public GenericDomainTableModel<MImpresion> model = new GenericDomainTableModel<MImpresion>(columnIdentifiers) {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch(columnIndex) {
                case 0: return String.class;
                case 1: return Long.class;
                case 2: return Long.class;
            }
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MImpresion impresion = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: return impresion.getTipo();
                case 1: return impresion.getPrecio();
                case 2: return Long.parseLong(impresion.getCantidad()+"");
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            MImpresion impresion = getDomainObject(rowIndex);
            switch(columnIndex) {
                case 0: impresion.setTipo((String) aValue); break;
                case 1: impresion.setPrecio((Long)aValue); break;
                case 2: impresion.setCantidad((int)aValue); break;
                default: throw new ArrayIndexOutOfBoundsException(columnIndex);
            }
            notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!
        }
    }; // Fin de la implementación concreta. Sí, eso es todo!
    public TableModel getModelo(){
        return model;
    }
}
