public class Calculadora {
    public Calculadora() {

    }

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public double raiz(double numero1) {
        return Math.sqrt(numero1);
    }

    public double exponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}