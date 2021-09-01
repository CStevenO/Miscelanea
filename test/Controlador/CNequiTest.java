/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MNequi;
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
public class CNequiTest {
    
    public CNequiTest() {
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
     * Test of Insertar method, of class CNequi.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        MNequi intNequi = null;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.Insertar(intNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CNequi.
     */
    @Test
    public void testActualizar_MNequi() {
        System.out.println("Actualizar");
        MNequi actNequi = null;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.Actualizar(actNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class CNequi.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Date fecha = null;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.Eliminar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of Consultar method, of class CNequi.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        Date fecha = null;
        CNequi instance = new CNequi();
        MNequi expResult = null;
        MNequi result = instance.Consultar(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of ConsultarRango method, of class CNequi.
     */
    @Test
    public void testConsultarRango() {
        System.out.println("ConsultarRango");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CNequi instance = new CNequi();
        List<MNequi> expResult = null;
        List<MNequi> result = instance.ConsultarRango(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of Columnas method, of class CNequi.
     */
    @Test
    public void testColumnas() {
        System.out.println("Columnas");
        CNequi instance = new CNequi();
        List<String> expResult = null;
        List<String> result = instance.Columnas();
        assertEquals(expResult, result);
    }

    /**
     * Test of total method, of class CNequi.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Date fechaInicial = null;
        Date fechaFinal = null;
        CNequi instance = new CNequi();
        List<Long> expResult = null;
        List<Long> result = instance.total(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTope method, of class CNequi.
     */
    @Test
    public void testGetTope() {
        System.out.println("getTope");
        CNequi instance = new CNequi();
        long expResult = 0L;
        long result = instance.getTope();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPorcentaje method, of class CNequi.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        CNequi instance = new CNequi();
        float expResult = 0.0F;
        float result = instance.getPorcentaje();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTope method, of class CNequi.
     */
    @Test
    public void testSetTope() {
        System.out.println("setTope");
        Date fecha = null;
        long tope = 0L;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.setTope(fecha, tope);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPorcentaje method, of class CNequi.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        Date fecha = null;
        float porcentaje = 0.0F;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.setPorcentaje(fecha, porcentaje);
        assertEquals(expResult, result);
    }

    /**
     * Test of mes method, of class CNequi.
     */
    @Test
    public void testMes() {
        System.out.println("mes");
        CNequi instance = new CNequi();
        long expResult = 0L;
        long result = instance.mes();
        assertEquals(expResult, result);
    }

    /**
     * Test of Actualizar method, of class CNequi.
     */
    @Test
    public void testActualizar_List() {
        System.out.println("Actualizar");
        List<MNequi> todos = null;
        CNequi instance = new CNequi();
        boolean expResult = false;
        boolean result = instance.Actualizar(todos);
        assertEquals(expResult, result);
    }
    
}
