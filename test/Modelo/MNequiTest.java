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
public class MNequiTest {
    
    public MNequiTest() {
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
     * Test of getFecha method, of class MNequi.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        MNequi instance = new MNequi();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class MNequi.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        MNequi instance = new MNequi();
        instance.setFecha(fecha);
    }

    /**
     * Test of getRecargas method, of class MNequi.
     */
    @Test
    public void testGetRecargas() {
        System.out.println("getRecargas");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getRecargas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecargas method, of class MNequi.
     */
    @Test
    public void testSetRecargas() {
        System.out.println("setRecargas");
        long recargas = 0L;
        MNequi instance = new MNequi();
        instance.setRecargas(recargas);
    }

    /**
     * Test of getRetiros method, of class MNequi.
     */
    @Test
    public void testGetRetiros() {
        System.out.println("getRetiros");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getRetiros();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRetiros method, of class MNequi.
     */
    @Test
    public void testSetRetiros() {
        System.out.println("setRetiros");
        long retiros = 0L;
        MNequi instance = new MNequi();
        instance.setRetiros(retiros);
    }

    /**
     * Test of getGanancias method, of class MNequi.
     */
    @Test
    public void testGetGanancias() {
        System.out.println("getGanancias");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getGanancias();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGanancias method, of class MNequi.
     */
    @Test
    public void testSetGanancias() {
        System.out.println("setGanancias");
        long ganancias = 0L;
        MNequi instance = new MNequi();
        instance.setGanancias(ganancias);
    }

    /**
     * Test of getCaja method, of class MNequi.
     */
    @Test
    public void testGetCaja() {
        System.out.println("getCaja");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getCaja();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCaja method, of class MNequi.
     */
    @Test
    public void testSetCaja() {
        System.out.println("setCaja");
        long caja = 0L;
        MNequi instance = new MNequi();
        instance.setCaja(caja);
    }

    /**
     * Test of getSaldo method, of class MNequi.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSaldo method, of class MNequi.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        long saldo = 0L;
        MNequi instance = new MNequi();
        instance.setSaldo(saldo);
    }

    /**
     * Test of getIngreso method, of class MNequi.
     */
    @Test
    public void testGetIngreso() {
        System.out.println("getIngreso");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getIngreso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIngreso method, of class MNequi.
     */
    @Test
    public void testSetIngreso() {
        System.out.println("setIngreso");
        long ingreso = 0L;
        MNequi instance = new MNequi();
        instance.setIngreso(ingreso);
    }

    /**
     * Test of getEgreso method, of class MNequi.
     */
    @Test
    public void testGetEgreso() {
        System.out.println("getEgreso");
        MNequi instance = new MNequi();
        long expResult = 0L;
        long result = instance.getEgreso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEgreso method, of class MNequi.
     */
    @Test
    public void testSetEgreso() {
        System.out.println("setEgreso");
        long egreso = 0L;
        MNequi instance = new MNequi();
        instance.setEgreso(egreso);
    }

    /**
     * Test of calcular method, of class MNequi.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        MNequi instance = new MNequi();
        instance.calcular();
    }
    
}
