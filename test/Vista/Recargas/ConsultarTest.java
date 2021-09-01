/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Recargas;

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
public class ConsultarTest {
    
    public ConsultarTest() {
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
     * Test of hola method, of class Consultar.
     */
    @Test
    public void testHola() {
        System.out.println("hola");
        String id = "";
        String result_2 = "";
        Consultar instance = new Consultar();
        instance.hola(id, result_2);
    }

    /**
     * Test of main method, of class Consultar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Consultar.main(args);
    }
    
}
