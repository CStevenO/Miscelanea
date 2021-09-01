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
public class TuRedTest {
    
    public TuRedTest() {
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
     * Test of limpiar method, of class TuRed.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        TuRed instance = new TuRed();
        instance.limpiar();
    }

    /**
     * Test of main method, of class TuRed.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TuRed.main(args);
    }
    
}
