public class MotoristaFachada {
    CintoSegurança cinto;
    Farol farol;
    Motor motor;
    Porta porta;
    Radio radio;

    public MotoristaFachada(CintoSegurança cinto, Farol farol, Motor motor, Porta porta,Radio radio){
        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }

    public void inicioCorrida(String musica){
        System.out.println("Preparando para a sua corrida ...");
        porta.trava();
        farol.liga();
        motor.liga();
        cinto.trava();
        radio.liga();
        radio.sintoniza(musica);
    }

    public void fimCorrida(){
        System.out.println("Fim da sua corrida ...");
        porta.destrava();
        farol.desliga();
        motor.desliga();
        cinto.destrava();
        radio.desliga();
    }
}
