class DadosMeteorologicos {
    private int temperatura;
    private int umidade;
    private int rajadasVento;

    public DadosMeteorologicos(int temperatura, int umidade, int rajadasVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.rajadasVento = rajadasVento;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getUmidade() {
        return umidade;
    }

    public int getRajadasVento() {
        return rajadasVento;
    }
}