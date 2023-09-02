public class Chocolate extends ToppingDecorator{
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 6.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Chocolate.";
    }
}
