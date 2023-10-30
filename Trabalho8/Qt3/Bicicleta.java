public class Bicicleta extends Veiculo{

    String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
