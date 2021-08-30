/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
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
public class MTuLlaveTest {
    
    public MTuLlaveTest() {
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
     * Test of getFecha method, of class MTuLlave.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        MTuLlave instance = new MTuLlave();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class MTuLlave.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        MTuLlave instance = new MTuLlave();
        instance.setFecha(fecha);
    }

    /**
     * Test of getRecargas method, of class MTuLlave.
     */
    @Test
    public void testGetRecargas() {
        System.out.println("getRecargas");
        MTuLlave instance = new MTuLlave();
        long expResult = 0L;
        long result = instance.getRecargas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecargas method, of class MTuLlave.
     */
    @Test
    public void testSetRecargas() {
        System.out.println("setRecargas");
        long recargas = 0L;
        MTuLlave instance = new MTuLlave();
        instance.setRecargas(recargas);
    }

    /**
     * Test of getVentas method, of class MTuLlave.
     */
    @Test
    public void testGetVentas() {
        System.out.println("getVentas");
        MTuLlave instance = new MTuLlave();
        long expResult = 0L;
        long result = instance.getVentas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVentas method, of class MTuLlave.
     */
    @Test
    public void testSetVentas() {
        System.out.println("setVentas");
        long ventas = 0L;
        MTuLlave instance = new MTuLlave();
        instance.setVentas(ventas);
    }

    /**
     * Test of getSaldo method, of class MTuLlave.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        MTuLlave instance = new MTuLlave();
        long expResult = 0L;
        long result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSaldo method, of class MTuLlave.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        long saldo = 0L;
        MTuLlave instance = new MTuLlave();
        instance.setSaldo(saldo);
    }

    /**
     * Test of getCaja method, of class MTuLlave.
     */
    @Test
    public void testGetCaja() {
        System.out.println("getCaja");
        MTuLlave instance = new MTuLlave();
        long expResult = 0L;
        long result = instance.getCaja();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCaja method, of class MTuLlave.
     */
    @Test
    public void testSetCaja() {
        System.out.println("setCaja");
        long caja = 0L;
        MTuLlave instance = new MTuLlave();
        instance.setCaja(caja);
    }

    /**
     * Test of calcular method, of class MTuLlave.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        MTuLlave instance = new MTuLlave();
        instance.calcular();
    }

    /**
     * Test of recargar method, of class MTuLlave.
     */
    @Test
    public void testRecargar() {
        System.out.println("recargar");
        Date fecha = null;
        long recarga = 0L;
        MTuLlave instance = new MTuLlave();
        boolean expResult = false;
        boolean result = instance.recargar(fecha, recarga);
        assertEquals(expResult, result);
    }
    
}
