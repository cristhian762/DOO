package fabrica.abstrata.botoes;


import javax.swing.JButton;
import fabrica.abstrata.botoes.ButtonOK;
import fabrica.abstrata.botoes.ButtonCancel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
public  class FabricaBotoesIcon extends FabricaAbstrataBotoes {    
	@Override
	public JButton criaBotaoOK(){
		return new ButtonOK();
	} 

	@Override
	public JButton criaBotaoCancel() {
		return new ButtonCancel();
	}
}
