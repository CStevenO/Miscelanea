/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MImpresion;
import java.util.List;
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
public class CImpresionTest {
    
    public CImpresionTest() {
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
     * Test of insertar method, of class CImpresion.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        List<MImpresion> impresiones = null;
        CImpresion instance = new CImpresion();
        boolean expResult = false;
        boolean result = instance.insertar(impresiones);
        assertEquals(expResult, result);
    }
    
}
