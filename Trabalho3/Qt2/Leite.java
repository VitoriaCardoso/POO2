public class Leite extends ToppingDecorator{
    public Leite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 5.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Leite.";
    }
}
