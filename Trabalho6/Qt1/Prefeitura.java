public class Prefeitura implements Observer{
    @Override
    public void update(DadosMeteorologicos dados) {
        int umidade = dados.getUmidade();
        if (umidade > 70) {
            System.out.println("Alerta de Defesa Civil: Umidade do ar alta. Tome precauções!");
        }
    }
}
