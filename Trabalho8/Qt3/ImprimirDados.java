public class ImprimirDados implements Visitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("Carro: Cor - " + carro.cor + ", Marca - " + carro.marca + ", Modelo - " + carro.modelo);
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta: Cor - " + bicicleta.cor);
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus: Lugares - " + onibus.qtdLugares + ", Ano de Fabricação - " + onibus.anoFabricacao);
    }
}
