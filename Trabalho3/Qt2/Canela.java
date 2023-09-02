public class Canela extends ToppingDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 0.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", com Canela.";
    }
}
