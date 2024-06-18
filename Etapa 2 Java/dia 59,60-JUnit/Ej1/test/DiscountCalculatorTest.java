/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flopy
 */
public class DiscountCalculatorTest {
  
    
    public DiscountCalculatorTest() {
    }
    DiscountCalculatorService dss;
    DiscountCalculator ds;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dss=new DiscountCalculatorService();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deberiaCalcularEl10(){
        assertEquals(100,dss.calcularDescuento(new DiscountCalculator(1000,10)),0);
    }
    
    @Test 
    public void deberiaCalcularEl50(){
        assertEquals(500,dss.calcularDescuento(new DiscountCalculator(1000,50)),50);
    }
    @Test
    public void deberiaDarElPrecioFinalConEl20(){
        assertEquals(800,dss.precioConDescuento(new DiscountCalculator(1000,20)),0);
    }
}
