public class Main {
    public static void main(String[] args) {
        Capuccino capuccino = new Capuccino();
        Café café = new Café();
        Chá chá = new Chá();

        capuccino.prepararBebida();
        capuccino.aquecerAgua();
        capuccino.adicionarCondimentos();
        capuccino.colocarXicara();

        café.prepararBebida();
        café.aquecerAgua();
        café.adicionarCondimentos();
        café.colocarXicara();

        chá.prepararBebida();
        chá.aquecerAgua();
        chá.adicionarCondimentos();
        chá.colocarXicara();

    }
}
