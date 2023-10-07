public class Chá extends BaristaTemplate{


    public Chá(){

    }

    @Override
    public void aquecerAgua() {
        System.out.println("Aquecer água do chá por 3 minutos");
    }

    @Override
    public void prepararBebida() {
        System.out.println("Preparo da bebida");
    }

    @Override
    public void colocarXicara() {
        System.out.println("Colocar na Xicará de 250ml");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionar limão");
        System.out.println("Adicionar açucar");
    }
}
