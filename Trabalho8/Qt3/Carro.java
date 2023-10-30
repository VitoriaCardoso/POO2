public class Carro extends Veiculo{
    String cor;
    String marca;
    String modelo;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
