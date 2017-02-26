package br.com.dojo;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/*
 * FizzBuzz

 *  Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
 * 
 *  Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
 *  Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
 *  Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.
 *  Caso contrário deverá retornar o próprio número.
 * 
 */


public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void init() {
        this.fb = new FizzBuzz();
    }

    @Test
    public void deveInstanciarFizzBuzz() {
        assertNotNull(this.fb);
    }
    
    @Test
    public void deveSerDivisivelPor3() {
        int number = 3;
        boolean isDivisivel = this.fb.isDivisivelPor3(number);
        assertTrue(isDivisivel);
    }
    
    @Test
    public void deveSerDivisivelPor5() {
        int number = 5;
        boolean isDivisivel = this.fb.isDivisivelPor5(number);
        assertTrue(isDivisivel);
    }
    
    @Test
    public void deveSerDivisivelPor3E5() {
        int number = 15;
        boolean isDivisivel = this.fb.isDivisivelPor3E5(number);
        assertTrue(isDivisivel);
    }
    
    @Test
    public void deveRetornarFizz() {
        int number = 3;
        String valor = fb.retornarValor(number);
        assertEquals("Fizz", valor);
    }
    
    @Test
    public void deveRetornarBuzz() {
        int number = 5;
        String valor = fb.retornarValor(number);
        assertEquals("Buzz", valor);
    }
    
    @Test
    public void deveRetornarFizzBuzz() {
        int number = 15;
        String valor = fb.retornarValor(number);
        assertEquals("FizzBuzz", valor);
    }
    
    @Test
    public void deveRetornarOProprioNumero7() {
        int number = 7;
        String valor = fb.retornarValor(number);
        assertEquals("7", valor);
    }
    
    @Test
    public void deveRetornarOProprioNumero148() {
        int number = 148;
        String valor = fb.retornarValor(number);
        assertEquals("148", valor);
    }
    
    @Test
    public void deveRetornarFizzBuzzParaNumero135() {
        int number = 135;
        String valor = fb.retornarValor(number);
        assertEquals("FizzBuzz", valor);
    }

}
