public class CalculadoraDecimal implements Decimal{
    @Override
    public int somar(int a, int b) {
        System.out.println("A soma de decimal é: " + (a+b));
        return 0;
    }

    @Override
    public int subtrair(int a, int b) {
        System.out.println("A subtração de decimal é: " + (a-b));
        return 0;
    }

    @Override
    public int multiplicar(int a, int b) {
        System.out.println("A multiplicação de decimal é: " + (a*b));
        return 0;
    }
}
