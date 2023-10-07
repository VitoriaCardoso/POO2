public class Café extends BaristaTemplate{

    @Override
    public void aquecerAgua() {
        System.out.println("Aquecer água do Café por 10 minutos");
    }

    @Override
    public void prepararBebida() {
        System.out.println("Preparo da bebida");

    }

    @Override
    public void colocarXicara() {
        System.out.println("Colocar na Xicará de 50ml");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionar açucar");
    }
}
