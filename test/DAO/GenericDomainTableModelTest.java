/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steve
 */
public class GenericDomainTableModelTest {
    
    public GenericDomainTableModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTableModelListener method, of class GenericDomainTableModel.
     */
    @Test
    public void testAddTableModelListener() {
        System.out.println("addTableModelListener");
        TableModelListener l = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.addTableModelListener(l);
    }

    /**
     * Test of removeTableModelListener method, of class GenericDomainTableModel.
     */
    @Test
    public void testRemoveTableModelListener() {
        System.out.println("removeTableModelListener");
        TableModelListener l = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.removeTableModelListener(l);
    }

    /**
     * Test of getTableModelListeners method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetTableModelListeners() {
        System.out.println("getTableModelListeners");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        TableModelListener[] expResult = null;
        TableModelListener[] result = instance.getTableModelListeners();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of notifyTableChanged method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableChanged() {
        System.out.println("notifyTableChanged");
        TableModelEvent e = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableChanged(e);
    }

    /**
     * Test of notifyTableHeaderChanged method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableHeaderChanged() {
        System.out.println("notifyTableHeaderChanged");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableHeaderChanged();
    }

    /**
     * Test of notifyTableRowsInserted method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableRowsInserted() {
        System.out.println("notifyTableRowsInserted");
        int firstRow = 0;
        int lastRow = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableRowsInserted(firstRow, lastRow);
    }

    /**
     * Test of notifyTableRowsUpdated method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableRowsUpdated() {
        System.out.println("notifyTableRowsUpdated");
        int firstRow = 0;
        int lastRow = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableRowsUpdated(firstRow, lastRow);
    }

    /**
     * Test of notifyTableRowsDeleted method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableRowsDeleted() {
        System.out.println("notifyTableRowsDeleted");
        int firstRow = 0;
        int lastRow = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableRowsDeleted(firstRow, lastRow);
    }

    /**
     * Test of notifyTableCellUpdated method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyTableCellUpdated() {
        System.out.println("notifyTableCellUpdated");
        int row = 0;
        int column = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyTableCellUpdated(row, column);
    }

    /**
     * Test of getRowCount method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumnCount method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumnName method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int columnIndex = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        String expResult = "";
        String result = instance.getColumnName(columnIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCellEditable method, of class GenericDomainTableModel.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int rowIndex = 0;
        int columnIndex = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        boolean expResult = false;
        boolean result = instance.isCellEditable(rowIndex, columnIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of addRow method, of class GenericDomainTableModel.
     */
    @Test
    public void testAddRow() {
        System.out.println("addRow");
        Object domainObject = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.addRow(domainObject);
    }

    /**
     * Test of addRows method, of class GenericDomainTableModel.
     */
    @Test
    public void testAddRows() {
        System.out.println("addRows");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.addRows(null);
    }

    /**
     * Test of insertRow method, of class GenericDomainTableModel.
     */
    @Test
    public void testInsertRow() {
        System.out.println("insertRow");
        Object domainObject = null;
        int rowIndex = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.insertRow(domainObject, rowIndex);
    }

    /**
     * Test of notifyDomainObjectUpdated method, of class GenericDomainTableModel.
     */
    @Test
    public void testNotifyDomainObjectUpdated() {
        System.out.println("notifyDomainObjectUpdated");
        Object domainObject = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.notifyDomainObjectUpdated(domainObject);
    }

    /**
     * Test of deleteRow method, of class GenericDomainTableModel.
     */
    @Test
    public void testDeleteRow_GenericType() {
        System.out.println("deleteRow");
        Object domainObject = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.deleteRow(domainObject);
    }

    /**
     * Test of deleteRow method, of class GenericDomainTableModel.
     */
    @Test
    public void testDeleteRow_int() {
        System.out.println("deleteRow");
        int rowIndex = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.deleteRow(rowIndex);
    }

    /**
     * Test of deleteRows method, of class GenericDomainTableModel.
     */
    @Test
    public void testDeleteRows() {
        System.out.println("deleteRows");
        int firstRow = 0;
        int lastRow = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.deleteRows(firstRow, lastRow);
    }

    /**
     * Test of clearTableModelData method, of class GenericDomainTableModel.
     */
    @Test
    public void testClearTableModelData() {
        System.out.println("clearTableModelData");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.clearTableModelData();
    }

    /**
     * Test of getDomainObject method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetDomainObject() {
        System.out.println("getDomainObject");
        int rowIndex = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        Object expResult = null;
        Object result = instance.getDomainObject(rowIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDomainObjects method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetDomainObjects_int_int() {
        System.out.println("getDomainObjects");
        int firstRow = 0;
        int lastRow = 0;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        List expResult = null;
        List result = instance.getDomainObjects(firstRow, lastRow);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDomainObjects method, of class GenericDomainTableModel.
     */
    @Test
    public void testGetDomainObjects_0args() {
        System.out.println("getDomainObjects");
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        List expResult = null;
        List result = instance.getDomainObjects();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColumnIdentifiers method, of class GenericDomainTableModel.
     */
    @Test
    public void testSetColumnIdentifiers() {
        System.out.println("setColumnIdentifiers");
        List columnIdentifiers = null;
        GenericDomainTableModel instance = new GenericDomainTableModelImpl();
        instance.setColumnIdentifiers(columnIdentifiers);
    }

    public class GenericDomainTableModelImpl extends GenericDomainTableModel {

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
