/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import javax.swing.table.TableModel;
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
public class TSolucionesTest {
    
    public TSolucionesTest() {
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
     * Test of getModelo method, of class TSoluciones.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        TSoluciones instance = new TSoluciones();
        TableModel expResult = null;
        TableModel result = instance.getModelo();
        assertEquals(expResult, result);
    }
    
}
