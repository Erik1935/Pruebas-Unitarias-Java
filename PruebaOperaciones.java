/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.calculadora.calcu;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author erikj
 */
public class PruebaOperaciones {
    
    public PruebaOperaciones() {
    }
    calcu calcu1 = new calcu();
    calcu operacion1 = calcu1;
     @Test
    public void testSomething() {
        assertEquals(5, calcu1.suma(2,3));
         assertEquals(-5, calcu1.suma(-2,-3));
         assertEquals(0, calcu1.resta(2,2));
         assertEquals(1, calcu1.resta(-2,-3));
         assertEquals(6, calcu1.multiplicacion(2,3));
         assertEquals(6, calcu1.multiplicacion(-2,-3));
         assertEquals(1, calcu1.division(2,2));
         assertEquals(0, calcu1.division(-2,-3));
    }
     @Test
    public void testSuma1(){
        assertEquals(5, operacion1.suma(3,2));
    }
     @Test
    public void testSuma2(){
        assertEquals(5, operacion1.suma(4,1));
    }

    public void testResta1(){
        assertEquals(5, operacion1.resta(7,2));
    }
    
    @Test
    public void testResta2(){
        assertEquals(-3, operacion1.resta(-4,-1));
    }

    @Test
    public void testMultiplicacion1(){
        assertEquals(6, operacion1.multiplicacion(3,2));
    }
    
    @Test
    public void testMultiplicacion2(){
        assertEquals(6, operacion1.multiplicacion(-3,-2));
    }    
     @Test
    public void testDivision1(){
        assertEquals(3, operacion1.division(6,2));
    }
    
    @Test
    public void testDivision2(){
        assertEquals(3, operacion1.division(-6,-2));
    }  
    @Test
    public void testExponenciacion(){
        assertEquals(36, operacion1.exponenciacion(-6,2));
    }  
     @Test
    public void testExponenciacion2(){
        assertEquals(4, operacion1.exponenciacion(2,2));
    }
     @Test
    public void testraiz(){
        assertEquals(9, operacion1.raiz(81));
    }  
      @Test
    public void testraiz2(){
        assertEquals(2, operacion1.raiz(4));
    }  
       @Test
    public void testPorcentaje(){
        assertEquals(1125.0, operacion1.porcentaje(15,7500));
    }  
        @Test
    public void testPorcentaje2(){
        assertEquals(750, operacion1.porcentaje(10,7500));
    }  

}
