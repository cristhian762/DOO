/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20191BSI0077
 */
public class MembroTwitter implements Observer {
    private String usuario;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public void update(Observable ob) {
        CaixaEntradaGrupo msg = (CaixaEntradaGrupo) ob;
        
        System.out.println("User: " + this.getUsuario());
        System.out.println("Mensagem: " + msg.getNovaMensagem());
    }
}
