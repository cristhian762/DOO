
package caixa;

import java.util.List;
import javax.swing.JOptionPane;


public abstract class AbstractSaqueHandler implements SaqueHandler {
    private SaqueHandler nextPagamentoHandler;
    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.nextPagamentoHandler = handler;
    }
    public void processHander(List lista, int valor) {                
        if(lista.contains(getTipoNota()))
              valor = handleSaque(valor);                               
        if (nextPagamentoHandler != null && valor >0)
            this.nextPagamentoHandler.processHander(lista, valor);
        
    }
    protected abstract int getTipoNota();
    protected int valorRestante(int valor){
        
        int nNotas100 = valor / 100 ;
        
        JOptionPane.showMessageDialog(null, "Número de notas de 100: " 
                + nNotas100);
        
        return valor - nNotas100 * 100;
    }    
    
    protected abstract int handleSaque(int valor);
}

