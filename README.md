# Calculadora ISA ActividadGrupal #

## Introdución ##

En esta actividad grupal realizaremos una calculadora con la metodología TDD.

Usaremos un lenguaje ava y para los test usaremos Junit.

La aplicación consiste de una sencilla calculadora capaz de realizar las siguientes operaciones:

* Suma
* Resta
* Multiplicación
* División
* Raíz
* Exponente

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
[public void deberia_sumar_numeros(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L7-L21)

Y la implementación del códio final de la suma sería:

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    } 
[public double sumar(double numero1, double numero2) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/d2bfb803e08ab52d2d3cf0236bf5ab5a1f624a82/Calculadora/src/main/java/Calculadora.java#L8-L10)

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

Test para resolver la multiplicación:

    public void deberia_multiplicar_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // multiplico los numeros
        final double resultado = calculadora.multiplicar(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 * numero2;
        assertEquals(expected,resultado);
    }
[public void deberia_multiplicar_numeros(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L39-L52)

Y la implantación en el main:

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
[public double multiplicar(double numero1, double numero2) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/d2bfb803e08ab52d2d3cf0236bf5ab5a1f624a82/Calculadora/src/main/java/Calculadora.java#L16-L18)

# DIVISION #

El código en el test: 

    public void deberia_dividir_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double numero2=5;
        final Calculadora calculadora = new Calculadora();
        //when
        // divido los numeros
        final double resultado = calculadora.dividir(numero1,numero2);
        // then
        // el resultado deberia ser el esperado.
        final double expected = numero1 / numero2;
        assertEquals(expected,resultado);
    }
[public void deberia_dividir_numeros(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L54-L67)

Y finalmente la implantación del código en el main:

    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
[public double dividir(double numero1, double numero2) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/d2bfb803e08ab52d2d3cf0236bf5ab5a1f624a82/Calculadora/src/main/java/Calculadora.java#L20-L22)

# RAIZ #

    public void deberia_hacer_la_raiz_cuadrada_de_un_numero(){
        //given
        // la calculadora y datos de los numeros
        final double numero1=3;
        final double indice=2;
        double t;
        final Calculadora calculadora = new Calculadora();
        //when
        // hago la raiz de los numeros
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
[public void deberia_hacer_la_raiz_cuadrada_de_un_numero(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L69-L90)

Quedando la implantación en el main:

    public double raiz(double numero1) {
        return Math.sqrt(numero1);
    }
[public double raiz(double numero1) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/d2bfb803e08ab52d2d3cf0236bf5ab5a1f624a82/Calculadora/src/main/java/Calculadora.java#L24-L26)

# EXPONENTE #

    public void deberia_calcular_exponente_numeros(){
        //given
        // la calculadora y datos de los numeros
        final double base=3;
        double exponente=3;
        double result=1;
        final Calculadora calculadora = new Calculadora();
        //when
        // hago el exponente de los numeros
        final double resultado = calculadora.exponente(base,exponente);
        // then
        // el resultado deberia ser el esperado.
        while (exponente != 0){
            result = calculadora.multiplicar(result,base);
            exponente = calculadora.restar(exponente,1);
        }
        final double expected = result;
        assertEquals(expected,resultado);
    }
[public void deberia_calcular_exponente_numeros(){](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/03af8c086b3232ba8e15f74ee76ee114fb20a64f/Calculadora/src/test/java/CalculadoraTest.java#L92-L110)

Y la última implantación de las operaciones quedaría en el main de la siguiente manera:

    public double exponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }
[public double exponente(double base, double exponente) {](https://github.com/AnaElectroviral/Calculadora_ISA_ActividadGrupal/blob/d2bfb803e08ab52d2d3cf0236bf5ab5a1f624a82/Calculadora/src/main/java/Calculadora.java#L28-L30)

# Resultado de los test con todas las operaciones:

![Test Aprobado](https://am4pap001files.storage.live.com/y4mCVS9J7L2DzDAsT3M7uRFt_6la4043khVoXY0_J2n_OSnpE0_k2JBVZ1tnYO2D0Yya1St6-qp7LZQaFE5CmoBZ2lYFCP5C5qtFhpaHvclqj0mSjAWu4rMjB7_uYnB0OPkHwI6JQJBgNs1z94JQsfJra29ru4wo8xKuBIF9VTdvrvF7XQPQKPUq99W0qr93Pno_Hg8kqRViu6VRuAOWhwNENRrBjU0WShvb9_QNa-EiJ4?encodeFailures=1&width=542&height=365)


## Bibliografia ##

https://geekytheory.com/como-calcular-la-raiz-cuadrada-de-un-numero-en-java/
https://programacion.click/java-calcula-la-raiz-cuadrada-sin-usar-el-metodo-de-biblioteca/#:~:text=Si%20queremos%20calcular%20la%20ra%C3%ADz,Es%20simple.
https://es.acervolima.com/calcular-la-potencia-de-un-numero-en-java-sin-usar-el-metodo-math-pow/

Creadores del contenido:

Ana Bermúdez González @AnaElectroviral

Alain Basabe Llovet @Alain-Basabe

Rafael Gracia Yague @rgraciay
