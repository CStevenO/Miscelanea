/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MTuLlave;
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
public class CLlaveTest {
    
    public CLlaveTest() {
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
     * Test of Insertar method, of class CLlave.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        MTuLlave intLlave = null;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.Insertar(intLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CLlave.
     */
    @Test
    public void testActualizar_MTuLlave() {
        System.out.println("Actualizar");
        MTuLlave actLlave = null;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.Actualizar(actLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class CLlave.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Date fecha = null;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.Eliminar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consultar method, of class CLlave.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        Date fecha = null;
        CLlave instance = new CLlave();
        MTuLlave expResult = null;
        MTuLlave result = instance.Consultar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of ConsultarRango method, of class CLlave.
     */
    @Test
    public void testConsultarRango() {
        System.out.println("ConsultarRango");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CLlave instance = new CLlave();
        List<MTuLlave> expResult = null;
        List<MTuLlave> result = instance.ConsultarRango(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of Columnas method, of class CLlave.
     */
    @Test
    public void testColumnas() {
        System.out.println("Columnas");
        CLlave instance = new CLlave();
        List<String> expResult = null;
        List<String> result = instance.Columnas();
        assertEquals(expResult, result);
    }

    /**
     * Test of total method, of class CLlave.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CLlave instance = new CLlave();
        List<Long> expResult = null;
        List<Long> result = instance.total(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTope method, of class CLlave.
     */
    @Test
    public void testGetTope() {
        System.out.println("getTope");
        CLlave instance = new CLlave();
        long expResult = 0L;
        long result = instance.getTope();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPorcentaje method, of class CLlave.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        CLlave instance = new CLlave();
        float expResult = 0.0F;
        float result = instance.getPorcentaje();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTope method, of class CLlave.
     */
    @Test
    public void testSetTope() {
        System.out.println("setTope");
        Date fecha = null;
        long tope = 0L;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.setTope(fecha, tope);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPorcentaje method, of class CLlave.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        Date fecha = null;
        float porcentaje = 0.0F;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.setPorcentaje(fecha, porcentaje);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CLlave.
     */
    @Test
    public void testActualizar_List() {
        System.out.println("Actualizar");
        List<MTuLlave> todos = null;
        CLlave instance = new CLlave();
        boolean expResult = false;
        boolean result = instance.Actualizar(todos);
        assertEquals(expResult, result);
    }
    
}
