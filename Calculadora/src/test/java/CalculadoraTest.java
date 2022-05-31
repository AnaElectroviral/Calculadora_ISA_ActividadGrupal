import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void deberia_sumar_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // sumo los numeros
        final double resultado = calculadora.sumar(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 + numero2;
        assertEquals(expected,resultado);

    }
    @Test
    public void deberia_restar_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // sumo los numeros
        final double resultado = calculadora.restar(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 - numero2;
        assertEquals(expected,resultado);
    }

    @Test
    public void deberia_multiplicar_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // sumo los numeros
        final double resultado = calculadora.multiplicar(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 * numero2;
        assertEquals(expected,resultado);
    }
    @Test
    public void deberia_dividir_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // sumo los numeros
        final double resultado = calculadora.dividir(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 / numero2;
        assertEquals(expected,resultado);
    }
    @Test
    public void deberia_hacer_la_raiz_cuadrada_de_un_numero(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double indice=2;
        double t;
        final Calculadora calculadora = new Calculadora();
        //when
        // sumo los numeros
        final double resultado = calculadora.raiz(numero1);
        // then
        // el resultado deberia ser el esperado.
        double square = calculadora.dividir(numero1,indice);

        do {
            t = square;
            square = calculadora.dividir((calculadora.sumar(t, (calculadora.dividir(numero1, t)))),indice);

        } while ((calculadora.restar(t,square)) != 0 );
        final double expected = square;
        assertEquals(expected,resultado);
    }
}