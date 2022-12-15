package com.example.tiposDatosAvanzados;

import java.math.BigDecimal;

public class TipoBigDecimal {
    public static void main(String[] args) {
        System.out.println(0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f);
        BigDecimal valorA = new BigDecimal(3.14f);
        BigDecimal valorB = new BigDecimal(3.15f);
        valorA.multiply(valorB);
        //Suma de bigDecimal "ValorB a "ValorA"
        valorA.add(valorB);
        //Resultado
        BigDecimal resultado = valorA.add(valorB);
        System.out.println(resultado.toString());
    }
}
