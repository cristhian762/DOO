/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20191BSI0077
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MembroWhatsApp telefone = new MembroWhatsApp();
        MembroEmail email = new MembroEmail();
        
        CaixaEntradaGrupo mensagem = new CaixaEntradaGrupo();
        
        mensagem.addObserver(telefone);
        mensagem.addObserver(email);
        
        telefone.setNumber(2799661);
        email.setEmail("cristhian762@gmail.com");

        mensagem.setNovaMensagem("Hello world");
    }
}
