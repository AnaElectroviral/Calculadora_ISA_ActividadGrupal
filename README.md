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

El test para resolver la resta:

    public void deberia_restar_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // resto los numeros
        final double resultado = calculadora.restar(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 - numero2;
        assertEquals(expected,resultado);
    }
[public void deberia_restar_numeros(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L23-L36)

Y la implementación quedaría de la siguiente manera: 

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

[public double restar(double numero1, double numero2) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/2f54a49226c7a86bff3c80edbe8d63c2c9949873/Calculadora/src/main/java/Calculadora.java#L11-L14)

# MULTIPLICACIÓN #










# Resultado de los test con todas las operaciones:

![Test Aprobado](https://am4pap001files.storage.live.com/y4mCVS9J7L2DzDAsT3M7uRFt_6la4043khVoXY0_J2n_OSnpE0_k2JBVZ1tnYO2D0Yya1St6-qp7LZQaFE5CmoBZ2lYFCP5C5qtFhpaHvclqj0mSjAWu4rMjB7_uYnB0OPkHwI6JQJBgNs1z94JQsfJra29ru4wo8xKuBIF9VTdvrvF7XQPQKPUq99W0qr93Pno_Hg8kqRViu6VRuAOWhwNENRrBjU0WShvb9_QNa-EiJ4?encodeFailures=1&width=542&height=365)


Creadores del contenido:

Ana Bermúdez González

Alain Basabe Llovet

Rafael Gracia Yague
