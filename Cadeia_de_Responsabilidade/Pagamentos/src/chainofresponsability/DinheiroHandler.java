
package chainofresponsability;

import javax.swing.JOptionPane;


public class DinheiroHandler  extends AbstractPagamentoHandler {
    
    public static final int DINHEIRO =1;  
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                    + " com dinheiro?", valor);
        JOptionPane.showMessageDialog(null, "Pago com dinheiro. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }

}
