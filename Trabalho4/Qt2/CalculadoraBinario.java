public class CalculadoraBinario implements Binario{
    @Override
    public String subtrair(String a, String b) {
        System.out.println("A subtração do binario: "+ Integer.toBinaryString(Integer.parseInt(a,2) - Integer.parseInt(b,2)));
        return null;
    }

    @Override
    public String somar(String a, String b) {
        System.out.println("A soma do binario: " + Integer.toBinaryString(Integer.parseInt(a,2) - Integer.parseInt(b,2)));

        return null;
    }

    @Override
    public String multiplicar(String a, String b) {
        System.out.println("A multiplicação do binario: " + Integer.toBinaryString(Integer.parseInt(a,2) * Integer.parseInt(b,2)));
        return null;
    }
}
