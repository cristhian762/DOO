/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20191BSI0077
 */
public class MembroWhatsApp implements Observer {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void update(Observable ob) {
        CaixaEntradaGrupo msg = (CaixaEntradaGrupo) ob;
        
        System.out.println("Número: " + this.getNumber());
        System.out.println("Mensagem: " + msg.getNovaMensagem());
    }
}
