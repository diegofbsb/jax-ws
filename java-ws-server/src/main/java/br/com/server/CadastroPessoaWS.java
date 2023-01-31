package br.com.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.server.modelo.Pessoa;

@WebService
public class CadastroPessoaWS {

	private final CadastroPessoaService cadastroPessoaServico;

	public CadastroPessoaWS() {
		cadastroPessoaServico = new CadastroPessoaService();
	}

	@WebMethod
	public void cadastrarPessoa(Pessoa pessoa) {
		cadastroPessoaServico.cadastrar(pessoa);
	}

	@WebMethod
	public Pessoa buscarPorCodigo(int codigo) {
		return cadastroPessoaServico.pesquisarPorCodigo(codigo);
	}

}
