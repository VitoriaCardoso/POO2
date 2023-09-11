public class PavaoAveAdaptor implements Ave {

    Pavao pavao;

    public PavaoAveAdaptor(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }

}
