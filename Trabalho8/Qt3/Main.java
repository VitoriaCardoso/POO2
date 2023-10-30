public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Azul", "Toyota", "Corolla");
        Bicicleta bicicleta = new Bicicleta("Verde");
        Onibus onibus = new Onibus(50, 2020);

        Visitor imprimirVisitor = new ImprimirDados();
        Visitor enviarMensagemVisitor = new EnviarMensagem();

        carro.accept(imprimirVisitor);
        carro.accept(enviarMensagemVisitor);

        bicicleta.accept(imprimirVisitor);
        bicicleta.accept(enviarMensagemVisitor);

        onibus.accept(imprimirVisitor);
        onibus.accept(enviarMensagemVisitor);
    }
}
