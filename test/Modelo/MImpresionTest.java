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
public class MImpresionTest {
    
    public MImpresionTest() {
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
     * Test of getCantidad method, of class MImpresion.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        MImpresion instance = new MImpresion();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class MImpresion.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        MImpresion instance = new MImpresion();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getPrecio method, of class MImpresion.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        MImpresion instance = new MImpresion();
        long expResult = 0L;
        long result = instance.getPrecio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class MImpresion.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        long precio = 0L;
        MImpresion instance = new MImpresion();
        instance.setPrecio(precio);
    }

    /**
     * Test of getTipo method, of class MImpresion.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        MImpresion instance = new MImpresion();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class MImpresion.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        MImpresion instance = new MImpresion();
        instance.setTipo(tipo);
    }
    
}
