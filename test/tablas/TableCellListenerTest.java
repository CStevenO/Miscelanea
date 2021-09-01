/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.beans.PropertyChangeEvent;
import javax.swing.JTable;
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
public class TableCellListenerTest {
    
    public TableCellListenerTest() {
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
     * Test of getColumn method, of class TableCellListener.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        TableCellListener instance = null;
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewValue method, of class TableCellListener.
     */
    @Test
    public void testGetNewValue() {
        System.out.println("getNewValue");
        TableCellListener instance = null;
        Object expResult = null;
        Object result = instance.getNewValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOldValue method, of class TableCellListener.
     */
    @Test
    public void testGetOldValue() {
        System.out.println("getOldValue");
        TableCellListener instance = null;
        Object expResult = null;
        Object result = instance.getOldValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRow method, of class TableCellListener.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        TableCellListener instance = null;
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTable method, of class TableCellListener.
     */
    @Test
    public void testGetTable() {
        System.out.println("getTable");
        TableCellListener instance = null;
        JTable expResult = null;
        JTable result = instance.getTable();
        assertEquals(expResult, result);
    }

    /**
     * Test of propertyChange method, of class TableCellListener.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent e = null;
        TableCellListener instance = null;
        instance.propertyChange(e);
    }

    /**
     * Test of run method, of class TableCellListener.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        TableCellListener instance = null;
        instance.run();
    }
    
}
