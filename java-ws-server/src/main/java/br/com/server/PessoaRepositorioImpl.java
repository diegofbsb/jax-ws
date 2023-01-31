package br.com.server;

import br.com.server.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorioImpl implements PessoaRepositorio {

    private static PessoaRepositorioImpl instance;
    private final List<Pessoa> pessoas;

    private PessoaRepositorioImpl() {
        // Classe singleton
        pessoas = new ArrayList<Pessoa>();
    }

    public static PessoaRepositorioImpl getInstanceOf() {
        if (instance == null) {
            instance = new PessoaRepositorioImpl();
        }
        return instance;
    }

    public void salvar(Pessoa pessoa) {
        pessoa.setCodigo(pessoas.size() + 1);
        pessoas.add(pessoa);

    }

    public Pessoa buscarPorCodigo(int codigo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        return null;
    }

}
