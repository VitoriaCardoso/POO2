public class Onibus extends Veiculo{

    int qtdLugares;
    int anoFabricacao;

    public Onibus(int qtdLugares, int anoFabricacao) {
        this.qtdLugares = qtdLugares;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
