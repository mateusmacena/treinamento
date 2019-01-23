package br.cesed.si.pizzariaheldermassas.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ControleDeComandas")
public class ControleDeComanda {
	
	private int numeroDaMesa;
	
	private String produtoPedido;
	
	private int quantidadeProdutoPedido;

	public int getNumeroDaMesa() {
		return numeroDaMesa;
	}

	public void setNumeroDaMesa(int numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
	}

	public String getProdutoPedido() {
		return produtoPedido;
	}

	public void setProdutoPedido(String produtoPedido) {
		this.produtoPedido = produtoPedido;
	}

	public int getQuantidadeProdutoPedido() {
		return quantidadeProdutoPedido;
	}

	public void setQuantidadeProdutoPedido(int quantidadeProdutoPedido) {
		this.quantidadeProdutoPedido = quantidadeProdutoPedido;
	}
	
	
	
	

}
