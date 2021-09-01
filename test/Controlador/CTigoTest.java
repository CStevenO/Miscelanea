/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MTigo;
import java.sql.Date;
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
public class CTigoTest {
    
    public CTigoTest() {
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
     * Test of Insertar method, of class CTigo.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        MTigo recarga = null;
        CTigo instance = new CTigo();
        boolean expResult = false;
        boolean result = instance.Insertar(recarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CTigo.
     */
    @Test
    public void testActualizar_MTigo() {
        System.out.println("Actualizar");
        MTigo actRecarga = null;
        CTigo instance = new CTigo();
        boolean expResult = false;
        boolean result = instance.Actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consultar method, of class CTigo.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        Date fecha = null;
        CTigo instance = new CTigo();
        MTigo expResult = null;
        MTigo result = instance.Consultar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of ConsultarRango method, of class CTigo.
     */
    @Test
    public void testConsultarRango() {
        System.out.println("ConsultarRango");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CTigo instance = new CTigo();
        List<MTigo> expResult = null;
        List<MTigo> result = instance.ConsultarRango(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CTigo.
     */
    @Test
    public void testActualizar_List() {
        System.out.println("Actualizar");
        List<MTigo> todos = null;
        CTigo instance = new CTigo();
        boolean expResult = false;
        boolean result = instance.Actualizar(todos);
        assertEquals(expResult, result);
    }
    
}
