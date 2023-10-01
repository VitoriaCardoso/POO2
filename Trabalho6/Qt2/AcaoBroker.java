import java.util.ArrayList;
import java.util.List;

public class AcaoBroker {
    public void comprarAcoes(Investidor investidor, Acao acao) {
        // Lógica para comprar ações
        System.out.println("Corretor está comprando ações para o investidor " + investidor.nome);
    }

    public void venderAcoes(Investidor investidor, Acao acao) {
        // Lógica para vender ações
        System.out.println("Corretor está vendendo ações para o investidor " + investidor.nome);
    }
}
