public class CalculadoraBinarioAdapter implements Calculadora{

    Binario binario;
    String a = "10";
    String b = "10";

    public CalculadoraBinarioAdapter(Binario binario){
        this.binario = binario;
    }
    @Override
    public void somar() {
        binario.somar(a,b);
    }

    @Override
    public void subtrair() {
        binario.subtrair(a,b);
    }

    @Override
    public void multiplicar() {
        binario.multiplicar(a,b);
    }
}
