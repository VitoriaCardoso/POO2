public class SedexFrete implements FreteStrategy {

    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5;
    }
}
