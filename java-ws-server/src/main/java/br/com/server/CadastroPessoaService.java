package br.com.server;

import br.com.server.modelo.Pessoa;

public class CadastroPessoaService {

	private final PessoaRepositorio repositorio;

	public CadastroPessoaService() {
		repositorio = PessoaRepositorioImpl.getInstanceOf();
	}

	public void cadastrar(Pessoa pessoa) {
		repositorio.salvar(pessoa);
	}

	public Pessoa pesquisarPorCodigo(int codigo) {
		return repositorio.buscarPorCodigo(codigo);
	}

}
