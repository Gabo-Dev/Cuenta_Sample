/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        int expResult = 50;
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
        System.out.println(c.getBalance());
        c.depositar(cantidad);
        System.out.println(c.getBalance());
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        int cantidad = 60;
        System.out.println(c.getBalance());
        try {
            c.retirar(cantidad);
            System.out.println(c.getBalance());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
}
