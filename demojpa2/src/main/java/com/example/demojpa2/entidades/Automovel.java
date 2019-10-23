package com.example.demojpa2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Automoveis")
public class Automovel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column(nullable=false)
	private String chassi;	
	@ManyToOne
	private Pessoa proprietaria;
	
	public Pessoa getProprietaria() {
		return proprietaria;
	}
	public void setProprietaria(Pessoa proprietaria) {
		this.proprietaria=proprietaria;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
}