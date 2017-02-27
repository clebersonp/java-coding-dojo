package br.com.dojo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final int DIVISAO_POR_TREZ = 3;
    private static final int DIVISAO_POR_CINCO = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private List<Integer> numeros = new ArrayList<>();

    public FizzBuzz() {
        this.preencheLista();
    }
    
    public boolean isDivisivelPor3(int number) {
        return (number % DIVISAO_POR_TREZ == 0);
    }
    
    public boolean isDivisivelPor5(int number) {
        return (number % DIVISAO_POR_CINCO == 0);
    }
    
    public boolean isDivisivelPor3E5(int number) {
        return (this.isDivisivelPor3(number) && this.isDivisivelPor5(number));
    }
    
    public String retornarValor(int number) {
        if (this.isDivisivelPor3E5(number)) {
            return FIZZ_BUZZ;
        } else if (this.isDivisivelPor3(number)) {
            return FIZZ;
        } else if (this.isDivisivelPor5(number)) {
            return BUZZ;
        }
        return "" + number;
    }
    
    public List<Integer> getNumeros() {
        return this.numeros;
    }
    
    private void preencheLista() {
        for (int i = 1; i <= 100; i++) {
            this.numeros.add(i);
        }
    }
    
}
