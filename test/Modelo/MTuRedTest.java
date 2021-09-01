/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class MTuRedTest {
    
    public MTuRedTest() {
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
     * Test of calcular method, of class MTuRed.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        MTuRed instance = new MTuRed();
        instance.calcular();
    }

    /**
     * Test of calcular method, of class MTuRed.
     */
    @Test
    public void testCalcular_MTuRed() {
        System.out.println("calcular");
        MTuRed anterior = null;
        MTuRed instance = new MTuRed();
        instance.calcular(anterior);
    }
    
}
