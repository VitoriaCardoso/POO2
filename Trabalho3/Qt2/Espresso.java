public class Espresso implements Cafe{
    @Override
    public double calculaCusto() {
        return 10.00;
    }

    @Override
    public String getDescricao() {
        return "\nCafé expresso ";
    }
}
