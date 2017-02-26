package br.com.dojo;

import java.util.List;

public class TesteFizzBuzz {

    public static void main(String[] args) {
        
        FizzBuzz fb = new FizzBuzz();
        
        List<Integer> numeros = fb.getNumeros();
        
        numeros.forEach(n -> System.out.println(fb.retornarValor(n)));
        
    }
    
}
