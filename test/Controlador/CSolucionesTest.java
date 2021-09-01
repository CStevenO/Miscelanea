/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MSoluciones;
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
public class CSolucionesTest {
    
    public CSolucionesTest() {
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
     * Test of Insertar method, of class CSoluciones.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        MSoluciones recarga = null;
        CSoluciones instance = new CSoluciones();
        boolean expResult = false;
        boolean result = instance.Insertar(recarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CSoluciones.
     */
    @Test
    public void testActualizar_MSoluciones() {
        System.out.println("Actualizar");
        MSoluciones actRecarga = null;
        CSoluciones instance = new CSoluciones();
        boolean expResult = false;
        boolean result = instance.Actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consultar method, of class CSoluciones.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        Date fecha = null;
        CSoluciones instance = new CSoluciones();
        MSoluciones expResult = null;
        MSoluciones result = instance.Consultar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of ConsultarRango method, of class CSoluciones.
     */
    @Test
    public void testConsultarRango() {
        System.out.println("ConsultarRango");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CSoluciones instance = new CSoluciones();
        List<MSoluciones> expResult = null;
        List<MSoluciones> result = instance.ConsultarRango(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CSoluciones.
     */
    @Test
    public void testActualizar_List() {
        System.out.println("Actualizar");
        List<MSoluciones> todos = null;
        CSoluciones instance = new CSoluciones();
        boolean expResult = false;
        boolean result = instance.Actualizar(todos);
        assertEquals(expResult, result);
    }
    
}
