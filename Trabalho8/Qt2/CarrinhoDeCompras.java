import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    List<Item> items = new ArrayList<>();
    public double pesoTotal = 0;
    public double total = 0;
    
    public void adicionaItem(Item item, double peso){
        items.add(item);
        pesoTotal += peso;

    }
    public void removeItem(Item item, double peso){
        items.remove(item);
        pesoTotal -= peso;
    }
    
    public int calculaTotal(){
        int sum = 0;
	for(Item item : items){
            sum += item.getPreco();
        }
	return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        if (strategy != null) {
            double frete = this.calculaTotal();
            System.out.println("Frete: " + frete);
            total += frete;

            strategy.pagar(total);
        } else {
            System.out.println("Erro: Nenhuma estratégia de pagamento selecionada.");
        }
        
    }

    public double calculaFrete(FreteStrategy estrategiaFrete) {
        if (estrategiaFrete != null) {
            return estrategiaFrete.calcularFrete(pesoTotal);
        } else {
            System.out.println("Erro: Nenhuma estratégia de frete selecionada.");
            return 0;
        }
    }
    
}
