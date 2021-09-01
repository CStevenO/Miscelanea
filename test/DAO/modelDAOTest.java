/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.MImpresion;
import Modelo.MNequi;
import Modelo.MSoluciones;
import Modelo.MTigo;
import Modelo.MTuLlave;
import Modelo.MTuRed;
import java.sql.Date;
import java.util.ArrayList;
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
public class modelDAOTest {
    
    public modelDAOTest() {
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
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_MTuRed() {
        System.out.println("insertar");
        MTuRed intRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_MTigo() {
        System.out.println("insertar");
        MTigo intRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_MSoluciones() {
        System.out.println("insertar");
        MSoluciones intRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_MNequi() {
        System.out.println("insertar");
        MNequi intNequi = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(intNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_MTuLlave() {
        System.out.println("insertar");
        MTuLlave intLlave = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(intLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class modelDAO.
     */
    @Test
    public void testActualizar_MTuRed() {
        System.out.println("actualizar");
        MTuRed actRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class modelDAO.
     */
    @Test
    public void testActualizar_MTigo() {
        System.out.println("actualizar");
        MTigo actRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class modelDAO.
     */
    @Test
    public void testActualizar_MSoluciones() {
        System.out.println("actualizar");
        MSoluciones actRecarga = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class modelDAO.
     */
    @Test
    public void testActualizar_MNequi() {
        System.out.println("actualizar");
        MNequi actNequi = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.actualizar(actNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class modelDAO.
     */
    @Test
    public void testActualizar_MTuLlave() {
        System.out.println("actualizar");
        MTuLlave actLlave = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.actualizar(actLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class modelDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Date fecha = null;
        String servicio = "";
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.eliminar(fecha, servicio);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarR method, of class modelDAO.
     */
    @Test
    public void testConsultarR() {
        System.out.println("consultarR");
        Date fecha = null;
        modelDAO instance = new modelDAO();
        MTuRed expResult = null;
        MTuRed result = instance.consultarR(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarTi method, of class modelDAO.
     */
    @Test
    public void testConsultarTi() {
        System.out.println("consultarTi");
        Date fecha = null;
        modelDAO instance = new modelDAO();
        MTigo expResult = null;
        MTigo result = instance.consultarTi(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarS method, of class modelDAO.
     */
    @Test
    public void testConsultarS() {
        System.out.println("consultarS");
        Date fecha = null;
        modelDAO instance = new modelDAO();
        MSoluciones expResult = null;
        MSoluciones result = instance.consultarS(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarN method, of class modelDAO.
     */
    @Test
    public void testConsultarN() {
        System.out.println("consultarN");
        Date fecha = null;
        modelDAO instance = new modelDAO();
        MNequi expResult = null;
        MNequi result = instance.consultarN(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarT method, of class modelDAO.
     */
    @Test
    public void testConsultarT() {
        System.out.println("consultarT");
        Date fecha = null;
        modelDAO instance = new modelDAO();
        MTuLlave expResult = null;
        MTuLlave result = instance.consultarT(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoR method, of class modelDAO.
     */
    @Test
    public void testConsultarRangoR() {
        System.out.println("consultarRangoR");
        Date fechaInicial = null;
        Date fechaFinal = null;
        modelDAO instance = new modelDAO();
        List<MTuRed> expResult = null;
        List<MTuRed> result = instance.consultarRangoR(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoTi method, of class modelDAO.
     */
    @Test
    public void testConsultarRangoTi() {
        System.out.println("consultarRangoTi");
        Date fechaInicial = null;
        Date fechaFinal = null;
        modelDAO instance = new modelDAO();
        List<MTigo> expResult = null;
        List<MTigo> result = instance.consultarRangoTi(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoS method, of class modelDAO.
     */
    @Test
    public void testConsultarRangoS() {
        System.out.println("consultarRangoS");
        Date fechaInicial = null;
        Date fechaFinal = null;
        modelDAO instance = new modelDAO();
        List<MSoluciones> expResult = null;
        List<MSoluciones> result = instance.consultarRangoS(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoN method, of class modelDAO.
     */
    @Test
    public void testConsultarRangoN() {
        System.out.println("consultarRangoN");
        Date fechaInicial = null;
        Date fechaFinal = null;
        modelDAO instance = new modelDAO();
        List<MNequi> expResult = null;
        List<MNequi> result = instance.consultarRangoN(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoT method, of class modelDAO.
     */
    @Test
    public void testConsultarRangoT() {
        System.out.println("consultarRangoT");
        Date fechaInicial = null;
        Date fechaFinal = null;
        modelDAO instance = new modelDAO();
        List<MTuLlave> expResult = null;
        List<MTuLlave> result = instance.consultarRangoT(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of total method, of class modelDAO.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Date fechaInicial = null;
        Date fechaFinal = null;
        String plataforma = "";
        modelDAO instance = new modelDAO();
        ArrayList<Long> expResult = null;
        ArrayList<Long> result = instance.total(fechaInicial, fechaFinal, plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of columnas method, of class modelDAO.
     */
    @Test
    public void testColumnas() {
        System.out.println("columnas");
        String plataforma = "";
        modelDAO instance = new modelDAO();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.columnas(plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTope method, of class modelDAO.
     */
    @Test
    public void testGetTope() {
        System.out.println("getTope");
        String plataforma = "";
        modelDAO instance = new modelDAO();
        long expResult = 0L;
        long result = instance.getTope(plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPorcentaje method, of class modelDAO.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        String plataforma = "";
        modelDAO instance = new modelDAO();
        float expResult = 0.0F;
        float result = instance.getPorcentaje(plataforma);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTope method, of class modelDAO.
     */
    @Test
    public void testSetTope() {
        System.out.println("setTope");
        Date fecha = null;
        String plataforma = "";
        long tope = 0L;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.setTope(fecha, plataforma, tope);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPorcentaje method, of class modelDAO.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        Date fecha = null;
        String plataforma = "";
        float porcentaje = 0.0F;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.setPorcentaje(fecha, plataforma, porcentaje);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarMovimiento method, of class modelDAO.
     */
    @Test
    public void testConsultarMovimiento() {
        System.out.println("consultarMovimiento");
        modelDAO instance = new modelDAO();
        long expResult = 0L;
        long result = instance.consultarMovimiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class modelDAO.
     */
    @Test
    public void testInsertar_List() {
        System.out.println("insertar");
        List<MImpresion> impresiones = null;
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.insertar(impresiones);
        assertEquals(expResult, result);
    }

    /**
     * Test of comprobar method, of class modelDAO.
     */
    @Test
    public void testComprobar() {
        System.out.println("comprobar");
        modelDAO instance = new modelDAO();
        boolean expResult = false;
        boolean result = instance.comprobar();
        assertEquals(expResult, result);
    }
    
}
