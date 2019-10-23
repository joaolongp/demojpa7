package com.example.demojpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demojpa2.entidades.Automovel;
import com.example.demojpa2.entidades.Pessoa;
import com.example.demojpa2.repositorios.AutomovelRepositorio;
import com.example.demojpa2.repositorios.PessoaRepositorio;

@SpringBootApplication
public class Demojpa2Application implements CommandLineRunner{
	@Autowired
	private PessoaRepositorio pessoas;
	@Autowired
	private AutomovelRepositorio automoveis;

	public static void main(String[] args) {
		SpringApplication.run(Demojpa2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Inserir pessoas: ");
		Pessoa p1 = new Pessoa();
		p1.setNome("Joao");
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria");
		pessoas.inserir(p1);
		pessoas.inserir(p2);
		
		System.out.println("Inserir Automoveis: ");
		Automovel a1 = new Automovel();
		
		a1.setChassi("123");
		a1.setProprietaria(p1);
		System.out.println("Setou");
		automoveis.inserir(a1);
		System.out.println("Inseriu");*/
		
		System.out.println("Consulta Automovel: ");
		Automovel a = automoveis.consultar(3);
		System.out.println(a.getChassi());
		System.out.println(a.getId());
		System.out.println(a.getProprietaria().getNome());
	}

}
