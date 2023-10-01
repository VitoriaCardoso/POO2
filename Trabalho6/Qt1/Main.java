public class Main {
    public static void main(String[] args) {

        CET cet = new CET();

        Prefeitura prefeituraObserver = new Prefeitura();
        Aeroporto aeroportoObserver = new Aeroporto();

        cet.addObserver(prefeituraObserver);
        cet.addObserver(aeroportoObserver);

        DadosMeteorologicos dados = new DadosMeteorologicos(25, 60, 30);
        cet.setDadosMeteorologicos(dados);
    }
}
