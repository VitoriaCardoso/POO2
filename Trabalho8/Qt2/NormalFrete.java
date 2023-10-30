public class NormalFrete implements FreteStrategy {

    @Override
    public double calcularFrete(double peso) {
        return peso * 1.0;
    }
}
