/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20191BSI0077
 */
public class CaixaEntradaGrupo extends Observable{
    private String mensagem;
    
    public void setNovaMensagem(String mensagem) {
        this.mensagem = mensagem;
        
        notifyObserver();
    }

    public String getNovaMensagem() {
        return mensagem;
    }
}
