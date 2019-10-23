package com.example.demojpa2.repositorios;

import com.example.demojpa2.entidades.Automovel;

public interface AutomovelRepositorio {
	void inserir(Automovel umAutomovel);
	Automovel consultar(long id);
}