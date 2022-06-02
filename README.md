# Calculadora ISA ActividadGrupal #

## Introdución ##

En esta actividad grupal realizaremos una calculadora con la metodología TDD.

Usaremos un lenguaje java y para los test usaremos Test Runner for Java.

La aplicación consiste de una sencilla calculadora capaz de realizar las siguientes operaciones:

* Suma
* Resta
* Multiplicación
* División
* Raíz

# SUMA #

El test para resolver la suma:

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

Y la implementación del códio final de la suma sería:

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    } 

# RESTA #

