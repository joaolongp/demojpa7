package com.example.demojpa2.repositorios;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.example.demojpa2.entidades.Automovel;

@Component
@Transactional
public class AutomovelRepositorioJPA implements AutomovelRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void inserir(Automovel umAutomovel) {
		em.persist(umAutomovel);
	}
	@Override
	public Automovel consultar(long id){
		return em.find(Automovel.class, id);
	}
}
