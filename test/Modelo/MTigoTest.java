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
public class MTigoTest {
    
    public MTigoTest() {
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
     * Test of calcular method, of class MTigo.
     */
    @Test
    public void testCalcular_0args() {
        System.out.println("calcular");
        MTigo instance = new MTigo();
        instance.calcular();
    }

    /**
     * Test of calcular method, of class MTigo.
     */
    @Test
    public void testCalcular_MTigo() {
        System.out.println("calcular");
        MTigo anterior = null;
        MTigo instance = new MTigo();
        instance.calcular(anterior);
    }

    /**
     * Test of getGananciasSim method, of class MTigo.
     */
    @Test
    public void testGetGananciasSim() {
        System.out.println("getGananciasSim");
        MTigo instance = new MTigo();
        long expResult = 0L;
        long result = instance.getGananciasSim();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGananciasSim method, of class MTigo.
     */
    @Test
    public void testSetGananciasSim() {
        System.out.println("setGananciasSim");
        long gananciasSim = 0L;
        MTigo instance = new MTigo();
        instance.setGananciasSim(gananciasSim);
    }
    
}
