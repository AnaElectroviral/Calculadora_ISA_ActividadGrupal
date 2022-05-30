import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSuma {

    @Test public void
    debe_dar_la_suma_correctamente() {
        //given
        // Datos para la suma
        double numero1 = 3;
        double numero2 = 5;

        Calculadora suma = new Calculadora(numero1, numero2);

        //when
        // Llamando al caso de uso crear suma
        TestSuma target = new TestSuma();
        target.execute(suma);

        //then
        // Tendremos el resultado de la suma
        double sumaToAssert = "La suma es: " + numero1 + numero2;
        assertEquals(sumaToAssert, Calculadora.getResultado);

    }

}
