package br.cesed.si.pizzariaheldermassas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cardapio")

public class Cardapio {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idItem;
	
	private String nomeitem;
	
	private double preco;

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public String getNomeitem() {
		return nomeitem;
	}

	public void setNomeitem(String nomeitem) {
		this.nomeitem = nomeitem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
