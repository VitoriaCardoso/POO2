public class Main {
    public static void main(String[] args) {
        Criptomoedas criptomoedas = new Criptomoedas();
        criptomoedas.ProcessaPagamento(3, 25.0, "Bitcoin");
        criptomoedas.Entrega();

        Online online = new Online();
        online.ProcessaPagamento(2, 15.0, "Dinheiro");
        online.Entrega();

        Loja loja = new Loja();
        loja.ProcessaPagamento(10, 25.0, "Cartão de Crédito");
        loja.Entrega();

    }

    //Reposta
    // A diferença entre Template e o Decorator, o Template Method utiliza herança para
    // permitir que as subclasses alterem partes específicas do algoritmo e Decorator
    // utiliza composição para agregar responsabilidades aos objetos
}
