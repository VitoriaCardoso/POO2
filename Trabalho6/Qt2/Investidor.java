public class Investidor implements Observer{

    private String nome;
    private AcaoBroker corretor;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, AcaoBroker corretor, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.corretor = corretor;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }

    public void update(Acao acao) {
        double precoAtual = acao.getPrecoAtual();

        if (precoAtual <= precoMinimo) {
            System.out.println("Investidor " + nome + " está comprando ações de " + acao.getNome() +
                    " a um preço de " + precoAtual);
            corretor.comprarAcoes(this, acao);
        } else if (precoAtual >= precoMaximo) {
            System.out.println("Investidor " + nome + " está vendendo ações de " + acao.getNome() +
                    " a um preço de " + precoAtual);
            corretor.venderAcoes(this, acao);
        }
    }
}