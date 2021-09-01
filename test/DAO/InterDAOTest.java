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
public class InterDAOTest {
    
    public InterDAOTest() {
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
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_MTuRed() {
        System.out.println("insertar");
        MTuRed intRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_MTigo() {
        System.out.println("insertar");
        MTigo intRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_MSoluciones() {
        System.out.println("insertar");
        MSoluciones intRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(intRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_MNequi() {
        System.out.println("insertar");
        MNequi intNequi = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(intNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_MTuLlave() {
        System.out.println("insertar");
        MTuLlave intLlave = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(intLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class InterDAO.
     */
    @Test
    public void testActualizar_MTuRed() {
        System.out.println("actualizar");
        MTuRed actRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class InterDAO.
     */
    @Test
    public void testActualizar_MTigo() {
        System.out.println("actualizar");
        MTigo actRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class InterDAO.
     */
    @Test
    public void testActualizar_MSoluciones() {
        System.out.println("actualizar");
        MSoluciones actRecarga = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar(actRecarga);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class InterDAO.
     */
    @Test
    public void testActualizar_MNequi() {
        System.out.println("actualizar");
        MNequi actNequi = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar(actNequi);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class InterDAO.
     */
    @Test
    public void testActualizar_MTuLlave() {
        System.out.println("actualizar");
        MTuLlave actLlave = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.actualizar(actLlave);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class InterDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Date fecha = null;
        String servicio = "";
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.eliminar(fecha, servicio);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarR method, of class InterDAO.
     */
    @Test
    public void testConsultarR() {
        System.out.println("consultarR");
        Date fecha = null;
        InterDAO instance = new InterDAOImpl();
        MTuRed expResult = null;
        MTuRed result = instance.consultarR(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarTi method, of class InterDAO.
     */
    @Test
    public void testConsultarTi() {
        System.out.println("consultarTi");
        Date fecha = null;
        InterDAO instance = new InterDAOImpl();
        MTigo expResult = null;
        MTigo result = instance.consultarTi(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarS method, of class InterDAO.
     */
    @Test
    public void testConsultarS() {
        System.out.println("consultarS");
        Date fecha = null;
        InterDAO instance = new InterDAOImpl();
        MSoluciones expResult = null;
        MSoluciones result = instance.consultarS(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarN method, of class InterDAO.
     */
    @Test
    public void testConsultarN() {
        System.out.println("consultarN");
        Date fecha = null;
        InterDAO instance = new InterDAOImpl();
        MNequi expResult = null;
        MNequi result = instance.consultarN(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarT method, of class InterDAO.
     */
    @Test
    public void testConsultarT() {
        System.out.println("consultarT");
        Date fecha = null;
        InterDAO instance = new InterDAOImpl();
        MTuLlave expResult = null;
        MTuLlave result = instance.consultarT(fecha);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoR method, of class InterDAO.
     */
    @Test
    public void testConsultarRangoR() {
        System.out.println("consultarRangoR");
        Date fechaInicial = null;
        Date fechaFinal = null;
        InterDAO instance = new InterDAOImpl();
        List<MTuRed> expResult = null;
        List<MTuRed> result = instance.consultarRangoR(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoTi method, of class InterDAO.
     */
    @Test
    public void testConsultarRangoTi() {
        System.out.println("consultarRangoTi");
        Date fechaInicial = null;
        Date fechaFinal = null;
        InterDAO instance = new InterDAOImpl();
        List<MTigo> expResult = null;
        List<MTigo> result = instance.consultarRangoTi(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoS method, of class InterDAO.
     */
    @Test
    public void testConsultarRangoS() {
        System.out.println("consultarRangoS");
        Date fechaInicial = null;
        Date fechaFinal = null;
        InterDAO instance = new InterDAOImpl();
        List<MSoluciones> expResult = null;
        List<MSoluciones> result = instance.consultarRangoS(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoN method, of class InterDAO.
     */
    @Test
    public void testConsultarRangoN() {
        System.out.println("consultarRangoN");
        Date fechaInicial = null;
        Date fechaFinal = null;
        InterDAO instance = new InterDAOImpl();
        List<MNequi> expResult = null;
        List<MNequi> result = instance.consultarRangoN(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarRangoT method, of class InterDAO.
     */
    @Test
    public void testConsultarRangoT() {
        System.out.println("consultarRangoT");
        Date fechaInicial = null;
        Date fechaFinal = null;
        InterDAO instance = new InterDAOImpl();
        List<MTuLlave> expResult = null;
        List<MTuLlave> result = instance.consultarRangoT(fechaInicial, fechaFinal);
        assertEquals(expResult, result);
    }

    /**
     * Test of total method, of class InterDAO.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Date fechaInicial = null;
        Date fechaFinal = null;
        String plataforma = "";
        InterDAO instance = new InterDAOImpl();
        ArrayList<Long> expResult = null;
        ArrayList<Long> result = instance.total(fechaInicial, fechaFinal, plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of columnas method, of class InterDAO.
     */
    @Test
    public void testColumnas() {
        System.out.println("columnas");
        String plataforma = "";
        InterDAO instance = new InterDAOImpl();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.columnas(plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTope method, of class InterDAO.
     */
    @Test
    public void testGetTope() {
        System.out.println("getTope");
        String plataforma = "";
        InterDAO instance = new InterDAOImpl();
        long expResult = 0L;
        long result = instance.getTope(plataforma);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPorcentaje method, of class InterDAO.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        String plataforma = "";
        InterDAO instance = new InterDAOImpl();
        float expResult = 0.0F;
        float result = instance.getPorcentaje(plataforma);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTope method, of class InterDAO.
     */
    @Test
    public void testSetTope() {
        System.out.println("setTope");
        Date fecha = null;
        String plataforma = "";
        long tope = 0L;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.setTope(fecha, plataforma, tope);
        assertEquals(expResult, result);
    }

    /**
     * Test of setPorcentaje method, of class InterDAO.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        Date fecha = null;
        String plataforma = "";
        float porcentaje = 0.0F;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.setPorcentaje(fecha, plataforma, porcentaje);
        assertEquals(expResult, result);
    }

    /**
     * Test of consultarMovimiento method, of class InterDAO.
     */
    @Test
    public void testConsultarMovimiento() {
        System.out.println("consultarMovimiento");
        InterDAO instance = new InterDAOImpl();
        long expResult = 0L;
        long result = instance.consultarMovimiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class InterDAO.
     */
    @Test
    public void testInsertar_List() {
        System.out.println("insertar");
        List<MImpresion> impresiones = null;
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.insertar(impresiones);
        assertEquals(expResult, result);
    }

    /**
     * Test of comprobar method, of class InterDAO.
     */
    @Test
    public void testComprobar() {
        System.out.println("comprobar");
        InterDAO instance = new InterDAOImpl();
        boolean expResult = false;
        boolean result = instance.comprobar();
        assertEquals(expResult, result);
    }

    public class InterDAOImpl implements InterDAO {

        public boolean insertar(MTuRed intRecarga) {
            return false;
        }

        public boolean insertar(MTigo intRecarga) {
            return false;
        }

        public boolean insertar(MSoluciones intRecarga) {
            return false;
        }

        public boolean insertar(MNequi intNequi) {
            return false;
        }

        public boolean insertar(MTuLlave intLlave) {
            return false;
        }

        public boolean actualizar(MTuRed actRecarga) {
            return false;
        }

        public boolean actualizar(MTigo actRecarga) {
            return false;
        }

        public boolean actualizar(MSoluciones actRecarga) {
            return false;
        }

        public boolean actualizar(MNequi actNequi) {
            return false;
        }

        public boolean actualizar(MTuLlave actLlave) {
            return false;
        }

        public boolean eliminar(Date fecha, String servicio) {
            return false;
        }

        public MTuRed consultarR(Date fecha) {
            return null;
        }

        public MTigo consultarTi(Date fecha) {
            return null;
        }

        public MSoluciones consultarS(Date fecha) {
            return null;
        }

        public MNequi consultarN(Date fecha) {
            return null;
        }

        public MTuLlave consultarT(Date fecha) {
            return null;
        }

        public List<MTuRed> consultarRangoR(Date fechaInicial, Date fechaFinal) {
            return null;
        }

        public List<MTigo> consultarRangoTi(Date fechaInicial, Date fechaFinal) {
            return null;
        }

        public List<MSoluciones> consultarRangoS(Date fechaInicial, Date fechaFinal) {
            return null;
        }

        public List<MNequi> consultarRangoN(Date fechaInicial, Date fechaFinal) {
            return null;
        }

        public List<MTuLlave> consultarRangoT(Date fechaInicial, Date fechaFinal) {
            return null;
        }

        public ArrayList<Long> total(Date fechaInicial, Date fechaFinal, String plataforma) {
            return null;
        }

        public ArrayList<String> columnas(String plataforma) {
            return null;
        }

        public long getTope(String plataforma) {
            return 0L;
        }

        public float getPorcentaje(String plataforma) {
            return 0.0F;
        }

        public boolean setTope(Date fecha, String plataforma, long tope) {
            return false;
        }

        public boolean setPorcentaje(Date fecha, String plataforma, float porcentaje) {
            return false;
        }

        public long consultarMovimiento() {
            return 0L;
        }

        public boolean insertar(List<MImpresion> impresiones) {
            return false;
        }

        public boolean comprobar() {
            return false;
        }
    }
    
}
