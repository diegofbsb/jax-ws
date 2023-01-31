package br.com.server;

import br.com.server.modelo.Pessoa;

public interface PessoaRepositorio {

	void salvar(Pessoa pessoa);

	Pessoa buscarPorCodigo(int codigo);

}
