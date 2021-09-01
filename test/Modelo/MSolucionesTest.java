/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class MSolucionesTest {
    
    public MSolucionesTest() {
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
     * Test of calcular method, of class MSoluciones.
     */
    @Test
    public void testCalcular_0args() {
        System.out.println("calcular");
        MSoluciones instance = new MSoluciones();
        instance.calcular();
    }

    /**
     * Test of calcular method, of class MSoluciones.
     */
    @Test
    public void testCalcular_MSoluciones() {
        System.out.println("calcular");
        MSoluciones anterior = null;
        MSoluciones instance = new MSoluciones();
        instance.calcular(anterior);
    }

    /**
     * Test of getFactura method, of class MSoluciones.
     */
    @Test
    public void testGetFactura() {
        System.out.println("getFactura");
        MSoluciones instance = new MSoluciones();
        long expResult = 0L;
        long result = instance.getFactura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFactura method, of class MSoluciones.
     */
    @Test
    public void testSetFactura() {
        System.out.println("setFactura");
        long factura = 0L;
        MSoluciones instance = new MSoluciones();
        instance.setFactura(factura);
    }

    /**
     * Test of getGananciaFac method, of class MSoluciones.
     */
    @Test
    public void testGetGananciaFac() {
        System.out.println("getGananciaFac");
        MSoluciones instance = new MSoluciones();
        long expResult = 0L;
        long result = instance.getGananciaFac();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGananciaFac method, of class MSoluciones.
     */
    @Test
    public void testSetGananciaFac() {
        System.out.println("setGananciaFac");
        long gananciaFac = 0L;
        MSoluciones instance = new MSoluciones();
        instance.setGananciaFac(gananciaFac);
    }
    
}
