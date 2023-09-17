public class Main {
    public static void main(String[] args) {
        CintoSegurança cintoSegurança = new CintoSegurança();
        Farol farol = new Farol();
        Motor motor = new Motor();
        Porta porta = new Porta();
        Radio radio = new Radio();

        MotoristaFachada motoristaFachada = new MotoristaFachada(cintoSegurança,farol,motor,porta,radio);

        motoristaFachada.inicioCorrida("libera ela");
        motoristaFachada.fimCorrida();

    }
}
