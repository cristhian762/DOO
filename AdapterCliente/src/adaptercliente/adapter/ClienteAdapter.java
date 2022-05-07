/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adaptercliente.adapter;

import adaptercliente.model.Cliente;
import lib.ClienteExterno;

/**
 *
 * @author cristhian
 */
public class ClienteAdapter extends Cliente {
	private final Cliente cli = new Cliente();
	
	
	public ClienteAdapter (ClienteExterno ce){
		this.cli.setNomeCompleto(ce.getNome() + " " + ce.getSobreNome());
		this.cli.setTelefone(ce.getDddTelefone() + ce.getTelefone());
		this.cli.setCelular(ce.getDddCelular() + ce.getCelular());
		this.cli.setEmail(ce.getEmail());
	}
	
	public Cliente getCliente(){
		return this.cli;
	}
}
