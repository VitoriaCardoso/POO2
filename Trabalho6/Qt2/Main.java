public class Main {
    public static void main(String[] args) {
        Acao acaoXYZ = new Acao("XYZ", 50.0);
        AcaoBroker corretor = new AcaoBroker();

        Investidor investidor1 = new Investidor("Investidor1", corretor, 45.0, 60.0);
        Investidor investidor2 = new Investidor("Investidor2", corretor, 55.0, 80.0);

        acaoXYZ.addObserver(investidor1);
        acaoXYZ.addObserver(investidor2);

        // Simulação de variação de preço
        acaoXYZ.setPrecoAtual(55.0);
        acaoXYZ.setPrecoAtual(75.0);
    }
}
