public class Aeroporto implements Observer{
    @Override
    public void update(DadosMeteorologicos dados) {
        int rajadasVento = dados.getRajadasVento();
        if (rajadasVento > 40) {
            System.out.println("Alerta no Aeroporto: Rajadas de vento intensas. Esteja ciente!");
        }
    }
}
