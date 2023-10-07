public abstract class PedidosTemplate {

    int quant;
    double produto;
    String formaPagamento;

    public abstract void ProcessaPagamento(int quant,double produto,String formaPagamento);
    public abstract void Entrega();
}
