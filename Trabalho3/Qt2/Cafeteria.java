public class Cafeteria {
    public static void main(String[] args) {
        Decaf cafe_descafeinado = new Decaf();
        Canela canela = new Canela(cafe_descafeinado);

        System.out.print(canela.calculaCusto());
        System.err.print(canela.getDescricao());
    }
}
