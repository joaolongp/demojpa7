package com.example.demojpa2.repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.example.demojpa2.entidades.Pessoa;

@Component
@Transactional
public class PessoaRepositorioJPA implements PessoaRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void inserir(Pessoa umaPessoa) {
		em.persist(umaPessoa);
	}

	@Override
	public Pessoa inserir(String nome, int idade) {
		return null;
	}

	@Override
	public Pessoa inserir(String nome) {
		return null;
	}
	
	@Override
	public Pessoa consultar(long id){
		return em.find(Pessoa.class, id);
	}
	
	@Override
	public List<Pessoa> consultarTodos(){
		String jpql = "Select p from Pessoa p";
		TypedQuery<Pessoa> consulta=
				em.createQuery(jpql, Pessoa.class);
		return consulta.getResultList();
	}
	
	public Pessoa remover(long id) {
		Pessoa p = consultar(id);
		em.remove(p);
		return p;
	}
	
	public void alterar(Pessoa umaPessoa) {
		em.merge(umaPessoa);
	}
}
