public class ToppingDecorator implements Cafe{

    Cafe cafe;

    public ToppingDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double calculaCusto() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
