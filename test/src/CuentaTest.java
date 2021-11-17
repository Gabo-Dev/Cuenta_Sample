/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhony
 */
public class CuentaTest {
    Cuenta c ;
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         c = new Cuenta(50,12345);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBalance method, of class Cuenta.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        int expResult = 0;
        int result = c.getBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of depositar method, of class Cuenta.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        int cantidad = 5;
        c.depositar(cantidad);
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        int cantidad = 10;
        c.retirar(cantidad);
    }
    
}
