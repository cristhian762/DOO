/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20191BSI0077
 */
public class MembroEmail implements Observer {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void update(Observable ob) {
        CaixaEntradaGrupo msg = (CaixaEntradaGrupo) ob;
        
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Enviando mensagem: " + msg.getNovaMensagem());
    }

}
