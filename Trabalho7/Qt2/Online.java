public class Online extends PedidosTemplate{

    int quant;
    double produto;
    String formaPagamento;

    public Online(){
        this.formaPagamento = formaPagamento;
        this.produto = produto;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public void ProcessaPagamento(int quant, double produto, String formaPagamento)  {
        System.out.println("Processando pagamento no valor de: " + quant*produto);
        System.out.println("Forma de pagamento: " + formaPagamento);
    }

    @Override
    public void Entrega() {
        System.out.println("Entrega feita pela transportadora Unilog");
    }
}