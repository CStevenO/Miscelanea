/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MTuRed;
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
public class CTuRedTest {
    
    public CTuRedTest() {
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
     * Test of Insertar method, of class CTuRed.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        MTuRed recarga = null;
        CTuRed instance = new CTuRed();
        boolean expResult = false;
        boolean result = instance.Insertar(recarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CTuRed.
     */
    @Test
    public void testActualizar_MTuRed() {
        System.out.println("Actualizar");
        MTuRed actRecarga = null;
        CTuRed instance = new CTuRed();
        boolean expResult = false;
        boolean result = instance.Actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consultar method, of class CTuRed.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        Date fecha = null;
        CTuRed instance = new CTuRed();
        MTuRed expResult = null;
        MTuRed result = instance.Consultar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of ConsultarRango method, of class CTuRed.
     */
    @Test
    public void testConsultarRango() {
        System.out.println("ConsultarRango");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CTuRed instance = new CTuRed();
        List<MTuRed> expResult = null;
        List<MTuRed> result = instance.ConsultarRango(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CTuRed.
     */
    @Test
    public void testActualizar_List() {
        System.out.println("Actualizar");
        List<MTuRed> todos = null;
        CTuRed instance = new CTuRed();
        boolean expResult = false;
        boolean result = instance.Actualizar(todos);
        assertEquals(expResult, result);
    }
    
}
