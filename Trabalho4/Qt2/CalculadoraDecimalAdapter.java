public class CalculadoraDecimalAdapter implements Calculadora{

    Decimal decimal;
    int a = 3;
    int b = 3;

    public CalculadoraDecimalAdapter(Decimal decimal){
        this.decimal = decimal;
    }

    @Override
    public void somar() {
        decimal.somar(a, b);

    }

    @Override
    public void subtrair() {
        decimal.subtrair(a,b);
    }

    @Override
    public void multiplicar() {
        decimal.multiplicar(a,b);
    }
}
