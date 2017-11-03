/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VicDance
 */
public class EmpleadoBRTest {
    
    public EmpleadoBRTest() {
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
     * Test of calculaSalarioBruto method, of class EmpleadoBR.
     */
    @Test
    public void testCalculaSalarioBruto() throws Exception {
        System.out.println("calculaSalarioBruto");
        int tipo = 1;
        float ventaMes = 1000.0F;
        float horasExtra = 2.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 1140.0F;
        float result = instance.calculaSalarioBruto(tipo, ventaMes, horasExtra);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculaSalarioBruto1() throws Exception {
        System.out.println("calculaSalarioBruto");
        int tipo = 0;
        float ventaMes = 2000.0F;
        float horasExtra = 2.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 1740.0F;
        float result = instance.calculaSalarioBruto(tipo, ventaMes, horasExtra);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioNeto method, of class EmpleadoBR.
     */
    @Test
    public void testCalcularSalarioNeto() {
        System.out.println("calcularSalarioNeto");
        float salarioBruto = 1000.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 1000.0F;
        float result = instance.calcularSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testCalcularSalarioNeto1() {
        System.out.println("calcularSalarioNeto");
        float salarioBruto = 1500.0F;
        EmpleadoBR instance = new EmpleadoBR();
        float expResult = 1260.0F;
        float result = instance.calcularSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
