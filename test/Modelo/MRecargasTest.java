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
public class MRecargasTest {
    
    public MRecargasTest() {
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
     * Test of getFecha method, of class MRecargas.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        MRecargas instance = new MRecargas();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class MRecargas.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        MRecargas instance = new MRecargas();
        instance.setFecha(fecha);
    }

    /**
     * Test of getPagado method, of class MRecargas.
     */
    @Test
    public void testGetPagado() {
        System.out.println("getPagado");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getPagado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPagado method, of class MRecargas.
     */
    @Test
    public void testSetPagado() {
        System.out.println("setPagado");
        long pagado = 0L;
        MRecargas instance = new MRecargas();
        instance.setPagado(pagado);
    }

    /**
     * Test of getRecargado method, of class MRecargas.
     */
    @Test
    public void testGetRecargado() {
        System.out.println("getRecargado");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getRecargado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecargado method, of class MRecargas.
     */
    @Test
    public void testSetRecargado() {
        System.out.println("setRecargado");
        long recargado = 0L;
        MRecargas instance = new MRecargas();
        instance.setRecargado(recargado);
    }

    /**
     * Test of getDebe method, of class MRecargas.
     */
    @Test
    public void testGetDebe() {
        System.out.println("getDebe");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getDebe();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDebe method, of class MRecargas.
     */
    @Test
    public void testSetDebe() {
        System.out.println("setDebe");
        long debe = 0L;
        MRecargas instance = new MRecargas();
        instance.setDebe(debe);
    }

    /**
     * Test of getVentas method, of class MRecargas.
     */
    @Test
    public void testGetVentas() {
        System.out.println("getVentas");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getVentas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVentas method, of class MRecargas.
     */
    @Test
    public void testSetVentas() {
        System.out.println("setVentas");
        long ventas = 0L;
        MRecargas instance = new MRecargas();
        instance.setVentas(ventas);
    }

    /**
     * Test of getSaldo method, of class MRecargas.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSaldo method, of class MRecargas.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        long saldo = 0L;
        MRecargas instance = new MRecargas();
        instance.setSaldo(saldo);
    }

    /**
     * Test of getGanancias method, of class MRecargas.
     */
    @Test
    public void testGetGanancias() {
        System.out.println("getGanancias");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getGanancias();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGanancias method, of class MRecargas.
     */
    @Test
    public void testSetGanancias() {
        System.out.println("setGanancias");
        long ganancias = 0L;
        MRecargas instance = new MRecargas();
        instance.setGanancias(ganancias);
    }

    /**
     * Test of getCaja method, of class MRecargas.
     */
    @Test
    public void testGetCaja() {
        System.out.println("getCaja");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getCaja();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCaja method, of class MRecargas.
     */
    @Test
    public void testSetCaja() {
        System.out.println("setCaja");
        long caja = 0L;
        MRecargas instance = new MRecargas();
        instance.setCaja(caja);
    }

    /**
     * Test of getSugerencia method, of class MRecargas.
     */
    @Test
    public void testGetSugerencia() {
        System.out.println("getSugerencia");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getSugerencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSugerencia method, of class MRecargas.
     */
    @Test
    public void testSetSugerencia() {
        System.out.println("setSugerencia");
        long sugerencia = 0L;
        MRecargas instance = new MRecargas();
        instance.setSugerencia(sugerencia);
    }

    /**
     * Test of getRetiro method, of class MRecargas.
     */
    @Test
    public void testGetRetiro() {
        System.out.println("getRetiro");
        MRecargas instance = new MRecargas();
        long expResult = 0L;
        long result = instance.getRetiro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRetiro method, of class MRecargas.
     */
    @Test
    public void testSetRetiro() {
        System.out.println("setRetiro");
        long retiro = 0L;
        MRecargas instance = new MRecargas();
        instance.setRetiro(retiro);
    }
    
}
