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
	private final ClienteExterno ce;
	
	public ClienteAdapter(ClienteExterno ce) {
		this.ce = ce;
	}

	@Override
	public void setNomeCompleto(String nomeCompleto) {
		super.setNomeCompleto(this.ce.getNome() + " " +this.ce.getSobreNome()); 
	}

	@Override
	public String getNomeCompleto() {
		return this.ce.getNome() + " " +this.ce.getSobreNome();
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(this.ce.getEmail());
	}

	@Override
	public String getEmail() {
		return this.ce.getEmail();
	}

	@Override
	public void setCelular(String celular) {
		super.setCelular(this.ce.getDddCelular() + this.ce.getCelular());
	}

	@Override
	public String getCelular() {
		return this.ce.getDddCelular() + this.ce.getCelular();
	}

	@Override
	public void setTelefone(String telefone) {
		super.setTelefone(this.ce.getTelefone());
	}

	@Override
	public String getTelefone() {
		return this.ce.getDddTelefone() + this.ce.getTelefone();
	}
	
}
