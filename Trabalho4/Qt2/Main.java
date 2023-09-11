public class Main {
    public static void main(String[] args) {
        Decimal dc = new CalculadoraDecimal();
        Calculadora cda = new CalculadoraDecimalAdapter(dc);

        Binario bn = new CalculadoraBinario();
        Calculadora cba = new CalculadoraBinarioAdapter(bn);

        Main main = new Main();

        main.calcular(cda);
        main.calcular(cba);


    }

    public void calcular(Calculadora calculadora){
        calculadora.multiplicar();
        calculadora.somar();
        calculadora.subtrair();
    }
}
