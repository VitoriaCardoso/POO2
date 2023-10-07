public class Capuccino extends BaristaTemplate{

    @Override
    public void aquecerAgua() {
        System.out.println("Aquecer água do Capucino por 5 minutos");
    }

    @Override
    public void prepararBebida() {
        System.out.println("Preparo da bebida");

    }

    @Override
    public void colocarXicara() {
        System.out.println("Colocar na Xicará de 500ml");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionar canela");
        System.out.println("Adicionar açucar");
        System.out.println("Adicionar cravo");

    }
}
