/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

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
public class DataConnectionTest {
    
    public DataConnectionTest() {
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
     * Test of conectar method, of class DataConnection.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        DataConnection instance = new DataConnection();
        instance.conectar();
    }

    /**
     * Test of desconectar method, of class DataConnection.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        DataConnection instance = new DataConnection();
        instance.desconectar();
    }
    
}
